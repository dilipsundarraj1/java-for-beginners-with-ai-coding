plugins {
    id("java")
    id("application")
}

group = "com.modernjava"
version = "1.0"


repositories {
    mavenCentral()
}

application {
    mainClass.set("app.MovieTicketApp")
}

tasks.test {
    useJUnitPlatform()
}
