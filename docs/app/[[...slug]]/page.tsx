import { source } from '@/lib/source';
import { getMDXComponents } from '@/mdx-components';
import {
	DocsBody,
	DocsDescription,
	DocsPage,
	DocsTitle,
	PageLastUpdate
} from 'fumadocs-ui/layouts/docs/page';
import type { Metadata } from 'next';
import { notFound } from 'next/navigation';

const sectionTitles: Record<string, string> = {
	'getting-started': 'Getting Started',
	guides: 'Guides',
	webhooks: 'Webhooks',
	appointments: 'Appointments',
	reference: 'Reference'
};

const getSectionTitle = (slug: string[] | undefined): string | null => {
	if (!slug || slug.length === 0) return null;
	return sectionTitles[slug[0]] ?? null;
};

const Page = async (props: { params: Promise<{ slug?: string[] }> }) => {
	const params = await props.params;
	const page = source.getPage(params.slug);
	if (!page) notFound();

	const MDX = page.data.body as React.ComponentType<{
		components: ReturnType<typeof getMDXComponents>;
	}>;

	const sectionTitle = getSectionTitle(params.slug);

	return (
		<DocsPage toc={page.data.toc} full={page.data.full} breadcrumb={{ enabled: false }}>
			{sectionTitle && (
				<div className="flex items-center gap-1.5 text-sm text-fd-muted-foreground">
					<span className="truncate text-fd-primary font-medium">{sectionTitle}</span>
				</div>
			)}
			<DocsTitle>{page.data.title}</DocsTitle>
			<DocsDescription className="mb-0">{page.data.description}</DocsDescription>
			<hr className="my-4" />
			<DocsBody>
				<MDX components={getMDXComponents()} />
			</DocsBody>
			{page.data.lastModified && <PageLastUpdate date={new Date(page.data.lastModified)} />}
		</DocsPage>
	);
};

export default Page;

export const generateStaticParams = async () => source.generateParams();

export const generateMetadata = async (props: {
	params: Promise<{ slug?: string[] }>;
}): Promise<Metadata> => {
	const params = await props.params;
	const page = source.getPage(params.slug);
	if (!page) notFound();

	return {
		title: page.data.title,
		description: page.data.description
	};
};
