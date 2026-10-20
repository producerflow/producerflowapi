import type { ReactNode } from 'react';

import { baseOptions } from '@/lib/layout.shared';
import { source } from '@/lib/source';
import { DocsLayout } from 'fumadocs-ui/layouts/docs';
import { RootProvider } from 'fumadocs-ui/provider/next';

import './global.css';

const basePath = process.env.NEXT_PUBLIC_BASE_PATH ?? '/producerflowapi';

const Layout = ({ children }: { children: ReactNode }) => (
	<html lang="en" suppressHydrationWarning>
		<body className="flex min-h-screen flex-col">
			<RootProvider
				theme={{ defaultTheme: 'light', enableSystem: false }}
				search={{ options: { type: 'static', api: `${basePath}/api/search` } }}>
				<DocsLayout tree={source.getPageTree()} {...baseOptions()}>
					{children}
				</DocsLayout>
			</RootProvider>
		</body>
	</html>
);

export default Layout;
