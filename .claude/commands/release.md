# Release Command

Prepare a new release for the producerflowapi client libraries.

## Instructions

1. **Ask for version**: Prompt the user for the new version number (e.g., `1.0.18`). Validate it follows semver format.

2. **Update TypeScript package**:
   - Update `version` in `gen/ts/package.json`
   - Run `npm install` in `gen/ts/` to sync `package-lock.json`

3. **Update Kotlin package**:
   - Update `version=` line in `gen/kotlin/gradle.properties`

4. **Update CHANGELOG.md**:
   - First, review the commit history since the last tag:

     ```bash
     git log $(git describe --tags --abbrev=0)..HEAD --oneline
     ```

   - Summarize the changes and propose changelog entries to the user
   - Confirm with the user before adding to the changelog
   - Add a new section at the top (after the header) with the format:

     ```markdown
     ## [X.Y.Z] - YYYY-MM-DD

     ### Added
     - (new features)

     ### Changed
     - (changes in existing functionality)

     ### Fixed
     - (bug fixes)

     ---
     ```

5. **Summary**: After completing all updates, show:
   - Files modified
   - The new version number
   - Remind user to:
     - Commit the changes
     - Create a GitHub release with tag `vX.Y.Z`
     - Manually trigger the publish workflows from GitHub Actions:
       - [Publish to NPM](.github/workflows/npm-publish.yml)
       - [Publish Kotlin to GitHub Packages](.github/workflows/kotlin-publish.yml)

## Current Versions

Check `gen/ts/package.json` and `gen/kotlin/gradle.properties` for current versions.
