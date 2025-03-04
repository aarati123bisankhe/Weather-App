pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS) // Ensures settings.gradle.kts controls repositories
    repositories {
        google()
        mavenCentral()
    }
}


rootProject.name = "WeatherApp"
include(":app")
