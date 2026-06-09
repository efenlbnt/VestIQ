plugins {
    id("vestiq.android.library")
    id("vestiq.android.compose")
}

android {
    namespace = "com.vestiq.feature.dashboard"
}

dependencies {
    implementation(project(":core:core-ui"))
    implementation(project(":core:core-model"))
    implementation(project(":core:core-common"))
    implementation(project(":data:data-wallet"))
    implementation(project(":data:data-market"))

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.compose.ui)
    debugImplementation(libs.androidx.compose.ui.tooling)
}
