plugins {
    id("groovy-gradle-plugin")
}

repositories {
    gradlePluginPortal() // so that external plugins can be resolved in dependencies section
    mavenCentral()
}
dependencies {
    // https://mvnrepository.com/artifact/dev.petuska.npm.publish/dev.petuska.npm.publish.gradle.plugin
    implementation("dev.petuska.npm.publish:dev.petuska.npm.publish.gradle.plugin:3.1.0")
    // https://mvnrepository.com/artifact/cz.habarta.typescript-generator/typescript-generator-gradle-plugin
    implementation("cz.habarta.typescript-generator:typescript-generator-gradle-plugin:3.1.1185")
}