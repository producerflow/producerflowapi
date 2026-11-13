import { Mermaid } from '@/components/mermaid';
import defaultMdxComponents from 'fumadocs-ui/mdx';
import type { MDXComponents } from 'mdx/types';

export const getMDXComponents = (components?: MDXComponents): MDXComponents => ({
	...(defaultMdxComponents as MDXComponents),
	Mermaid,
	...components
});
