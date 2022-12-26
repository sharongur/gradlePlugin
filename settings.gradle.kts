pluginManagement {
    repositories {
        gradlePluginPortal()
        // https://github.com/gradle/gradle/issues/15406
        mavenCentral()
    }

}
rootProject.name = "GradlePluginTest"


include(
        ":GradlePluginTest",
        ":GradlePluginTestModule",
)