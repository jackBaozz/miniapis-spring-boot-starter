# Miniapis Spring Boot Starter

`miniapis-spring-boot-starter` 是一个专为 **Spring Boot 3.x (推荐 3.3.x)** 和 **Java 21** 深度定制的高效、通用的第三方 API 快速集成 Starter 组件。

它开箱即用地集成了三大核心能力：
1. **轻量级声明式参数校验**（基于 AOP，免去繁琐的手动验证逻辑）。
2. **多通道 AI API 服务支持**（包括自研的高效无状态 `ChatGPTService` 以及官方 `OpenAiService` SDK 的无缝注入）。
3. **庞大的外部公共 API 集成能力**：深度整合了来自 `public-apis` 社区的 **51 个分类、共 1,368 个** 活跃公共 API 的声明式客户端。

---

## 📂 项目目录结构与实现原理

本 Starter 的源码结构高度模块化，清晰地划分了核心校验切面、AI 配置以及外部 API 客户端：

```text
com.bzz.miniapis
├── aspect
│   └── DoCheckAspect.java              # AOP 参数校验切面实现
├── config
│   ├── MiniapisAutoConfiguration.java  # 核心自动装配类（AI 客户端与基础配置）
│   ├── AgifyProperties.java            # 手动优化的 API 属性配置类
│   ├── CatFactProperties.java
│   ├── CoinDeskProperties.java
│   └── DogfactsProperties.java
├── enums
│   └── Check.java                      # 参数校验支持的类型枚举（Email、Phone 等）
├── sdk                                 # 51 个分类的第三方 API SDK（通过声明式客户端自动生成）
│   ├── animals                         # 动物分类包
│   │   ├── AnimalsAutoConfiguration.java # 动物分类 Bean 注册中心
│   │   ├── AxolotlClient.java           # 声明式 HTTP 客户端接口 (@HttpExchange)
│   │   ├── AxolotlProperties.java       # 每个 API 的可配 URL 和开关属性
│   │   └── ...
│   ├── geocoding                       # 地理编码包
│   ├── weather                         # 气象天气包
│   └── ...
├── service                             # AI 接口服务
│   ├── ChatGPTService.java             # 自研 ChatGPT 服务接口
│   └── ChatGPTServiceImpl.java         # 基于 RestClient 的 ChatGPT 实现
└── utils
    └── CheckUtil.java                  # 核心正则和逻辑校验工具类
```

