# Miniapis Spring Boot Starter

`miniapis-spring-boot-starter` 是一个专为 Spring Boot 3.x 深度定制的通用 API 快速集成 Starter 组件。它旨在通过开箱即用的方式提供两大核心功能：
1. **轻量级声明式参数校验**（基于 AOP，避免繁琐的手动验证逻辑）。
2. **多通道 AI API 服务支持**（包括自研的高效无状态 `ChatGPTService` 以及官方 `OpenAiService` SDK 的无缝注入）。

---

## 🛠️ 环境要求

- **Java**: 21
- **Spring Boot**: 3.3.0 (支持 Spring Boot 3.x 规范)

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

## ⚙️ 配置文件

在主项目的 `application.yml` 或 `application.properties` 中添加以下配置项：

```yaml
miniapis:
  # 全局启用开关，默认为 true
  enabled: true
  
  check:
    # AOP参数校验开关，默认为 true
    enabled: true
    
  chatgpt:
    # ChatGPT 自研客户端开关，默认为 true
    enabled: true
    # 您的 OpenAI API Key
    api-key: "your-chatgpt-api-key"
    # 自定义中转接口或官方请求地址，默认为 https://api.openai.com/v1/chat/completions
    api-url: "https://api.openai.com/v1/chat/completions"
    
  openai:
    # OpenAI 官方 SDK 自动装配，只要配置了该 key，会自动向 Spring 容器中注入官方的 OpenAiService 实例
    api-key: "your-openai-sdk-api-key"

  # ==========================================
  # 以下为集成的 public-apis 免 Key API SDK 配置 (均为可选，默认启用)
  # ==========================================
  placeholder:
    # JSONPlaceholder 客户端开关，默认为 true
    enabled: true
    # 接口地址，默认为 https://jsonplaceholder.typicode.com
    url: "https://jsonplaceholder.typicode.com"

  weather:
    # Open-Meteo 天气接口开关，默认为 true
    enabled: true
    # 接口地址，默认为 https://api.open-meteo.com
    url: "https://api.open-meteo.com"

  ipify:
    # ipify IP获取接口开关，默认为 true
    enabled: true
    # 接口地址，默认为 https://api.ipify.org
    url: "https://api.ipify.org"

  joke:
    # Official Joke API 接口开关，默认为 true
    enabled: true
    # 接口地址，默认为 https://official-joke-api.appspot.com
    url: "https://official-joke-api.appspot.com"
``````

---

## 🚀 核心功能使用指南

### 1. 声明式参数校验 (`@DoCheck`)

通过在 Controller 方法上标注 `@DoCheck` 即可快速对指定入参进行校验。校验不通过时，会抛出 `MiniapisIllegalParametersException`（继承自 `RuntimeException`），可配合全局异常处理器（`@ControllerAdvice`）统一返回错误格式。

#### 定义接口与切面配置：
```java
@RestController
@RequestMapping("/user")
public class UserController {

    // 指定校验方式为 Email，校验的参数名为 email
    @DoCheck(value = Check.Email, arg = "email", msg = "邮箱格式不合法！")
    @GetMapping("/register")
    public R<String> register(@RequestParam("email") String email) {
        return R.success("注册链接已发送至: " + email);
    }
}
```

#### 可扩展校验逻辑：
校验类型是通过 `com.bzz.miniapis.enums.Check` 枚举与 `com.bzz.miniapis.utils.CheckUtil` 工具类绑定的。如有新的正则或验证逻辑，可以直接扩展这两个类。

---

### 2. Spring 托管的 `ChatGPTService`（自研轻量级客户端）

本组件提供了一个**线程安全且无状态**的 `ChatGPTService` 接口，在项目启动时会根据您的配置自动向 Spring 容器注入。支持同步和异步调用：

#### 同步调用示例 (Sync)：
```java
@RestController
public class ChatController {

    @Autowired
    private ChatGPTService chatGPTService;

    @GetMapping("/chat")
    public String chat(@RequestParam("prompt") String prompt) {
        ChatGPTRequest request = new ChatGPTRequest();
        request.setMessages(new MessageModel[]{ new MessageModel("user", prompt) });
        
        // 核心请求：会自动套用全局配置中的 api-key 和 api-url
        ChatGPTResponse response = chatGPTService.getResponse(request);
        
        return response.getChoices().get(0).getMessage().getContent();
    }
}
```

#### 异步调用示例 (Async)：
```java
@RestController
public class AsyncChatController {

    @Autowired
    private ChatGPTService chatGPTService;

    @GetMapping("/chat/async")
    public void chatAsync(@RequestParam("prompt") String prompt) {
        ChatGPTRequest request = new ChatGPTRequest();
        request.setMessages(new MessageModel[]{ new MessageModel("user", prompt) });

        chatGPTService.getResponseAsync(request, new ChatGPTApiCallback() {
            @Override
            public void onSuccess(ChatGPTResponse response) {
                System.out.println("AI 回复: " + response.getChoices().get(0).getMessage().getContent());
            }

            @Override
            public void onFailure(String errorMessage) {
                System.err.println("调用失败: " + errorMessage);
            }

            @Override
            public void onFailure(CommonResponse response) {
                System.err.println("API 错误: " + response.getResponse());
            }
        });
    }
}
```

---

### 3. OpenAI 官方 SDK 自动注入 (`OpenAiService`)

如果您更倾向于使用官方或社区流行的底层 SDK（`com.theokanning.openai-gpt3-java`），一旦您在配置文件中填入了 `miniapis.openai.api-key`，本 Starter 会自动为您配置并向容器中注入 `OpenAiService` 实例。

直接装配并使用：
```java
@Service
public class AdvancedAiService {

