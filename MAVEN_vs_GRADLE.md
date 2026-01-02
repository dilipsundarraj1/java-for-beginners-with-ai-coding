# Maven vs Gradle Configuration - This Project

## Configuration File Structure

### Root Level Configuration

**Gradle (build.gradle.kts)**:
```kotlin
plugins {
    id("java")
}

group = "org.example"
version = ""

repositories {
    mavenCentral()
}

subprojects {
    apply(plugin="java")
    java {
        sourceCompatibility = JavaVersion.VERSION_25
        targetCompatibility = JavaVersion.VERSION_25
    }
    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.9.1"))
        testImplementation("org.junit.jupiter:junit-jupiter")
        // ...
    }
    tasks.test {
        useJUnitPlatform()
    }
}
```

**Maven (pom.xml)**:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="...">
    <modelVersion>4.0.0</modelVersion>
    <groupId>org.example</groupId>
    <artifactId>java-for-beginners-with-ai-coding</artifactId>
    <version>1.0.0</version>
    <packaging>pom</packaging>

    <properties>
        <maven.compiler.source>25</maven.compiler.source>
        <maven.compiler.target>25</maven.compiler.target>
    </properties>

    <repositories>
        <repository>
            <id>central</id>
            <url>https://repo.maven.apache.org/maven2</url>
        </repository>
    </repositories>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.junit</groupId>
                <artifactId>junit-bom</artifactId>
                <version>5.9.1</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <modules>
        <module>basics</module>
        <!-- ... -->
    </modules>
</project>
```

---

## Command Comparison

| Task | Gradle | Maven |
|------|--------|-------|
| **Build entire project** | `./gradlew build` | `mvn clean install` |
| **Clean build** | `./gradlew clean build` | `mvn clean install` |
| **Compile only** | `./gradlew classes` | `mvn clean compile` |
| **Run tests** | `./gradlew test` | `mvn test` |
| **Skip tests** | `./gradlew build -x test` | `mvn clean install -DskipTests` |
| **Build specific module** | `./gradlew :basics:build` | `mvn clean install -pl basics` |
| **Create JAR** | `./gradlew jar` | `mvn clean package` |
| **View dependencies** | `./gradlew dependencies` | `mvn dependency:tree` |
| **Clean artifacts** | `./gradlew clean` | `mvn clean` |
| **Run custom task** | `./gradlew customTask` | `mvn goal-name` |

---

## Directory Structure

### After Gradle Build
```
module/
├── build.gradle.kts
├── src/
│   ├── main/java/...
│   └── test/java/...
└── build/                    ← Gradle output
    ├── classes/
    ├── libs/
    └── test-classes/
```

### After Maven Build
```
module/
├── pom.xml
├── src/
│   ├── main/java/...
│   └── test/java/...
└── target/                   ← Maven output
    ├── classes/
    ├── test-classes/
    └── [module-name].jar
```

**Key Difference**: 
- Gradle uses `build/` directory
- Maven uses `target/` directory
- Both should be in `.gitignore` (already configured)

---

## Module Configuration Comparison

### Gradle Approach (build.gradle.kts)

**Root Module**:
```kotlin
subprojects {
    // Configuration inherited by all modules
}

include("basics", "basics-final", "apps:calculatorapp", ...)
```

**Child Modules**:
```kotlin
// Usually empty, inherits from root
```

### Maven Approach (pom.xml)

**Root Module (pom.xml)**:
```xml
<modules>
    <module>basics</module>
    <module>basics-final</module>
    <module>apps</module>
    <!-- ... -->
</modules>
```

**Intermediate Aggregators (apps/pom.xml)**:
```xml
<modules>
    <module>calculatorapp</module>
    <module>movieapp</module>
</modules>
```

**Child Modules (basics/pom.xml)**:
```xml
<parent>
    <groupId>org.example</groupId>
    <artifactId>java-for-beginners-with-ai-coding</artifactId>
    <version>1.0.0</version>
    <relativePath>..</relativePath>
</parent>
```

---

## Dependency Management

### Gradle (build.gradle.kts)
```kotlin
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
```

### Maven (pom.xml)
```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.junit</groupId>
            <artifactId>junit-bom</artifactId>
            <version>5.9.1</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>

<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

---

## Plugin Configuration Comparison

### Running Tests

**Gradle (build.gradle.kts)**:
```kotlin
tasks.test {
    useJUnitPlatform()
}
```

