plugins {
    id("vestiq.android.library")
}

android {
    namespace = "com.vestiq.data.market"
}

dependencies {
    implementation(project(":core:core-model"))
    implementation(project(":core:core-common"))
    implementation(project(":core:core-network"))
    implementation(project(":core:core-database"))
}
