# Host Compatibility Matrix

| Host build | Channel | Package | Version | APK SHA-256 | Runtime Hook |
|---|---|---|---|---|---|
| DeepSeek 2.7.1 / code288 | User-mentioned test target | com.deepseek.chat | Exact installed APK metadata not verified | Missing | Not verified |
| Other DeepSeek builds | Multiple possible channels | com.deepseek.chat | To be recorded per APK | Missing | Not verified |
| Uploaded module ZIP | Research module, not host app | com.dsmod.probe | Manifest 1.7.6 / code 36 | See artifact manifest | Static only |

## Required fingerprint
Record package, versionName, versionCode, APK SHA-256, signing certificate digest, installer/source channel, Android version, ABI and exact observed method descriptors. VersionCode alone is insufficient.
