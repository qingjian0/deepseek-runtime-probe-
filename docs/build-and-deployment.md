# Build and Deployment

## Toolchain
- JDK 17
- Gradle 8.9
- Android Gradle Plugin 8.7.3
- Android SDK Platform 35
- Build Tools 35.0.0

## Local build
~~~bash
gradle --no-daemon :app:assembleDebug
~~~

Output: app/build/outputs/apk/debug/app-debug.apk.

## LSPosed
1. Install the APK.
2. Enable module in LSPosed.
3. Scope only com.deepseek.chat.
4. Force-stop and relaunch DeepSeek.
5. Inspect LSPosed logs for [DSRP].

APK installation is not proof of module activation. Module activation is not proof of candidate execution.
