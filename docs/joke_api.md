# Official Joke API 随机笑话集成服务

## 1. 接口概述
`Official Joke API` 提供简单幽默的随机英文段子和编程冷笑话接口。你可以使用它来丰富应用程序的主页、聊天机器人的快捷回复或者用于测试系统的返回格式。

* **分类**: 娱乐与社交
* **官方网站**: https://official-joke-api.appspot.com
* **默认 Base URL**: `https://official-joke-api.appspot.com`
* **鉴权方式**: 完全免费，免 Key 访问

---

## 2. 接口明细规格

### 2.1 随机获取一个笑话 (Get Random Joke)
* **请求路径**: `GET /random_joke`
* **Query 查询参数**: 无
* **响应格式**: JSON Object (对应 DTO: `Joke`)
* **响应数据结构**:
```json
{
  "id": 28,
  "type": "programming",
  "setup": "There are 10 types of people in this world...",
  "punchline": "Those who understand binary and those who don't"
}
```

---

## 3. 本 SDK 数据模型 (DTO)

### `Joke.java`
* `id`: 笑话的唯一数字 ID 标识
* `type`: 笑话类型，例如 `programming` (编程)、`general` (常规)
* `setup`: 笑话的第一阶段（铺垫/包袱）
* `punchline`: 笑话的第二阶段（点睛之笔/抖包袱）

---

## 4. SDK 调用指南

### 4.1 配置文件设定
若需要自定义或关闭该服务，可在 `application.yml` 配置：
```yaml
miniapis:
  joke:
    enabled: true                 # 是否开启装配，默认为 true
    url: "https://official-joke-api.appspot.com" # 覆盖接口地址
```

### 4.2 Java 注入与调用
在你的 Spring Bean 中注入并使用 `JokeClient`：

```java
import com.bzz.miniapis.sdk.joke.JokeClient;
import com.bzz.miniapis.sdk.joke.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fun")
public class JokeDemoController {

    @Autowired
    private JokeClient jokeClient;

    /**
     * 随机返回一个英文笑话
     */
    @GetMapping("/joke")
    public String getRandomJoke() {
        Joke joke = jokeClient.getRandomJoke();
        if (joke != null) {
            return String.format("【笑话 ID: %d】\n%s\n—— %s", 
                    joke.getId(), joke.getSetup(), joke.getPunchline());
        }
        return "哎呀，今天没有笑话啦！";
    }
}
```
