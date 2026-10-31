# Recovery Provenance Manifest

## Canonical destination
- Repository: qingjian0/deepseek-runtime-probe-
- Migration branch: migration/full-project-recovery
- Source repository: qingjian0/LSP-Deekseep-
- Source ref: main
- Source head observed during recovery: d5ca2240339c35914935395fecc332aa53165b59

## Replayed source files

The following files were fetched from the source repository's main branch and recreated on the migration branch. GitHub source blob SHA values are retained for traceability.

| Path | Source blob SHA |
|---|---|
| app/src/main/java/dev/deepseek/runtimeprobe/HostProfile.java | fc3b78f151ea6e7d9e126fe8de20d9962c418d59 |
| app/src/main/java/dev/deepseek/runtimeprobe/SafeTrace.java | d685630ce9174e372b73279f1d12f2d586a3f36b |
| app/src/main/java/dev/deepseek/runtimeprobe/ProbeEntry.java | b4c89654334d3f2b7f260311894185a32d8c3f21 |
| app/src/main/assets/META-INF/xposed/scope.list | c4d1471622427fad9dd330718fb68acbf29ce761 |
| app/src/main/assets/xposed_init | 2c5bea35f427d97c4e09c74b7e0b080b0521f78c |
| app/src/main/AndroidManifest.xml | 8f469a65b5d2d797fa26a6bcd78ada5e3b8df7fd |
| app/proguard-rules.pro | 4599b523b224fc1b86da8636db1e3882b6d001f9 |
| app/build.gradle | 7434a4c61471190ef589e610a3cd1e8c3f27818c |
| gradle.properties | af2ca6999c475b0ab49390e866a8b28c0904864d |
| build.gradle | 5b7ccba7c566afb5057eaea1b10b99b083851fe4 |
| settings.gradle | fde0f06028d290aef431300330739c04c9183deb |
| docs/ARCHITECTURE.md | 493818b306df0b1acd4d7d211efc62de9a6a9f4d |
| docs/HOOK_COVERAGE.md | 7849fd99ba00490bbd00a79708d0303b3f8a6199 |
| docs/STATIC_REVERSE_ENGINEERING_REPORT.md | f8f1dda4a0dc258d738499a3e23cbd9b761e4c7f |
| docs/INPUT_ARTIFACTS.md | 9f9bfa0efdf00b79eb6fef4f0bc59b1385943bb5 |
| docs/INSTALLATION.md | 57022ed56811844217c2ae4c8eb7839d6b1bb1b1 |
| docs/SESSION_RECORD.md | 5d673b88fb69d089a89c76530669f246c2fa2a58 |
| docs/SECURITY_AND_PRIVACY.md | a816653c038d5f624ddeed9b126dacf4731ccfe3 |
| docs/BUILD_AND_TEST.md | 64b85802a704815de150209284dbba6c1c1324a4 |
| docs/HOST_COMPATIBILITY.md | 8e1a7039483f141f8f6230f0c6cb9529a7c3b05a |
| .github/workflows/android.yml | 93f5354bf23c5863f84baef8ff22251cf1427edc |
| LICENSE | 31b4a35205f3c0db4e435edeb84f3f931d05b447 |

## Source commit history

The source repository contains individual commits adding the files above. The recovered GitHub history was inspected; no source code implementation for a production Local API or Agent runtime was present in the inspected baseline.

## Uploaded artifacts

See artifacts/manifests/INPUT_ARTIFACTS.sha256 for exact sizes and hashes. Binary APK/APKS files are not redistributed.

## Integrity limits

A Git blob SHA identifies a source repository object. It is not the same as a local file SHA-256 and is not a publisher signature. The new repository records both source blob identifiers and uploaded-file SHA-256 values where available.
