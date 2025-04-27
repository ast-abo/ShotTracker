// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    implementation 'org.tensorflow:tensorflow-lite:2.11.0'
    implementation 'androidx.camera:camera-core:1.2.0'
    implementation 'androidx.camera:camera-view:1.2.0'
    implementation 'androidx.camera:camera-lifecycle:1.2.0'
}