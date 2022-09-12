import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.jetbrains.kotlin.multiplatform").version("1.7.10")
  id("maven-publish")
}

group = "com.example"
version = "0.1"

repositories {
  mavenCentral()
}

tasks.withType(KotlinCompile::class.java).configureEach {
  kotlinOptions {
    apiVersion = "1.5"
    languageVersion = "1.5"
  }
}

kotlin {
  jvm()
  js(IR) {
    nodejs()
  }

  sourceSets {
    val commonMain by getting {
    }
  }
}