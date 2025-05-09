//plugins {
//    id("com.android.application")
//    id("kotlin-android")
//}
//
//
//android {
//    namespace = "com.codingtutorials.weatherapp"
//    compileSdk = 34
//
//    defaultConfig {
//        applicationId = "com.codingtutorials.weatherapp"
//        minSdk = 24
//        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_1_8
//        targetCompatibility = JavaVersion.VERSION_1_8
//    }
//}
//
//dependencies {
//    implementation ("com.google.firebase:firebase-auth:21.0.1")// Ensure latest version
//    implementation("androidx.appcompat:appcompat:1.7.0")
//    implementation("com.google.android.material:material:1.12.0")
//    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
//    implementation("androidx.activity:activity:1.10.0")
//    testImplementation("junit:junit:4.13.2")
//    androidTestImplementation("androidx.test.ext:junit:1.2.1")
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
//    implementation("com.squareup.okhttp3:okhttp:4.9.3")
//
//}


plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}











