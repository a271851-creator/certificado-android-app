pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("")
                includeGroupByRegex("")
                includeGroupByRegex("")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Certificado2026-1"
include(":app")
