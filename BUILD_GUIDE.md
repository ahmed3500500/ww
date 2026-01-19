# 📦 دليل بناء التطبيق

## خطوات البناء التفصيلية:

### 1. تثبيت المتطلبات:

```bash
# تثبيت JDK 17
sudo apt-get update
sudo apt-get install -y openjdk-17-jdk

# التحقق من التثبيت
java -version
```

### 2. تثبيت Android Studio (اختياري):

- تحميل من: https://developer.android.com/studio
- أو استخدام command line tools

### 3. البناء من Command Line:

```bash
cd islamic_prayer_native

# تنظيف المشروع
./gradlew clean

# بناء APK Debug
./gradlew assembleDebug

# بناء APK Release
./gradlew assembleRelease
```

### 4. ملف APK النهائي:

```
app/build/outputs/apk/release/app-release.apk
```

### 5. التثبيت على الجهاز:

```bash
adb install app/build/outputs/apk/release/app-release.apk
```

---

## 🔧 حل المشاكل:

### مشكلة: Gradle sync failed
**الحل**: 
```bash
./gradlew --refresh-dependencies
```

### مشكلة: SDK not found
**الحل**: 
- تثبيت Android SDK
- تعيين ANDROID_HOME

### مشكلة: Build failed
**الحل**: 
```bash
./gradlew clean
./gradlew build --stacktrace
```

---

**نجاح البناء! 🎉**