**Maven (pom.xml)**:
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.1.2</version>
</plugin>
```

### Compiler Configuration

**Gradle (build.gradle.kts)**:
```kotlin
java {
    sourceCompatibility = JavaVersion.VERSION_25
    targetCompatibility = JavaVersion.VERSION_25
}
```

**Maven (pom.xml)**:
```xml
<properties>
    <maven.compiler.source>25</maven.compiler.source>
    <maven.compiler.target>25</maven.compiler.target>
</properties>

<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.11.0</version>
    <configuration>
        <source>25</source>
        <target>25</target>
    </configuration>
</plugin>
```

### Creating Executable JARs

**Gradle (build.gradle.kts)**:
```kotlin
// Typically configured in build.gradle.kts
```

**Maven (pom.xml)**:
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-shade-plugin</artifactId>
    <version>3.5.0</version>
    <executions>
        <execution>
            <phase>package</phase>
            <goals>
                <goal>shade</goal>
            </goals>
            <configuration>
                <transformers>
                    <transformer implementation="...ManifestResourceTransformer">
                        <mainClass>com.calculator.CalculatorApp</mainClass>
                    </transformer>
                </transformers>
                <finalName>calculatorapp</finalName>
            </configuration>
        </execution>
    </executions>
</plugin>
```

---

## IDE Integration

### IntelliJ IDEA

| Feature | Gradle | Maven |
|---------|--------|-------|
| **Auto-detection** | Yes (gradle wrapper) | Yes (pom.xml) |
| **Refresh project** | Sync Now button | Reload Maven Projects |
| **Run tests** | Gradle Tool Window | Maven Tool Window |
| **Build artifact** | Gradle build panel | Maven build panel |
| **Dependency tree** | Gradle Dependencies tab | Maven Dependency Analyzer |

### Eclipse

Both Gradle and Maven have good plugin support. Maven is native to Eclipse.

### Visual Studio Code

- **Gradle**: Extension Marketplace → "Gradle for Java"
- **Maven**: Extension Marketplace → "Maven for Java"

---

## Advantages of Each

### Gradle Advantages
✅ Faster builds (daemon, incremental compilation)
✅ More concise configuration (Kotlin DSL)
✅ Better for complex builds
✅ Plugin ecosystem very modern
✅ Flexible task creation

### Maven Advantages
✅ Industry standard in enterprises
✅ Better IDE integration out-of-box
✅ Convention over configuration
✅ Larger ecosystem of plugins
✅ Better documentation for beginners
✅ Simpler to understand project structure
✅ Dependency management is explicit
✅ Easier for CI/CD pipelines

---

## Which Should You Use?

| Scenario | Recommendation |
|----------|---|
| **Learning Java** | Maven (simpler, more standard) |
| **Enterprise Project** | Maven (widely adopted) |
| **Complex Build Logic** | Gradle (more powerful) |
| **Existing Gradle Project** | Continue with Gradle |
| **Team Uses Maven** | Maven (team consistency) |
| **Need Fast Builds** | Gradle (daemon, incremental) |
| **Starting Fresh** | Consider both, Maven is safer choice |

---

## Migration Path

You can gradually migrate from Gradle to Maven (or vice versa):

1. **Keep both**: Use whichever tool suits your current task
2. **Parallel build**: Some teams run both during CI/CD
3. **Gradual switch**: Migrate one module at a time
4. **Full switch**: Eventually retire one build tool (optional)

For this project, you now have **both options available** without any conflicts!

---

## Quick Reference: File Locations

```
Gradle Configuration:
├── build.gradle.kts (root)
├── settings.gradle.kts (root)
├── gradle/ (wrapper)
├── gradlew, gradlew.bat (wrapper scripts)
└── module/build.gradle.kts (each module)

Maven Configuration:
├── pom.xml (root)
├── module/pom.xml (each module)
└── apps/pom.xml (aggregators)

Ignore Both:
├── build/ (Gradle output)
└── target/ (Maven output)
```

---

## Summary

Both build tools work perfectly for this project:

- **Gradle** remains your primary build tool (existing configuration)
- **Maven** is now available as an alternative
- Source code and structure remain **identical**
- Switch between them as needed
- Use Maven for enterprise compatibility, Gradle for faster builds

Choose based on your **team preferences** and **project needs**!

