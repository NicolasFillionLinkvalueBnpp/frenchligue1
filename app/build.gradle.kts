plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "fr.fdj.frenchligue"
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        applicationId = "fr.fdj.frenchligue"
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation (Dependencies.coreAndroidX)
    implementation (Dependencies.lifeCycleRuntime)
    implementation (Dependencies.activityCompose)
    implementation (platform(Dependencies.composeBom))
    implementation (Dependencies.composeUi)
    implementation (Dependencies.composeGraphics)
    implementation (Dependencies.composeUiToolingPreview)
    implementation (Dependencies.composeMaterial3)
    testImplementation (Dependencies.junit)
    androidTestImplementation (Dependencies.androidTestJUnit)
    androidTestImplementation (Dependencies.androidTestEspresso)
    androidTestImplementation (platform(Dependencies.androidTestComposeBom))
    androidTestImplementation (Dependencies.androidTestComposeUi)
    debugImplementation (Dependencies.debugComposeUiTooling)
    debugImplementation (Dependencies.debugComposeUiTestManifest)
}