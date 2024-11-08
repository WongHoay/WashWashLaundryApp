// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    alias(libs.plugins.android.application) apply false

    id("com.google.gms.google-services") version "4.4.2" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Classpath for the Android Gradle Plugin
        classpath("com.android.tools.build:gradle:8.1.0")  // Use latest compatible version
        // Firebase classpath for Google Services plugin
        classpath("com.google.gms:google-services:4.3.15")
    }
}