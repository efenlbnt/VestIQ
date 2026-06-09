plugins {
    id("vestiq.android.library")
}

android {
    namespace = "com.vestiq.core.network"
}

dependencies {
    implementation(project(":core:core-model"))
    implementation(project(":core:core-common"))
}
