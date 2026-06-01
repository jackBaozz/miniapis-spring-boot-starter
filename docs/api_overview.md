# Miniapis SDK - 集成 API 总览

本 Starter 深度集成了多个来自 `public-apis` 社区的免费且免 Key 的高质量第三方 API 服务。通过 Spring Boot 3.3.x 提供的声明式 HTTP Interfaces 架构，使用者可以通过依赖注入对应的 Client 接口，以极简的方式在项目里调用这些服务。

## 📂 API 分类目录

当前集成的 API 主要划分为以下四大核心功能分类：

| 分类 | 服务名称 | 对应客户端 Bean | 默认 Base URL | 功能描述 | 详细说明文档 |
| :--- | :--- | :--- | :--- | :--- | :---: |
| **测试与模拟** | **JSONPlaceholder** | `JsonPlaceholderClient` | `https://jsonplaceholder.typicode.com` | 提供帖子、评论等 Mock 数据接口，用于前端调试或集成测试。 | [查看详情](placeholder_api.md) |
| **地理与气象** | **Open-Meteo Weather** | `OpenMeteoClient` | `https://api.open-meteo.com` | 提供全球任意经纬度的天气预测、当前温度、风速等实时气象数据。 | [查看详情](weather_api.md) |
| **网络与工具** | **ipify** | `IpifyClient` | `https://api.ipify.org` | 一个极致简单、高可用的公共 IP 解析服务，用于获取当前设备公网 IP。 | [查看详情](ipify_api.md) |
| **娱乐与社交** | **Official Joke API** | `JokeClient` | `https://official-joke-api.appspot.com` | 随机获取英文幽默、编程段子等笑话的 API 服务。 | [查看详情](joke_api.md) |

---

## ⚙️ 统一启用与配置

所有集成的 API 在引入本 Starter 时**默认自动启用**。你可以在主项目的配置文件中对它们进行开关控制，或者重写其接口服务地址（例如在局域网有代理中转或镜像源时）：

```yaml
miniapis:
  # 1. JSONPlaceholder 模拟数据
  placeholder:
    enabled: true  # 是否启用，默认为 true
    url: "https://jsonplaceholder.typicode.com" # 服务地址
    
  # 2. Open-Meteo 天气预报
  weather:
    enabled: true
    url: "https://api.open-meteo.com"
    
  # 3. ipify 公网 IP 获取
  ipify:
    enabled: true
    url: "https://api.ipify.org"
    
  # 4. Official Joke API 随机笑话
  joke:
    enabled: true
    url: "https://official-joke-api.appspot.com"
```

## 🛠️ 底层封装设计

本 SDK 的声明式客户端统一在自动配置类 `MiniapisAutoConfiguration` 中通过以下方式装配：
- 底层采用 Spring `RestClient` 作为 HTTP 请求引擎，性能高且资源消耗小。
- 使用 `HttpServiceProxyFactory` 从标准的 `@HttpExchange` 声明式接口中动态生成代理客户端。
- 配置了 Jackson 转换器，所有出参模型均使用 POJO/DTO 类接收，并自动完成反序列化。