    @Autowired
    private OpenAiService openAiService; // 官方 SDK 直接注入

    public void generateText() {
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt("Somebody once told me")
                .model("gpt-3.5-turbo-instruct")
                .echo(true)
                .build();
                
        openAiService.createCompletion(completionRequest)
                .getChoices()
                .forEach(System.out::println);
    }
}
```

---

### 4. 多通道第三方 API 声明式 SDK 支持 (基于 Spring Boot 3.3.0 HTTP Interfaces)

本组件基于 Spring Boot 3.3.x 提供的声明式 HTTP Interfaces (`@HttpExchange` 配合 `RestClient`)，集成了多个来自 `public-apis` 的优质、无需 Key 的公用 API 服务。所有客户端都具备：
- **可复用/可配置性**：支持在配置文件中一键开启/关闭，并支持自由重写接口的 Base URL；
- **声明式接口设计**：摒弃传统繁琐的手动 HTTP 请求拼接，完全面向接口及 DTO 开发。

#### 1) JSONPlaceholder 模拟数据服务 (`JsonPlaceholderClient`)
用于测试及快速演示的 Mock 资源（如文章 posts、评论 comments 等）。
- **默认服务地址**: `https://jsonplaceholder.typicode.com`
- **主要方法**:
  - `Post getPost(Integer id)`: 获取单篇帖子。
  - `List<Post> getPosts()`: 获取全部帖子。
  - `List<Comment> getCommentsByPostId(Integer id)`: 获取某帖子的所有评论。
- **使用示例**:
```java
@RestController
public class DemoController {

    @Autowired
    private JsonPlaceholderClient jsonPlaceholderClient;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return jsonPlaceholderClient.getPosts();
    }
}
```

#### 2) Open-Meteo 天气预报服务 (`OpenMeteoClient`)
免费且免 Key 的全球天气预报 API 服务。
- **默认服务地址**: `https://api.open-meteo.com`
- **主要方法**:
  - `WeatherForecast getForecast(Double latitude, Double longitude, Boolean currentWeather)`: 查询指定经纬度的天气信息。
- **使用示例**:
```java
@RestController
public class WeatherController {

    @Autowired
    private OpenMeteoClient openMeteoClient;

    @GetMapping("/weather")
    public WeatherForecast getWeather(@RequestParam Double lat, @RequestParam Double lon) {
        // 请求经纬度天气，并返回当前天气信息
        return openMeteoClient.getForecast(lat, lon, true);
    }
}
```

#### 3) ipify IP 获取服务 (`IpifyClient`)
简单好用的公共 IP 地址获取服务。
- **默认服务地址**: `https://api.ipify.org`
- **主要方法**:
  - `IpResponse getIp(String format)`: 获取公网 IP (当参数 `format="json"` 时返回 DTO 响应)。
- **使用示例**:
```java
@RestController
public class IpController {

    @Autowired
    private IpifyClient ipifyClient;

    @GetMapping("/myip")
    public IpResponse getIp() {
        // 获取 JSON 格式的客户端外网公网 IP
        return ipifyClient.getIp("json");
    }
}
```

#### 4) Official Joke API 随机笑话服务 (`JokeClient`)
随机获取英文幽默、编程段子等笑话的免 Key API。
- **默认服务地址**: `https://official-joke-api.appspot.com`
- **主要方法**:
  - `Joke getRandomJoke()`: 随机返回笑话。
- **使用示例**:
```java
@RestController
public class JokeController {

    @Autowired
    private JokeClient jokeClient;

    @GetMapping("/joke")
    public Joke getRandomJoke() {
        return jokeClient.getRandomJoke();
    }
}
```

---

## 🧪 单元测试

主项目中配置了多个 JUnit 5 测试案例，用以验证各种场景下的行为：
- `ChatGPTTest`: 验证注入的 `ChatGPTService` 的异步回调请求行为。
- `MainTest`: 验证在启用 AOP 参数校验 (`miniapis.check.enabled=true`) 时拦截与异常抛出情况。
- `Main2Test`: 验证 Mock 切面与 Stub 条件下的接口调用测试。
- `Main3Test`: 验证当手动关闭参数校验 (`miniapis.check.enabled=false`) 时，切面能够正确放行。
- `PlaceholderTest`: 验证 `JsonPlaceholderClient` 调用，涵盖获取单个/全部帖子以及获取评论列表接口。
- `WeatherTest`: 验证 `OpenMeteoClient` 调用，查询经纬度天气预测数据。
- `IpifyTest`: 验证 `IpifyClient` 调用，获取当前客户端公网 IP 地址。
- `JokeTest`: 验证 `JokeClient` 调用，获取随机笑话。
