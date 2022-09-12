import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.jetbrains.kotlin.multiplatform").version("1.6.20")
}

repositories {
  mavenLocal()
  mavenCentral()
}

kotlin {
  jvm()
  js(IR) {
    nodejs()
  }

  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation("com.example:lib:0.1")
      }
    }
  }
}