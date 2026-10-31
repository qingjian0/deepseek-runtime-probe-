# Main Project Thread — Reconstructed

## User requirements recovered
1. Build a local Agent and API based on public Nexus research.
2. Use Hook/injection in Android.
3. Reverse-engineer uploaded module package and DeepSeek client packages.
4. Investigate DeepSeek 2.7.1/code288 and potentially other Play/domestic builds; the user clarified that one uploaded build was not the only target.
5. Identify the actual main chat SSE parser, Flow emitted object types, finish/close/error/cancel lifecycle and nested FileFragment metadata.
6. Produce an installable APK that can be enabled in LSPosed.
7. Use an independent project name; do not brand it DSH.
8. Upload source, reports, history and documentation to GitHub.

## Recoverable technical progress
- Static analysis report for 模块.apk.zip exists.
- Earlier report identified Xposed entry com.dsmod.probe.Main, target com.deepseek.chat, two DEX files, multiple native libraries and a Deekseep developer letter.
- The report identifies Local API routes and Agent/MCP architecture from public-source comparison, while marking closed payload handlers and native behavior incomplete.
- DSRP metadata-only Java Hook baseline was committed to the former repository.
- Candidate list includes rx3#g, h60#b, nw1#j, nw1#e, nw1#a and st1#A.

## Important non-results
- No runtime signature capture from the user's phone was recovered.
- No Flow emitted object type was confirmed.
- No definitive main chat SSE parser was established.
- No complete FileFragment nested metadata decoder was recovered.
- No validated Local API server implementation was recovered.
- No APK with verified CI provenance and successful LSPosed runtime activation was recovered.
