plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

val appName = (project.findProperty("appName") as String?) ?: "COT Runner"
val appUrl = (project.findProperty("appUrl") as String?) ?: "https://example.com"
val appId = (project.findProperty("appId") as String?) ?: "com.ginan.cotrunner"

android {
    namespace = "com.ginan.cotrunner"
    compileSdk = 34

    defaultConfig {
        applicationId = appId
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        resValue("string", "app_name", appName)
        buildConfigField("String", "APP_URL", "\"$appUrl\"")
    }

    buildFeatures {
        buildConfig = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
}
