# ipify IP 获取集成服务

## 1. 接口概述
`ipify` 是一个极其简单、快速且高可用的公共 IP 解析服务。它的主旨就是做一件事：告诉你当前的设备或者服务的公网外网 IP 地址。

* **分类**: 网络与工具
* **官方网站**: https://www.ipify.org
* **默认 Base URL**: `https://api.ipify.org`
* **鉴权方式**: 完全免费，免 Key 访问

---

## 2. 接口明细规格

### 2.1 获取客户端公网 IP 地址 (Get Client IP)
* **请求路径**: `GET /`
* **Query 查询参数**:
  * `format` (String, 必须): 返回的数据格式。本 SDK 规定传输 `"json"`，以获得 JSON 格式的解析结果。
* **响应格式**: JSON Object (对应 DTO: `IpResponse`)
* **响应数据结构**:
```json
{
  "ip": "172.235.104.213"
}
```

---

## 3. 本 SDK 数据模型 (DTO)

### `IpResponse.java`
* `ip`: 当前客户端或者服务器访问外部网络时的公网 IP 地址。

---

## 4. SDK 调用指南

### 4.1 配置文件设定
若需要自定义或关闭该服务，可在 `application.yml` 配置：
```yaml
miniapis:
  ipify:
    enabled: true            # 是否开启装配，默认为 true
    url: "https://api.ipify.org" # 覆盖接口地址
```

### 4.2 Java 注入与调用
在你的 Spring Bean 中注入并使用 `IpifyClient`：

```java
import com.bzz.miniapis.sdk.ipify.IpifyClient;
import com.bzz.miniapis.sdk.ipify.IpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/network")
public class IpifyDemoController {

    @Autowired
    private IpifyClient ipifyClient;

    /**
     * 获取当前服务所在机器的公网外网IP
     */
    @GetMapping("/my-public-ip")
    public String getMyPublicIp() {
        // 请求参数 format 传入 "json" 以解析为 DTO
        IpResponse response = ipifyClient.getIp("json");
        if (response != null) {
            return "当前服务器公网 IP 地址为: " + response.getIp();
        }
        return "获取 IP 失败";
    }
}
```
