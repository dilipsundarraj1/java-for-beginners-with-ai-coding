plugins {
    id("java")
    id("application")
}

group = "com.modernjava"
version = ""


application {
    mainClass.set("app.CalculatorApp")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "app.CalculatorApp"
    }
}

