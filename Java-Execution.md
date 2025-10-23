```mermaid
flowchart LR
    A[Source Code] -->|javac| B[Bytecode]
    B --> C[JVM]
    C --> D[Program Execution Output]
    C -->|inside| E[JRE]
```