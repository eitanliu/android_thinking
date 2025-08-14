# Android Stub

## Frameworks

### Core

[platform/frameworks/base/+/refs/heads/main/core](https://android.googlesource.com/platform/frameworks/base/+/refs/heads/main/core/java)  
[com.android.internal](https://android.googlesource.com/platform/frameworks/base/+/refs/heads/main/core/java/com/android/internal)  

## Tools

### Common

[platform/tools/base/+/refs/heads/studio-main/common](https://android.googlesource.com/platform/tools/base/+/refs/heads/studio-main/common/src/)  
[platform/tools/base/+/refs/heads/tools-canary-release/common](https://android.googlesource.com/platform/tools/base/+/refs/heads/tools-canary-release/common/src/)  
[platform/tools/base/+/refs/heads/android13-d4-s2-release/common](https://android.googlesource.com/platform/tools/base/+/refs/heads/android13-d4-s2-release/common/src/)  


### RR引用替换
```
public static final int (\w+)\s*=\s*(\d+);
public static final int $1 = android.R.attr.$1;
```