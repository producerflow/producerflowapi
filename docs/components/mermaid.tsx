'use client';

import { useEffect, useId, useRef, useState } from 'react';

// Client-side Mermaid renderer. Works under static export because the diagram
// is rendered in the browser after hydration.
export function Mermaid({ chart }: { chart: string }) {
	const id = useId();
	const [svg, setSvg] = useState('');
	const containerRef = useRef<HTMLDivElement>(null);

	useEffect(() => {
		let cancelled = false;

		const renderChart = async () => {
			const { default: mermaid } = await import('mermaid');
			mermaid.initialize({
				startOnLoad: false,
				securityLevel: 'loose',
				fontFamily: 'inherit',
				themeCSS: 'margin: 1.5rem auto 0;',
				theme: 'default'
			});

			try {
				const { svg } = await mermaid.render(
					`mermaid-${id.replace(/[^a-zA-Z0-9]/g, '')}`,
					chart.trim(),
					containerRef.current ?? undefined
				);
				if (!cancelled) setSvg(svg);
			} catch {
				// Leave the raw chart text if rendering fails.
			}
		};

		void renderChart();
		return () => {
			cancelled = true;
		};
	}, [chart, id]);

	return <div ref={containerRef} dangerouslySetInnerHTML={{ __html: svg }} />;
}
