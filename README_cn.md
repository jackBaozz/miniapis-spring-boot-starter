# Miniapis Java SDK (JDK 17+)

`miniapis-java-sdk` 是一个专为 **Java 17+** 深度定制的高效、通用的第三方 API 快速集成组件。
目前已经 **完全脱离了 Spring Boot 依赖**，变更为超轻量级的纯原生 Java SDK。

它开箱即用地集成了两大核心能力：
1. **轻量级原生参数校验**。
2. **庞大的外部公共 API 集成能力**：深度整合了来自 `public-apis` 社区的 **51 个分类、共 1,368 个** 活跃公共 API 的客户端，并内置全局代理支持。

本组件使用最新的 **Java 17 语言特性**：
- **`java.net.http.HttpClient`**：告别臃肿的第三方 HTTP 库，使用原生 HttpClient 进行异步和同步网络请求。
- **`Record` 类型**：大量精简数据模型定义，天然不可变。
- **`Switch Expressions` 和 `Pattern Matching`**：现代化语法的运用提升代码健壮性。
- **纯净依赖**：除了底层的 `Jackson` 用于 JSON 转换外，无任何 Spring 或其他重量级框架依赖，极致轻量，对 **GraalVM Native Image** 100% 友好。

---

## 🛠️ 编译与使用说明

### 1. 编译项目
由于这是一个标准的 Maven 项目，你可以轻松使用 Maven 命令进行编译：

```bash
# 编译并安装到本地 Maven 仓库
mvn clean install -DskipTests
```

### 2. 引入依赖
在你的项目的 `pom.xml` 中引入以下依赖：

```xml
<dependency>
    <groupId>com.baozhizhi.miniapis</groupId>
    <artifactId>miniapis-spring-boot-starter</artifactId>
    <version>0.1.0-SHAPSHOT</version>
</dependency>
```

### 3. 使用指南与典型示例

以下是三个典型的使用场景示例，帮助你快速将本 SDK 集成到你的项目中。

#### 示例 1：基础的无鉴权 API 调用
这是最简单的使用方式。只需选择对应的 API 客户端并传入目标 URL 即可。

```java
import com.bzz.miniapis.sdk.animals.RandomdogClient;

public class BasicUsageExample {
    public static void main(String[] args) {
        // 大量免 Key 的 API 只需要传入正确的 endpoint
        String url = "https://random.dog/woof.json";
        
        System.out.println("正在获取随机狗狗图片...");
        String response = RandomdogClient.execute(url);
        
        if (response != null) {
            System.out.println("请求成功！返回结果: " + response);
            // 接下来你可以使用 Jackson 等库来解析这个 JSON 字符串
        } else {
            System.err.println("数据获取失败。");
        }
    }
}
```

#### 示例 2：配置全局代理后的 API 调用
如果你的服务器环境需要通过代理才能访问外网，你可以进行全局的代理初始化。

```java
import com.bzz.miniapis.config.ProxyConfigHolder;
import com.bzz.miniapis.config.ProxyProperties;
import com.bzz.miniapis.sdk.development.GithubClient;

public class ProxyUsageExample {
    public static void main(String[] args) {
        // 1. 组装代理配置信息
        ProxyProperties proxyProps = new ProxyProperties();
        proxyProps.setEnabled(true);
        proxyProps.setType("SOCKS5"); // 支持 HTTP, SOCKS4, SOCKS5
        proxyProps.setHost("127.0.0.1");
        proxyProps.setPort(1080);
        
        // 2. 初始化全局代理配置
        ProxyConfigHolder.initialize(proxyProps);

        // 3. 接下来所有客户端的 execute 调用都会自动走这个代理
        String githubApiUrl = "https://api.github.com/users/octocat";
        String response = GithubClient.execute(githubApiUrl);
        
        System.out.println("GitHub 用户信息: " + response);
    }
}
```

#### 示例 3：解析原生 JSON 响应结果
因为本 SDK 是纯 Java 实现，去除了臃肿的实体映射绑定，客户端将直接返回原生的 JSON 字符串。你可以利用底层自带的 `Jackson` 库轻松进行解析。

```java
import com.bzz.miniapis.sdk.geocoding.IpinfoClient;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParsingExample {
    public static void main(String[] args) {
        try {
            // 调用 IP 信息查询 API
            String responseStr = IpinfoClient.execute("https://ipinfo.io/161.185.160.93/geo");
            
            if (responseStr != null) {
                // 使用 Jackson ObjectMapper 解析响应
                ObjectMapper mapper = new ObjectMapper();
                JsonNode rootNode = mapper.readTree(responseStr);
                
                String city = rootNode.path("city").asText();
                String country = rootNode.path("country").asText();
                String location = rootNode.path("loc").asText();
                
                System.out.printf("该 IP 位于 %s, %s (经纬度: %s)%n", city, country, location);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

## 📂 项目目录结构与实现原理

本 SDK 的源码结构高度模块化，清晰地划分了核心校验切面、全局代理配置以及外部 API 客户端：

```text
com.bzz.miniapis
├── aop
│   └── DoCheckPoint.java               # 原生参数校验切面逻辑
├── config
│   ├── ProxyConfigHolder.java          # 全局代理配置持有类
│   └── ProxyProperties.java            # 代理属性配置类
├── enums
│   └── Check.java                      # 参数校验支持的类型枚举（Email、Phone、Url 等）
├── sdk                                 # 51 个分类的第三方 API SDK
│   ├── animals                         # 动物分类包
│   │   ├── AxolotlClient.java          # 原生 HTTP 客户端接口
│   │   └── ...
│   ├── geocoding                       # 地理编码包
│   ├── weather                         # 气象天气包
│   └── ...
└── utils
    └── CheckUtil.java                  # 核心正则和逻辑校验工具类
```

### 💡 核心实现原理：
* **原生 HTTP 接口**：所有的 `Client` 接口底层均使用了 JDK 11+ 原生的 `java.net.http.HttpClient`，配合流式的 Builder 模式。
* **无 Spring Boot 上下文**：作为纯 Java SDK，配置的初始化和 API 调用不再依赖于 Spring 的应用上下文。

---

## ⚡ GraalVM Native Image 支持

本项目已通过全面重构，**移除了所有运行时的 Java 反射依赖**。
核心特性均已使用静态 `instanceof` 等原生方案重写。因此，您可以无缝将其接入到基于 GraalVM 的 Ahead-of-Time (AOT) 编译体系中。

---

## 📊 API 能力分类与认证说明

本组件在后台通过**代理环境（全球网络连通）**对所有的第三方 API 进行了连通性测试，最终保留了 **1,368 个在线的公共 API**。

按照认证机制，集成的服务主要划分为两大类：
1. **🟢 免 Key 认证服务 (No Auth)**：共计 **637** 个。此类服务开箱即用，不需要提供任何 API Key。
2. **🔴 需要认证服务 (apiKey / OAuth)**：共计 **731** 个。此类服务必须在其官方网站申请对应的授权 Token 或 API Key，并在请求时传入。

### 🏷️ 51 个 API 能力分类与分布
详细分类及具体接口说明请直接查看 `docs/api_overview.md`。以下是主要的前五大热门分类：
* **Development (开发与工具)**：116 个客户端
* **Games & Comics (游戏与漫画)**：89 个客户端
* **Geocoding (地理定位与 IP)**：86 个客户端
* **Government (政府与公共事务)**：82 个客户端
* **Transportation (交通与航空航天)**：67 个客户端
