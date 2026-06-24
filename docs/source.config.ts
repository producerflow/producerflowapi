import { defineConfig, defineDocs } from 'fumadocs-mdx/config';
import lastModifiedPlugin from 'fumadocs-mdx/plugins/last-modified';

export const docs = defineDocs({
	dir: 'content/docs',
	docs: {
		postprocess: {
			includeProcessedMarkdown: true
		}
	}
});

export default defineConfig({
	plugins: [lastModifiedPlugin()]
});
