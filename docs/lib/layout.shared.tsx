import type { BaseLayoutProps } from 'fumadocs-ui/layouts/shared';
import Link from 'next/link';

import { ProducerflowIcon } from './logo';

export const baseOptions = (): BaseLayoutProps => ({
	nav: {
		title: () => (
			<div className="flex flex-1 items-center gap-3">
				<a href="/" aria-label="Producerflow portal">
					<ProducerflowIcon />
				</a>
				<span aria-hidden="true" className="bg-fd-border h-5 w-px" />
				<Link href="/" className="text-fd-foreground font-semibold">
					Docs
				</Link>
			</div>
		)
	}
});
