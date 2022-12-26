import dev.petuska.npm.publish.task.NodeExecTask

plugins {
    id("dev.petuska.npm.publish")
    // Optional, added to avoid hard-coding node home
    id("com.github.node-gradle.node") version "3.5.0"
}

node {
    download.set(true)
}

npmPublish {
    nodeHome.set(tasks.nodeSetup.flatMap { it.nodeDir })
    packages {
        register("js") {
            version.set("4.20.69")
            packageName.set("coolio")
            files {
                from(tasks.getByPath(":GradlePluginTestModule:generateTypeScript"))
                from(tasks.getByPath(":GradlePluginTest:generateTypeScript"))
            }
        }
    }
    registries {
        register("nexus") {
            uri.set(uri("http://npm-registry.e-bitbox.com:8081/repository/npm-hosted/"))
        }
    }
}

tasks {
    withType<NodeExecTask> { dependsOn(nodeSetup) }
}
