pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "VestIQ"

include(":app")

// core — platform-agnostic + Android infrastructure
include(":core:core-model")
include(":core:core-common")
include(":core:core-ui")
include(":core:core-network")
include(":core:core-database")
include(":core:core-datastore")

// data — repositories + mock data sources
include(":data:data-auth")
include(":data:data-market")
include(":data:data-wallet")
include(":data:data-advisor")

// feature — screens + view models
include(":feature:feature-auth")
include(":feature:feature-dashboard")
include(":feature:feature-market")
include(":feature:feature-asset-detail")
include(":feature:feature-wallet")
include(":feature:feature-advisor")
