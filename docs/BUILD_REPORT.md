# Build Report

Date: 2026-10-31. Source baseline recovered from qingjian0/LSP-Deekseep- main history.

| Check | Status | Evidence |
|---|---|---|
| Local build in migration session | Not run | No local Android SDK/Gradle execution |
| CI build | Pending | Migration workflow not yet completed |
| APK artifact | Not produced/verified | No artifact ID |
| APK signature | Not run | No apksigner output |
| Device install | Not run | No device session |
| LSPosed activation | Not run | No LSPosed log |

A future successful build record must include workflow URL/run ID, commit SHA, runner image, Java/Gradle/SDK versions, command, exit code, artifact ID, APK SHA-256 and apksigner output.


## CI trigger note

The base branch contains the pull-request workflow definition so GitHub can evaluate this PR. The workflow is configured to build pushes to the migration branch and pull requests targeting main. The result remains pending until an actual workflow run is observed.


## First CI attempt — 2026-10-31

- Workflow run: 41198103151
- Job: build
- Commit tested: 77eb91cd6043b11e9458c5543b24b12da230d416
- JDK 17 setup: passed
- Android SDK setup: failed
- Failure: sdkmanager could not find the deprecated package named tools.
- Gradle setup/build and APK verification: skipped because SDK setup failed.
- APK artifact: not produced.

## Corrective change

The workflow was updated on both main and the migration branch to use android-actions/setup-android@v4 and explicitly request only platform-tools. The action documentation confirms that the old tools package is no longer served and that platform-tools is the supported package default. The updated workflow commit on the migration branch is ac5f1727cd145557823350dbebb968b1ac25497d.

A post-fix workflow run has not yet been returned by the available GitHub workflow-run query. Therefore the fix is committed but not yet verified by a successful CI run.
