import cz.habarta.typescript.generator.JsonLibrary
import cz.habarta.typescript.generator.TypeScriptOutputKind

plugins {
    id("java-library")
    id("cz.habarta.typescript-generator")
}


sourceSets {
    main {
        java {
            resources {
                srcDir("build/typescript-generator")
            }
        }
    }
}

tasks {
    generateTypeScript {
        jsonLibrary = JsonLibrary.jackson2
        classes = listOf("com.company.deeper.SomeOtherJavaClass")
        outputKind = TypeScriptOutputKind.module
//        namespace = "Rest";
        outputs.dir(buildDir.resolve("typescript-generator"))
    }
    build {
        dependsOn(generateTypeScript)
    }
}
