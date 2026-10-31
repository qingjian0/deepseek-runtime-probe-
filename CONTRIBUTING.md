# Contributing

## Evidence first
- Every host-specific Hook must cite APK hash, package/version/channel, DEX descriptor or runtime log.
- Separate static leads from runtime observations.
- Never log chat content, credentials, file contents or user identifiers.
- Do not broaden Hook scope beyond the authorized DeepSeek package.
- Add tests for parsers, API schemas, event lifecycle and cancellation before claiming stability.

## Branching
Use focused branches and pull requests. Do not force-push shared branches or rewrite existing history.

## Build
JDK 17, Android SDK Platform 35, Build Tools 35.0.0, Gradle 8.9, AGP 8.7.3.

~~~bash
gradle --no-daemon :app:assembleDebug
~~~
