plugins {
    id("vestiq.android.library")
}

android {
    namespace = "com.vestiq.core.datastore"
}

dependencies {
    implementation(project(":core:core-common"))
}
