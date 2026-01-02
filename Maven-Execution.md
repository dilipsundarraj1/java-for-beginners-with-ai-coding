# Maven Build Guide

This project now supports both **Gradle** and **Maven** as build tools.

## Prerequisites

- Java 25 or later installed
- Maven 3.8.0 or later installed

To check if Maven is installed:
```bash
mvn --version
```

If you need to install Maven, visit: https://maven.apache.org/download.cgi

## Maven Project Structure

The project uses a multi-module Maven structure:

```
java-for-beginners-with-ai-coding/
├── pom.xml (root parent POM)
├── basics/
│   └── pom.xml
├── basics-final/
│   └── pom.xml
├── apps/
│   ├── calculatorapp/
│   │   └── pom.xml
│   └── movieapp/
│       └── pom.xml
└── apps-final/
    ├── calculatorapp/
    │   └── pom.xml
    └── movieapp/
        └── pom.xml
```

## Common Maven Commands

### Build the entire project
```bash
mvn clean install
```

### Build a specific module
```bash
mvn clean install -pl basics
mvn clean install -pl apps/calculatorapp
mvn clean install -pl apps-final/movieapp
```

### Compile only (without tests)
```bash
mvn clean compile
```

### Run tests
```bash
mvn test
```

### Run tests for a specific module
```bash
mvn test -pl basics
```

### Create a JAR file
```bash
mvn clean package
```

### Create a JAR with all dependencies included (calculator app)
```bash
mvn clean package -pl apps/calculatorapp
```

The output will be in the `target/` directory of each module.

### Skip tests during build
```bash
mvn clean install -DskipTests
```

### View dependency tree
```bash
mvn dependency:tree
```

### Clean build artifacts
```bash
mvn clean
```

## Running Applications

### Calculator App (from apps module)
```bash
cd apps/calculatorapp
mvn clean package
java -jar target/calculatorapp.jar
```

### Calculator App Final (from apps-final module)
```bash
cd apps-final/calculatorapp
mvn clean package
java -jar target/calculatorapp.jar
```

## IDE Integration

### IntelliJ IDEA
1. Open the project in IntelliJ
2. IntelliJ will automatically detect the `pom.xml` file
3. The Maven panel will appear on the right side
4. You can execute Maven goals directly from the IDE

### Eclipse
1. Open the project as existing Maven project
2. Right-click project → Configure → Convert to Maven Project
3. Maven nature will be added automatically

### Visual Studio Code
1. Install Maven extension (by Microsoft or other vendor)
2. Open the project folder
3. Maven commands will be available in the command palette

## Project Configuration

### Java Version
The project is configured for Java 25. To change this, update the `<maven.compiler.source>` and `<maven.compiler.target>` properties in the root `pom.xml`:

```xml
<properties>
    <maven.compiler.source>25</maven.compiler.source>
    <maven.compiler.target>25</maven.compiler.target>
</properties>
```

### Dependencies
All projects inherit the following test dependencies from the parent POM:
- JUnit 5.9.1 (Jupiter API & Engine)
- JUnit Platform Launcher

### Main Classes (Application Entry Points)
- **Calculator App**: `com.calculator.CalculatorApp`
- **Movie App**: Application main class not yet specified

## Directory Structure Comparison

### Maven Directory Structure
```
module/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       └── java/
└── target/
    ├── classes/
    ├── test-classes/
    └── [module-name].jar
```

### Gradle Directory Structure (still supported)
```
module/
├── build.gradle.kts
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       └── java/
└── build/
    ├── classes/
    ├── test-classes/
    └── libs/
```

## Switching Between Build Tools

You can use either Gradle or Maven interchangeably:

**Using Gradle:**
```bash
./gradlew build
```

**Using Maven:**
```bash
mvn clean install
```

Both will produce the same output structure and compiled classes.

## Troubleshooting

### Issue: Maven not found
**Solution**: Ensure Maven is installed and added to your system PATH
```bash
mvn --version
```

### Issue: Java version mismatch
**Solution**: Check your JAVA_HOME environment variable and ensure Java 25 is installed
```bash
java --version
javac --version
```

### Issue: Slow Maven build on first run
**Solution**: This is normal as Maven downloads dependencies on first use. Subsequent builds will be faster.

### Issue: Out of memory during build
**Solution**: Increase Maven heap size
```bash
export MAVEN_OPTS="-Xmx1024m"
mvn clean install
```

## Additional Resources

- Maven Official Documentation: https://maven.apache.org/guides/
- Maven Central Repository: https://mvnrepository.com/
- Java 25 Features: https://docs.oracle.com/en/java/javase/25/


