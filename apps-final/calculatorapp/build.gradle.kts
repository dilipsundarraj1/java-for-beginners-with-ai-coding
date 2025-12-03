plugins {
    id("java")
    id("application")
}

group = "com.modernjava"
version = ""


application {
    mainClass.set("com.calculator.app.CalculatorApp")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "com.calculator.app.CalculatorApp"
    }
}

