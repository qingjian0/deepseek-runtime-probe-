# Project Overview

## Mission
Recover and consolidate all available DeepSeek Android runtime research into a traceable engineering workspace. The repository tracks source provenance, reverse-engineering evidence, implementation status, test evidence and unresolved work.

## Workstreams
1. Android instrumentation: LSPosed/Xposed module, process filtering, ClassLoader acquisition and candidate Hook.
2. Host reverse engineering: DEX descriptors, Kotlin Flow, SSE parser, message/fragment model, JNI/native libraries.
3. Local API: OpenAI-compatible and Anthropic-compatible HTTP interfaces, streaming, authentication and cancellation.
4. Agent runtime: tool schema, policy, execution lifecycle, result reinjection, persistence and deduplication.
5. Nexus research: compare publicly visible architecture and distinguish MCP client/server responsibilities.
6. Compatibility: package/channel/version/hash/signing certificate/ABI and runtime method signatures.

## Current state
- Recovered: Java Xposed probe source and Gradle configuration from the former LSP-Deekseep repository.
- Recovered: static reverse-engineering report and four uploaded files with verified SHA-256.
- Partially reconstructed: decisions and branch summaries from available conversation context.
- Missing: verbatim export of every branch chat, complete JADX output, device LSPosed logs, verified APK artifact.
- Not implemented: production Local API server, Agent executor, SSE parser adapter, FileFragment decoder and runtime compatibility profiles.

## Definition of done
A workstream is complete only when source, evidence, tests, environment and limitations are documented. Code existing is not equivalent to a verified feature.
