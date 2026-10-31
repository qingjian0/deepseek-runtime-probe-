# Known Issues

1. The probe uses legacy Xposed API 82; compatibility with the user's exact LSPosed release needs testing.
2. Candidate obfuscated names may differ by DeepSeek channel/build.
3. Candidate method semantics are not proven by names alone.
4. The actual main chat SSE parser is not identified.
5. Flow emitted element runtime type is unknown.
6. Complete finish/close/error/cancel lifecycle is unknown.
7. FileFragment nested metadata is not reconstructed.
8. No Local API server is implemented in recovered source.
9. No Agent tool executor is implemented in recovered source.
10. No device-side LSPosed trace was recovered.
11. No successful CI APK artifact is established yet for the migration branch.
12. Historical branch chats are reconstructed summaries, not verbatim exports.
13. APK/APKS inputs are not publicly redistributed; only metadata and hashes are archived.
