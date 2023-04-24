plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "me.kirill_timofeev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnit()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}