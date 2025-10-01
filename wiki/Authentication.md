# Authentication

All requests to our API require authentication. This guide explains how to obtain API keys and use them to authenticate your Connect API calls.

## Obtaining an API Key

To use our API, you'll need to generate an API key from the Producer Flow user interface:

1. Navigate to the settings section and select "API keys"

   ![API Keys Section](/img/getting-api-key/getting-api-key-01.png)

2. Click the "Generate new API key" button

   ![API Keys Management](/img/getting-api-key/getting-api-key-02.png)

3. Fill out the form:
   - Provide a name for your API key
   - Add an optional description
   - Select an expiration time (or use the default)

   ![Generate API Key Form](/img/getting-api-key/getting-api-key-03.png)

4. Click "Generate new API key" and securely store the generated key

   > **Important**: The API key will only be displayed once. Make sure to copy and store it securely.

## Using API Keys in Go

In Go, you can authenticate your Connect API calls by adding your API key as a bearer token or header in your HTTP client.

### Using a Custom HTTP Transport

```go
package main

import (
    "context"
    "net/http"

    "connectrpc.com/connect"
    producerpb "github.com/producerflow/producerflowapi/gen/go/producerflow/producer/v1"
    producerconnect "github.com/producerflow/producerflowapi/gen/go/producerflow/producer/v1/producerv1connect"
)

// Custom transport to add authentication headers
type authTransport struct {
    base   http.RoundTripper
    apiKey string
}

func (t *authTransport) RoundTrip(req *http.Request) (*http.Response, error) {
    // Add the API key as a header

    req.Header.Add("x-api-key", t.apiKey)

    return t.base.RoundTrip(req)
}

func createAuthenticatedClient(apiKey string) producerconnect.ProducerServiceClient {
    // Create an HTTP client with authentication headers
    httpClient := &http.Client{
        Transport: &authTransport{
            base: http.DefaultTransport,
            apiKey: apiKey,
        },
    }

    return producerconnect.NewProducerServiceClient(
        httpClient,
        "https://api.producerflow.com",
        connect.WithGRPC(), // or WithConnect() depending on protocol
    )
}

func main() {
    client := createAuthenticatedClient("YOUR_API_KEY")

    // Now you can make authenticated API calls
    req := connect.NewRequest(&producerpb.GetProducerRequest{
        // Add request parameters
    })

    resp, err := client.GetProducer(context.Background(), req)
    // Process response
}
```

## Using API Keys in TypeScript

In TypeScript, you can authenticate your Connect API calls using interceptors.

### Using Connect Interceptors

```typescript
import { createPromiseClient } from "@connectrpc/connect";
import { createConnectTransport } from "@connectrpc/connect-node";
import { ProducerService } from "@producerflow/producerflowapi";

// Create an authenticated client
function createAuthenticatedClient(apiKey: string) {
    // Create a transport with authentication headers
    const transport = createConnectTransport({
        baseUrl: "https://api.producerflow.com",
        httpVersion: "1.1",
        interceptors: [{
            interceptRequest(next, req) {
                // Add the API key header
                req.header.set("x-api-key", apiKey);
                // Or alternatively:
                // req.header.set("x-api-key", apiKey);

                return next(req);
            }
        }]
    });

    return createPromiseClient(ProducerService, transport);
}

async function main() {
    const client = createAuthenticatedClient("YOUR_API_KEY");

    // Make authenticated API calls
    try {
        const response = await client.getProducer({
            lookupMethod: {
                case: "producerIdLookup",
                value: {
                    producerId: "example-id",
                },
            },
        });

        console.log("Producer data:", response.producer);
    } catch (error) {
        console.error("Error:", error);
    }
}

main();
```

### For Browser Environments

```typescript
import { createPromiseClient } from "@connectrpc/connect";
import { createConnectTransport } from "@connectrpc/connect-web";
import { ProducerService } from "@producerflow/producerflowapi";

function createAuthenticatedClient(apiKey: string) {
    const transport = createConnectTransport({
        baseUrl: "https://api.producerflow.com",
        interceptors: [{
            interceptRequest(next, req) {
                req.header.set("Authorization", `Bearer ${apiKey}`);
                // Or alternatively:
                // req.header.set("x-api-key", apiKey);

                return next(req);
            }
        }]
    });

    return createPromiseClient(ProducerService, transport);
}

// Usage in browser code
const client = createAuthenticatedClient("YOUR_API_KEY");

// Make authenticated API calls
async function fetchProducer(producerId: string) {
    try {
        const response = await client.getProducer({
            lookupMethod: {
                case: "producerIdLookup",
                value: {
                    producerId: producerId,
                },
            },
        });

        return response.producer;
    } catch (error) {
        console.error("Error fetching producer:", error);
        throw error;
    }
}
```

## Security Best Practices

When working with API keys, follow these best practices:

1. **Store securely**: Never hardcode API keys in your source code or commit them to version control
2. **Use environment variables**: Store API keys in environment variables or secure credential stores
3. **Implement key rotation**: Regularly rotate your API keys, especially for production environments
4. **Set appropriate expirations**: Choose expiration times that balance security and convenience
5. **Use least privilege**: Generate keys with only the permissions needed for your application
