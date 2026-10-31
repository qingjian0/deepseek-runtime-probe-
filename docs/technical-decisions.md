# Technical Decisions

## ADR-001 — Independent project identity
Use DeepSeek Runtime Probe (DSRP), not DSH branding or package namespace. The user explicitly requested a standalone LSPosed module and rejected DSH naming.

## ADR-002 — Android package
Use dev.deepseek.runtimeprobe. Implemented in the recovered Gradle baseline.

## ADR-003 — Target scope
Strictly target com.deepseek.chat; no global scope. Implemented in the Xposed entry and scope list.

## ADR-004 — Metadata-only Hook
Record method signatures, argument runtime types, result runtime type, exception type and elapsed time. Never record argument values or message payloads.

## ADR-005 — Explicit candidates, not blind global hooking
Probe evidence-backed candidate methods rather than sweeping all framework/application methods. Global hooking creates instability, excessive logs and privacy risk.

## ADR-006 — Preserve protocol/security flow
A future Local API adapter must use the host's authorized request path and preserve authentication, PoW, TLS and server-side controls. It must not extract or expose credentials.

## ADR-007 — Separate API gateway and Agent executor
HTTP protocol translation, host transport and tool execution are separate layers.

## ADR-008 — Evidence labels
Every claim is Observed, Verified, Inferred, Unverified or Missing. A method name or DEX string alone does not establish semantics.

## ADR-009 — Repository migration
The target repository was empty. A minimal bootstrap commit was required on main; substantive recovery is on migration/full-project-recovery.

## ADR-010 — Binary artifacts
Do not publicly redistribute third-party APK/APKS/DEX/SO files. Store filename, size, SHA-256, provenance and handling decision only.
