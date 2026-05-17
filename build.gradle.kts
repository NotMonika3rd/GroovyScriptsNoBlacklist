plugins {
    id("java")
    id("xyz.wagyourtail.unimined") version "1.4.18-kappa"
}

group = "rip.sayori"
version = "1.0-SNAPSHOT"

unimined.minecraft {
    version = "1.12.2"

    mappings.mcp("stable", "39-1.12")

    cleanroom {
        loader("0.5.9-alpha")
    }
}
repositories {
    mavenCentral()
    unimined.modrinthMaven()
}

dependencies {
    "modImplementation"("maven.modrinth:groovyscript:1.4.3")
}
