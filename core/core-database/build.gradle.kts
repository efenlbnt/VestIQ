plugins {
    id("vestiq.android.library")
}

android {
    namespace = "com.vestiq.core.database"
}

dependencies {
    implementation(project(":core:core-model"))
    implementation(project(":core:core-common"))
}
