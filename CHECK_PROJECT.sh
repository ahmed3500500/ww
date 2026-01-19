#!/bin/bash
echo "🔍 التحقق الشامل من المشروع..."
echo ""

# التحقق من الملفات الأساسية
echo "✅ الملفات الأساسية:"
[ -f "build.gradle.kts" ] && echo "  ✓ build.gradle.kts" || echo "  ✗ build.gradle.kts"
[ -f "settings.gradle.kts" ] && echo "  ✓ settings.gradle.kts" || echo "  ✗ settings.gradle.kts"
[ -f "gradle.properties" ] && echo "  ✓ gradle.properties" || echo "  ✗ gradle.properties"
[ -f "README.md" ] && echo "  ✓ README.md" || echo "  ✗ README.md"
[ -f "BUILD_GUIDE.md" ] && echo "  ✓ BUILD_GUIDE.md" || echo "  ✗ BUILD_GUIDE.md"

echo ""
echo "✅ ملفات التطبيق:"
[ -f "app/build.gradle.kts" ] && echo "  ✓ app/build.gradle.kts" || echo "  ✗ app/build.gradle.kts"
[ -f "app/src/main/AndroidManifest.xml" ] && echo "  ✓ AndroidManifest.xml" || echo "  ✗ AndroidManifest.xml"
[ -f "app/proguard-rules.pro" ] && echo "  ✓ proguard-rules.pro" || echo "  ✗ proguard-rules.pro"

echo ""
echo "✅ ملفات Kotlin:"
find app/src/main/kotlin -name "*.kt" | wc -l | xargs echo "  عدد ملفات Kotlin:"

echo ""
echo "✅ ملفات الموارد:"
[ -f "app/src/main/res/values/strings.xml" ] && echo "  ✓ strings.xml" || echo "  ✗ strings.xml"
[ -f "app/src/main/res/values/colors.xml" ] && echo "  ✓ colors.xml" || echo "  ✗ colors.xml"
[ -f "app/src/main/res/values/themes.xml" ] && echo "  ✓ themes.xml" || echo "  ✗ themes.xml"

echo ""
echo "✅ الصور:"
ls -1 app/src/main/res/drawable/*.png 2>/dev/null | wc -l | xargs echo "  عدد الصور:"

echo ""
echo "✅ الصوت:"
[ -f "app/src/main/res/raw/adhan.mp3" ] && echo "  ✓ adhan.mp3" || echo "  ✗ adhan.mp3"

echo ""
echo "📊 إحصائيات المشروع:"
echo "  - إجمالي الملفات: $(find . -type f | wc -l)"
echo "  - ملفات Kotlin: $(find . -name "*.kt" | wc -l)"
echo "  - ملفات XML: $(find . -name "*.xml" | wc -l)"
echo "  - حجم المشروع: $(du -sh . | cut -f1)"

echo ""
echo "✅ التحقق اكتمل!"
