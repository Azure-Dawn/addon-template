plugins {
    java
}

repositories {
    mavenCentral()

    maven {
        name = "labymod"
        url = uri("https://dist.labymod.net/api/v1/maven/release/")
    }
}

dependencies {
    // Zugriff auf API aus dem api-Modul
    implementation(project(":api"))

    // LabyMod API
    compileOnly("net.labymod.api:addon:4.0.0")

    // Annotation Processor (SEHR WICHTIG)
    annotationProcessor("net.labymod.api:addon:4.0.0")
}
