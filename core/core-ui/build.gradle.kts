plugins {
    id("vestiq.android.library")
    id("vestiq.android.compose")
}

android {
    namespace = "com.vestiq.core.ui"
}

dependencies {
    implementation(project(":core:core-model"))

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.compose.ui)
    debugImplementation(libs.androidx.compose.ui.tooling)
}
