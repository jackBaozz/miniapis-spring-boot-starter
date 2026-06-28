# Miniapis Java SDK (JDK 17+)

[English](#english) | [中文](#中文)

---

<a id="english"></a>
## English

`miniapis-java-sdk` is a highly efficient, general-purpose third-party API integration component deeply customized for **Java 17+**. 
It is now **completely decoupled from Spring Boot dependencies**, transforming into an ultra-lightweight, pure native Java SDK.

It provides two core capabilities out-of-the-box:
1. **Lightweight Native Parameter Validation**.
2. **Massive External Public API Integration**: Deeply integrates declarative clients for **1,368 active public APIs across 51 categories** from the `public-apis` community, with built-in global proxy support.

This component utilizes the latest **Java 17 Language Features**:
- **`java.net.http.HttpClient`**: Says goodbye to bloated third-party HTTP libraries, using native HttpClient for asynchronous and synchronous network requests.
- **`Record` Types**: Massively simplified data model definitions, naturally immutable.
- **`Switch Expressions` and `Pattern Matching`**: Modern syntax usage enhances code robustness.
- **Pure Dependencies**: Besides the underlying `Jackson` for JSON conversion, it has absolutely no Spring or other heavyweight framework dependencies. It's extremely lightweight and 100% friendly to **GraalVM Native Image**.

---

### 🛠️ Build & Usage Instructions

#### 1. Build the Project
Since this is a standard Maven project, you can easily build it using the Maven CLI:

```bash
# Compile and install to your local Maven repository
mvn clean install -DskipTests
```

#### 2. Include the Dependency
Add the following dependency to your project's `pom.xml`:

```xml
<dependency>
    <groupId>com.baozhizhi.miniapis</groupId>
    <artifactId>miniapis-spring-boot-starter</artifactId>
    <version>0.1.0-SHAPSHOT</version>
</dependency>
```

#### 3. Usage Guide & Examples

Below are three typical usage examples covering different scenarios you might encounter when using this SDK.

##### Example 1: Basic API Call (No Authentication)
The simplest way to use the SDK. Just pick a client and pass the target URL.

```java
import com.bzz.miniapis.sdk.animals.RandomdogClient;

public class BasicUsageExample {
    public static void main(String[] args) {
        // Many APIs do not require an API key, just provide the endpoint
        String url = "https://random.dog/woof.json";
        
        System.out.println("Fetching a random dog image...");
        String response = RandomdogClient.execute(url);
        
        if (response != null) {
            System.out.println("Success! Response: " + response);
            // You can now parse the JSON string using Jackson or your preferred library
        } else {
            System.err.println("Failed to fetch data.");
        }
    }
}
```

##### Example 2: API Call with Global Proxy Configured
If your environment requires a proxy to access external networks, you can configure it globally once.

```java
import com.bzz.miniapis.config.ProxyConfigHolder;
import com.bzz.miniapis.config.ProxyProperties;
import com.bzz.miniapis.sdk.development.GithubClient;

public class ProxyUsageExample {
    public static void main(String[] args) {
        // 1. Configure the proxy properties
        ProxyProperties proxyProps = new ProxyProperties();
        proxyProps.setEnabled(true);
        proxyProps.setType("SOCKS5"); // Supports HTTP, SOCKS4, SOCKS5
        proxyProps.setHost("127.0.0.1");
        proxyProps.setPort(1080);
        
        // 2. Initialize the global proxy holder
        ProxyConfigHolder.initialize(proxyProps);

        // 3. All subsequent client calls will automatically use this proxy
        String githubApiUrl = "https://api.github.com/users/octocat";
        String response = GithubClient.execute(githubApiUrl);
        
        System.out.println("GitHub User Data: " + response);
    }
}
```

##### Example 3: Parsing the Native JSON Response
Since this SDK is pure Java without bloated JSON mappers attached to the clients, you will receive a raw JSON string. Here is how you can parse it using the embedded `Jackson` library.

```java
import com.bzz.miniapis.sdk.geocoding.IpinfoClient;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParsingExample {
    public static void main(String[] args) {
        try {
            // Call an IP Info API
            String responseStr = IpinfoClient.execute("https://ipinfo.io/161.185.160.93/geo");
            
            if (responseStr != null) {
                // Parse the response using Jackson ObjectMapper
                ObjectMapper mapper = new ObjectMapper();
                JsonNode rootNode = mapper.readTree(responseStr);
                
                String city = rootNode.path("city").asText();
                String country = rootNode.path("country").asText();
                String location = rootNode.path("loc").asText();
                
                System.out.printf("IP is located in %s, %s (Coordinates: %s)%n", city, country, location);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

### 📂 Project Structure & Implementation Principles

The SDK's source code is highly modularized, clearly separating core validation, proxy configurations, and external API clients:

```text
com.bzz.miniapis
├── aop
│   └── DoCheckPoint.java               # AOP parameter validation logic
├── config
│   ├── ProxyConfigHolder.java          # Global proxy configuration holder
│   └── ProxyProperties.java            # Proxy properties configuration class
├── enums
│   └── Check.java                      # Parameter validation types (Email, Phone, Url, etc.)
├── sdk                                 # 51 categories of third-party API SDKs
│   ├── animals                         # Animal category package
│   │   ├── AxolotlClient.java          # Native HTTP Client interface
│   │   └── ...
│   ├── geocoding                       # Geocoding package
│   ├── weather                         # Weather package
│   └── ...
└── utils
    └── CheckUtil.java                  # Core regex and logical validation utilities
```

#### 💡 Core Implementation Details:
* **Native HTTP Interface**: All `Client` interfaces utilize the native JDK 11+ `java.net.http.HttpClient` with stream-styled Builder patterns.
* **No Spring Boot Context**: The SDK is pure Java. Proxy configurations and API calls do not require a Spring application context to be running.

---

### ⚡ GraalVM Native Image Support

This project has been completely refactored to **remove all runtime Java reflection dependencies**.
Core features now use static `instanceof` patterns and native solutions. Therefore, you can seamlessly integrate it into a GraalVM Ahead-of-Time (AOT) compilation architecture.

---

### 📊 API Capabilities & Authentication

This component has verified the connectivity of all third-party APIs via a **global proxy network**, retaining **1,368 active public APIs**.

Based on the authentication mechanism, the integrated services fall into two main categories:
1. **🟢 No Auth Services**: 637 APIs. Ready to use out of the box without providing an API Key.
2. **🔴 Auth Required Services (apiKey / OAuth)**: 731 APIs. You must apply for an authorization Token/Key on their official website and pass it in the request.

#### 🏷️ 51 Categories Breakdown
The top 5 categories are:
* **Development**: 116 clients
* **Games & Comics**: 89 clients
* **Geocoding**: 86 clients
* **Government**: 82 clients
* **Transportation**: 67 clients

---

<br>

<a id="中文"></a>
## 中文

`miniapis-java-sdk` 是一个为 **Java 17+** 深度定制的高效、通用的第三方 API 聚合集成 SDK。
它现在已经**完全解耦了 Spring Boot 依赖**，蜕变成一个超轻量级的纯原生 Java SDK。

它开箱即用地提供两大核心能力：
1. **轻量级原生参数校验**。
2. **海量外部公共 API 集成**：内置了针对 `public-apis` 社区中 **51 个类别、1,368 个活跃公共 API** 的声明式客户端，并内置全局代理支持。

本组件使用了最新的 **Java 17 语言特性**：
- **`java.net.http.HttpClient`**：告别臃肿的第三方 HTTP 库，使用原生 HttpClient 进行异步和同步网络请求。
- **`Record` 类型**：大幅简化数据模型定义，天生不可变（Immutable）。
- **`Switch 表达式` 和 `模式匹配 (Pattern Matching)`**：现代语法提升代码健壮性。
- **纯净的依赖**：除了底层用于 JSON 转换的 `Jackson`，绝无 Spring 或其他重型框架依赖。极其轻量，**100% 完美支持 GraalVM Native Image**。

---

### 🛠️ 构建与使用说明

#### 1. 构建项目
由于这是一个标准的 Maven 项目，你可以通过 Maven CLI 轻松构建：

```bash
# 编译并安装到本地 Maven 仓库
mvn clean install -DskipTests
```

#### 2. 引入依赖
在你的项目中添加以下依赖到 `pom.xml`：

```xml
<dependency>
    <groupId>com.baozhizhi.miniapis</groupId>
    <artifactId>miniapis-spring-boot-starter</artifactId>
    <version>0.1.0-SHAPSHOT</version>
</dependency>
```

#### 3. 使用指南与示例

以下是三个典型的使用示例，涵盖了使用该 SDK 时可能遇到的不同场景。

##### 示例 1：基础 API 调用（无认证）
最简单的使用方式。只需挑选一个 Client 并传入目标 URL。

```java
import com.bzz.miniapis.sdk.animals.RandomdogClient;

public class BasicUsageExample {
    public static void main(String[] args) {
        // 许多 API 不需要 API key，只需提供端点地址即可
        String url = "https://random.dog/woof.json";
        
        System.out.println("Fetching a random dog image...");
        String response = RandomdogClient.execute(url);
        
        if (response != null) {
            System.out.println("Success! Response: " + response);
            // 现在你可以使用 Jackson 或你喜欢的 JSON 库来解析这个字符串
        } else {
            System.err.println("Failed to fetch data.");
        }
    }
}
```

##### 示例 2：配置全局代理的 API 调用
如果你的环境需要代理才能访问外网，你可以一次性配置全局代理。

```java
import com.bzz.miniapis.config.ProxyConfigHolder;
import com.bzz.miniapis.config.ProxyProperties;
import com.bzz.miniapis.sdk.development.GithubClient;

public class ProxyUsageExample {
    public static void main(String[] args) {
        // 1. 配置代理属性
        ProxyProperties proxyProps = new ProxyProperties();
        proxyProps.setEnabled(true);
        proxyProps.setType("SOCKS5"); // 支持 HTTP, SOCKS4, SOCKS5
        proxyProps.setHost("127.0.0.1");
        proxyProps.setPort(1080);
        
        // 2. 初始化全局代理持有者
        ProxyConfigHolder.initialize(proxyProps);

        // 3. 之后所有的客户端调用都会自动使用此代理
        String githubApiUrl = "https://api.github.com/users/octocat";
        String response = GithubClient.execute(githubApiUrl);
        
        System.out.println("GitHub User Data: " + response);
    }
}
```

##### 示例 3：解析原生 JSON 响应
由于此 SDK 是纯 Java，客户端没有绑定臃肿的 JSON 映射器，你将接收到一个原始的 JSON 字符串。以下是如何使用内置的 `Jackson` 库来解析它。

```java
import com.bzz.miniapis.sdk.geocoding.IpinfoClient;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParsingExample {
    public static void main(String[] args) {
        try {
            // 调用 IP 信息 API
            String responseStr = IpinfoClient.execute("https://ipinfo.io/161.185.160.93/geo");
            
            if (responseStr != null) {
                // 使用 Jackson ObjectMapper 解析响应
                ObjectMapper mapper = new ObjectMapper();
                JsonNode rootNode = mapper.readTree(responseStr);
                
                String city = rootNode.path("city").asText();
                String country = rootNode.path("country").asText();
                String location = rootNode.path("loc").asText();
                
                System.out.printf("该 IP 位于 %s, %s (坐标: %s)%n", city, country, location);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

### 📂 项目结构与实现原理

SDK 的源代码高度模块化，清晰地分离了核心校验、代理配置以及外部 API 客户端：

```text
com.bzz.miniapis
├── aop
│   └── DoCheckPoint.java               # AOP 参数校验逻辑
├── config
│   ├── ProxyConfigHolder.java          # 全局代理配置持有者
│   └── ProxyProperties.java            # 代理属性配置类
├── enums
│   └── Check.java                      # 参数校验类型枚举 (Email, Phone, Url 等)
├── sdk                                 # 51 大类的第三方 API SDK
│   ├── animals                         # 动物类
│   │   ├── AxolotlClient.java          # 原生 HTTP Client 接口
│   │   └── ...
│   ├── geocoding                       # 地理编码类
│   ├── weather                         # 天气类
│   └── ...
└── utils
    └── CheckUtil.java                  # 核心正则和逻辑校验工具类
```

#### 💡 核心实现细节：
* **原生 HTTP 接口**：所有的 `Client` 接口都利用了原生的 JDK 11+ `java.net.http.HttpClient`，配合流式 Builder 模式。
* **无 Spring Boot 上下文**：SDK 是纯 Java 的。代理配置和 API 调用不需要运行 Spring 应用程序上下文。

---

### ⚡ GraalVM Native Image 支持

本项目已被彻底重构，**移除了所有的运行时 Java 反射依赖**。
核心功能现在使用静态的 `instanceof` 模式和原生解决方案。因此，你可以无缝地将其集成到 GraalVM AOT (Ahead-of-Time) 编译架构中。

---

### 📊 API 能力与认证机制

本组件已通过**全球代理网络**验证了所有第三方 API 的连通性，保留了 **1,368 个活跃的公共 API**。

根据认证机制，集成的服务主要分为两大类：
1. **🟢 免认证服务**：637 个 API。开箱即用，无需提供 API Key。
2. **🔴 需认证服务 (apiKey / OAuth)**：731 个 API。你必须在其官网上申请授权 Token/Key，并在请求中传递。

#### 🏷️ 51 个分类统计
排名前 5 的类别为：
* **Development (开发)**：116 个客户端
* **Games & Comics (游戏动漫)**：89 个客户端
* **Geocoding (地理位置)**：86 个客户端
* **Government (政府数据)**：82 个客户端
* **Transportation (交通)**：67 个客户端