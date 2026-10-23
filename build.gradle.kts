subprojects {
    apply(plugin = "java")

    repositories { mavenCentral() }

    extensions.configure<JavaPluginExtension> {
        sourceSets["main"].java.setSrcDirs(listOf("src"))
        sourceSets["test"].java.setSrcDirs(listOf("test", rootProject.file("test-support")))
    }

    dependencies {
        "testImplementation"(platform("org.junit:junit-bom:5.13.4"))
        "testImplementation"("org.junit.jupiter:junit-jupiter")
        "testRuntimeOnly"("org.junit.platform:junit-platform-launcher")
    }

    tasks.withType<JavaCompile>().configureEach {
        options.release = 21
    }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
    }
}
