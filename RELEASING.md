# Release Process

This project uses a manual release process to publish client libraries.

## Creating a Release

1. Update the version in the relevant package files:
   - TypeScript: `gen/ts/package.json` and run `npm install` in `gen/ts/` to update `package-lock.json`
   - Kotlin: `gen/kotlin/gradle.properties`
2. Update `CHANGELOG.md` with the new version and changes
3. Create a new GitHub release with the appropriate tag (e.g., `v1.0.18`)

## Publishing Client Libraries

Client libraries are published manually via GitHub Actions workflows:

- **NPM (TypeScript)**: Go to [Actions → Publish to NPM](.github/workflows/npm-publish.yml) → Run workflow
- **GitHub Packages (Kotlin)**: Go to [Actions → Publish Kotlin to GitHub Packages](.github/workflows/kotlin-publish.yml) → Run workflow

Both workflows accept an optional version input. If left empty, the version from the package configuration files will be used.
