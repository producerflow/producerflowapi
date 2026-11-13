import { fileURLToPath } from 'node:url';

import { createMDX } from 'fumadocs-mdx/next';

const withMDX = createMDX();

const root = fileURLToPath(new URL('.', import.meta.url));

// GitHub Pages serves a project site under /<repo>. Override with an empty
// string (and add public/CNAME) if a custom domain is configured later.
const basePath = process.env.NEXT_PUBLIC_BASE_PATH ?? '/producerflowapi';

/** @type {import('next').NextConfig} */
const config = {
	reactStrictMode: true,
	turbopack: { root }, // pin workspace root (avoids picking a stray parent lockfile)
	output: 'export', // static HTML in out/, deployable to GitHub Pages
	basePath,
	images: { unoptimized: true }, // required for static export
	trailingSlash: true // stable routing on GitHub Pages
};

export default withMDX(config);
