# Android MVP Starter Template

This is a starter template for building Android apps in **Kotlin** with MVP architectural pattern in mind. It aims to make app development faster by providing some boilerplate code, as well as an appropriate folder structure. This template was inspired by Google's [Android Architecture Blueprints](https://github.com/googlesamples/android-architecture) and dmilicic's [Clean Architecture Boilerplate](https://github.com/dmilicic/Android-Clean-Boilerplate).

**Dagger2** is included.

Project also contains a simple *Splash Screen*  - make sure to adapt it to your preference:
* Why? - [Material Design Guidelines](https://material.io/guidelines/patterns/launch-screens.html) 
* How? - [Splash screen done the right way](https://www.bignerdranch.com/blog/splash-screens-the-right-way/)  

![](https://raw.githubusercontent.com/wiki/googlesamples/android-architecture/images/mvp.png)

*Image from Android Architecture Blueprints - presenting MVP Structure*

## How to use

1. Clone this repository
2. Change package `me.wozappz.mvpsplash` to your desired name [(Tutorial)](https://stackoverflow.com/questions/16804093/android-studio-rename-package)
3. Update AndroidManifest.xml to reflect package name change
4. Update `applicationId` in build.gradle

## Included libraries

* [Android Support Library](https://developer.android.com/topic/libraries/support-library/index.html) - for backwards compatibility
* [Dagger2](https://github.com/google/dagger) - for easy Dependency Injection
* [Anko](https://github.com/Kotlin/anko) - to simplify Android development
* [Leak Canary](https://github.com/square/leakcanary) - to find sneaky memory leaks

## License

This project is licensed under the Apache-2.0 License - see the [LICENSE](LICENSE) file for details
