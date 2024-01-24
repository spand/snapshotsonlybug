rootProject.name = "snapshotsonlybug"

pluginManagement {
    repositories {
        // Expected either to have the same effect
//         mavenLocal()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
            mavenContent {
                snapshotsOnly()
            }
        }
    }
}

buildscript {
    repositories {
        mavenLocal()
    }
}