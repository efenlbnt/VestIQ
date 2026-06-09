import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Enables Jetpack Compose. Apply AFTER `vestiq.android.application` or
 * `vestiq.android.library` so the Android extension already exists.
 */
class AndroidComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("org.jetbrains.kotlin.plugin.compose")

            val enableCompose: (CommonExtension<*, *, *, *, *, *>) -> Unit = { ext ->
                ext.buildFeatures {
                    compose = true
                }
            }

            extensions.findByType(ApplicationExtension::class.java)?.let(enableCompose)
            extensions.findByType(LibraryExtension::class.java)?.let(enableCompose)
        }
    }
}
