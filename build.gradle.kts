plugins {
    groovy
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(gradleTestKit())
    testImplementation("org.spockframework:spock-core:2.3-groovy-3.0")
    testImplementation("org.spockframework:spock-junit4:2.3-groovy-3.0")

    testImplementation("io.ratpack:ratpack-groovy-test:1.9.0") {
        exclude(group = "org.codehaus.groovy", module = "groovy-all")
    }
    testImplementation("com.fasterxml.jackson.dataformat:jackson-dataformat-smile:2.17.0")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

tasks {
    test {
        useJUnitPlatform()
    }
}
