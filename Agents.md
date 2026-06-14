# LLM / Agents Coding Guidelines

## 1. GraalVM Native Image Compatibility
- **Do NOT use reflection**: To ensure the project can be smoothly compiled using GraalVM Native Image, do not use any Java reflection packages or APIs (`java.lang.reflect.*`, `Class.forName()`, `Class.getMethod()`, `Class.getDeclaredField()`, etc.).
- **Use Native Alternatives**: Prefer native Java syntax and instance checks over reflection. For example, instead of using `java.lang.reflect.Array.getLength(value)`, use `value instanceof Object[]` or `value instanceof int[]`, etc.
- **Spring AOP**: When using Spring AOP, rely on `MethodSignature.getMethod()` provided by the join point rather than dynamically resolving methods via target class reflection.
- **Dynamic Proxies**: Avoid using `java.lang.reflect.Proxy.newProxyInstance()` dynamically at runtime if possible. If required, ensure that interface proxy configurations are explicitly declared for GraalVM Native Image compilation.
- **Serialization**: Do not use default Java serialization (`java.io.Serializable`, `ObjectInputStream`, `ObjectOutputStream`). Prefer using Jackson or Gson for serialization/deserialization to standard formats like JSON.
- **Method Handles**: Avoid using `java.lang.invoke.MethodHandles.lookup()` and dynamic method invocation, as these often require complex configuration for AOT compilation.
