module github.com/producerflow/producerflowapi

go 1.24.0

require (
	buf.build/gen/go/bufbuild/protovalidate/protocolbuffers/go v1.36.7-20250717185734-6c6e0d3c608e.1
	connectrpc.com/connect v1.18.1
	google.golang.org/genproto v0.0.0-20250603155806-513f23925822
	google.golang.org/grpc v1.74.2
	google.golang.org/protobuf v1.36.7
)

require (
	github.com/Masterminds/semver v1.4.2 // indirect
	github.com/Masterminds/sprig v2.15.0+incompatible // indirect
	github.com/aokoli/goutils v1.0.1 // indirect
	github.com/envoyproxy/protoc-gen-validate v1.2.1 // indirect
	github.com/gogo/protobuf v1.3.2 // indirect
	github.com/golang/protobuf v1.5.4 // indirect
	github.com/google/uuid v1.6.0 // indirect
	github.com/huandu/xstrings v1.0.0 // indirect
	github.com/imdario/mergo v0.3.4 // indirect
	github.com/mwitkow/go-proto-validators v0.0.0-20180403085117-0950a7990007 // indirect
	github.com/pseudomuto/protoc-gen-doc v1.5.1 // indirect
	github.com/pseudomuto/protokit v0.2.0 // indirect
	golang.org/x/crypto v0.38.0 // indirect
	golang.org/x/net v0.40.0 // indirect
	golang.org/x/sys v0.33.0 // indirect
	golang.org/x/text v0.25.0 // indirect
	google.golang.org/genproto/googleapis/api v0.0.0-20250528174236-200df99c418a // indirect
	google.golang.org/genproto/googleapis/rpc v0.0.0-20250528174236-200df99c418a // indirect
	google.golang.org/grpc/cmd/protoc-gen-go-grpc v1.5.1 // indirect
)

tool (
	connectrpc.com/connect/cmd/protoc-gen-connect-go
	github.com/pseudomuto/protoc-gen-doc/cmd/protoc-gen-doc
	google.golang.org/grpc/cmd/protoc-gen-go-grpc
	google.golang.org/protobuf/cmd/protoc-gen-go
)
