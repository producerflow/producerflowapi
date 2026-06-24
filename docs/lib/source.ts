import { createElement } from 'react';

import { docs } from '@/.source/server';
import { loader } from 'fumadocs-core/source';

import { IconDocs, folderIcons } from './icons';

export const source = loader({
	baseUrl: '/',
	source: docs.toFumadocsSource(),
	plugins: [
		{
			name: 'agentero-icons',
			transformPageTree: {
				root(tree) {
					tree.children
						.filter(child => child.type === 'page' && child.url === '/')
						.forEach(child => {
							child.icon = createElement(IconDocs);
						});
					return tree;
				},
				folder(node) {
					if (node.$id) {
						const Icon = folderIcons[node.$id];
						if (Icon) node.icon = createElement(Icon);
					}
					return node;
				}
			}
		}
	]
});