### 💡 核心实现原理：
* **参数校验 AOP**：在 Controller 层方法上标注 `@DoCheck`。切面类 `DoCheckAspect` 会在方法执行前拦截，并读取参数通过 `CheckUtil` 进行规则校验，校验失败直接抛出异常。
* **声明式 HTTP 接口**：自 Spring Boot 3.x 起，引入了内置的 HTTP Interfaces。所有 `Client` 接口（例如 `AxolotlClient`）都使用 `@HttpExchange` 进行方法声明。
* **分包自动配置**：由于 API 数量极为庞大，为了避免单个配置类臃肿，SDK 为每个分类设计了独立的自动配置类（如 `AnimalsAutoConfiguration`），各自分管该类目下的 API 注入。所有的配置类均通过 [AutoConfiguration.imports](file:///Users/bao/work/idea_workspace/miniapis-spring-boot-starter/src/main/resources/META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports) 自动注册并向主应用暴露。

---

## 🛠️ 环境要求

* **Java**: 21
* **Spring Boot**: 3.3.0+ (支持 Spring Boot 3.x 规范)

---

## 📦 依赖引入

在项目的 `pom.xml` 中引入以下 Maven 依赖：

```xml
<dependency>
    <groupId>com.baozhizhi.miniapis</groupId>
    <artifactId>miniapis-spring-boot-starter</artifactId>
    <version>0.1.0-SHAPSHOT</version>
</dependency>
```

---

## 📊 API 能力分类与认证说明

本 Starter 在后台通过**代理环境（全球网络连通）**对所有的第三方 API 进行了连通性测试，剔除了失效的 130 个下线接口，最终保留了 **1,368 个在线的公共 API**。

按照认证机制，集成的服务主要划分为两大类：
1. **🟢 免 Key 认证服务 (No Auth)**：共计 **637** 个。此类服务开箱即用，不需要注册或提供任何 API Key，即可直接发起调用。
2. **🔴 需要认证服务 (apiKey / OAuth)**：共计 **731** 个。此类服务必须在其官方网站申请对应的授权 Token 或 API Key，并在配置项中指定后方能正常调用。

### 🏷️ 51 个 API 能力分类与分布
详细分类及具体接口说明请直接查看 [docs/api_overview.md](file:///Users/bao/work/idea_workspace/miniapis-spring-boot-starter/docs/api_overview.md)。以下是主要的前五大热门分类：
* **Development (开发与工具)**：116 个客户端 (com.bzz.miniapis.sdk.development)
* **Games & Comics (游戏与漫画)**：89 个客户端 (com.bzz.miniapis.sdk.gamescomics)
* **Geocoding (地理定位与 IP)**：86 个客户端 (com.bzz.miniapis.sdk.geocoding)
* **Government (政府与公共事务)**：82 个客户端 (com.bzz.miniapis.sdk.government)
* **Transportation (交通与航空航天)**：67 个客户端 (com.bzz.miniapis.sdk.transportation)

---

## ⚙️ 统一启用与配置

您可以在主项目的配置文件中自由对各个模块、分类甚至单个 API 进行开启/关闭，或者重写它们的接口请求地址（例如配置国内中转或局域网代理代理地址）：

```yaml
miniapis:
  enabled: true       # 全局启用开关，默认 true
  
  check:
    enabled: true     # AOP 参数验证开关，默认 true
    
  chatgpt:
    enabled: true     # 自研 ChatGPT 客户端开关
    api-key: "sk-xxxx" # 您的 OpenAI API Key
    api-url: "https://api.openai.com/v1/chat/completions" # 请求端点
    
  openai:
    api-key: "sk-xxxx" # 配置此项后，会自动向 Spring 容器注入官方 OpenAiService 实例

  # ==========================================
  # 各分类包 API 配置（可选，默认启用免 Key 接口）
  # ==========================================
  animals:
    axolotl:
      enabled: true   # 🟢 免 Key 客户端开关
      url: "https://theaxolotlapi.netlify.app/"
  geocoding:
    googlemaps:
      enabled: true   # 🔴 需要认证的客户端，需自行配置 url
      url: "https://maps.googleapis.com"
```

---

## 🚀 核心使用指南

### 1. 声明式参数校验 (`@DoCheck`)
标注在 Controller 控制器的方法入参上。
```java
@RestController
@RequestMapping("/user")
public class UserController {

    @DoCheck(value = Check.Email, arg = "email", msg = "邮箱格式不合法！")
    @GetMapping("/register")
    public R<String> register(@RequestParam("email") String email) {
        return R.success("激活邮件已发送！");
    }
}
```

### 2. 轻量无状态 `ChatGPTService`
支持同步和异步调用：
```java
@Autowired
private ChatGPTService chatGPTService;

public void chatSync() {
    ChatGPTRequest request = new ChatGPTRequest();
    request.setMessages(new MessageModel[]{ new MessageModel("user", "你好！") });
    
    ChatGPTResponse response = chatGPTService.getResponse(request);
    System.out.println(response.getChoices().get(0).getMessage().getContent());
}
```

### 3. 调用集成的第三方 API
在需要使用的类中直接 `@Autowired` 注入对应的客户端接口（Client）即可，客户端底层使用 JSON 反序列化：
```java
@RestController
public class DemoController {

    // 🟢 调用免 Key 的随机狗图片服务
    @Autowired
    private RandomdogClient randomdogClient;

    @GetMapping("/dog")
    public Object getDog() {
        return randomdogClient.execute(); // 返回狗相关的 JSON 实体模型
    }
}
```

---

## 🧪 单元测试

项目内置了详尽的单元测试类（JUnit 5），涵盖以下核心验证：
* `ChatGPTTest`：验证自研的 `ChatGPTService` 异步回调与请求逻辑。
* `MainTest` & `Main3Test`：验证 `@DoCheck` 参数校验拦截与关闭开关。
* `CatFactTest`、`AgifyTest`、`DogfactsTest`：验证批量外部 API 的装配和网络请求连通性。
