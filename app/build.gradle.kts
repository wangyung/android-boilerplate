plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

val kotlinVersion by rootProject.extra { "1.3.11" }
val appCompatVersion by rootProject.extra { "1.0.2" }
val androidxWidgetVersion by rootProject.extra { "1.0.0" }
val constraintLayoutVersion by rootProject.extra { "2.0.0-alpha2" }
val lifecycleVersion by rootProject.extra { "2.0.0" }
val jacksonVersion by rootProject.extra { "2.9.7" }
val retrofitVersion by rootProject.extra { "2.5.0" }
val retrofitCoroutineVersion by rootProject.extra { "0.9.2" }
val kotlinxCoroutineVersion by rootProject.extra { "1.0.1" }
val materialVersion by rootProject.extra { "1.0.0" }
val glideVersion by rootProject.extra { "4.8.0" }
val koinVersion by rootProject.extra { "1.0.2" }

// For tests
val junitVersion by rootProject.extra { "4.12" }
val testExtVersion by rootProject.extra { "1.0.0" }
val espressoVersion by rootProject.extra { "3.1.0" }
val robolectricVersion by rootProject.extra { "4.1" }

android {
    compileSdkVersion(28)
    defaultConfig {
        // TODO: Replace the applicationId
        applicationId = "com.github.example"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
    implementation("androidx.appcompat:appcompat:$appCompatVersion")
    implementation("androidx.cardview:cardview:$androidxWidgetVersion")
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")
    implementation("androidx.lifecycle:lifecycle-extensions:$lifecycleVersion")
    implementation("androidx.recyclerview:recyclerview:$androidxWidgetVersion")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
    implementation("com.github.bumptech.glide:glide:$glideVersion")
    implementation("com.google.android.material:material:$materialVersion")
    implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:$retrofitCoroutineVersion")
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-jackson:$retrofitVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutineVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlinxCoroutineVersion")

    implementation("org.koin:koin-android-viewmodel:$koinVersion")

    kapt("com.github.bumptech.glide:compiler:$glideVersion")

    testImplementation("androidx.test.ext:junit:$testExtVersion")
    testImplementation("androidx.test.espresso:espresso-core:$espressoVersion")
    testImplementation("junit:junit:$junitVersion")
    testImplementation("org.koin:koin-test:$koinVersion")
    testImplementation("org.robolectric:robolectric:$robolectricVersion")
    androidTestImplementation("androidx.test.ext:junit:$testExtVersion")
    androidTestImplementation("androidx.test.espresso:espresso-core:$espressoVersion")
}

kapt {
    correctErrorTypes = true
}
