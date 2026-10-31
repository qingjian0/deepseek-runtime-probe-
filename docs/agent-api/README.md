# Local Agent and API Design

## Status
This directory documents the target design. No production Local API server or Agent executor is present in the recovered source baseline.

## Proposed layers
1. Local API Gateway: loopback-only HTTP listener, API-key authentication, request validation, bounded concurrency and SSE framing.
2. Protocol adapters: OpenAI Chat Completions and Anthropic Messages first; Responses compatibility only after schema tests.
3. Host transport adapter: translate validated API requests into the host's supported request/session path.
4. Stream bridge: map text/reasoning deltas and terminal states; propagate cancellation and backpressure.
5. Agent runtime: tool registry, JSON Schema validation, explicit permissions, timeout, idempotency and result reinjection.
6. Device bridge: in-app operations by default; Root/Shizuku only with explicit authorization and per-operation policy.

## Compatibility and safety
- Do not bypass official authentication, PoW, TLS or service-side controls.
- Never export host cookies, bearer tokens or private session credentials.
- Bind loopback by default; LAN mode requires explicit opt-in and strong authentication.
- Validate and bound tool calls; destructive actions require confirmation.
- SSE must terminate correctly on finish, close, error and cancel.
