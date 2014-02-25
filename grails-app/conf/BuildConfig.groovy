grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    plugins {
        build ':release:2.2.1', ':rest-client-builder:1.0.3', {
            export = false
        }

        runtime(":hibernate:$grailsVersion") {
            export = false
        }

        compile ':spring-security-core:2.0-RC2'

        runtime ":jquery:1.11.0.1"
    }
}
