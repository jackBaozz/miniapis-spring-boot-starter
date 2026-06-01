# JSONPlaceholder API 模拟数据集成服务

## 1. 接口概述
`JSONPlaceholder` 是一个非常流行且高可用的 Mock 模拟数据服务。它主要用于快速验证网络请求、前端展示结构调试或集成测试，无需自己搭建复杂的后端测试数据库。

* **分类**: 测试与模拟数据
* **官方网站**: https://jsonplaceholder.typicode.com
* **默认 Base URL**: `https://jsonplaceholder.typicode.com`
* **鉴权方式**: 完全免费，免 Key 访问

---

## 2. 接口明细规格

### 2.1 获取指定帖子 (Get Single Post)
* **请求路径**: `GET /posts/{id}`
* **路径变量**:
  * `id` (Integer, 必须): 帖子的唯一标识 ID
* **响应格式**: JSON Object (对应 DTO: `Post`)
* **响应数据结构**:
```json
{
  "userId": 1,
  "id": 1,
  "title": "sunt aut facere repellat...",
  "body": "quia et suscipit..."
}
```

### 2.2 获取全部帖子列表 (Get All Posts)
* **请求路径**: `GET /posts`
* **响应格式**: JSON Array of Objects (对应 DTO: `List<Post>`)
* **最大返回条数**: 100 条

### 2.3 获取帖子的所有评论 (Get Comments for Post)
* **请求路径**: `GET /posts/{id}/comments`
* **路径变量**:
  * `id` (Integer, 必须): 关联的帖子 ID
* **响应格式**: JSON Array of Objects (对应 DTO: `List<Comment>`)
* **响应数据结构**:
```json
[
  {
    "postId": 1,
    "id": 1,
    "name": "id labore ex et quam laborum",
    "email": "Eliseo@gardner.biz",
    "body": "laudantium enim quasi..."
  }
]
```

---

## 3. 本 SDK 数据模型 (DTO)

### `Post.java`
* `userId`: 用户 ID
* `id`: 帖子唯一标识
* `title`: 标题
* `body`: 内容

### `Comment.java`
* `postId`: 关联帖子 ID
* `id`: 评论唯一标识
* `name`: 评论人姓名
* `email`: 评论人邮箱
* `body`: 评论具体内容

---

## 4. SDK 调用指南

### 4.1 配置文件设定
若需要自定义或关闭该服务，可在 `application.yml` 配置：
```yaml
miniapis:
  placeholder:
    enabled: true                  # 是否开启装配，默认为 true
    url: "https://jsonplaceholder.typicode.com" # 覆盖接口地址
```

### 4.2 Java 注入与调用
在你的 Spring Bean (如 Service 或 Controller) 中，直接 `@Autowired` 注入 `JsonPlaceholderClient`：

```java
import com.bzz.miniapis.sdk.placeholder.JsonPlaceholderClient;
import com.bzz.miniapis.sdk.placeholder.Post;
import com.bzz.miniapis.sdk.placeholder.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class PlaceholderDemoController {

    @Autowired
    private JsonPlaceholderClient placeholderClient;

    /**
     * 根据文章ID获取详情
     */
    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable Integer id) {
        return placeholderClient.getPost(id);
    }

    /**
     * 获取指定文章下所有的评论
     */
    @GetMapping("/posts/{id}/comments")
    public List<Comment> getComments(@PathVariable Integer id) {
        return placeholderClient.getCommentsByPostId(id);
    }
}
```
