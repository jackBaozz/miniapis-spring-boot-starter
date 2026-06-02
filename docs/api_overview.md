# Miniapis SDK - 集成 API 总览

本 Starter 深度集成了由 `public-apis` 社区收集的全球丰富且免费的公共 API 接口（共包含 **51** 个核心分类，合计 **1368** 个可用客户端）。底层基于 Spring Boot 3.3.x 提供的声明式 HTTP Interfaces 架构（`RestClient` + `HttpExchange`），直接使用依赖注入对应的 Client 接口即可调用这些服务。

## 📂 API 分类索引目录

| 分类名称 (Category) | 中文分类 | API 客户端数量 | 包路径 (Package) |
| :--- | :--- | :---: | :--- |
| [**Development**](#development) | 发展 | 116 | `com.bzz.miniapis.sdk.development` |
| [**Games & Comics**](#games-comics) | 游戏与漫画 | 89 | `com.bzz.miniapis.sdk.gamescomics` |
| [**Geocoding**](#geocoding) | 地理编码 | 86 | `com.bzz.miniapis.sdk.geocoding` |
| [**Government**](#government) | 政府 | 82 | `com.bzz.miniapis.sdk.government` |
| [**Transportation**](#transportation) | 交通 | 67 | `com.bzz.miniapis.sdk.transportation` |
| [**Cryptocurrency**](#cryptocurrency) | 加密货币 | 59 | `com.bzz.miniapis.sdk.cryptocurrency` |
| [**Finance**](#finance) | 金融 | 42 | `com.bzz.miniapis.sdk.finance` |
| [**Social**](#social) | 社交 | 40 | `com.bzz.miniapis.sdk.social` |
| [**Open Data**](#open-data) | 开放数据 | 39 | `com.bzz.miniapis.sdk.opendata` |
| [**Video**](#video) | 视频 | 39 | `com.bzz.miniapis.sdk.video` |
| [**Security**](#security) | 安全性 | 36 | `com.bzz.miniapis.sdk.security` |
| [**Science & Math**](#science-math) | 科学与数学 | 34 | `com.bzz.miniapis.sdk.sciencemath` |
| [**Music**](#music) | 音乐 | 31 | `com.bzz.miniapis.sdk.music` |
| [**Sports & Fitness**](#sports-fitness) | 运动与健身 | 31 | `com.bzz.miniapis.sdk.sportsfitness` |
| [**Weather**](#weather) | 天气 | 31 | `com.bzz.miniapis.sdk.weather` |
| [**Health**](#health) | 健康 | 30 | `com.bzz.miniapis.sdk.health` |
| [**Documents & Productivity**](#documents-productivity) | 文件和生产力 | 28 | `com.bzz.miniapis.sdk.documentsproductivity` |
| [**Photography**](#photography) | 摄影 | 26 | `com.bzz.miniapis.sdk.photography` |
| [**Animals**](#animals) | 动物 | 25 | `com.bzz.miniapis.sdk.animals` |
| [**Books**](#books) | 书籍 | 24 | `com.bzz.miniapis.sdk.books` |
| [**Machine Learning**](#machine-learning) | 机器学习 | 24 | `com.bzz.miniapis.sdk.machinelearning` |
| [**Food & Drink**](#food-drink) | 食品和饮料 | 22 | `com.bzz.miniapis.sdk.fooddrink` |
| [**Test Data**](#test-data) | 测试数据 | 20 | `com.bzz.miniapis.sdk.testdata` |
| [**Anime**](#anime) | 动漫 | 19 | `com.bzz.miniapis.sdk.anime` |
| [**Art & Design**](#art-design) | 艺术与设计 | 19 | `com.bzz.miniapis.sdk.artdesign` |
| [**Cloud Storage & File Sharing**](#cloud-storage-file-sharing) | 云存储和文件共享 | 18 | `com.bzz.miniapis.sdk.cloudstoragefilesharing` |
| [**Email**](#email) | 电子邮件 | 18 | `com.bzz.miniapis.sdk.email` |
| [**Jobs**](#jobs) | 工作机会 | 18 | `com.bzz.miniapis.sdk.jobs` |
| [**News**](#news) | 新闻动态 | 18 | `com.bzz.miniapis.sdk.news` |
| [**Personality**](#personality) | 个性 | 18 | `com.bzz.miniapis.sdk.personality` |
| [**URL Shorteners**](#url-shorteners) | 网址缩短器 | 18 | `com.bzz.miniapis.sdk.urlshorteners` |
| [**Business**](#business) | 商务 | 17 | `com.bzz.miniapis.sdk.business` |
| [**Currency Exchange**](#currency-exchange) | 货币兑换 | 17 | `com.bzz.miniapis.sdk.currencyexchange` |
| [**Text Analysis**](#text-analysis) | 文本分析 | 15 | `com.bzz.miniapis.sdk.textanalysis` |
| [**Anti-Malware**](#anti-malware) | 反恶意软件 | 14 | `com.bzz.miniapis.sdk.antimalware` |
| [**Calendar**](#calendar) | 日历 | 14 | `com.bzz.miniapis.sdk.calendar` |
| [**Entertainment**](#entertainment) | 娱乐 | 14 | `com.bzz.miniapis.sdk.entertainment` |
| [**Environment**](#environment) | 环境 | 14 | `com.bzz.miniapis.sdk.environment` |
| [**Dictionaries**](#dictionaries) | 词典 | 13 | `com.bzz.miniapis.sdk.dictionaries` |
| [**Shopping**](#shopping) | 购物 | 12 | `com.bzz.miniapis.sdk.shopping` |
| [**Blockchain**](#blockchain) | 区块链 | 10 | `com.bzz.miniapis.sdk.blockchain` |
| [**Open Source Projects**](#open-source-projects) | 开源项目 | 9 | `com.bzz.miniapis.sdk.opensourceprojects` |
| [**Tracking**](#tracking) | 追踪 | 9 | `com.bzz.miniapis.sdk.tracking` |
| [**Data Validation**](#data-validation) | 数据验证 | 7 | `com.bzz.miniapis.sdk.datavalidation` |
| [**Vehicle**](#vehicle) | 车辆 | 7 | `com.bzz.miniapis.sdk.vehicle` |
| [**Authentication & Authorization**](#authentication-authorization) | 认证与授权 | 6 | `com.bzz.miniapis.sdk.authenticationauthorization` |
| [**Continuous Integration**](#continuous-integration) | 持续集成 | 6 | `com.bzz.miniapis.sdk.continuousintegration` |
| [**Phone**](#phone) | 电话 | 6 | `com.bzz.miniapis.sdk.phone` |
| [**Patent**](#patent) | 专利 | 4 | `com.bzz.miniapis.sdk.patent` |
| [**Programming**](#programming) | 编程 | 4 | `com.bzz.miniapis.sdk.programming` |
| [**Events**](#events) | 活动 | 3 | `com.bzz.miniapis.sdk.events` |

---

## 🛠️ API 分类详细列表

### Development

本分类 (**发展**) 共包含 **116** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.development.DevelopmentAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Ciprand | `CiprandClient` | `https://github.com/polarspetroll/ciprand` | 安全随机字符串生成器 | 🟢 免 Key |
| Cloudflare Trace | `CloudflareTraceClient` | `https://github.com/fawazahmed0/cloudflare-trace-api` | 获取 IP 地址、时间戳、用户代理、国家/地区代码、IATA、HTTP 版本、TLS/SSL 版本等 | 🟢 免 Key |
| Codex | `CodexClient` | `https://github.com/Jaagrav/CodeX` | 多种语言的在线编译器 | 🟢 免 Key |
| ApicAgent | `ApicagentClient` | `https://www.apicagent.com` | 从用户代理字符串中提取设备详细信息 | 🟢 免 Key |
| Azure DevOps | `AzureDevopsClient` | `https://docs.microsoft.com/en-us/rest/api/azure/devops` | REST API 请求/响应对的 Azure DevOps 基本组件 | 🔴 需要认证 (apiKey) |
| CDNJS | `CdnjsClient` | `https://api.cdnjs.com/libraries/jquery` | CDNJS 上的图书馆信息 | 🟢 免 Key |
| ApiFlash | `ApiflashClient` | `https://apiflash.com/` | 为开发者提供基于 Chrome 的屏幕截图 API | 🔴 需要认证 (apiKey) |
| CORS Proxy | `CorsProxyClient` | `https://github.com/burhanuday/cors-proxy` | 使用此代理作为中间人来解决可怕的 CORS 错误 | 🟢 免 Key |
| Base | `BaseClient` | `https://www.base-api.io/` | 构建快速后端 | 🔴 需要认证 (apiKey) |
| Blynk-Cloud | `BlynkCloudClient` | `https://blynkapi.docs.apiary.io/#` | 从 Blynk IoT Cloud 控制 IoT 设备 | 🔴 需要认证 (apiKey) |
| Docker Hub | `DockerHubClient` | `https://docs.docker.com/docker-hub/api/latest/` | 与 Docker Hub 交互 | 🔴 需要认证 (apiKey) |
| API Grátis | `ApiGrTisClient` | `https://apigratis.com.br/` | 多种服务和公共 API | 🟢 免 Key |
| Userstack | `UserstackClient` | `https://userstack.com/?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 安全用户代理字符串查找 JSON API | 🔴 需要认证 (OAuth) |
| Blitapp | `BlitappClient` | `https://blitapp.com/api/` | 安排网页屏幕截图并将其同步到您的云端 | 🔴 需要认证 (apiKey) |
| Ghost | `GhostClient` | `https://ghost.org/` | 将发布的内容获取到您的网站、应用程序或其他嵌入式媒体中 | 🔴 需要认证 (apiKey) |
| Databricks | `DatabricksClient` | `https://docs.databricks.com/dev-tools/api/latest/index.html` | 管理您的 databricks 帐户、集群、笔记本、作业和工作区的服务 | 🔴 需要认证 (apiKey) |
| Contentful Images | `ContentfulImagesClient` | `https://www.contentful.com/developers/docs/references/images-api/` | 用于检索图像并将变换应用于图像 | 🔴 需要认证 (apiKey) |
| DomainDb Info | `DomaindbInfoClient` | `https://api.domainsdb.info/` | 域名搜索以查找包含特定单词/短语/等的所有域 | 🟢 免 Key |
| BrewPage | `BrewpageClient` | `https://brewpage.app` | 免费托管 HTML、JSON、键值、文件、具有短 URL 和 TTL 保留的多文件网站 | 🟢 免 Key |
| Bitbucket | `BitbucketClient` | `https://developer.atlassian.com/bitbucket/api/2/reference/` | 比特桶API | 🔴 需要认证 (OAuth) |
| Google Fonts | `GoogleFontsClient` | `https://developers.google.com/fonts/docs/developer_api` | Google Fonts 提供的所有系列的元数据 | 🔴 需要认证 (apiKey) |
| Agify.io | `AgifyIoClient` | `https://agify.io` | 从名字估计年龄 | 🟢 免 Key |
| Gitlab | `GitlabClient` | `https://docs.gitlab.com/ee/api/` | 以编程方式自动化 GitLab 交互 | 🔴 需要认证 (OAuth) |
| Browshot | `BrowshotClient` | `https://browshot.com/api/documentation` | 轻松制作任何屏幕尺寸、任何设备的网页屏幕截图 | 🔴 需要认证 (apiKey) |
| 24 Pull Requests | `Api24PullRequestsClient` | `https://24pullrequests.com/api` | 12 月期间促进开源合作的项目 | 🟢 免 Key |
| DigitalOcean Status | `DigitaloceanStatusClient` | `https://status.digitalocean.com/api` | 所有 DigitalOcean 服务的状态 | 🟢 免 Key |
| Host.io | `HostIoClient` | `https://host.io` | 面向开发人员的域数据 API | 🔴 需要认证 (apiKey) |
| Google Firebase | `GoogleFirebaseClient` | `https://firebase.google.com/docs` | Google 的移动应用程序开发平台，可帮助构建、改进和发展应用程序 | 🔴 需要认证 (apiKey) |
| ExtendsClass JSON Storage | `ExtendsclassJsonStorageClient` | `https://extendsclass.com/json-storage.html` | 一个简单的 JSON 存储 API | 🟢 免 Key |
| APIs.guru | `ApisGuruClient` | `https://apis.guru/api-doc/` | Web API 的 Wikipedia、公共 API 的 OpenAPI/Swagger 规范 | 🟢 免 Key |
| Google Docs | `GoogleDocsClient` | `https://developers.google.com/docs/api/reference/rest` | 用于读取、写入和格式化 Google Docs 文档的 API | 🔴 需要认证 (OAuth) |
| jsDelivr | `JsdelivrClient` | `https://github.com/jsdelivr/data.jsdelivr.com` | jsDelivr CDN 上的软件包信息和下载统计信息 | 🟢 免 Key |
| Google Sheets | `GoogleSheetsClient` | `https://developers.google.com/sheets/api/reference/rest` | 用于读取、写入和格式化 Google Sheets 数据的 API | 🔴 需要认证 (OAuth) |
| Google Keep | `GoogleKeepClient` | `https://developers.google.com/keep/api/reference/rest` | 用于读取、写入和格式化 Google Keep 笔记的 API | 🔴 需要认证 (OAuth) |
| IPify | `IpifyClient` | `https://www.ipify.org/` | 一个简单的 IP 地址 API | 🟢 免 Key |
| Hasura | `HasuraClient` | `https://hasura.io/opensource/` | 具有内置授权的 GraphQL 和 REST API 引擎 | 🔴 需要认证 (apiKey) |
| Google Slides | `GoogleSlidesClient` | `https://developers.google.com/slides/api/reference/rest` | 用于读取、写入和格式化 Google 幻灯片演示文稿的 API | 🔴 需要认证 (OAuth) |
| IBM Text to Speech | `IbmTextToSpeechClient` | `https://cloud.ibm.com/docs/text-to-speech/getting-started.html` | 将文本转换为语音 | 🔴 需要认证 (apiKey) |
| IPinfo | `IpinfoClient` | `https://ipinfo.io/developers` | 另一个简单的 IP 地址 API | 🟢 免 Key |
| JSONPlaceholder | `JsonplaceholderClient` | `https://jsonplaceholder.typicode.com` | 用于测试和原型设计的虚假 REST API | 🟢 免 Key |
| GETPing | `GetpingClient` | `https://www.getping.info` | 通过简单的 GET 请求触发电子邮件通知 | 🔴 需要认证 (apiKey) |
| License-API | `LicenseApiClient` | `https://github.com/cmccandless/license-api/blob/master/README.md` | Choosealicense.com 的非官方 REST API | 🟢 免 Key |
| Gorest | `GorestClient` | `https://gorest.co.in/` | 用于测试和原型设计的在线 REST API | 🔴 需要认证 (OAuth) |
| IP2WHOIS Information Lookup | `Ip2WhoisInformationLookupClient` | `https://www.ip2whois.com/` | WHOIS域名查询 | 🔴 需要认证 (apiKey) |
| Icanhazip | `IcanhazipClient` | `https://major.io/icanhazip-com-faq/` | IP地址API | 🟢 免 Key |
| ipfind.io | `IpfindIoClient` | `https://ipfind.io` | IP 地址或任何域名的地理位置以及一些其他有用信息 | 🔴 需要认证 (apiKey) |
| Hunter | `HunterClient` | `https://hunter.io/api` | 用于域名搜索、专业电子邮件查找器、作者查找器和电子邮件验证器的 API | 🔴 需要认证 (apiKey) |
| Httpbin | `HttpbinClient` | `https://httpbin.org/` | 简单的 HTTP 请求和响应服务 | 🟢 免 Key |
| npm Registry | `NpmRegistryClient` | `https://github.com/npm/registry/blob/master/docs/REGISTRY-API.md` | 以编程方式查询有关您最喜欢的 Node.js 库的信息 | 🟢 免 Key |
| Image-Charts | `ImageChartsClient` | `https://documentation.image-charts.com/` | 生成图表、二维码和图形图像 | 🟢 免 Key |
| JSONbin.io | `JsonbinIoClient` | `https://jsonbin.io` | Free JSON storage service. Ideal for small scale Web apps, Websites and Mobile apps | 🔴 需要认证 (apiKey) |
| Genderize.io | `GenderizeIoClient` | `https://genderize.io` | 从名字估计性别 | 🟢 免 Key |
| MY IP | `MyIpClient` | `https://www.myip.com/api-docs/` | 获取IP地址信息 | 🟢 免 Key |
| Httpbin Cloudflare | `HttpbinCloudflareClient` | `https://cloudflare-quic.com/b/` | Cloudflare 支持 HTTP/3 的简单 HTTP 请求和响应服务 | 🟢 免 Key |
| Postman | `PostmanClient` | `https://www.postman.com/postman/workspace/postman-public-workspace/documentation/12959542-c8142d51-e97c-46b6-bd77-52bb66712c9a` | 用于测试 API 的工具 | 🔴 需要认证 (apiKey) |
| Logs.to | `LogsToClient` | `https://logs.to/` | 生成日志 | 🔴 需要认证 (apiKey) |
| GeekFlare | `GeekflareClient` | `https://apidocs.geekflare.com/docs/geekflare-api` | 为网站的重要测试和监控方法提供众多功能 | 🔴 需要认证 (apiKey) |
| Qrcode Monkey | `QrcodeMonkeyClient` | `https://www.qrcode-monkey.com/qr-code-api-with-logo/` | 将自定义且外观独特的 QR 码集成到您的系统或工作流程中 | 🟢 免 Key |
| JSON 2 JSONP | `Json2JsonpClient` | `https://json2jsonp.com/` | 使用客户端 JavaScript 将 JSON 转换为 JSONP（即时）以轻松实现跨域数据请求 | 🟢 免 Key |
| Mocky | `MockyClient` | `https://designer.mocky.io/` | REST API 端点的模拟用户定义的测试 JSON | 🟢 免 Key |
| Kroki | `KrokiClient` | `https://kroki.io` | 根据文本描述创建图表 | 🟢 免 Key |
| QuickChart | `QuickchartClient` | `https://quickchart.io/` | 生成图表和图形图像 | 🟢 免 Key |
| MAC address vendor lookup | `MacAddressVendorLookupClient` | `https://macaddress.io/api` | 检索有关给定 MAC 地址或 OUI 的供应商详细信息和其他信息 | 🔴 需要认证 (apiKey) |
| OpenAPIHub | `OpenapihubClient` | `https://hub.openapihub.com/` | 一体化 API 平台 | 🔴 需要认证 (X-Mashape-Key) |
| IFTTT | `IftttClient` | `https://platform.ifttt.com/docs/connect_api` | IFTTT 连接 API | 🟢 免 Key |
| Icanhazepoch | `IcanhazepochClient` | `https://icanhazepoch.com` | 获取纪元时间 | 🟢 免 Key |
| ReqRes | `ReqresClient` | `https://reqres.in/` | 托管的 REST-API 准备响应您的 AJAX 请求 | 🟢 免 Key |
| PageCDN | `PagecdnClient` | `https://pagecdn.com/docs/public-api` | PageCDN 上的 javascript、css 和字体库的公共 API | 🔴 需要认证 (apiKey) |
| Micro DB | `MicroDbClient` | `https://m3o.com/db` | 简单的数据库服务 | 🔴 需要认证 (apiKey) |
| ScraperApi | `ScraperapiClient` | `https://www.scraperapi.com` | 轻松构建可扩展的网络抓取工具 | 🔴 需要认证 (apiKey) |
| import.io | `ImportIoClient` | `http://api.docs.import.io/` | 从网站或 RSS 源检索结构化数据 | 🔴 需要认证 (apiKey) |
| Sonar | `SonarClient` | `https://github.com/Cgboal/SonarSearch` | 项目声纳 DNS 枚举 API | 🟢 免 Key |
| Screenshot | `ScreenshotClient` | `https://www.abstractapi.com/website-screenshot-api` | 以编程方式对任何网站的网页进行屏幕截图 | 🔴 需要认证 (apiKey) |
| ScrapingDog | `ScrapingdogClient` | `https://www.scrapingdog.com/` | 用于网页抓取的代理 API | 🔴 需要认证 (apiKey) |
| RSS feed to JSON | `RssFeedToJsonClient` | `https://rss-to-json-serverless-api.vercel.app` | 使用 feed URL 返回 JSON 格式的 RSS feed | 🟢 免 Key |
| QR & Barcode | `QrBarcodeClient` | `https://solsigs.com/qrapi/` | QR codes and barcodes (Code 128, EAN-13, Data Matrix, PDF417 + more). SVG or PNG output | 🟢 免 Key |
| OneSignal | `OnesignalClient` | `https://documentation.onesignal.com/docs/onesignal-api` | 适用于推送通知、电子邮件、短信和应用内的自助式客户互动解决方案 | 🔴 需要认证 (apiKey) |
| NetworkCalc | `NetworkcalcClient` | `https://networkcalc.com/api/docs` | 网络计算器，包括子网、DNS、二进制和安全工具 | 🟢 免 Key |
| MicroENV | `MicroenvClient` | `https://microenv.com/` | 为开发者提供的 Fake Rest API | 🟢 免 Key |
| host-t.com | `HostTComClient` | `https://host-t.com` | 通过 HTTP GET 请求进行基本 DNS 查询 | 🟢 免 Key |
| ScreenshotAPI.net | `ScreenshotapiNetClient` | `https://screenshotapi.net/` | 创建像素完美的网站屏幕截图 | 🔴 需要认证 (apiKey) |
| Netlify | `NetlifyClient` | `https://docs.netlify.com/api/get-started/` | Netlify 是可编程网络的托管服务 | 🔴 需要认证 (OAuth) |
| ScrapeNinja | `ScrapeninjaClient` | `https://scrapeninja.net` | 使用 Chrome 指纹和住宅代理抓取 API | 🔴 需要认证 (apiKey) |
| Wandbox | `WandboxClient` | `https://github.com/melpon/wandbox/blob/master/kennel2/API.rst` | wandbox.org 中提到的支持 35 种以上语言的代码编译器 | 🟢 免 Key |
| scrapestack | `ScrapestackClient` | `https://scrapestack.com/` | 实时、可扩展的代理和网页抓取 REST API | 🔴 需要认证 (apiKey) |
| Nationalize.io | `NationalizeIoClient` | `https://nationalize.io` | 估计名字的国籍 | 🟢 免 Key |
| Open Page Rank | `OpenPageRankClient` | `https://www.domcop.com/openpagerank/` | 使用Page Rank算法计算和比较不同网站指标的API | 🔴 需要认证 (apiKey) |
| Pusher Beams | `PusherBeamsClient` | `https://pusher.com/beams` | 适用于 Android 和 iOS 的推送通知 | 🔴 需要认证 (apiKey) |
| ProxyKingdom | `ProxykingdomClient` | `https://proxykingdom.com` | 旋转代理 API，针对每个请求生成一个工作代理 | 🔴 需要认证 (apiKey) |
| ScrapingAnt | `ScrapingantClient` | `https://scrapingant.com` | 使用简单的 API 进行无头 Chrome 抓取 | 🔴 需要认证 (apiKey) |
| Statically | `StaticallyClient` | `https://statically.io/` | 为开发者提供的免费 CDN | 🟢 免 Key |
| Heroku | `HerokuClient` | `https://devcenter.heroku.com/articles/platform-api-reference/` | REST API 以编程方式创建应用程序、配置附加组件并在 Heroku 上执行其他任务 | 🔴 需要认证 (OAuth) |
| SonarQube | `SonarqubeClient` | `https://sonarcloud.io/web_api` | SonarQube REST API 用于检测错误、代码异味和安全漏洞 | 🔴 需要认证 (OAuth) |
| GitHub | `GithubClient` | `https://docs.github.com/en/free-pro-team@latest/rest` | 以编程方式使用 GitHub 存储库、代码和用户信息 | 🔴 需要认证 (OAuth) |
| StackExchange | `StackexchangeClient` | `https://api.stackexchange.com/` | 开发者问答论坛 | 🔴 需要认证 (OAuth) |
| serpstack | `SerpstackClient` | `https://serpstack.com/` | 实时准确的 Google 搜索结果 API | 🔴 需要认证 (apiKey) |
| QR code | `QrCodeClient` | `https://www.qrtag.net/api/` | 创建易于阅读的 QR 码和 URL 缩短器 | 🟢 免 Key |
| ZenRows | `ZenrowsClient` | `https://www.zenrows.com/` | Web Scraping API 绕过反机器人解决方案，同时提供 JS 渲染和旋转代理 | 🔴 需要认证 (apiKey) |
| QR code | `QrCodeClient` | `http://goqr.me/api/` | 生成并解码/读取二维码图形 | 🟢 免 Key |
| Talordata | `TalordataClient` | `https://docs.talordata.com/` | 来自主要搜索引擎的 SERP 数据，可免费试用 | 🔴 需要认证 (apiKey) |
| Serialif Color | `SerialifColorClient` | `https://color.serialif.com/` | 颜色转换、互补、灰度和对比文本 | 🟢 免 Key |
| Supportivekoala | `SupportivekoalaClient` | `https://developers.supportivekoala.com/` | 使用模板自动生成图像 | 🔴 需要认证 (apiKey) |
| Thunderbit | `ThunderbitClient` | `https://thunderbit.com/docs/introduction` | 将网页提取为 Markdown 或人工智能应用程序的结构化数据 | 🔴 需要认证 (apiKey) |
| SavePage.io | `SavepageIoClient` | `https://www.savepage.io` | 一个免费的 RESTful API，用于对任何桌面或移动网站进行屏幕截图 | 🔴 需要认证 (apiKey) |
| ip-fast.com | `IpFastComClient` | `https://ip-fast.com/docs/` | IP地址、国家和城市 | 🟢 免 Key |
| Suprsonic | `SuprsonicClient` | `https://suprsonic.ai` | Unified agent API: search, scrape, enrich, image gen, TTS, STT, messaging. One key, 20+ capabilities | 🔴 需要认证 (apiKey) |
| ProxyCrawl | `ProxycrawlClient` | `https://proxycrawl.com` | 抓取和爬行反验证码服务 | 🔴 需要认证 (apiKey) |
| SHOUTCLOUD | `ShoutcloudClient` | `http://shoutcloud.io/` | 全大写即服务 | 🟢 免 Key |
| WebScraping.AI | `WebscrapingAiClient` | `https://webscraping.ai/` | 具有内置代理和 JS 渲染的 Web Scraping API | 🔴 需要认证 (apiKey) |
| scraperBox | `ScraperboxClient` | `https://scraperbox.com/` | 无法检测到的网页抓取 API | 🔴 需要认证 (apiKey) |
| Changelogs.md | `ChangelogsMdClient` | `https://changelogs.md` | 来自开源项目的结构化变更日志元数据 | 🟢 免 Key |
| HTTP2.Pro | `Http2ProClient` | `https://http2.pro/doc/api` | 测试客户端和服务器 HTTP/2 协议支持的端点 | 🟢 免 Key |
| Sheetsu | `SheetsuClient` | `https://sheetsu.com/` | 轻松集成谷歌表格 | 🔴 需要认证 (apiKey) |
| Tyk | `TykClient` | `https://tyk.io/open-source/` | API和服务管理平台 | 🔴 需要认证 (apiKey) |
| isitdownstatus | `IsitdownstatusClient` | `https://isitdownstatus.com` | 检查网站和在线服务当前是否已关闭 | 🟢 免 Key |
| OpenGraphr | `OpengraphrClient` | `https://opengraphr.com/docs/1.0/overview` | 从 URL 检索 Open Graph 数据的 API 非常简单 | 🔴 需要认证 (apiKey) |


### Games & Comics

本分类 (**游戏与漫画**) 共包含 **89** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.gamescomics.GamesComicsAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Autochess VNG | `AutochessVngClient` | `https://github.com/didadadida93/autochess-vng-api` | Autochess VNG 的 Rest Api | 🟢 免 Key |
| Barter.VG | `BarterVgClient` | `https://github.com/bartervg/barter.vg/wiki` | 提供有关游戏、DLC、捆绑包、赠品、交易的信息 | 🟢 免 Key |
| Board Game Geek | `BoardGameGeekClient` | `https://boardgamegeek.com/wiki/page/BGG_XML_API2` | 棋盘游戏、角色扮演游戏和视频游戏 | 🟢 免 Key |
| AmiiboAPI | `AmiiboapiClient` | `https://amiiboapi.com/` | 任天堂 Amiibo 信息 | 🟢 免 Key |
| Chess.com | `ChessComClient` | `https://www.chess.com/news/view/published-data-api` | Chess.com 只读 REST API | 🟢 免 Key |
| Geek-Jokes | `GeekJokesClient` | `https://github.com/sameerkumar18/geek-joke-api` | 获取随机的极客/编程相关笑话，用于各种应用程序 | 🟢 免 Key |
| Brawl Stars | `BrawlStarsClient` | `https://developer.brawlstars.com` | 《荒野乱斗》游戏信息 | 🔴 需要认证 (apiKey) |
| GraphQL Pokemon | `GraphqlPokemonClient` | `https://github.com/favware/graphql-pokemon` | GraphQL powered Pokemon API. Supports generations 1 through 8 | 🟢 免 Key |
| Digimon TCG | `DigimonTcgClient` | `https://documenter.getpostman.com/view/14059948/TzecB4fH` | 在 digimoncard.io 中搜索数码宝贝卡 | 🟢 免 Key |
| Animal Crossing: New Horizons | `AnimalCrossingNewHorizonsClient` | `http://acnhapi.com/` | 动物、化石、艺术、音乐、家具和村民的 API | 🟢 免 Key |
| GW2Spidy | `Gw2SpidyClient` | `https://github.com/rubensayshi/gw2spidy/wiki` | GW2Spidy API，激战 2 贸易市场上的物品数据 | 🟢 免 Key |
| Destiny The Game | `DestinyTheGameClient` | `https://bungie-net.github.io/multi/index.html` | Bungie 平台 API | 🔴 需要认证 (apiKey) |
| Disney | `DisneyClient` | `https://disneyapi.dev` | 迪士尼人物信息 | 🟢 免 Key |
| Fortnite | `FortniteClient` | `https://fortnitetracker.com/site-api` | 《堡垒之夜》统计数据 | 🔴 需要认证 (apiKey) |
| Comic Vine | `ComicVineClient` | `https://comicvine.gamespot.com/api/documentation` | 漫画 | 🟢 免 Key |
| Hyrule Compendium | `HyruleCompendiumClient` | `https://github.com/gadhagod/Hyrule-Compendium-API` | 《塞尔达传说：BOTW》中所有互动项目的数据 | 🟢 免 Key |
| Clash of Clans | `ClashOfClansClient` | `https://developer.clashofclans.com` | 部落冲突游戏信息 | 🔴 需要认证 (apiKey) |
| GamerPower | `GamerpowerClient` | `https://www.gamerpower.com/api-read` | 游戏赠品追踪器 | 🟢 免 Key |
| Clash Royale | `ClashRoyaleClient` | `https://developer.clashroyale.com` | 皇室战争游戏信息 | 🔴 需要认证 (apiKey) |
| Hearthstone | `HearthstoneClient` | `http://hearthstoneapi.com/` | 炉石卡牌信息 | 🔴 需要认证 (X-Mashape-Key) |
| Hypixel | `HypixelClient` | `https://api.hypixel.net/` | Hypixel 玩家统计 | 🔴 需要认证 (apiKey) |
| FunTranslations | `FuntranslationsClient` | `https://api.funtranslations.com/` | 将文本翻译成有趣的语言 | 🟢 免 Key |
| Humble Bundle | `HumbleBundleClient` | `https://rapidapi.com/Ziggoto/api/humble-bundle` | Humble Bundle 当前的捆绑包 | 🔴 需要认证 (apiKey) |
| Genshin Impact | `GenshinImpactClient` | `https://genshin.dev` | 原神游戏数据 | 🟢 免 Key |
| GDBrowser | `GdbrowserClient` | `https://gdbrowser.com/api` | 使用 Geometry Dash 服务器的简单方法 | 🟢 免 Key |
| FreeToGame | `FreetogameClient` | `https://www.freetogame.com/api-doc` | 免费游戏数据库 | 🟢 免 Key |
| Dota 2 | `Dota2Client` | `https://docs.opendota.com/` | 提供有关 Dota 2 玩家统计数据、比赛统计数据、排名的信息 | 🔴 需要认证 (apiKey) |
| IGDB.com | `IgdbComClient` | `https://api-docs.igdb.com` | 视频游戏数据库 | 🔴 需要认证 (apiKey) |
| Humor | `HumorClient` | `https://humorapi.com` | 幽默、笑话和模因 | 🔴 需要认证 (apiKey) |
| FFXIV Collect | `FfxivCollectClient` | `https://ffxivcollect.com/` | 《最终幻想 XIV》收藏品数据 | 🟢 免 Key |
| Chuck Norris Database | `ChuckNorrisDatabaseClient` | `http://www.icndb.com/api/` | 笑话 | 🟢 免 Key |
| Dungeons and Dragons (Alternate) | `DungeonsAndDragonsAlternateClient` | `https://open5e.com/` | 包括 SRD（系统参考文档）中的所有怪物和法术以及搜索 API | 🟢 免 Key |
| mod.io | `ModIoClient` | `https://docs.mod.io` | 跨平台模组 API | 🔴 需要认证 (apiKey) |
| PokéAPI (GraphQL) | `PokApiGraphqlClient` | `https://github.com/mazipan/graphql-pokeapi` | PokeAPI 的非官方 GraphQL | 🟢 免 Key |
| Digimon Information | `DigimonInformationClient` | `https://digimon-api.vercel.app/` | 提供有关数码宝贝生物的信息 | 🟢 免 Key |
| Puyo Nexus | `PuyoNexusClient` | `https://github.com/deltadex7/puyodb-api-deno` | Puyo Puyo 信息来自 Puyo Nexus Wiki | 🟢 免 Key |
| Giant Bomb | `GiantBombClient` | `https://www.giantbomb.com/api/documentation` | 电子游戏 | 🔴 需要认证 (apiKey) |
| Path of Exile | `PathOfExileClient` | `https://www.pathofexile.com/developer/docs` | 流亡之路游戏信息 | 🔴 需要认证 (OAuth) |
| Sakura CardCaptor | `SakuraCardcaptorClient` | `https://github.com/JessVel/sakura-card-captor-api` | 小樱魔卡卡片信息 | 🟢 免 Key |
| PlayerDB | `PlayerdbClient` | `https://playerdb.co/` | 查询 Minecraft、Steam 和 Xbox 帐户 | 🟢 免 Key |
| Guild Wars 2 | `GuildWars2Client` | `https://wiki.guildwars2.com/wiki/API:Main` | 激战 2 游戏信息 | 🔴 需要认证 (apiKey) |
| Minecraft Server Status | `MinecraftServerStatusClient` | `https://api.mcsrvstat.us` | 用于获取有关 Minecraft 服务器信息的 API | 🟢 免 Key |
| Lichess | `LichessClient` | `https://lichess.org/api` | 访问 Lichess 上的用户、游戏、谜题等所有数据 | 🔴 需要认证 (OAuth) |
| RAWG.io | `RawgIoClient` | `https://rawg.io/apidocs` | 适用于 50 个平台（包括手机）的 500,000 多款游戏 | 🔴 需要认证 (apiKey) |
| Halo | `HaloClient` | `https://developer.haloapi.com/` | 光环 5 和光环战争 2 信息 | 🔴 需要认证 (apiKey) |
| Raider | `RaiderClient` | `https://raider.io/api` | 提供魔兽世界中Raiding和Mythic+内容的详细角色和公会排名 | 🟢 免 Key |
| Eve Online | `EveOnlineClient` | `https://esi.evetech.net/ui` | 第三方开发者文档 | 🔴 需要认证 (OAuth) |
| Fun Facts | `FunFactsClient` | `https://asli-fun-fact-api.herokuapp.com/` | 随机有趣的事实 | 🟢 免 Key |
| Monster Hunter World | `MonsterHunterWorldClient` | `https://docs.mhw-db.com/` | 怪物猎人世界数据 | 🟢 免 Key |
| Steam | `SteamClient` | `https://github.com/Revadike/InternalSteamWebAPI/wiki` | 内部 Steam Web API 文档 | 🟢 免 Key |
| JokeAPI | `JokeapiClient` | `https://sv443.net/jokeapi/v2/` | 编程、杂项和黑色笑话 | 🟢 免 Key |
| Psychonauts | `PsychonautsClient` | `https://psychonauts-api.netlify.app/` | Psychonauts 世界角色信息和 PSI 能力 | 🟢 免 Key |
| When is next MCU film | `WhenIsNextMcuFilmClient` | `https://github.com/DiljotSG/MCU-Countdown/blob/develop/docs/API.md` | 即将上映的 MCU 电影信息 | 🟢 免 Key |
| Pokéapi | `PokApiClient` | `https://pokeapi.co` | 宝可梦信息 | 🟢 免 Key |
| Scryfall | `ScryfallClient` | `https://scryfall.com/docs/api` | 万智牌数据库 | 🟢 免 Key |
| Mario Kart Tour | `MarioKartTourClient` | `https://mario-kart-tour-api.herokuapp.com/` | 适用于车手、卡丁车、滑翔机和课程的 API | 🔴 需要认证 (OAuth) |
| MMO Games | `MmoGamesClient` | `https://www.mmobomb.com/api` | MMO 游戏数据库、新闻和赠品 | 🟢 免 Key |
| Steam | `SteamClient` | `https://steamapi.xpaw.me/` | Steam Web API 文档 | 🔴 需要认证 (apiKey) |
| Deck of Cards | `DeckOfCardsClient` | `http://deckofcardsapi.com/` | 一副牌 | 🟢 免 Key |
| RuneScape | `RunescapeClient` | `https://runescape.wiki/w/Application_programming_interface` | RuneScape 和 OSRS RPG 信息 | 🟢 免 Key |
| Final Fantasy XIV | `FinalFantasyXivClient` | `https://xivapi.com/` | 最终幻想 XIV 游戏数据 API | 🟢 免 Key |
| Jokes One | `JokesOneClient` | `https://jokes.one/api/joke/` | 每日笑话和可通过 REST API 访问的大类笑话 | 🔴 需要认证 (apiKey) |
| Battle.net | `BattleNetClient` | `https://develop.battle.net/documentation/guides/getting-started` | 暗黑破坏神 III、炉石传说、星际争霸 II 和魔兽世界游戏数据 API | 🔴 需要认证 (OAuth) |
| Valorant (non-official) | `ValorantNonOfficialClient` | `https://valorant-api.com` | 一个广泛的 API，包含大多数《Valorant》游戏内物品、资产等的数据 | 🟢 免 Key |
| RPS 101 | `Rps101Client` | `https://rps101.pythonanywhere.com/api` | 石头、剪刀、布 共有 101 件物品 | 🟢 免 Key |
| Rick and Morty | `RickAndMortyClient` | `https://rickandmortyapi.com` | 所有瑞克和莫蒂信息，包括图像 | 🟢 免 Key |
| quizapi.io | `QuizapiIoClient` | `https://quizapi.io/` | 访问各种测验问题 | 🔴 需要认证 (apiKey) |
| TETR.IO | `TetrIoClient` | `https://tetr.io/about/api/` | TETR.IO Tetra 通道 API | 🟢 免 Key |
| Open Trivia | `OpenTriviaClient` | `https://opentdb.com/api_config.php` | 琐事问题 | 🟢 免 Key |
| Marvel | `MarvelClient` | `https://developer.marvel.com` | 漫威漫画 | 🔴 需要认证 (apiKey) |
| Hytale | `HytaleClient` | `https://hytale-api.com/` | Hytale 博客文章和职位 | 🟢 免 Key |
| PUBG | `PubgClient` | `https://developer.pubg.com/` | 访问游戏内 PUBG 数据 | 🔴 需要认证 (apiKey) |
| Dungeons and Dragons | `DungeonsAndDragonsClient` | `https://www.dnd5eapi.co/docs/` | 第五版法术、职业、怪物等的参考 | 🟢 免 Key |
| Tronald Dump | `TronaldDumpClient` | `https://www.tronalddump.io/` | 唐纳德·特朗普说过的最愚蠢的话 | 🟢 免 Key |
| Riot Games | `RiotGamesClient` | `https://developer.riotgames.com/` | 英雄联盟游戏信息 | 🔴 需要认证 (apiKey) |
| Magic The Gathering | `MagicTheGatheringClient` | `http://magicthegathering.io/` | 万智牌游戏信息 | 🟢 免 Key |
| Tebex | `TebexClient` | `https://docs.tebex.io/plugin/` | Tebex API 提供有关游戏购买的信息 | 🔴 需要认证 (X-Mashape-Key) |
| Cross Universe | `CrossUniverseClient` | `https://crossuniverse.psychpsyo.com/apiDocs.html` | 跨宇宙卡牌数据 | 🟢 免 Key |
| TCGdex | `TcgdexClient` | `https://www.tcgdex.net/docs` | 多语言宝可梦 TCG 信息 | 🟢 免 Key |
| Pokémon TCG | `PokMonTcgClient` | `https://pokemontcg.io` | 神奇宝贝 TCG 信息 | 🟢 免 Key |
| SuperHeroes | `SuperheroesClient` | `https://superheroapi.com` | 来自所有宇宙的所有超级英雄和恶棍数据都在一个 API 下 | 🔴 需要认证 (apiKey) |
| CheapShark | `CheapsharkClient` | `https://www.cheapshark.com/api` | Steam/PC 游戏价格和优惠 | 🟢 免 Key |
| xkcd | `XkcdClient` | `https://xkcd.com/json.html` | 以 JSON 形式检索 xkcd 漫画 | 🟢 免 Key |
| PandaScore | `PandascoreClient` | `https://developers.pandascore.co/` | 电子竞技比赛及结果 | 🔴 需要认证 (apiKey) |
| SpaceTradersAPI | `SpacetradersapiClient` | `https://spacetraders.io?rel=pub-apis` | 一款可玩的星际空间交易 MMOAPI | 🔴 需要认证 (OAuth) |
| Warface (non-official) | `WarfaceNonOfficialClient` | `https://api.wfstats.cf` | 官方API代理，具有更好的数据结构和更多功能 | 🟢 免 Key |
| Yu-Gi-Oh! | `YuGiOhClient` | `https://db.ygoprodeck.com/api-guide/` | Yu-Gi-Oh! TCG Information | 🟢 免 Key |
| Wargaming.net | `WargamingNetClient` | `https://developers.wargaming.net/` | Wargaming.net 信息和统计数据 | 🔴 需要认证 (apiKey) |
| Universalis | `UniversalisClient` | `https://universalis.app/docs/index.html` | 最终幻想 XIV 市场板数据 | 🟢 免 Key |


### Geocoding

本分类 (**地理编码**) 共包含 **86** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.geocoding.GeocodingAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| administrative-divisons-db | `AdministrativeDivisonsDbClient` | `https://github.com/kamikazechaser/administrative-divisions-db` | 获取一个国家的所有行政区划 | 🟢 免 Key |
| Cartes.io | `CartesIoClient` | `https://github.com/M-Media-Group/Cartes.io/wiki/API` | 为任何事物创建地图和标记 | 🟢 免 Key |
| Airtel IP | `AirtelIpClient` | `https://sys.airtel.lv/ip2country/1.1.1.1/?full=true` | IP Geolocation API. Collecting data from multiple sources | 🟢 免 Key |
| Apiip | `ApiipClient` | `https://apiip.net/` | 通过IP地址获取位置信息 | 🔴 需要认证 (apiKey) |
| bng2latlong | `Bng2LatlongClient` | `https://www.getthedata.com/bng2latlong` | 将英国 OSGB36 东向和北向（英国国家网格）转换为 WGS84 纬度和经度 | 🟢 免 Key |
| Graph Countries | `GraphCountriesClient` | `https://github.com/lennertVanSever/graphcountries` | 与国家/地区相关的数据，例如货币、语言、国旗、地区+次地区以及毗邻国家 | 🟢 免 Key |
| ipapi.com | `IpapiComClient` | `https://ipapi.com/?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 实时地理定位和反向 IP 查找 REST API | 🔴 需要认证 (apiKey) |
| GeoJS | `GeojsClient` | `https://www.geojs.io/` | 与 ChatOps 集成的 IP 地理定位 | 🟢 免 Key |
| Google Maps | `GoogleMapsClient` | `https://developers.google.com/maps/` | 基于 Google 地图数据创建/自定义数字地图 | 🔴 需要认证 (apiKey) |
| Google Earth Engine | `GoogleEarthEngineClient` | `https://developers.google.com/earth-engine/` | 用于全球范围环境数据分析的云平台 | 🔴 需要认证 (apiKey) |
| IP Address Details | `IpAddressDetailsClient` | `https://ipinfo.io/` | 通过ip地址查找地理位置 | 🟢 免 Key |
| GeographQL | `GeographqlClient` | `https://geographql.netlify.app` | 国家、州和城市 GraphQL API | 🟢 免 Key |
| CountryStateCity | `CountrystatecityClient` | `https://countrystatecity.in/` | JSON、SQL、XML、YAML 和 CSV 格式的世界国家、州、地区、省份、城市和城镇 | 🔴 需要认证 (apiKey) |
| Battuta | `BattutaClient` | `http://battuta.medunes.net` | （国家/地区/城市）级联位置 API | 🔴 需要认证 (apiKey) |
| Geokeo | `GeokeoClient` | `https://geokeo.com` | Geokeo 地理编码服务 - 每天有 2500 个免费 API 请求 | 🟢 免 Key |
| IPstack | `IpstackClient` | `https://ipstack.com/?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 通过 IP 地址定位和识别网站访问者 | 🔴 需要认证 (apiKey) |
| adresse.data.gouv.fr | `AdresseDataGouvFrClient` | `https://adresse.data.gouv.fr` | 法国地址数据库、地理编码和反向 | 🟢 免 Key |
| BigDataCloud | `BigdatacloudClient` | `https://www.bigdatacloud.com/ip-geolocation-apis` | 提供快速准确的 IP 地理定位 API 以及安全检查和置信区域 | 🔴 需要认证 (apiKey) |
| Hong Kong GeoData Store | `HongKongGeodataStoreClient` | `https://geodata.gov.hk/gs/` | 用于访问香港地理数据的API | 🟢 免 Key |
| Country | `CountryClient` | `http://country.is/` | 从访问者的 IP 中获取其所在国家/地区 | 🟢 免 Key |
| HackMyIP | `HackmyipClient` | `https://hackmyip.com/api` | IP 地理位置、ISP 和隐私/VPN 评分、电子邮件泄露检查、DNS 和 WHOIS 查找 | 🟢 免 Key |
| IP Geolocation | `IpGeolocationClient` | `https://www.abstractapi.com/ip-geolocation-api` | 根据 IP 定位网站访问者 | 🔴 需要认证 (apiKey) |
| ip-api | `IpApiClient` | `https://ip-api.com/docs` | 使用 IP 地址或域查找位置 | 🟢 免 Key |
| IPInfoDB | `IpinfodbClient` | `https://www.ipinfodb.com/api` | 免费地理定位工具和 API，用于通过 IP 地址查找国家、地区、城市和时区 | 🔴 需要认证 (apiKey) |
| BdAPIs | `BdapisClient` | `https://bdapis.com/` | 获取孟加拉国的分区、地区和乌帕齐拉 | 🟢 免 Key |
| ipapi.co | `IpapiCoClient` | `https://ipapi.co/api/#introduction` | 查找IP地址位置信息 | 🟢 免 Key |
| Geocodify.com | `GeocodifyComClient` | `https://geocodify.com/` | 地址的全球地理编码、地理解析和自动完成 | 🔴 需要认证 (apiKey) |
| GeoDataSource | `GeodatasourceClient` | `https://www.geodatasource.com/web-service` | 使用纬度和经度坐标对城市名称进行地理编码 | 🔴 需要认证 (apiKey) |
| Mexico | `MexicoClient` | `https://github.com/IcaliaLabs/sepomex` | 墨西哥 RESTful 邮政编码 API | 🟢 免 Key |
| Geocode.xyz | `GeocodeXyzClient` | `https://geocode.xyz/api` | 提供全球正向/反向地理编码、批量地理编码和地理解析 | 🟢 免 Key |
| GeoNames | `GeonamesClient` | `http://www.geonames.org/export/web-services.html` | 地名和其他地理数据 | 🟢 免 Key |
| geoPlugin | `GeopluginClient` | `https://www.geoplugin.com` | IP 地理位置和货币换算 | 🟢 免 Key |
| ipstack | `IpstackClient` | `https://ipstack.com/` | 通过 IP 地址定位和识别网站访问者 | 🔴 需要认证 (apiKey) |
| ipgeolocation | `IpgeolocationClient` | `https://ipgeolocation.io/` | IP 地理定位 AP 免费计划每月 30k 请求 | 🔴 需要认证 (apiKey) |
| IP 2 Country | `Ip2CountryClient` | `https://ip2country.info` | 将 IP 映射到国家/地区 | 🟢 免 Key |
| keycdn IP Location Finder | `KeycdnIpLocationFinderClient` | `https://tools.keycdn.com/geo` | Get the IP geolocation data through the simple REST API. All the responses are JSON encoded | 🔴 需要认证 (apiKey) |
| Ducks Unlimited | `DucksUnlimitedClient` | `https://gis.ducks.org/datasets/du-university-chapters/api` | API 浏览器提供查询 URL 以及位置和城市的 JSON 响应 | 🟢 免 Key |
| ApogeoAPI | `ApogeoapiClient` | `https://apogeoapi.com` | 针对国家、州、城市、IP 地理位置和实时汇率的捆绑 API | 🔴 需要认证 (apiKey) |
| IP2Location | `Ip2LocationClient` | `https://www.ip2location.com/web-service/ip2location` | IP 地理定位 Web 服务可获取超过 55 个参数 | 🔴 需要认证 (apiKey) |
| IP2Proxy | `Ip2ProxyClient` | `https://www.ip2location.com/web-service/ip2proxy` | 使用 IP 地址检测代理和 VPN | 🔴 需要认证 (apiKey) |
| Kakao Maps | `KakaoMapsClient` | `https://apis.map.kakao.com` | Kakao Maps 为韩国地图提供多个 API | 🔴 需要认证 (apiKey) |
| MapQuest | `MapquestClient` | `https://developer.mapquest.com/` | 获取绘制世界地图的工具和资源 | 🔴 需要认证 (apiKey) |
| Longdo Map | `LongdoMapClient` | `https://map.longdo.com/docs/` | 包含泰国详细地点和信息门户的交互式地图 | 🔴 需要认证 (apiKey) |
| HERE Maps | `HereMapsClient` | `https://developer.here.com` | 基于 HERE 地图数据创建/定制数字地图 | 🔴 需要认证 (apiKey) |
| Geoapify | `GeoapifyClient` | `https://www.geoapify.com/api/geocoding-api/` | 正向和反向地理编码、地址自动完成 | 🔴 需要认证 (apiKey) |
| SLF | `SlfClient` | `https://github.com/slftool/slftool.github.io/blob/master/API.md` | 德国城市、国家、河流、数据库 | 🟢 免 Key |
| Mapbox | `MapboxClient` | `https://docs.mapbox.com/` | 创建/定制精美的数字地图 | 🔴 需要认证 (apiKey) |
| One Map, Singapore | `OneMapSingaporeClient` | `https://www.onemap.gov.sg/docs/` | 新加坡土地管理局针对新加坡地址的 REST API 服务 | 🔴 需要认证 (apiKey) |
| US ZipCode | `UsZipcodeClient` | `https://www.smarty.com/docs/cloud/us-zipcode-api` | 验证并附加任何美国邮政编码的数据 | 🔴 需要认证 (apiKey) |
| Rwanda Locations | `RwandaLocationsClient` | `https://rapidapi.com/victorkarangwa4/api/rwanda` | 卢旺达普罗旺斯、地区、城市、首都、部门、单元、村庄和街道 | 🟢 免 Key |
| Postcodes.io | `PostcodesIoClient` | `https://postcodes.io` | 英国邮政编码查找和地理定位 | 🟢 免 Key |
| openrouteservice.org | `OpenrouteserviceOrgClient` | `https://openrouteservice.org/` | 路线、POI、等时线、地理编码（+反向）、海拔等 | 🔴 需要认证 (apiKey) |
| PostalCodes | `PostalcodesClient` | `https://postalcodes.info/api` | 邮政编码搜索、国家/地区出口和地址验证数据 | 🟢 免 Key |
| Pinball Map | `PinballMapClient` | `https://pinballmap.com/api/v1/docs` | 公共弹球机的众包地图 | 🟢 免 Key |
| OpenCage | `OpencageClient` | `https://opencagedata.com` | 使用开放数据进行正向和反向地理编码 | 🔴 需要认证 (apiKey) |
| Open Topo Data | `OpenTopoDataClient` | `https://www.opentopodata.org` | 纬度和经度的海拔和海洋深度 | 🟢 免 Key |
| Cep.la | `CepLaClient` | `http://cep.la/` | 巴西 RESTful API，用于查找有关街道、邮政编码、社区、城市和州的信息 | 🟢 免 Key |
| GeoDB Cities | `GeodbCitiesClient` | `http://geodb-cities-api.wirefreethought.com/` | 获取全球城市、地区、国家数据 | 🔴 需要认证 (apiKey) |
| REST Countries | `RestCountriesClient` | `https://restcountries.com` | 通过 RESTful API 获取有关国家/地区的信息 | 🟢 免 Key |
| IPGEO | `IpgeoClient` | `https://api.techniknews.net/ipgeo/` | 无限制的免费 IP 地址 API 以及有用的信息 | 🟢 免 Key |
| Actinia Grass GIS | `ActiniaGrassGisClient` | `https://actinia.mundialis.de/api_docs/` | Actinia 是一个开源 REST API，用于使用 GRASS GIS 的地理数据 | 🔴 需要认证 (apiKey) |
| TomTom | `TomtomClient` | `https://developer.tomtom.com/` | 地图、路线、地点和交通 API | 🔴 需要认证 (apiKey) |
| Postali | `PostaliClient` | `https://postali.app/api` | 墨西哥 邮政编码 API | 🟢 免 Key |
| Telize | `TelizeClient` | `https://rapidapi.com/fcambus/api/telize/` | Telize 提供来自任何 IP 地址的位置信息 | 🔴 需要认证 (apiKey) |
| IBGE | `IbgeClient` | `https://servicodados.ibge.gov.br/api/docs/` | IBGE（巴西地理与统计研究所）的综合服务 | 🟢 免 Key |
| positionstack | `PositionstackClient` | `https://positionstack.com/` | 正向和反向批量地理编码 REST API | 🔴 需要认证 (apiKey) |
| Uebermaps | `UebermapsClient` | `https://uebermaps.com/api/v2` | 发现地图并与朋友分享 | 🔴 需要认证 (apiKey) |
| Zippopotam.us | `ZippopotamUsClient` | `http://www.zippopotam.us` | 获取有关国家、城市、州等地点的信息 | 🟢 免 Key |
| PostcodeData.nl | `PostcodedataNlClient` | `http://api.postcodedata.nl/v1/postcode/?postcode=1211EP&streetnumber=60&ref=domeinnaam.nl&type=json` | 提供基于荷兰地址邮政编码的地理位置数据 | 🟢 免 Key |
| CitySDK | `CitysdkClient` | `http://www.citysdk.eu/citysdk-toolkit/` | 为部分欧洲城市开放 API | 🟢 免 Key |
| Nominatim | `NominatimClient` | `https://nominatim.org/release-docs/latest/api/Overview/` | 提供全球正向/反向地理编码 | 🟢 免 Key |
| Geocod.io | `GeocodIoClient` | `https://www.geocod.io/` | 批量地址地理编码/反向地理编码 | 🔴 需要认证 (apiKey) |
| OpenStreetMap | `OpenstreetmapClient` | `http://wiki.openstreetmap.org/wiki/API` | 导航、地理定位和地理数据 | 🔴 需要认证 (OAuth) |
| Utah AGRC | `UtahAgrcClient` | `https://api.mapserv.utah.gov` | 用于对犹他州地址进行地理编码的犹他州 Web API | 🔴 需要认证 (apiKey) |
| ZipCodeAPI | `ZipcodeapiClient` | `https://www.zipcodeapi.com` | 美国邮政编码距离、半径和位置 API | 🔴 需要认证 (apiKey) |
| GeoApi | `GeoapiClient` | `https://api.gouv.fr/api/geoapi.html` | 法国地理数据 | 🟢 免 Key |
| Yandex.Maps Geocoder | `YandexMapsGeocoderClient` | `https://yandex.com/dev/maps/geocoder` | 使用地理编码从对象的地址获取对象的坐标 | 🔴 需要认证 (apiKey) |
| Ziptastic | `ZiptasticClient` | `https://ziptasticapi.com/` | 获取任何美国邮政编码的国家、州和城市 | 🟢 免 Key |
| LocationIQ | `LocationiqClient` | `https://locationiq.org/docs/` | 提供正向/反向地理编码和批量地理编码 | 🔴 需要认证 (apiKey) |
| IP Vigilante | `IpVigilanteClient` | `https://www.ipvigilante.com/` | 免费 IP 地理定位 API | 🟢 免 Key |
| HelloSalut | `HellosalutClient` | `https://fourtonfish.com/project/hellosalut-api/` | 根据用户语言获取你好翻译 | 🟢 免 Key |
| ViaCep | `ViacepClient` | `https://viacep.com.br` | 巴西 RESTful 邮政编码 API | 🟢 免 Key |
| Hirak IP to Country | `HirakIpToCountryClient` | `https://iplocation.hirak.site/` | 带国家代码、货币代码和货币名称的 IP 到位置，快速响应，无限请求 | 🔴 需要认证 (apiKey) |
| OnWater | `OnwaterClient` | `https://onwater.io/` | 确定纬度/经度是在水上还是陆地上 | 🟢 免 Key |
| Queimadas INPE | `QueimadasInpeClient` | `https://queimadas.dgi.inpe.br/queimadas/dados-abertos/` | 获取热点数据（可能发生野火） | 🟢 免 Key |
| What3Words | `What3WordsClient` | `https://what3words.com` | 三个词作为全球难忘且独特的坐标 | 🔴 需要认证 (apiKey) |


### Government

本分类 (**政府**) 共包含 **82** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.government.GovernmentAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Brazil | `BrazilClient` | `https://brasilapi.com.br/` | 社区驱动的巴西公共数据 API | 🟢 免 Key |
| Bank Negara Malaysia Open Data | `BankNegaraMalaysiaOpenDataClient` | `https://apikijangportal.bnm.gov.my/` | 马来西亚中央银行开放数据 | 🟢 免 Key |
| City, Berlin | `CityBerlinClient` | `https://daten.berlin.de/` | 柏林(DE) 城市开放数据 | 🟢 免 Key |
| BCLaws | `BclawsClient` | `https://www.bclaws.gov.bc.ca/civix/template/complete/api/index.html` | 查阅不列颠哥伦比亚省的法律 | 🟢 免 Key |
| City, Lviv | `CityLvivClient` | `https://opendata.city-adm.lviv.ua/` | 利沃夫(UA) 城市开放数据 | 🟢 免 Key |
| Data USA | `DataUsaClient` | `https://datausa.io/about/api/` | 美国公开数据 | 🟢 免 Key |
| Data.parliament.uk | `DataParliamentUkClient` | `https://explore.data.parliament.uk/?learnmore=Members` | 包含实时数据集，包括请愿书、法案、国会议员选票、出席率等信息 | 🟢 免 Key |
| Brazil Central Bank Open Data | `BrazilCentralBankOpenDataClient` | `https://dadosabertos.bcb.gov.br/` | 巴西央行开放数据 | 🟢 免 Key |
| Gazette Data, UK | `GazetteDataUkClient` | `https://www.thegazette.co.uk/data` | 英国官方公共记录 API | 🔴 需要认证 (OAuth) |
| City, Helsinki | `CityHelsinkiClient` | `https://hri.fi/en_gb/` | 赫尔辛基(FI) 城市开放数据 | 🟢 免 Key |
| Deutscher Bundestag DIP | `DeutscherBundestagDipClient` | `https://dip.bundestag.de/documents/informationsblatt_zur_dip_api_v01.pdf` | 此 API 提供对 DIP 实体（例如活动、人员、印刷材料）的读取访问权限 | 🔴 需要认证 (apiKey) |
| Census.gov | `CensusGovClient` | `https://www.census.gov/data/developers/data-sets.html` | 美国人口普查局提供有关人口统计和企业的各种 API 和数据集 | 🟢 免 Key |
| Interpol Red Notices | `InterpolRedNoticesClient` | `https://interpol.api.bund.dev/` | 访问和搜索国际刑警组织红色通缉令 | 🟢 免 Key |
| Federal Register | `FederalRegisterClient` | `https://www.federalregister.gov/reader-aids/developer-resources/rest-api` | 美国政府日报 | 🟢 免 Key |
| Data.gov | `DataGovClient` | `https://api.data.gov/` | 美国政府数据 | 🔴 需要认证 (apiKey) |
| LocalGov.jp | `LocalgovJpClient` | `https://localgov.jp/` | 日本赠款和补贴（中央 J 赠款 + 1,916 个市町村） | 🟢 免 Key |
| EPA | `EpaClient` | `https://www.epa.gov/developers/data-data-products#apis` | 来自美国环境保护局的 Web 服务和数据集 | 🟢 免 Key |
| FBI Wanted | `FbiWantedClient` | `https://www.fbi.gov/wanted/api` | 获取有关 FBI 通缉计划的信息 | 🟢 免 Key |
| City, Toronto Open Data | `CityTorontoOpenDataClient` | `https://open.toronto.ca/` | 多伦多（加利福尼亚州）城市开放数据 | 🟢 免 Key |
| Brazil Receita WS | `BrazilReceitaWsClient` | `https://www.receitaws.com.br/` | CNPJ 为巴西公司提供咨询 | 🟢 免 Key |
| CPFHub | `CpfhubClient` | `https://cpfhub.io` | 巴西 CPF 查找 — 返回任何 CPF 的全名、出生日期和性别 | 🔴 需要认证 (apiKey) |
| City, Gdańsk | `CityGdaSkClient` | `https://ckan.multimediagdansk.pl/en` | 格但斯克 (PL) 城市开放数据 | 🟢 免 Key |
| National Park Service, US | `NationalParkServiceUsClient` | `https://www.nps.gov/subjects/developer/` | 数据来自美国国家公园管理局 | 🔴 需要认证 (apiKey) |
| Open Government, Austria | `OpenGovernmentAustriaClient` | `https://www.data.gv.at/` | 奥地利政府开放数据 | 🟢 免 Key |
| Open Government, Australia | `OpenGovernmentAustraliaClient` | `https://www.data.gov.au/` | 澳大利亚政府开放数据 | 🟢 免 Key |
| City, Nantes Open Data | `CityNantesOpenDataClient` | `https://data.nantesmetropole.fr/pages/home/` | 南特(法国) 城市开放数据 | 🔴 需要认证 (apiKey) |
| Open Government, France | `OpenGovernmentFranceClient` | `https://www.data.gouv.fr/` | 法国政府开放数据 | 🔴 需要认证 (apiKey) |
| City, New York Open Data | `CityNewYorkOpenDataClient` | `https://opendata.cityofnewyork.us/` | 纽约（美国）城市开放数据 | 🟢 免 Key |
| Food Standards Agency | `FoodStandardsAgencyClient` | `http://ratings.food.gov.uk/open-data/en-GB` | 英国食品卫生评级数据API | 🟢 免 Key |
| Indian Pincode | `IndianPincodeClient` | `https://indianpincode.com/` | 免费印度 PIN 码查找，包括 GPS 坐标、165k+ 邮局、州和地区数据 | 🟢 免 Key |
| Colorado Information Marketplace | `ColoradoInformationMarketplaceClient` | `https://data.colorado.gov/` | 科罗拉多州政府开放数据 | 🟢 免 Key |
| Open Government, Argentina | `OpenGovernmentArgentinaClient` | `https://datos.gob.ar/` | 阿根廷政府开放数据 | 🟢 免 Key |
| Code.gov | `CodeGovClient` | `https://code.gov` | 美国联邦政府开源和代码共享的主要平台 | 🔴 需要认证 (apiKey) |
| District of Columbia Open Data | `DistrictOfColumbiaOpenDataClient` | `http://opendata.dc.gov/pages/using-apis` | 包含华盛顿特区政府公共数据集，包括犯罪、GIS、金融数据等 | 🟢 免 Key |
| Open Government, New South Wales | `OpenGovernmentNewSouthWalesClient` | `https://api.nsw.gov.au/` | 新南威尔士州政府开放数据 | 🔴 需要认证 (apiKey) |
| FEC | `FecClient` | `https://api.open.fec.gov/developers/` | 有关联邦选举竞选捐款的信息 | 🔴 需要认证 (apiKey) |
| Open Government, Germany | `OpenGovernmentGermanyClient` | `https://www.govdata.de/daten/-/details/govdata-metadatenkatalog` | 德国政府开放数据 | 🟢 免 Key |
| Open Government, Cyprus | `OpenGovernmentCyprusClient` | `https://data.gov.cy/?language=en` | 塞浦路斯政府开放数据 | 🟢 免 Key |
| Open Government, Czech Republic | `OpenGovernmentCzechRepublicClient` | `https://data.gov.cz/english/` | 捷克共和国政府开放数据 | 🟢 免 Key |
| Open Government, Ireland | `OpenGovernmentIrelandClient` | `https://data.gov.ie/pages/developers` | 爱尔兰政府开放数据 | 🟢 免 Key |
| Open Government, New Zealand | `OpenGovernmentNewZealandClient` | `https://www.data.govt.nz/` | 新西兰政府开放数据 | 🟢 免 Key |
| Open Government, Queensland Government | `OpenGovernmentQueenslandGovernmentClient` | `https://www.data.qld.gov.au/` | 昆士兰州政府开放数据 | 🟢 免 Key |
| City, Gdynia | `CityGdyniaClient` | `http://otwartedane.gdynia.pl/en/api_doc.html` | 格丁尼亚 (PL) 城市开放数据 | 🟢 免 Key |
| Open Government, ACT | `OpenGovernmentActClient` | `https://www.data.act.gov.au/` | 澳大利亚首都特区开放数据 | 🟢 免 Key |
| City, Prague Open Data | `CityPragueOpenDataClient` | `http://opendata.praha.eu/en` | 布拉格(CZ) 城市开放数据 | 🟢 免 Key |
| Open Government, Thailand | `OpenGovernmentThailandClient` | `https://data.go.th/` | 泰国政府开放数据 | 🔴 需要认证 (apiKey) |
| Brazilian Chamber of Deputies Open Data | `BrazilianChamberOfDeputiesOpenDataClient` | `https://dadosabertos.camara.leg.br/swagger/api.html` | 提供 Apis XML 和 JSON 格式的立法信息以及各种格式的文件 | 🟢 免 Key |
| Open Government, South Australian Government | `OpenGovernmentSouthAustralianGovernmentClient` | `https://data.sa.gov.au/` | 南澳大利亚州政府开放数据 | 🟢 免 Key |
| Gun Policy | `GunPolicyClient` | `https://www.gunpolicy.org/api` | 国际枪伤预防和政策 | 🔴 需要认证 (apiKey) |
| Istanbul (İBB) Open Data | `IstanbulBbOpenDataClient` | `https://data.ibb.gov.tr` | 数据集来自伊斯坦布尔大都会市 (ıBB) | 🟢 免 Key |
| Open Government, Mexico | `OpenGovernmentMexicoClient` | `https://www.inegi.org.mx/datos/` | 墨西哥统计政府开放数据 | 🟢 免 Key |
| Open Government, Lithuania | `OpenGovernmentLithuaniaClient` | `https://data.gov.lt/public/api/1` | 立陶宛政府开放数据 | 🟢 免 Key |
| Open Government, Luxembourg | `OpenGovernmentLuxembourgClient` | `https://data.public.lu` | 卢森堡政府开放数据 | 🔴 需要认证 (apiKey) |
| Open Government, Canada | `OpenGovernmentCanadaClient` | `http://open.canada.ca/en` | 加拿大政府开放数据 | 🟢 免 Key |
| Open Government, West Australia | `OpenGovernmentWestAustraliaClient` | `https://data.wa.gov.au/` | 西澳大利亚开放数据 | 🟢 免 Key |
| Open Government, Spain | `OpenGovernmentSpainClient` | `https://datos.gob.es/en` | 西班牙政府开放数据 | 🟢 免 Key |
| Open Government, Norway | `OpenGovernmentNorwayClient` | `https://data.norge.no/dataservices` | 挪威政府开放数据 | 🟢 免 Key |
| Open Government, Estonia | `OpenGovernmentEstoniaClient` | `https://avaandmed.eesti.ee/instructions/opendata-dataset-api` | 爱沙尼亚政府开放数据 | 🔴 需要认证 (apiKey) |
| Open Government, Poland | `OpenGovernmentPolandClient` | `https://dane.gov.pl/en` | 波兰政府开放数据 | 🟢 免 Key |
| Open Government, Colombia | `OpenGovernmentColombiaClient` | `https://www.dane.gov.co/` | 哥伦比亚政府开放数据 | 🟢 免 Key |
| Open Government, Netherlands | `OpenGovernmentNetherlandsClient` | `https://data.overheid.nl/en/ondersteuning/data-publiceren/api` | 荷兰政府开放数据 | 🟢 免 Key |
| Open Government, Peru | `OpenGovernmentPeruClient` | `https://www.datosabiertos.gob.pe/` | 秘鲁政府开放数据 | 🟢 免 Key |
| Open Government, Italy | `OpenGovernmentItalyClient` | `https://www.dati.gov.it/` | 意大利政府开放数据 | 🟢 免 Key |
| Open Government, Sweden | `OpenGovernmentSwedenClient` | `https://www.dataportal.se/en/dataservice/91_29789/api-for-the-statistical-database` | 瑞典政府开放数据 | 🟢 免 Key |
| Open Government, Victoria State Government | `OpenGovernmentVictoriaStateGovernmentClient` | `https://www.data.vic.gov.au/` | 维多利亚州政府开放数据 | 🟢 免 Key |
| Open Government, Portugal | `OpenGovernmentPortugalClient` | `https://dados.gov.pt/en/docapi/` | 葡萄牙政府开放数据 | 🟢 免 Key |
| US Presidential Election Data by TogaTech | `UsPresidentialElectionDataByTogatechClient` | `https://uselection.togatech.org/api/` | 美国总统选举前两名政党的基本候选人数据和现场选举人票统计 | 🟢 免 Key |
| Open Government, Greece | `OpenGovernmentGreeceClient` | `https://data.gov.gr/` | 希腊政府开放数据 | 🔴 需要认证 (OAuth) |
| Open Government, Belgium | `OpenGovernmentBelgiumClient` | `https://data.gov.be/` | 比利时政府开放数据 | 🟢 免 Key |
| Open Government, Taiwan | `OpenGovernmentTaiwanClient` | `https://data.gov.tw/` | 台湾政府开放数据 | 🟢 免 Key |
| Open Government, Singapore | `OpenGovernmentSingaporeClient` | `https://data.gov.sg/developer` | 新加坡政府开放数据 | 🟢 免 Key |
| Represent by Open North | `RepresentByOpenNorthClient` | `https://represent.opennorth.ca/` | 寻找加拿大政府代表 | 🟢 免 Key |
| Open Government, Slovenia | `OpenGovernmentSloveniaClient` | `https://podatki.gov.si/` | 斯洛文尼亚政府开放数据 | 🟢 免 Key |
| USA.gov | `UsaGovClient` | `https://www.usa.gov/developer` | 有关美国节目、活动、服务等的权威信息 | 🔴 需要认证 (apiKey) |
| UK Companies House | `UkCompaniesHouseClient` | `https://developer.company-information.service.gov.uk/` | 英国公司保存来自英国政府的数据 | 🔴 需要认证 (OAuth) |
| Open Government, Mexico | `OpenGovernmentMexicoClient` | `https://datos.gob.mx/` | 墨西哥政府开放数据 | 🟢 免 Key |
| USAspending.gov | `UsaspendingGovClient` | `https://api.usaspending.gov/` | 美国联邦支出数据 | 🟢 免 Key |
| Open Government, UK | `OpenGovernmentUkClient` | `https://data.gov.uk/` | 英国政府开放数据 | 🟢 免 Key |
| Open Government, Switzerland | `OpenGovernmentSwitzerlandClient` | `https://handbook.opendata.swiss/de/content/nutzen/api-nutzen.html` | 瑞士政府开放数据 | 🟢 免 Key |
| Open Government, USA | `OpenGovernmentUsaClient` | `https://www.data.gov/` | 美国政府开放数据 | 🟢 免 Key |
| Open Government, Finland | `OpenGovernmentFinlandClient` | `https://www.avoindata.fi/en` | 芬兰政府开放数据 | 🟢 免 Key |
| Open Government, India | `OpenGovernmentIndiaClient` | `https://data.gov.in/` | 印度政府开放数据 | 🔴 需要认证 (apiKey) |


### Transportation

本分类 (**交通**) 共包含 **67** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.transportation.TransportationAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| airportsapi | `AirportsapiClient` | `https://airport-web.appspot.com/api/docs/` | 通过 ICAO 代码获取机场的名称和网站 URL | 🟢 免 Key |
| Community Transit | `CommunityTransitClient` | `https://github.com/transitland/transitland-datastore/blob/master/README.md#api-endpoints` | 交通运输API | 🟢 免 Key |
| Amadeus for Developers | `AmadeusForDevelopersClient` | `https://developers.amadeus.com/self-service` | 旅游搜索 - 限制使用 | 🔴 需要认证 (OAuth) |
| Grab | `GrabClient` | `https://developer.grab.com/docs/` | 跟踪送货、乘车费用、付款和忠诚度积分 | 🔴 需要认证 (OAuth) |
| BIC-Boxtech | `BicBoxtechClient` | `https://docs.bic-boxtech.org/` | 全球集装箱船队的集装箱技术细节 | 🔴 需要认证 (OAuth) |
| BlaBlaCar | `BlablacarClient` | `https://dev.blablacar.com` | 搜索汽车共享行程 | 🔴 需要认证 (apiKey) |
| AZ511 | `Az511Client` | `https://www.az511.com/developers/doc` | 从 ADOT API 访问流量数据 | 🔴 需要认证 (apiKey) |
| Icelandic APIs | `IcelandicApisClient` | `http://docs.apis.is/` | 在冰岛境内或有关冰岛提供服务的开放 API | 🟢 免 Key |
| Compare Flight Prices | `CompareFlightPricesClient` | `https://rapidapi.com/obryan-software-obryan-software-default/api/compare-flight-prices/` | 用于比较跨平台航班价格的 API | 🔴 需要认证 (apiKey) |
| Transport for Berlin, Germany | `TransportForBerlinGermanyClient` | `https://github.com/derhuerst/vbb-rest/blob/3/docs/index.md` | 第三方VBB API | 🟢 免 Key |
| Apimetro | `ApimetroClient` | `https://apimetro.dev/swagger/index.html` | 墨西哥城公共交通系统的地理空间数据（Metro、Metrobús、Cablebús、RTP 等） | 🟢 免 Key |
| BC Ferries | `BcFerriesClient` | `https://www.bcferriesapi.ca` | BC Ferries 的航行时间和运力 | 🟢 免 Key |
| apilayer aviationstack | `ApilayerAviationstackClient` | `https://aviationstack.com/` | 实时航班状态和全球航空数据API | 🔴 需要认证 (OAuth) |
| Land Transport Authority DataMall, Singapore | `LandTransportAuthorityDatamallSingaporeClient` | `https://datamall.lta.gov.sg/content/dam/datamall/datasets/LTA_DataMall_API_User_Guide.pdf` | 新加坡交通信息 | 🔴 需要认证 (apiKey) |
| ADS-B Exchange | `AdsBExchangeClient` | `https://www.adsbexchange.com/data/` | 访问任何和所有机载飞机的实时和历史数据 | 🟢 免 Key |
| Navitia | `NavitiaClient` | `https://doc.navitia.io/` | 用于使用传输数据构建炫酷内容的开放 API | 🔴 需要认证 (apiKey) |
| Transport for Budapest, Hungary | `TransportForBudapestHungaryClient` | `https://bkkfutar.docs.apiary.io` | 布达佩斯公共交通 API | 🟢 免 Key |
| OpenSky Network | `OpenskyNetworkClient` | `https://opensky-network.org/apidoc/index.html` | 免费实时 ADS-B 航空数据 | 🟢 免 Key |
| Bay Area Rapid Transit | `BayAreaRapidTransitClient` | `http://api.bart.gov` | BART 的车站和预计抵达时间 | 🔴 需要认证 (apiKey) |
| Transport for Denver, US | `TransportForDenverUsClient` | `http://www.rtd-denver.com/gtfs-developer-guide.shtml` | 热电阻 | 🟢 免 Key |
| Orizn Visa | `OriznVisaClient` | `https://visa.orizn.app` | 199 个国家/地区的签证要求，15 种语言的 39,000 多个护照-目的地对 | 🔴 需要认证 (apiKey) |
| GraphHopper | `GraphhopperClient` | `https://docs.graphhopper.com/` | 带有逐向指令的 A 到 B 路由 | 🔴 需要认证 (apiKey) |
| Transport for Belgium | `TransportForBelgiumClient` | `https://docs.irail.be/` | iRail API 是比利时公共火车交通的第三方 API | 🟢 免 Key |
| Boston MBTA Transit | `BostonMbtaTransitClient` | `https://www.mbta.com/developers/v3-api` | MBTA 的车站和预计抵达时间 | 🔴 需要认证 (apiKey) |
| Sabre for Developers | `SabreForDevelopersClient` | `https://developer.sabre.com/guides/travel-agency/quickstart/getting-started-in-travel` | 旅游搜索 - 限制使用 | 🔴 需要认证 (apiKey) |
| Transport for Chicago, US | `TransportForChicagoUsClient` | `http://www.transitchicago.com/developers/` | 芝加哥交通管理局 (CTA) | 🔴 需要认证 (apiKey) |
| Tankerkoenig | `TankerkoenigClient` | `https://creativecommons.tankerkoenig.de/swagger/` | 德国实时汽油/柴油价格 | 🔴 需要认证 (apiKey) |
| CTS | `CtsClient` | `https://api.cts-strasbourg.eu/` | CTS实时API | 🔴 需要认证 (apiKey) |
| Transport for Finland | `TransportForFinlandClient` | `https://digitransit.fi/en/developers/` | 芬兰交通 API | 🟢 免 Key |
| AIS Hub | `AisHubClient` | `http://www.aishub.net/api` | 任何配备 AIS 跟踪系统的海洋和内河船舶的实时数据 | 🔴 需要认证 (apiKey) |
| Transport for Auckland, New Zealand | `TransportForAucklandNewZealandClient` | `https://dev-portal.at.govt.nz/` | 奥克兰交通 | 🟢 免 Key |
| REFUGE Restrooms | `RefugeRestroomsClient` | `https://www.refugerestrooms.org/api/docs/#!/restrooms` | 为跨性别者、双性者和性别不合格者提供安全的卫生间 | 🟢 免 Key |
| Transport for The Netherlands | `TransportForTheNetherlandsClient` | `https://github.com/skywave/KV78Turbo-OVAPI/wiki` | OVAPI-- 全国公共交通 | 🟢 免 Key |
| Schiphol Airport | `SchipholAirportClient` | `https://developer.schiphol.nl/` | 史基浦机场 | 🔴 需要认证 (apiKey) |
| Railway Transport for France | `RailwayTransportForFranceClient` | `https://www.digital.sncf.com/startup/api` | SNCF 公共 API | 🔴 需要认证 (apiKey) |
| TransitLand | `TransitlandClient` | `https://www.transit.land/documentation/datastore/api-endpoints.html` | 中转聚合 | 🟢 免 Key |
| Transport for Philadelphia, US | `TransportForPhiladelphiaUsClient` | `http://www3.septa.org/hackathon/` | SEPTA API | 🟢 免 Key |
| Transport for Norway | `TransportForNorwayClient` | `https://developer.entur.org/` | 挪威交通 API 和数据集 | 🟢 免 Key |
| Izi | `IziClient` | `http://api-docs.izi.travel/` | 为旅客提供的语音导览 | 🔴 需要认证 (apiKey) |
| Transport for Bordeaux, France | `TransportForBordeauxFranceClient` | `https://opendata.bordeaux-metropole.fr/explore/` | 波尔多大都会公共交通及更多（法国） | 🔴 需要认证 (apiKey) |
| Open Charge Map | `OpenChargeMapClient` | `https://openchargemap.org/site/develop/api` | 电动汽车充电地点的全球公共登记处 | 🔴 需要认证 (apiKey) |
| Transport for Switzerland | `TransportForSwitzerlandClient` | `https://opentransportdata.swiss/en/` | 瑞士官方公共交通开放数据 | 🔴 需要认证 (apiKey) |
| Transport for Spain | `TransportForSpainClient` | `https://data.renfe.com/api/1/util/snippet/api_info.html?resource_id=a2368cff-1562-4dde-8466-9635ea3a572a` | 西班牙的公共列车 | 🟢 免 Key |
| Transport for Los Angeles, US | `TransportForLosAngelesUsClient` | `https://developer.metro.net/api/` | 有关地铁车辆实时位置和行驶路线的数据 | 🟢 免 Key |
| Transport for Switzerland | `TransportForSwitzerlandClient` | `https://transport.opendata.ch/` | 瑞士公共交通 API | 🟢 免 Key |
| Metro Lisboa | `MetroLisboaClient` | `http://app.metrolisboa.pt/status/getLinhas.php` | 地铁线路延误 | 🟢 免 Key |
| Velib metropolis, Paris, France | `VelibMetropolisParisFranceClient` | `https://www.velib-metropole.fr/donnees-open-data-gbfs-du-service-velib-metropole` | Velib 开放数据 API | 🟢 免 Key |
| Transport for Sweden | `TransportForSwedenClient` | `https://www.trafiklab.se/api` | 公共交通消费者 | 🔴 需要认证 (OAuth) |
| Transport for Toronto, Canada | `TransportForTorontoCanadaClient` | `https://myttc.ca/developers` | 技术中心 | 🟢 免 Key |
| Transport for Ottawa, Canada | `TransportForOttawaCanadaClient` | `https://www.octranspo.com/en/plan-your-trip/travel-tools/developers` | OC 传输 API | 🔴 需要认证 (apiKey) |
| Transport for UK | `TransportForUkClient` | `https://developer.transportapi.com` | 英国交通 API 和数据集 | 🔴 需要认证 (apiKey) |
| Transport for United States | `TransportForUnitedStatesClient` | `https://retro.umoiq.com/xmlFeedDocs/NextBusXMLFeed.pdf` | 下一巴士 API | 🟢 免 Key |
| Tripadvisor | `TripadvisorClient` | `https://developer-tripadvisor.com/home/` | 对酒店、餐厅、景点或目的地的内容进行评级 | 🔴 需要认证 (apiKey) |
| Transport for Atlanta, US | `TransportForAtlantaUsClient` | `http://www.itsmarta.com/app-developer-resources.aspx` | 玛尔塔 | 🟢 免 Key |
| Transport for Manchester, England | `TransportForManchesterEnglandClient` | `https://developer.tfgm.com/` | TfGM传输网络数据 | 🔴 需要认证 (apiKey) |
| Transport for Vancouver, Canada | `TransportForVancouverCanadaClient` | `https://developer.translink.ca/` | 运联 | 🔴 需要认证 (OAuth) |
| Transport for Paris, France | `TransportForParisFranceClient` | `http://data.ratp.fr/api/v1/console/datasets/1.0/search/` | RATP 开放数据 API | 🟢 免 Key |
| Transport for Washington, US | `TransportForWashingtonUsClient` | `https://developer.wmata.com/` | 华盛顿地铁交通 API | 🔴 需要认证 (OAuth) |
| Transport for London, England | `TransportForLondonEnglandClient` | `https://api.tfl.gov.uk` | 伦敦交通局API | 🔴 需要认证 (apiKey) |
| Uber | `UberClient` | `https://developer.uber.com/products` | 优步乘车请求和价格估算 | 🔴 需要认证 (OAuth) |
| Transport for Honolulu, US | `TransportForHonoluluUsClient` | `http://hea.thebus.org/api_info.asp` | 檀香山交通信息 | 🔴 需要认证 (apiKey) |
| Transport for Lisbon, Portugal | `TransportForLisbonPortugalClient` | `https://emel.city-platform.com/opendata/` | 有关巴士路线、停车位和交通的数据 | 🔴 需要认证 (apiKey) |
| transport.rest | `TransportRestClient` | `https://transport.rest` | 社区维护、开发者友好的公共交通 API | 🟢 免 Key |
| Transport for Hessen, Germany | `TransportForHessenGermanyClient` | `https://opendata.rmv.de/site/start.html` | RMV API（黑森州公共交通） | 🟢 免 Key |
| Transport for Sao Paulo, Brazil | `TransportForSaoPauloBrazilClient` | `http://www.sptrans.com.br/desenvolvedores/api-do-olho-vivo-guia-de-referencia/documentacao-api/` | 特快专递 | 🔴 需要认证 (OAuth) |
| Transport for The Netherlands | `TransportForTheNetherlandsClient` | `http://www.ns.nl/reisinformatie/ns-api` | NS，仅限火车 | 🔴 需要认证 (apiKey) |
| Transport for Grenoble, France | `TransportForGrenobleFranceClient` | `https://www.mobilites-m.fr/pages/opendata/OpenDataApi.html` | 格勒诺布尔公共交通 | 🟢 免 Key |


### Cryptocurrency

本分类 (**加密货币**) 共包含 **59** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.cryptocurrency.CryptocurrencyAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Binance | `BinanceClient` | `https://github.com/binance/binance-spot-api-docs` | 位于中国的加密货币交易交易所 | 🔴 需要认证 (apiKey) |
| Bitmex | `BitmexClient` | `https://www.bitmex.com/app/apiOverview` | 总部位于香港的实时加密货币衍生品交易平台 | 🔴 需要认证 (apiKey) |
| 0x | `Api0XClient` | `https://0x.org/api` | 用于查询各种流动性池中的代币和池统计信息的 API | 🟢 免 Key |
| Bitcambio | `BitcambioClient` | `https://nova.bitcambio.com.br/api/v3/docs#a-public` | 获取交易所所有交易资产列表 | 🟢 免 Key |
| Alpha (Mossland) | `AlphaMosslandClient` | `https://alpha.moss.land/developers` | 韩国加密货币频道立场+RAG问答+规范实体/主题/事件存储 | 🟢 免 Key |
| Bitfinex | `BitfinexClient` | `https://docs.bitfinex.com/docs` | 加密货币交易平台 | 🔴 需要认证 (apiKey) |
| Bybit | `BybitClient` | `https://bybit-exchange.github.io/docs/linear/#t-introduction` | 加密货币数据馈送和算法交易 | 🔴 需要认证 (apiKey) |
| CoinMarketCap | `CoinmarketcapClient` | `https://coinmarketcap.com/api/` | 加密货币价格 | 🔴 需要认证 (apiKey) |
| Coinlayer | `CoinlayerClient` | `https://coinlayer.com?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 实时加密货币汇率 | 🔴 需要认证 (apiKey) |
| Bittrex | `BittrexClient` | `https://bittrex.github.io/api/v3` | 下一代加密货币交易平台 | 🔴 需要认证 (apiKey) |
| Blockchain | `BlockchainClient` | `https://www.blockchain.com/api` | 比特币支付、钱包和交易数据 | 🔴 需要认证 (apiKey) |
| CoinDCX | `CoindcxClient` | `https://docs.coindcx.com/` | 加密货币交易平台 | 🔴 需要认证 (apiKey) |
| Ethplorer | `EthplorerClient` | `https://github.com/EverexIO/Ethplorer/wiki/Ethplorer-API` | 以太坊代币、余额、地址、交易历史、合约和自定义结构 | 🔴 需要认证 (apiKey) |
| blockfrost Cardano | `BlockfrostCardanoClient` | `https://blockfrost.io/` | 与卡尔达诺主网和多个测试网的交互 | 🔴 需要认证 (apiKey) |
| Coinigy | `CoinigyClient` | `https://coinigy.docs.apiary.io` | 与 Coinigy 账户直接交互并进行交易 | 🔴 需要认证 (apiKey) |
| Coinlore | `CoinloreClient` | `https://www.coinlore.com/cryptocurrency-data-api` | 加密货币价格、数量等 | 🟢 免 Key |
| 1inch | `Api1InchClient` | `https://1inch.io/api/` | 去中心化交易所查询API | 🟢 免 Key |
| BtcTurk | `BtcturkClient` | `https://docs.btcturk.com/` | 实时加密货币数据、图表和允许买卖的 API | 🔴 需要认证 (apiKey) |
| Gateio | `GateioClient` | `https://www.gate.io/api2` | API提供现货、保证金、期货交易操作 | 🔴 需要认证 (apiKey) |
| Indodax | `IndodaxClient` | `https://github.com/btcid/indodax-official-api-docs` | 用卢比交易您的比特币和其他资产 | 🔴 需要认证 (apiKey) |
| Huobi | `HuobiClient` | `https://huobiapi.github.io/docs/spot/v1/en/` | 塞舌尔的加密货币交易所 | 🔴 需要认证 (apiKey) |
| CoinStats | `CoinstatsClient` | `https://documenter.getpostman.com/view/5734027/RzZ6Hzr3?version=latest` | 加密追踪器 | 🟢 免 Key |
| Coinlib | `CoinlibClient` | `https://coinlib.io/apidocs` | 加密货币价格 | 🔴 需要认证 (apiKey) |
| Messari | `MessariClient` | `https://messari.io/api` | 为数千种加密资产提供API端点 | 🟢 免 Key |
| Brave NewCoin | `BraveNewcoinClient` | `https://bravenewcoin.com/developers` | 来自 200 多个交易所的实时和历史加密数据 | 🔴 需要认证 (apiKey) |
| CryptingUp | `CryptingupClient` | `https://www.cryptingup.com/apidoc/#introduction` | 加密货币数据 | 🟢 免 Key |
| Localbitcoins | `LocalbitcoinsClient` | `https://localbitcoins.com/api-docs/` | 买卖比特币的 P2P 平台 | 🟢 免 Key |
| EXMO | `ExmoClient` | `https://documenter.getpostman.com/view/10287440/SzYXWKPi` | 总部位于英国的加密货币交易所 | 🔴 需要认证 (apiKey) |
| Mempool | `MempoolClient` | `https://mempool.space/api` | 专注于交易费用的比特币API服务 | 🟢 免 Key |
| Coinpaprika | `CoinpaprikaClient` | `https://api.coinpaprika.com` | 加密货币价格、数量等 | 🟢 免 Key |
| Nexchange | `NexchangeClient` | `https://nexchange2.docs.apiary.io/` | 自动化加密货币兑换服务 | 🟢 免 Key |
| Coinbase | `CoinbaseClient` | `https://developers.coinbase.com` | 比特币、比特币现金、莱特币和以太坊价格 | 🔴 需要认证 (apiKey) |
| PumpFunData | `PumpfundataClient` | `https://pumpfundata.com/docs` | 历史 Pump.fun 和 PumpSwap AMM 将数据交换为每小时的 Parquet 文件 | 🔴 需要认证 (apiKey) |
| CoinAPI | `CoinapiClient` | `https://docs.coinapi.io/` | 所有货币兑换都集成在一个 API 下 | 🔴 需要认证 (apiKey) |
| MercadoBitcoin | `MercadobitcoinClient` | `https://www.mercadobitcoin.com.br/api-doc/` | 巴西加密货币信息 | 🟢 免 Key |
| Block | `BlockClient` | `https://block.io/docs/basic` | 比特币支付、钱包和交易数据 | 🔴 需要认证 (apiKey) |
| FTX | `FtxClient` | `https://docs.ftx.com/` | 完整的 REST、websocket 和 FTX API 以满足您的算法交易需求 | 🔴 需要认证 (apiKey) |
| CoinRanking | `CoinrankingClient` | `https://developers.coinranking.com/api/documentation` | 实时加密货币数据 | 🔴 需要认证 (apiKey) |
| CryptAPI | `CryptapiClient` | `https://docs.cryptapi.io/` | 加密货币支付处理器 | 🟢 免 Key |
| Kraken | `KrakenClient` | `https://docs.kraken.com/rest/` | 加密货币交易所 | 🔴 需要认证 (apiKey) |
| WorldCoinIndex | `WorldcoinindexClient` | `https://www.worldcoinindex.com/apiservice` | 加密货币价格 | 🔴 需要认证 (apiKey) |
| dYdX | `DydxClient` | `https://docs.dydx.exchange/` | 去中心化加密货币交易所 | 🔴 需要认证 (apiKey) |
| Gemini | `GeminiClient` | `https://docs.gemini.com/rest-api/` | 加密货币交易所 | 🟢 免 Key |
| INFURA Ethereum | `InfuraEthereumClient` | `https://infura.io/product/ethereum` | 与以太坊主网和多个测试网的交互 | 🔴 需要认证 (apiKey) |
| NovaDax | `NovadaxClient` | `https://doc.novadax.com/en-US/#introduction` | NovaDAX API 用于访问所有市场数据、交易管理端点 | 🔴 需要认证 (apiKey) |
| Alchemy Ethereum | `AlchemyEthereumClient` | `https://docs.alchemy.com/alchemy/` | 以太坊节点即服务提供商 | 🔴 需要认证 (apiKey) |
| VALR | `ValrClient` | `https://docs.valr.com/` | 总部位于南非的加密货币交易所 | 🔴 需要认证 (apiKey) |
| KuCoin | `KucoinClient` | `https://docs.kucoin.com/` | 加密货币交易平台 | 🔴 需要认证 (apiKey) |
| Technical Analysis | `TechnicalAnalysisClient` | `https://technical-analysis-api.com` | 加密货币价格和技术分析 | 🔴 需要认证 (apiKey) |
| Solana JSON RPC | `SolanaJsonRpcClient` | `https://docs.solana.com/developing/clients/jsonrpc-api` | 提供与 Solana 区块链交互的各种端点 | 🟢 免 Key |
| CoinCap | `CoincapClient` | `https://docs.coincap.io/` | 通过 RESTful API 实时加密货币价格 | 🟢 免 Key |
| Coinbase Pro | `CoinbaseProClient` | `https://docs.pro.coinbase.com/#api` | 加密货币交易平台 | 🔴 需要认证 (apiKey) |
| ZMOK | `ZmokClient` | `https://zmok.io` | 以太坊 JSON RPC API 和 Web3 提供商 | 🟢 免 Key |
| Coinremitter | `CoinremitterClient` | `https://coinremitter.com/docs` | 加密货币支付和价格 | 🔴 需要认证 (apiKey) |
| icy.tools | `IcyToolsClient` | `https://developers.icy.tools/` | 基于 GraphQL 的 NFT API | 🔴 需要认证 (apiKey) |
| Poloniex | `PoloniexClient` | `https://docs.poloniex.com` | 美国数字资产交易所 | 🔴 需要认证 (apiKey) |
| CryptoCompare | `CryptocompareClient` | `https://www.cryptocompare.com/api#` | 加密货币比较 | 🟢 免 Key |
| Hirak Exchange Rates | `HirakExchangeRatesClient` | `https://rates.hirak.site/` | 162种货币与300种加密货币之间的汇率每5分钟更新一次，准确，无限制 | 🔴 需要认证 (apiKey) |
| CoinGecko | `CoingeckoClient` | `http://www.coingecko.com/api` | 加密货币价格、市场和开发者/社交数据 | 🟢 免 Key |


### Finance

本分类 (**金融**) 共包含 **42** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.finance.FinanceAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Aletheia | `AletheiaClient` | `https://aletheiaapi.com/` | 内幕交易数据、财报电话分析、财务报表等 | 🔴 需要认证 (apiKey) |
| Financial Modeling Prep | `FinancialModelingPrepClient` | `https://site.financialmodelingprep.com/developer/docs` | 实时和历史库存数据 | 🔴 需要认证 (apiKey) |
| Alpha Vantage | `AlphaVantageClient` | `https://www.alphavantage.co/` | 实时和历史库存数据 | 🔴 需要认证 (apiKey) |
| Binlist | `BinlistClient` | `https://binlist.net/` | 对 IIN/BIN 信息数据库的公开访问 | 🟢 免 Key |
| Billplz | `BillplzClient` | `https://www.billplz.com/api` | 支付平台 | 🔴 需要认证 (apiKey) |
| Econdb | `EcondbClient` | `https://www.econdb.com/api/` | 全球宏观经济数据 | 🟢 免 Key |
| Marketstack | `MarketstackClient` | `https://marketstack.com/?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 实时、日内和历史市场数据 API | 🔴 需要认证 (apiKey) |
| IG | `IgClient` | `https://labs.ig.com/gettingstarted` | 点差交易和差价合约市场数据 | 🔴 需要认证 (apiKey) |
| Bank Data | `BankDataClient` | `https://apilayer.com/marketplace/bank_data-api` | 全球即时 IBAN 和 SWIFT 号码验证 | 🔴 需要认证 (apiKey) |
| Intrinio | `IntrinioClient` | `https://intrinio.com/` | 广泛的金融数据源选择 | 🔴 需要认证 (apiKey) |
| Real Time Finance | `RealTimeFinanceClient` | `https://github.com/Real-time-finance/finance-websocket-API/` | Websocket API 用于访问实时股票数据 | 🔴 需要认证 (apiKey) |
| Finage | `FinageClient` | `https://finage.co.uk` | Finage 是一家股票、货币、加密货币、指数和 ETF 实时和历史数据提供商 | 🔴 需要认证 (apiKey) |
| Helium | `HeliumClient` | `https://heliumtrades.com/mcp-page/` | 带有媒体偏见评分的新闻、平衡的新闻合成、实时市场数据、人工智能期权定价 | 🟢 免 Key |
| Razorpay IFSC | `RazorpayIfscClient` | `https://razorpay.com/docs/` | 印度金融系统代码（银行分行代码） | 🟢 免 Key |
| Boleto.Cloud | `BoletoCloudClient` | `https://boleto.cloud/` | 在巴西生成 boletos 的 api | 🔴 需要认证 (apiKey) |
| MercadoPago | `MercadopagoClient` | `https://www.mercadopago.com.br/developers/es/reference` | Mercado Pago API 参考 - 开发集成所需的所有信息 | 🔴 需要认证 (apiKey) |
| Hotstoks | `HotstoksClient` | `https://hotstoks.com?utm_source=public-apis` | 由 SQL 提供支持的股市数据 | 🔴 需要认证 (apiKey) |
| Mono | `MonoClient` | `https://mono.co/` | 连接用户的银行账户并访问非洲的交易数据 | 🔴 需要认证 (apiKey) |
| Tradier | `TradierClient` | `https://developer.tradier.com` | 美国股票/期权市场数据（延迟、盘中、历史） | 🔴 需要认证 (OAuth) |
| Portfolio Optimizer | `PortfolioOptimizerClient` | `https://portfoliooptimizer.io/` | 投资组合分析和优化 | 🟢 免 Key |
| Fed Treasury | `FedTreasuryClient` | `https://fiscaldata.treasury.gov/api-documentation/` | 美国财政部数据 | 🟢 免 Key |
| VAT Validation | `VatValidationClient` | `https://www.abstractapi.com/vat-validation-rates-api` | 验证增值税号并计算增值税率 | 🔴 需要认证 (apiKey) |
| Klarna | `KlarnaClient` | `https://docs.klarna.com/klarna-payments/api/payments-api/` | Klarna 支付和购物服务 | 🔴 需要认证 (apiKey) |
| IBANforge | `IbanforgeClient` | `https://api.ibanforge.com` | 超过 75 个国家/地区的 IBAN 验证和 BIC/SWIFT 查询，包含 121,000 多个银行条目 | 🟢 免 Key |
| Moov | `MoovClient` | `https://docs.moov.io/api/` | Moov API 使平台可以轻松发送、接收和存储资金 | 🔴 需要认证 (apiKey) |
| SmartAPI | `SmartapiClient` | `https://smartapi.angelbroking.com/` | 访问<SmartAPI>集并创建端到端经纪服务 | 🔴 需要认证 (apiKey) |
| Twelve Data | `TwelveDataClient` | `https://twelvedata.com/` | 股市数据（实时和历史） | 🔴 需要认证 (apiKey) |
| StockData | `StockdataClient` | `https://www.StockData.org` | 实时、盘中和历史市场数据、新闻和情绪 API | 🔴 需要认证 (apiKey) |
| Tax Data | `TaxDataClient` | `https://apilayer.com/marketplace/tax_data-api` | 全球即时增值税号和税务验证 | 🔴 需要认证 (apiKey) |
| Alpaca | `AlpacaClient` | `https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-data-api-v2/` | 所有美国股票和 ETF 的实时和历史市场数据 | 🔴 需要认证 (apiKey) |
| OpenFIGI | `OpenfigiClient` | `https://www.openfigi.com/api` | Bloomberg LP 的股票、指数、期货、期权符号系统 | 🔴 需要认证 (apiKey) |
| EconPulse | `EconpulseClient` | `https://econpulse.io` | 实时经济数据 — CPI、PPI、能源、国债利率、BTC 溢价 | 🔴 需要认证 (apiKey) |
| Front Accounting APIs | `FrontAccountingApisClient` | `https://frontaccounting.com/fawiki/index.php?n=Devel.SimpleAPIModule` | Front Accounting 是一款适用于小型企业的多语言和多货币软件 | 🔴 需要认证 (OAuth) |
| Indian Mutual Fund | `IndianMutualFundClient` | `https://www.mfapi.in/` | 获取印度共同基金数据的完整历史 | 🟢 免 Key |
| YNAB | `YnabClient` | `https://api.youneedabudget.com/` | 预算与规划 | 🔴 需要认证 (OAuth) |
| Styvio | `StyvioClient` | `https://www.Styvio.com` | 实时和历史股票数据以及当前股票情绪 | 🔴 需要认证 (apiKey) |
| Zoho Books | `ZohoBooksClient` | `https://www.zoho.com/books/api/v3/` | 专为您的企业打造的在线会计软件 | 🔴 需要认证 (OAuth) |
| Polygon | `PolygonClient` | `https://polygon.io/` | 历史股市数据 | 🔴 需要认证 (apiKey) |
| WallstreetBets | `WallstreetbetsClient` | `https://dashboard.nbshare.io/apps/reddit/api/` | WallstreetBets 股票评论情绪分析 | 🟢 免 Key |
| Citi | `CitiClient` | `https://sandbox.developerhub.citi.com/api-catalog-list` | 所有花旗集团账户和对账单数据 API | 🔴 需要认证 (apiKey) |
| Plaid | `PlaidClient` | `https://www.plaid.com/docs` | 连接用户的银行账户并访问交易数据 | 🔴 需要认证 (apiKey) |
| Banco do Brasil | `BancoDoBrasilClient` | `https://developers.bb.com.br/home` | 所有巴西银行金融交易 API | 🔴 需要认证 (OAuth) |


### Social

本分类 (**社交**) 共包含 **40** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.social.SocialAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| 4chan | `Api4ChanClient` | `https://github.com/4chan/4chan-API` | 简单的基于图像的公告板，专用于各种主题 | 🟢 免 Key |
| Bluesky | `BlueskyClient` | `https://docs.bsky.app/` | 通过 AT 协议的去中心化社交网络 | 🟢 免 Key |
| HackerNews | `HackernewsClient` | `https://github.com/HackerNews/API` | CS 和创业的社会新闻 | 🟢 免 Key |
| Blogger | `BloggerClient` | `https://developers.google.com/blogger/` | Blogger API 允许客户端应用程序查看和更新 Blogger 内容 | 🔴 需要认证 (OAuth) |
| Lanyard | `LanyardClient` | `https://github.com/Phineas/lanyard` | 通过 HTTP REST API 或 WebSocket 检索您在 Discord 上的状态 | 🟢 免 Key |
| Disqus | `DisqusClient` | `https://disqus.com/api/docs/auth/` | 与 Disqus 数据通信 | 🔴 需要认证 (OAuth) |
| Full Contact | `FullContactClient` | `https://docs.fullcontact.com/` | 获取社交媒体资料和联系信息 | 🔴 需要认证 (OAuth) |
| Facebook | `FacebookClient` | `https://developers.facebook.com/` | Facebook 登录、在 FB 上分享、社交插件、分析等 | 🔴 需要认证 (OAuth) |
| Ayrshare | `AyrshareClient` | `https://www.ayrshare.com` | 用于发布、获取分析和管理多个用户社交媒体帐户的社交媒体 API | 🔴 需要认证 (apiKey) |
| Line | `LineClient` | `https://developers.line.biz/` | 线路登录、在线分享、社交插件等 | 🔴 需要认证 (OAuth) |
| Fuck Off as a Service | `FuckOffAsAServiceClient` | `https://www.foaas.com` | 要求某人滚蛋 | 🟢 免 Key |
| NAVER | `NaverClient` | `https://developers.naver.com/main/` | NAVER 登录、在 NAVER 上分享、社交插件等 | 🔴 需要认证 (OAuth) |
| Saidit | `SaiditClient` | `https://www.saidit.net/dev/api` | 开源 Reddit 克隆 | 🔴 需要认证 (OAuth) |
| TikTok | `TiktokClient` | `https://developers.tiktok.com/doc/login-kit-web` | 获取TikTok平台上的用户信息和用户的视频帖子 | 🔴 需要认证 (OAuth) |
| Discord | `DiscordClient` | `https://discord.com/developers/docs/intro` | 为 Discord 制作机器人，将 Discord 集成到外部平台 | 🔴 需要认证 (OAuth) |
| Reddit | `RedditClient` | `https://www.reddit.com/dev/api` | 互联网主页 | 🔴 需要认证 (OAuth) |
| Hashnode | `HashnodeClient` | `https://hashnode.com` | 为开发者打造的博客平台 | 🟢 免 Key |
| Kakao | `KakaoClient` | `https://developers.kakao.com/` | Kakao 登录、在 KakaoTalk 上分享、社交插件等 | 🔴 需要认证 (OAuth) |
| Twitch | `TwitchClient` | `https://dev.twitch.tv/docs` | 游戏串流API | 🔴 需要认证 (OAuth) |
| Product Hunt | `ProductHuntClient` | `https://api.producthunt.com/v2/docs` | 科技领域最佳新产品 | 🔴 需要认证 (OAuth) |
| LinkedIn | `LinkedinClient` | `https://docs.microsoft.com/en-us/linkedin/?context=linkedin/context` | 与 LinkedIn 进行所有数字集成的基础 | 🔴 需要认证 (OAuth) |
| Telegram MTProto | `TelegramMtprotoClient` | `https://core.telegram.org/api#getting-started` | 读取和写入电报数据 | 🔴 需要认证 (OAuth) |
| GetXAPI | `GetxapiClient` | `https://www.getxapi.com/` | 读取 Twitter / X 数据并通过 REST 发布推文、点赞、转发、关注、私信 | 🔴 需要认证 (apiKey) |
| Microsoft Graph | `MicrosoftGraphClient` | `https://docs.microsoft.com/en-us/graph/api/overview` | 访问 Microsoft 365、Windows 10 和企业移动性中的数据和情报 | 🔴 需要认证 (OAuth) |
| Telegram Bot | `TelegramBotClient` | `https://core.telegram.org/bots/api` | 适用于机器人的 MTProto API 的简化 HTTP 版本 | 🔴 需要认证 (apiKey) |
| Telegraph | `TelegraphClient` | `https://telegra.ph/api` | 轻松创建有吸引力的博客并进行分享 | 🔴 需要认证 (apiKey) |
| Tumblr | `TumblrClient` | `https://www.tumblr.com/docs/en/api/v2` | 读取和写入 Tumblr 数据 | 🔴 需要认证 (OAuth) |
| Instagram | `InstagramClient` | `https://www.instagram.com/developer/` | Instagram 登录、在 Instagram 上分享、社交插件等 | 🔴 需要认证 (OAuth) |
| vk | `VkClient` | `https://vk.com/dev/sites` | 读写vk数据 | 🔴 需要认证 (OAuth) |
| Trash Nothing | `TrashNothingClient` | `https://trashnothing.com/developer` | 一个免费回收社区，每天发布数千件免费物品 | 🔴 需要认证 (OAuth) |
| Pinterest | `PinterestClient` | `https://developers.pinterest.com/` | 世界思想目录 | 🔴 需要认证 (OAuth) |
| Meetup.com | `MeetupComClient` | `https://www.meetup.com/api/guide` | 来自 Meetup.com 的聚会数据 | 🔴 需要认证 (apiKey) |
| Open Collective | `OpenCollectiveClient` | `https://docs.opencollective.com/help/developers/api` | 获取开放集体数据 | 🟢 免 Key |
| Cisco Spark | `CiscoSparkClient` | `https://developer.ciscospark.com` | 团队协作软件 | 🔴 需要认证 (OAuth) |
| Twitter | `TwitterClient` | `https://developer.twitter.com/en/docs` | 读取和写入 Twitter 数据 | 🔴 需要认证 (OAuth) |
| Foursquare | `FoursquareClient` | `https://developer.foursquare.com/` | 与 Foursquare 用户和地点互动（基于地理位置的签到、照片、提示、活动等） | 🔴 需要认证 (OAuth) |
| aztro | `AztroClient` | `https://aztro.sameerkumar.website/` | 昨天、今天和明天的每日星座信息 | 🟢 免 Key |
| TamTam | `TamtamClient` | `https://dev.tamtam.chat/` | 用于与 TamTam 交互的 Bot API | 🔴 需要认证 (apiKey) |
| Slack | `SlackClient` | `https://api.slack.com/` | 团队即时通讯 | 🔴 需要认证 (OAuth) |
| Revolt | `RevoltClient` | `https://developers.revolt.chat/api/` | Revolt 开源 Discord 替代品 | 🔴 需要认证 (apiKey) |


### Open Data

本分类 (**开放数据**) 共包含 **39** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.opendata.OpenDataAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| 18F | `Api18FClient` | `http://18f.github.io/API-All-the-X/` | 美国联邦政府非官方 API 开发 | 🟢 免 Key |
| Lowy Asia Power Index | `LowyAsiaPowerIndexClient` | `https://github.com/0x0is1/lowy-index-api-docs` | 获取衡量资源和影响力，对亚洲国家的相对实力进行排名 | 🟢 免 Key |
| CARTO | `CartoClient` | `https://carto.com/` | 位置信息预测 | 🔴 需要认证 (apiKey) |
| Kaggle | `KaggleClient` | `https://www.kaggle.com/docs/api` | 创建数据集、笔记本并与之交互，并与 Kaggle 连接 | 🔴 需要认证 (apiKey) |
| CollegeScoreCard.ed.gov | `CollegescorecardEdGovClient` | `https://collegescorecard.ed.gov/data/` | 美国高等教育机构数据 | 🟢 免 Key |
| Microlink.io | `MicrolinkIoClient` | `https://microlink.io` | 从任何网站提取结构化数据 | 🟢 免 Key |
| BotsArchive | `BotsarchiveClient` | `https://botsarchive.com/docs.html` | 有关数据库中可用的 Telegram Bot 的 JSON 格式详细信息 | 🟢 免 Key |
| Nasdaq Data Link | `NasdaqDataLinkClient` | `https://docs.data.nasdaq.com/` | 股市数据 | 🔴 需要认证 (apiKey) |
| Joshua Project | `JoshuaProjectClient` | `https://api.joshuaproject.net/` | 世界上基督跟随者最少的人群 | 🔴 需要认证 (apiKey) |
| Onyx Bazaar | `OnyxBazaarClient` | `https://onyx-actions.onrender.com/bazaar` | 从 Coinbase CDP 发现 API 索引的 x402 付费 HTTP 服务的免费公共排行榜 | 🟢 免 Key |
| Universities List | `UniversitiesListClient` | `https://github.com/Hipo/university-domains-list` | 大学名称、国家和域名 | 🟢 免 Key |
| Socrata | `SocrataClient` | `https://dev.socrata.com/` | 获取来自世界各地政府、非营利组织和非政府组织的开放数据 | 🔴 需要认证 (OAuth) |
| LinkPreview | `LinkpreviewClient` | `https://www.linkpreview.net` | 获取任何请求的 URL 的 JSON 格式摘要，其中包含标题、描述和预览图像 | 🔴 需要认证 (apiKey) |
| PeakMetrics | `PeakmetricsClient` | `https://rapidapi.com/peakmetrics-peakmetrics-default/api/peakmetrics-news` | 新闻文章和公共数据集 | 🔴 需要认证 (apiKey) |
| Black History Facts | `BlackHistoryFactsClient` | `https://www.blackhistoryapi.io/docs` | 贡献或搜索网络上最大的黑人历史事实数据库之一 | 🔴 需要认证 (apiKey) |
| Archive.org | `ArchiveOrgClient` | `https://archive.readme.io/docs` | 互联网档案馆 | 🟢 免 Key |
| Yelp | `YelpClient` | `https://www.yelp.com/developers/documentation/v3` | 寻找本地企业 | 🔴 需要认证 (OAuth) |
| OpenCorporates | `OpencorporatesClient` | `http://api.opencorporates.com/documentation/API-Reference` | 许多国家的公司实体和董事的数据 | 🔴 需要认证 (apiKey) |
| ModelPartFinder Error Codes | `ModelpartfinderErrorCodesClient` | `https://modelpartfinder.com/docs/api` | 按品牌和代码查找电器和设备错误代码以及推荐的更换零件 | 🟢 免 Key |
| OpenSanctions | `OpensanctionsClient` | `https://www.opensanctions.org/docs/api/` | 有关国际制裁、犯罪和政治公众人物的数据 | 🟢 免 Key |
| Callook.info | `CallookInfoClient` | `https://callook.info` | 美国业余无线电呼号 | 🟢 免 Key |
| Open Data Minneapolis | `OpenDataMinneapolisClient` | `https://opendata.minneapolismn.gov/` | 明尼阿波利斯的空间 (GIS) 和非空间城市数据 | 🟢 免 Key |
| Open Scholarships | `OpenScholarshipsClient` | `https://scholarships.grudged.io` | 来自官方来源的免费、公开许可的美国奖学金和学生援助目录 | 🟢 免 Key |
| Nobel Prize | `NobelPrizeClient` | `https://www.nobelprize.org/about/developer-zone-2/` | 有关诺贝尔奖和活动的开放数据 | 🟢 免 Key |
| Wikipedia | `WikipediaClient` | `https://www.mediawiki.org/wiki/API:Main_page` | 媒体维基百科全书 | 🟢 免 Key |
| Recreation Information Database | `RecreationInformationDatabaseClient` | `https://ridb.recreation.gov/` | 休闲区、联邦土地、历史古迹、博物馆和其他景点/资源（美国） | 🔴 需要认证 (apiKey) |
| AcreLens | `AcrelensClient` | `https://www.acrelens.com` | 适用于任何美国房产的土地适宜性评分 API：离网、农村、娱乐、投资 | 🔴 需要认证 (apiKey) |
| Wikidata | `WikidataClient` | `https://www.wikidata.org/w/api.php?action=help` | 由维基媒体基金会运营的协作编辑的知识库 | 🔴 需要认证 (OAuth) |
| Scoop.it | `ScoopItClient` | `http://www.scoop.it/dev` | 内容管理服务 | 🔴 需要认证 (apiKey) |
| GENESIS | `GenesisClient` | `https://www.destatis.de/EN/Service/OpenData/api-webservice.html` | 德国联邦统计局 | 🔴 需要认证 (OAuth) |
| openAFRICA | `OpenafricaClient` | `https://africaopendata.org/` | 非洲开放数据的大型数据集存储库 | 🟢 免 Key |
| UPC database | `UpcDatabaseClient` | `https://upcdatabase.org/api` | 来自世界各地的超过 150 万个条形码编号 | 🔴 需要认证 (apiKey) |
| University of Oslo | `UniversityOfOsloClient` | `https://data.uio.no/` | 奥斯陆大学（挪威）的课程、讲座视频、课程详细信息等 | 🟢 免 Key |
| Voidly | `VoidlyClient` | `https://voidly.ai/api-docs` | 126 个国家/地区的互联网审查测量、事件和 ISP 级屏蔽数据 | 🟢 免 Key |
| Umeå Open Data | `UmeOpenDataClient` | `https://opendata.umea.se/api/` | 瑞典北部城市于默奥的开放数据 | 🟢 免 Key |
| Enigma Public | `EnigmaPublicClient` | `https://developers.enigma.com/docs` | 最广泛的公共数据集合 | 🔴 需要认证 (apiKey) |
| Urban Observatory | `UrbanObservatoryClient` | `https://urbanobservatory.ac.uk` | 英国最大的公开实时城市数据集 | 🟢 免 Key |
| French Address Search | `FrenchAddressSearchClient` | `https://geo.api.gouv.fr/adresse` | 通过法国政府搜索地址 | 🟢 免 Key |
| API Setu | `ApiSetuClient` | `https://www.apisetu.gov.in/` | 印度政府平台，为 KYC、商业、教育和就业提供大量 APIS | 🟢 免 Key |


### Video

本分类 (**视频**) 共包含 **39** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.video.VideoAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Breaking Bad Quotes | `BreakingBadQuotesClient` | `https://github.com/shevabam/breaking-bad-quotes` | 一些《绝命毒师》的名言 | 🟢 免 Key |
| An API of Ice And Fire | `AnApiOfIceAndFireClient` | `https://anapioficeandfire.com/` | 权力的游戏 API | 🟢 免 Key |
| Dune | `DuneClient` | `https://github.com/ywalia01/dune-api` | 一个简单的 API，为您提供书籍、角色、电影和引用 JSON 数据 | 🟢 免 Key |
| IMDbOT | `ImdbotClient` | `https://github.com/SpEcHiDe/IMDbOT` | 非官方 IMDb 电影/系列信息 | 🟢 免 Key |
| MCU Countdown | `McuCountdownClient` | `https://github.com/DiljotSG/MCU-Countdown` | 下一部漫威电影宇宙电影倒计时 | 🟢 免 Key |
| Lucifer Quotes | `LuciferQuotesClient` | `https://github.com/shadowoff09/lucifer-quotes` | 返回路西法的报价 | 🟢 免 Key |
| Movie Quote | `MovieQuoteClient` | `https://github.com/F4R4N/movie-quote/` | 随机电影和连续剧台词 | 🟢 免 Key |
| Stranger Things Quotes | `StrangerThingsQuotesClient` | `https://github.com/shadowoff09/strangerthings-quotes` | 返回《怪奇物语》报价 | 🟢 免 Key |
| Ron Swanson Quotes | `RonSwansonQuotesClient` | `https://github.com/jamesseanwright/ron-swanson-quotes#ron-swanson-quotes-api` | 电视 | 🟢 免 Key |
| Final Space | `FinalSpaceClient` | `https://finalspaceapi.com/docs/` | 最终空间 API | 🟢 免 Key |
| Harry Potter Charactes | `HarryPotterCharactesClient` | `https://hp-api.herokuapp.com/` | 哈利·波特角色数据与图像 | 🟢 免 Key |
| Open Movie Database | `OpenMovieDatabaseClient` | `http://www.omdbapi.com/` | 电影信息 | 🔴 需要认证 (apiKey) |
| Catch The Show | `CatchTheShowClient` | `https://catchtheshow.herokuapp.com/api/documentation` | next-episode.net 的 REST API | 🟢 免 Key |
| Simkl | `SimklClient` | `https://simkl.docs.apiary.io` | 电影、电视和动漫数据 | 🔴 需要认证 (apiKey) |
| TVDB | `TvdbClient` | `https://thetvdb.com/api-information` | 电视数据 | 🔴 需要认证 (apiKey) |
| Web Series Quotes Generator | `WebSeriesQuotesGeneratorClient` | `https://github.com/yogeshwaran01/web-series-quotes` | API 生成各种网络系列报价图像 | 🟢 免 Key |
| JSON2Video | `Json2VideoClient` | `https://json2video.com` | 以编程方式创建和编辑视频：水印、调整大小、幻灯片、画外音、文本动画 | 🔴 需要认证 (apiKey) |
| uNoGS | `UnogsClient` | `https://rapidapi.com/unogs/api/unogsng` | 非官方 Netflix 在线全球搜索，在一处搜索所有 Netflix 地区 | 🔴 需要认证 (apiKey) |
| Game of Thrones Quotes | `GameOfThronesQuotesClient` | `https://gameofthronesquotes.xyz/` | 一些《权力的游戏》中的台词 | 🟢 免 Key |
| TrailerAddict | `TraileraddictClient` | `https://www.traileraddict.com/trailerapi` | 轻松嵌入来自 TrailerAddict 的预告片 | 🔴 需要认证 (apiKey) |
| YouTube | `YoutubeClient` | `https://developers.google.com/youtube/` | 将 YouTube 功能添加到您的网站和应用程序 | 🔴 需要认证 (OAuth) |
| Trakt | `TraktClient` | `https://trakt.docs.apiary.io/` | 影视数据 | 🔴 需要认证 (apiKey) |
| Hyperserve | `HyperserveClient` | `https://hyperserve.io/` | 视频后端API：上传任意格式、转码为MP4、通过CDN传送 | 🔴 需要认证 (apiKey) |
| The Vampire Diaries | `TheVampireDiariesClient` | `https://vampire-diaries-api.netlify.app/` | 电视节目数据 | 🔴 需要认证 (apiKey) |
| SWAPI GraphQL | `SwapiGraphqlClient` | `https://graphql.org/swapi-graphql` | 星球大战 GraphQL API | 🟢 免 Key |
| Owen Wilson Wow | `OwenWilsonWowClient` | `https://owen-wilson-wow-api.herokuapp.com` | 演员 Owen Wilson 在电影中发出“哇”感叹声的 API | 🟢 免 Key |
| Motivational Quotes | `MotivationalQuotesClient` | `https://nodejs-quoteapp.herokuapp.com/` | 随机励志名言 | 🟢 免 Key |
| Watchmode | `WatchmodeClient` | `https://api.watchmode.com/` | 用于查找电影和节目的流媒体可用性的 API | 🔴 需要认证 (apiKey) |
| Vimeo | `VimeoClient` | `https://developer.vimeo.com/` | Vimeo 开发者 API | 🔴 需要认证 (OAuth) |
| The Lord of the Rings | `TheLordOfTheRingsClient` | `https://the-one-api.dev/` | 指环王 API | 🔴 需要认证 (apiKey) |
| SWAPI | `SwapiClient` | `https://swapi.dev/` | 您想要的所有星球大战数据 | 🟢 免 Key |
| STAPI | `StapiClient` | `http://stapi.co` | 有关《星际迷航》所有内容的信息 | 🟢 免 Key |
| TMDb | `TmdbClient` | `https://www.themoviedb.org/documentation/api` | 基于社区的电影数据 | 🔴 需要认证 (apiKey) |
| Stream | `StreamClient` | `https://api.stream.cz/graphiql` | 免费捷克网络电视、电影、连续剧和在线视频 | 🟢 免 Key |
| TVMaze | `TvmazeClient` | `http://www.tvmaze.com/api` | 电视节目数据 | 🟢 免 Key |
| ThronesApi | `ThronesapiClient` | `https://thronesapi.com/` | 权力的游戏角色数据与图像 | 🟢 免 Key |
| SWAPI | `SwapiClient` | `https://www.swapi.tech` | 星球大战的一切 | 🟢 免 Key |
| Stromberg Quotes | `StrombergQuotesClient` | `https://www.stromberg-api.de/` | 返回 Stromberg 的报价及更多内容 | 🟢 免 Key |
| Dailymotion | `DailymotionClient` | `https://developer.dailymotion.com/` | Dailymotion 开发者 API | 🔴 需要认证 (OAuth) |


### Security

本分类 (**安全性**) 共包含 **36** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.security.SecurityAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Botd | `BotdClient` | `https://github.com/fingerprintjs/botd` | Botd 是一个用于 JavaScript 机器人检测的浏览器库 | 🔴 需要认证 (apiKey) |
| Application Environment Verification | `ApplicationEnvironmentVerificationClient` | `https://github.com/fingerprintjs/aev` | Android库和API用于验证用户设备的安全性，检测root设备和其他风险 | 🔴 需要认证 (apiKey) |
| Escape | `EscapeClient` | `https://github.com/polarspetroll/EscapeAPI` | 用于转义不同类型查询的 API | 🟢 免 Key |
| Dehash.lt | `DehashLtClient` | `https://github.com/Dehash-lt/api` | 哈希解密 MD5、SHA1、SHA3、SHA256、SHA384、SHA512 | 🟢 免 Key |
| BitWarden | `BitwardenClient` | `https://bitwarden.com/help/api/` | 最好的开源密码管理器 | 🔴 需要认证 (OAuth) |
| Censys | `CensysClient` | `https://search.censys.io/api` | 连接互联网的主机和设备的搜索引擎 | 🔴 需要认证 (apiKey) |
| Intelligence X | `IntelligenceXClient` | `https://github.com/IntelligenceX/SDK/blob/master/Intelligence%20X%20API.pdf` | 通过 Intelligence X 执行 OSINT | 🔴 需要认证 (apiKey) |
| Mozilla http scanner | `MozillaHttpScannerClient` | `https://github.com/mozilla/http-observatory/blob/master/httpobs/docs/api.md` | Mozilla 天文台 http 扫描器 | 🟢 免 Key |
| dead-drop | `DeadDropClient` | `https://api.dead-drop.xyz/api/v1/docs` | 短暂的零知识加密数据共享 | 🟢 免 Key |
| Mozilla tls scanner | `MozillaTlsScannerClient` | `https://github.com/mozilla/tls-observatory#api-endpoints` | Mozilla 天文台 tls 扫描仪 | 🟢 免 Key |
| HaveIBeenPwned | `HaveibeenpwnedClient` | `https://haveibeenpwned.com/API/v3` | 之前在数据泄露中暴露过的密码 | 🔴 需要认证 (apiKey) |
| Passwordinator | `PasswordinatorClient` | `https://github.com/fawazsullia/password-generator/` | 生成不同复杂度的随机密码 | 🟢 免 Key |
| FilterLists | `FilterlistsClient` | `https://filterlists.com` | 广告拦截器和防火墙的过滤器列表 | 🟢 免 Key |
| GreyNoise | `GreynoiseClient` | `https://docs.greynoise.io/reference/get_v3-community-ip` | 查询 GreyNoise 数据集中的 IP 并检索完整 IP 上下文数据的子集 | 🔴 需要认证 (apiKey) |
| LoginRadius | `LoginradiusClient` | `https://www.loginradius.com/docs/` | 托管用户身份验证服务 | 🔴 需要认证 (apiKey) |
| HackerOne | `HackeroneClient` | `https://api.hackerone.com/` | 业界首个黑客 API，有助于提高创造性漏洞赏金狩猎的生产力 | 🔴 需要认证 (apiKey) |
| GitGuardian | `GitguardianClient` | `https://api.gitguardian.com/doc` | 扫描文件中的机密（API 密钥、数据库凭据） | 🔴 需要认证 (apiKey) |
| SecurityTrails | `SecuritytrailsClient` | `https://securitytrails.com/corp/apidocs` | 域和 IP 相关信息，例如当前和历史 WHOIS 和 DNS 记录 | 🔴 需要认证 (apiKey) |
| Bugcrowd | `BugcrowdClient` | `https://docs.bugcrowd.com/api/getting-started/` | Bugcrowd API，用于以编程方式交互和跟踪报告的问题 | 🔴 需要认证 (apiKey) |
| Classify | `ClassifyClient` | `https://classify-web.herokuapp.com/#/api` | 加密和解密短信 | 🟢 免 Key |
| PhishStats | `PhishstatsClient` | `https://phishstats.info/` | 网络钓鱼数据库 | 🟢 免 Key |
| Spyse | `SpyseClient` | `https://spyse-dev.readme.io/reference/quick-start` | 访问所有互联网资产的数据并构建强大的攻击面管理应用程序 | 🔴 需要认证 (apiKey) |
| Microsoft Security Response Center (MSRC) | `MicrosoftSecurityResponseCenterMsrcClient` | `https://msrc.microsoft.com/report/developer` | 用于与 Microsoft 安全响应中心 (MSRC) 交互的编程接口 | 🟢 免 Key |
| VulDB | `VuldbClient` | `https://vuldb.com/?doc.api` | VulDB API 允许启动对一项或多项以及事务机器人的查询 | 🔴 需要认证 (apiKey) |
| IPLogs | `IplogsClient` | `https://iplogs.com/docs` | Free VPN, proxy, Tor and datacenter IP detection. 13 sources, active probing | 🟢 免 Key |
| National Vulnerability Database | `NationalVulnerabilityDatabaseClient` | `https://nvd.nist.gov/vuln/Data-Feeds/JSON-feed-changelog` | 美国国家漏洞数据库 | 🟢 免 Key |
| BinaryEdge | `BinaryedgeClient` | `https://docs.binaryedge.io/api-v2.html` | 提供对 BinaryEdge 40fy 扫描平台的访问 | 🔴 需要认证 (apiKey) |
| Complete Criminal Checks | `CompleteCriminalChecksClient` | `https://completecriminalchecks.com/Developers` | 提供来自美国所有州和波多黎各的罪犯数据 | 🔴 需要认证 (apiKey) |
| Shodan | `ShodanClient` | `https://developer.shodan.io/` | 互联网连接设备的搜索引擎 | 🔴 需要认证 (apiKey) |
| UK Police | `UkPoliceClient` | `https://data.police.uk/docs/` | 英国警方数据 | 🟢 免 Key |
| FullHunt | `FullhuntClient` | `https://api-docs.fullhunt.io/#introduction` | 整个互联网的可搜索攻击面数据库 | 🔴 需要认证 (apiKey) |
| EmailRep | `EmailrepClient` | `https://docs.emailrep.io/` | 电子邮件地址威胁和风险预测 | 🟢 免 Key |
| Hashable | `HashableClient` | `https://hashable.space/pages/api/` | 用于访问高级加密函数和方法的 REST API | 🟢 免 Key |
| FingerprintJS Pro | `FingerprintjsProClient` | `https://dev.fingerprintjs.com/docs` | 欺诈检测 API 提供高度准确的浏览器指纹识别 | 🔴 需要认证 (apiKey) |
| Pulsedive | `PulsediveClient` | `https://pulsedive.com/api/` | 实时扫描、搜索和收集威胁情报数据 | 🔴 需要认证 (apiKey) |
| Privacy.com | `PrivacyComClient` | `https://privacy.com/developer/docs` | 生成特定于商家的一次性信用卡号，并链接回您的银行 | 🔴 需要认证 (apiKey) |


### Science & Math

本分类 (**科学与数学**) 共包含 **34** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.sciencemath.ScienceMathAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| iDigBio | `IdigbioClient` | `https://github.com/idigbio/idigbio-search-api/wiki` | 访问来自世界各地组织的数百万博物馆标本 | 🟢 免 Key |
| inspirehep.net | `InspirehepNetClient` | `https://github.com/inspirehep/rest-api-doc` | High Energy Physics info. system | 🟢 免 Key |
| GBIF | `GbifClient` | `https://www.gbif.org/developer/summary` | 全球生物多样性信息设施 | 🟢 免 Key |
| CORE | `CoreClient` | `https://core.ac.uk/services#api` | 获取世界各地的开放获取研究论文 | 🔴 需要认证 (apiKey) |
| ISRO | `IsroClient` | `https://isro.vercel.app` | ISRO航天器信息 | 🟢 免 Key |
| Newton | `NewtonClient` | `https://newton.vercel.app` | 符号和算术数学计算器 | 🟢 免 Key |
| SpaceX | `SpacexClient` | `https://github.com/r-spacex/SpaceX-API` | 公司、车辆、发射台和发射数据 | 🟢 免 Key |
| CodeCogs | `CodecogsClient` | `https://editor.codecogs.com/docs/4-LaTeX_rendering.php` | 以 PNG、GIF、SVG、EMF、PDF、JSON 或带有样式选项的下载格式渲染 LaTeX 方程 | 🟢 免 Key |
| Times Adder | `TimesAdderClient` | `https://github.com/FranP-code/API-Times-Adder` | 使用此 API，您可以添加发送的数组中引入的每个时间 | 🟢 免 Key |
| Remote Calc | `RemoteCalcClient` | `https://github.com/elizabethadegbaju/remotecalc` | 解码base64编码并解析，返回JSON中计算的解 | 🟢 免 Key |
| Open Science Framework | `OpenScienceFrameworkClient` | `https://developer.osf.io` | 研究设计、研究材料、数据、手稿等的存储库和档案 | 🟢 免 Key |
| arcsecond.io | `ArcsecondIoClient` | `https://api.arcsecond.io/` | 多种天文数据源 | 🟢 免 Key |
| Minor Planet Center | `MinorPlanetCenterClient` | `http://www.asterank.com/mpc` | Asterrank.com 信息 | 🟢 免 Key |
| Numbers | `NumbersClient` | `http://numbersapi.com` | 关于数字的事实 | 🟢 免 Key |
| Open Notify | `OpenNotifyClient` | `http://open-notify.org/Open-Notify-API/` | 国际空间站宇航员、当前位置等 | 🟢 免 Key |
| isEven (humor) | `IsevenHumorClient` | `https://isevenapi.xyz/` | 检查数字是否为偶数 | 🟢 免 Key |
| ITIS | `ItisClient` | `https://www.itis.gov/ws_description.html` | 综合分类信息系统 | 🟢 免 Key |
| NASA ADS | `NasaAdsClient` | `https://ui.adsabs.harvard.edu/help/api/api-docs.html` | 美国宇航局天体物理数据系统 | 🔴 需要认证 (OAuth) |
| SHARE | `ShareClient` | `https://share.osf.io/api/v2/` | 关于研究和学术活动的免费、开放的数据集 | 🟢 免 Key |
| Numbers | `NumbersClient` | `https://math.tools/api/numbers/` | 当天的数字、随机数、数字事实以及您想用数字做的任何其他事情 | 🔴 需要认证 (apiKey) |
| NASA | `NasaClient` | `https://api.nasa.gov` | NASA 数据，包括图像 | 🟢 免 Key |
| Purple Air | `PurpleAirClient` | `https://www2.purpleair.com/` | 实时空气质量监测 | 🟢 免 Key |
| arXiv | `ArxivClient` | `https://arxiv.org/help/api/user-manual` | 精心策划的研究共享平台：物理、数学、量化金融和经济学 | 🟢 免 Key |
| xMath | `XmathClient` | `https://x-math.herokuapp.com/` | 随机数学表达式 | 🟢 免 Key |
| Ocean Facts | `OceanFactsClient` | `https://oceanfacts.herokuapp.com/` | 与海洋学物理科学有关的事实 | 🟢 免 Key |
| Materials Platform for Data Science | `MaterialsPlatformForDataScienceClient` | `https://mpds.io` | 材料科学的策划实验数据 | 🔴 需要认证 (apiKey) |
| USGS Earthquake Hazards Program | `UsgsEarthquakeHazardsProgramClient` | `https://earthquake.usgs.gov/fdsnws/event/1/` | 地震数据实时 | 🟢 免 Key |
| Noctua | `NoctuaClient` | `https://api.noctuasky.com/api/v1/swaggerdoc/` | 用于访问NoctuaSky功能的REST API | 🟢 免 Key |
| Launch Library 2 | `LaunchLibrary2Client` | `https://thespacedevs.com/llapi` | 航天发射和事件数据库 | 🟢 免 Key |
| World Bank | `WorldBankClient` | `https://datahelpdesk.worldbank.org/knowledgebase/topics/125589` | 世界数据 | 🟢 免 Key |
| Sunrise and Sunset | `SunriseAndSunsetClient` | `https://sunrise-sunset.org/api` | 给定纬度和经度的日落和日出时间 | 🟢 免 Key |
| USGS Water Services | `UsgsWaterServicesClient` | `https://waterservices.usgs.gov/` | 河流和湖泊的水质和水位信息 | 🟢 免 Key |
| TLE | `TleClient` | `https://tle.ivanstanojevic.me/#/docs` | 卫星信息 | 🟢 免 Key |
| OpenAlex | `OpenalexClient` | `https://docs.openalex.org/` | 学术著作、作者、机构、来源和概念的开放目录 | 🟢 免 Key |


### Music

本分类 (**音乐**) 共包含 **31** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.music.MusicAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Gaana | `GaanaClient` | `https://github.com/cyberboysumanjay/GaanaAPI` | 用于从 Gaana 检索歌曲信息的 API | 🟢 免 Key |
| JioSaavn | `JiosaavnClient` | `https://github.com/cyberboysumanjay/JioSaavnAPI` | 用于从 JioSaavn 检索歌曲信息、专辑元数据等的 API | 🟢 免 Key |
| Genius | `GeniusClient` | `https://docs.genius.com/` | 众包歌词和音乐知识 | 🔴 需要认证 (OAuth) |
| Bandcamp | `BandcampClient` | `https://bandcamp.com/developer` | 音乐商店 Bandcamp 的 API | 🔴 需要认证 (OAuth) |
| KKBOX | `KkboxClient` | `https://developer.kkbox.com` | 获取音乐库、播放列表、图表并在 KKBOX 平台上表演 | 🔴 需要认证 (OAuth) |
| Jamendo | `JamendoClient` | `https://developer.jamendo.com/v3.0/docs` | 音乐 | 🔴 需要认证 (OAuth) |
| Discogs | `DiscogsClient` | `https://www.discogs.com/developers/` | 音乐 | 🔴 需要认证 (OAuth) |
| LastFm | `LastfmClient` | `https://www.last.fm/api` | 音乐 | 🔴 需要认证 (apiKey) |
| Lyrics.ovh | `LyricsOvhClient` | `https://lyricsovh.docs.apiary.io` | 用于检索歌曲歌词的简单 API | 🟢 免 Key |
| AI Mastering | `AiMasteringClient` | `https://aimastering.com/api_docs/` | 自动音乐母带处理 | 🔴 需要认证 (apiKey) |
| Mixcloud | `MixcloudClient` | `https://www.mixcloud.com/developers/` | 音乐 | 🔴 需要认证 (OAuth) |
| Openwhyd | `OpenwhydClient` | `https://openwhyd.github.io/openwhyd/API` | 下载精选的流媒体曲目播放列表（YouTube、SoundCloud 等...） | 🟢 免 Key |
| TasteDive | `TastediveClient` | `https://tastedive.com/read/api` | 类似的艺术家 API（也适用于电影和电视节目） | 🔴 需要认证 (apiKey) |
| Songlink / Odesli | `SonglinkOdesliClient` | `https://www.notion.so/API-d0ebe08a5e304a55928405eb682f6741` | 获取可播放歌曲的所有服务 | 🔴 需要认证 (apiKey) |
| Freesound | `FreesoundClient` | `https://freesound.org/docs/api/` | 音乐样本 | 🔴 需要认证 (apiKey) |
| Songkick | `SongkickClient` | `https://www.songkick.com/developer/` | 音乐活动 | 🔴 需要认证 (apiKey) |
| SoundCloud | `SoundcloudClient` | `https://developers.soundcloud.com/docs/api/guide` | 借助 SoundCloud API，您可以构建应用程序来提供更多的能力来控制您的内容 | 🔴 需要认证 (OAuth) |
| Verome | `VeromeClient` | `https://github.com/Kirazul/Verome-API` | 用于搜索、流式传输和探索 YouTube Music、YouTube 和 Last.fm 中的音乐数据的音乐 API | 🟢 免 Key |
| Radio Browser | `RadioBrowserClient` | `https://api.radio-browser.info/` | 网络广播电台列表 | 🟢 免 Key |
| Deezer | `DeezerClient` | `https://developers.deezer.com/api` | 音乐 | 🔴 需要认证 (OAuth) |
| Songsterr | `SongsterrClient` | `https://www.songsterr.com/a/wa/api/` | 提供吉他、贝斯和鼓的乐谱和和弦 | 🟢 免 Key |
| Genrenator | `GenrenatorClient` | `https://binaryjazz.us/genrenator-api/` | 音乐流派生成器 | 🟢 免 Key |
| MusicBrainz | `MusicbrainzClient` | `https://musicbrainz.org/doc/Development/XML_Web_Service/Version_2` | 音乐 | 🟢 免 Key |
| TheAudioDB | `TheaudiodbClient` | `https://www.theaudiodb.com/api_guide.php` | 音乐 | 🔴 需要认证 (apiKey) |
| Audiomack | `AudiomackClient` | `https://www.audiomack.com/data-api/docs` | 流媒体音乐中心 Audiomack 的 API | 🔴 需要认证 (OAuth) |
| Sunor | `SunorClient` | `https://docs.sunor.cc` | 通过 Suno 的人工智能音乐生成 API，提供即用即付积分 | 🔴 需要认证 (apiKey) |
| 7digital | `Api7DigitalClient` | `https://docs.7digital.com/reference` | 音乐商店 7digital 的 Api | 🔴 需要认证 (OAuth) |
| Musixmatch | `MusixmatchClient` | `https://developer.musixmatch.com/` | 音乐 | 🔴 需要认证 (apiKey) |
| Spotify | `SpotifyClient` | `https://beta.developer.spotify.com/documentation/web-api/` | 查看 Spotify 音乐目录、管理用户的音乐库、获取推荐等 | 🔴 需要认证 (OAuth) |
| Phishin | `PhishinClient` | `https://phish.in/api-docs` | 即兴摇滚乐队 Phish 的合法现场录音的网络存档 | 🔴 需要认证 (apiKey) |
| Bandsintown | `BandsintownClient` | `https://app.swaggerhub.com/apis/Bandsintown/PublicAPI/3.0.0` | 音乐活动 | 🟢 免 Key |


### Sports & Fitness

本分类 (**运动与健身**) 共包含 **31** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.sportsfitness.SportsFitnessAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| API-FOOTBALL | `ApiFootballClient` | `https://www.api-football.com/documentation-v3` | 获取有关足球联赛和杯赛的信息 | 🔴 需要认证 (apiKey) |
| Football Standings | `FootballStandingsClient` | `https://github.com/azharimm/football-standings-api` | 显示足球排名，例如英超、西甲、意甲等。数据基于 espn 网站 | 🟢 免 Key |
| Cloudbet | `CloudbetClient` | `https://www.cloudbet.com/api/` | 官方 Cloudbet API 提供实时体育赔率和投注 API，以编程方式下注 | 🔴 需要认证 (apiKey) |
| MLB Records and Stats | `MlbRecordsAndStatsClient` | `https://appac.github.io/mlb-data-api-docs/` | 当前和历史的 MLB 统计数据 | 🟢 免 Key |
| balldontlie | `BalldontlieClient` | `https://www.balldontlie.io` | Balldontlie 提供对 NBA 统计数据的访问 | 🟢 免 Key |
| Football (Soccer) Videos | `FootballSoccerVideosClient` | `https://www.scorebat.com/video-api/` | 嵌入英超联赛、德甲联赛、意甲联赛等进球和精彩时刻的代码 | 🟢 免 Key |
| ApiMedic | `ApimedicClient` | `https://apimedic.com/` | ApiMedic 主要为患者提供医疗症状检查 API | 🔴 需要认证 (apiKey) |
| Fitbit | `FitbitClient` | `https://dev.fitbit.com/` | Fitbit 信息 | 🔴 需要认证 (OAuth) |
| Football | `FootballClient` | `https://rapidapi.com/GiulianoCrescimbeni/api/football98/` | 一个简单的开源足球 API，用于获取球队的统计数据、最佳得分手等 | 🔴 需要认证 (X-Mashape-Key) |
| Strava | `StravaClient` | `https://strava.github.io/api/` | 与运动员、活动等保持联系 | 🔴 需要认证 (OAuth) |
| NHL Records and Stats | `NhlRecordsAndStatsClient` | `https://gitlab.com/dword4/nhlapi` | NHL历史数据和统计 | 🟢 免 Key |
| City Bikes | `CityBikesClient` | `https://api.citybik.es/v2/` | 世界各地的城市自行车 | 🟢 免 Key |
| DiscGolf | `DiscgolfClient` | `https://discgolfapi.com/docs/` | 结构化圆盘高尔夫球场数据 | 🟢 免 Key |
| Premier League Standings | `PremierLeagueStandingsClient` | `https://rapidapi.com/heisenbug/api/premier-league-live-scores/` | 当前所有英超联赛积分榜和统计数据 | 🔴 需要认证 (apiKey) |
| TheSportsDB | `ThesportsdbClient` | `https://www.thesportsdb.com/api.php` | 众包体育数据和艺术品 | 🔴 需要认证 (apiKey) |
| Squiggle | `SquiggleClient` | `https://api.squiggle.com.au` | 澳大利亚橄榄球联赛比赛的赛程、结果和预测 | 🟢 免 Key |
| CollegeFootballData.com | `CollegefootballdataComClient` | `https://collegefootballdata.com` | 非官方详细的美国大学橄榄球统计、记录和结果 API | 🔴 需要认证 (apiKey) |
| RacingHub | `RacinghubClient` | `https://racinghub.net/api/v1/docs#/` | 一级方程式历史数据和统计 | 🟢 免 Key |
| Football-Data | `FootballDataClient` | `https://www.football-data.org` | 足球数据，包括比赛信息、球员、球队和比赛 | 🔴 需要认证 (X-Mashape-Key) |
| Tredict | `TredictClient` | `https://www.tredict.com/blog/oauth_docs/` | 获取和设置活动、健康数据等 | 🔴 需要认证 (OAuth) |
| Sport Data | `SportDataClient` | `https://sportdataapi.com` | 获取世界各地的体育数据 | 🔴 需要认证 (apiKey) |
| NBA Data | `NbaDataClient` | `https://rapidapi.com/api-sports/api/api-nba/` | 所有 NBA 统计数据、比赛、实时比分、排名、统计 | 🔴 需要认证 (apiKey) |
| Ergast F1 | `ErgastF1Client` | `http://ergast.com/mrd/` | 1950年世锦赛开始时的F1数据 | 🟢 免 Key |
| Sportmonks Cricket | `SportmonksCricketClient` | `https://docs.sportmonks.com/cricket/` | 实时板球比分、球员统计数据和 Fantasy API | 🔴 需要认证 (apiKey) |
| Wger | `WgerClient` | `https://wger.de/en/software/api` | 锻炼管理器数据如练习、肌肉或设备 | 🔴 需要认证 (apiKey) |
| Sportmonks Football | `SportmonksFootballClient` | `https://docs.sportmonks.com/football/` | Football score/schedule, news api, tv channels, stats, history, display standing e.g. epl, la liga | 🔴 需要认证 (apiKey) |
| TourneyRadar | `TourneyradarClient` | `https://tourneyradar-api.vercel.app` | 全球 140 多个国家联合会即将举办的国际象棋锦标赛 | 🟢 免 Key |
| OpenLigaDB | `OpenligadbClient` | `https://www.openligadb.de` | 众包体育联赛结果 | 🟢 免 Key |
| NBA Stats | `NbaStatsClient` | `https://any-api.com/nba_com/nba_com/docs/API_Description` | 当前和历史的 NBA 统计数据 | 🟢 免 Key |
| JCDecaux Bike | `JcdecauxBikeClient` | `https://developer.jcdecaux.com/` | 德高集团自助自行车 | 🔴 需要认证 (apiKey) |
| Oddsmagnet | `OddsmagnetClient` | `https://data.oddsmagnet.com` | 多家英国博彩公司的赔率历史记录 | 🟢 免 Key |


### Weather

本分类 (**天气**) 共包含 **31** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.weather.WeatherAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| ColorfulClouds | `ColorfulcloudsClient` | `https://open.caiyunapp.com/ColorfulClouds_Weather_API` | 天气 | 🔴 需要认证 (apiKey) |
| QWeather | `QweatherClient` | `https://dev.qweather.com/en/` | 基于位置的天气数据 | 🔴 需要认证 (apiKey) |
| AQICN | `AqicnClient` | `https://aqicn.org/api/` | 1000多个城市空气质量指数数据 | 🔴 需要认证 (apiKey) |
| Hong Kong Obervatory | `HongKongObervatoryClient` | `https://www.hko.gov.hk/en/abouthko/opendata_intro.htm` | 提供天气信息、地震信息、气候数据 | 🟢 免 Key |
| Aemet | `AemetClient` | `https://opendata.aemet.es/centrodedescargas/inicio` | 来自西班牙的天气和预报数据 | 🔴 需要认证 (apiKey) |
| RainViewer | `RainviewerClient` | `https://www.rainviewer.com/api.html` | 从互联网上不同网站收集的雷达数据 | 🟢 免 Key |
| 7Timer! | `Api7TimerClient` | `http://www.7timer.info/doc.php?lang=en` | 天气，尤其是 Astroweather | 🟢 免 Key |
| weather-api | `WeatherApiClient` | `https://github.com/robertoduessmann/weather-api` | 用于检查天气的 RESTful 免费 API | 🟢 免 Key |
| Open-Meteo | `OpenMeteoClient` | `https://open-meteo.com/` | 非商业用途的全球天气预报 API | 🟢 免 Key |
| Meteorologisk Institutt | `MeteorologiskInstituttClient` | `https://api.met.no/weatherapi/documentation` | 天气和气候数据 | 🔴 需要认证 (User-Agent) |
| US Weather | `UsWeatherClient` | `https://www.weather.gov/documentation/services-web-api` | 美国国家气象局 | 🟢 免 Key |
| Pirate Weather | `PirateWeatherClient` | `https://pirateweather.net/en/latest/` | 免费天气 API，提供类似于 Dark Sky 的预报数据 | 🟢 免 Key |
| OpenWeatherMap | `OpenweathermapClient` | `https://openweathermap.org/api` | 天气 | 🔴 需要认证 (apiKey) |
| AccuWeather | `AccuweatherClient` | `https://developer.accuweather.com/apis` | 天气和预报数据 | 🔴 需要认证 (apiKey) |
| openSenseMap | `OpensensemapClient` | `https://api.opensensemap.org/` | 来自称为 senseBoxes 的个人气象站的数据 | 🟢 免 Key |
| Foreca | `ForecaClient` | `https://developer.foreca.com` | 天气 | 🔴 需要认证 (OAuth) |
| WeatherAPI | `WeatherapiClient` | `https://www.weatherapi.com/` | 天气 API 以及天文学和地理定位 API 等其他内容 | 🔴 需要认证 (apiKey) |
| Oikolab | `OikolabClient` | `https://docs.oikolab.com` | 来自 NOAA 和 ECMWF 的 70 多年全球每小时历史和预报天气数据 | 🔴 需要认证 (apiKey) |
| wttr.in | `WttrInClient` | `https://wttr.in/:help` | 终端中的天气，支持 JSON 输出 | 🟢 免 Key |
| Weatherstack | `WeatherstackClient` | `https://weatherstack.com/?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 实时和历史世界天气数据 API | 🔴 需要认证 (apiKey) |
| Yandex.Weather | `YandexWeatherClient` | `https://yandex.com/dev/weather/` | 评估特定地点的天气状况 | 🔴 需要认证 (apiKey) |
| Tomorrow | `TomorrowClient` | `https://docs.tomorrow.io` | 由专有技术提供支持的天气 API | 🔴 需要认证 (apiKey) |
| APIXU | `ApixuClient` | `https://www.apixu.com/doc/request.aspx` | 天气 | 🔴 需要认证 (apiKey) |
| Weatherbit | `WeatherbitClient` | `https://www.weatherbit.io/api` | 天气 | 🔴 需要认证 (apiKey) |
| Storm Glass | `StormGlassClient` | `https://stormglass.io/` | 来自多个来源的全球海洋天气 | 🔴 需要认证 (apiKey) |
| Micro Weather | `MicroWeatherClient` | `https://m3o.com/weather/api` | 实时天气预报和历史数据 | 🔴 需要认证 (apiKey) |
| IPMA | `IpmaClient` | `https://api.ipma.pt/open-data/` | 葡萄牙天气和气候数据 | 🟢 免 Key |
| OpenUV | `OpenuvClient` | `https://www.openuv.io` | 实时紫外线指数预测 | 🔴 需要认证 (apiKey) |
| AviationWeather | `AviationweatherClient` | `https://www.aviationweather.gov/dataserver` | NOAA 航空天气预报和观测 | 🟢 免 Key |
| ODWeather | `OdweatherClient` | `http://api.oceandrivers.com/static/docs.html` | 天气和天气网络摄像头 | 🟢 免 Key |
| HG Weather | `HgWeatherClient` | `https://hgbrasil.com/status/weather` | 提供巴西城市的天气预报数据 | 🔴 需要认证 (apiKey) |


### Health

本分类 (**健康**) 共包含 **30** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.health.HealthAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Covid-19 | `Covid19Client` | `https://github.com/M-Media-Group/Covid-19-API` | 每个国家的 Covid 19 病例、死亡人数和康复情况 | 🟢 免 Key |
| Covid-19 Live Data | `Covid19LiveDataClient` | `https://github.com/mathdroid/covid-19-api` | Covid 19 每日全球和国家数据摘要、确诊病例、康复病例和死亡病例 | 🟢 免 Key |
| Covid-19 Philippines | `Covid19PhilippinesClient` | `https://github.com/Simperfy/Covid-19-API-Philippines-DOH` | 菲律宾非官方 Covid-19 Web API（来自 DOH 收集的数据） | 🟢 免 Key |
| Coronavirus | `CoronavirusClient` | `https://pipedream.com/@pravin/http-api-for-latest-wuhan-coronavirus-data-2019-ncov-p_G6CLVM/readme` | 用于最新 Covid-19 数据的 HTTP API | 🟢 免 Key |
| Covid-19 India | `Covid19IndiaClient` | `https://data.covid19india.org/` | 印度各州和地区有关 Covid 19 病例、疫苗接种和康复情况的统计数据 | 🟢 免 Key |
| Covid-19 JHU CSSE | `Covid19JhuCsseClient` | `https://nuttaphat.com/covid19-api/` | 基于 JHU CSSE 的用于探索 Covid19 病例的开源 API | 🟢 免 Key |
| CMS.gov | `CmsGovClient` | `https://data.cms.gov/provider-data/` | 从 CMS 获取数据 - medicare.gov | 🔴 需要认证 (apiKey) |
| Covid-19 Datenhub | `Covid19DatenhubClient` | `https://npgeo-corona-npgeo-de.hub.arcgis.com` | COVID-19 背景下的地图、数据集、应用程序等 | 🟢 免 Key |
| Coronavirus in the UK | `CoronavirusInTheUkClient` | `https://coronavirus.data.gov.uk/details/developers-guide` | 英国政府冠状病毒数据，包括按地区划分的死亡人数和病例 | 🟢 免 Key |
| MyVaccination | `MyvaccinationClient` | `https://documenter.getpostman.com/view/16605343/Tzm8GG7u` | 马来西亚的疫苗接种数据 | 🟢 免 Key |
| Dataflow Kit COVID-19 | `DataflowKitCovid19Client` | `https://covid-19.dataflowkit.com` | 每小时站点的 COVID-19 实时统计数据 | 🟢 免 Key |
| Covid Tracking Project | `CovidTrackingProjectClient` | `https://covidtracking.com/data/api/version-2` | 美国 Covid-19 数据 | 🟢 免 Key |
| Humanitarian Data Exchange | `HumanitarianDataExchangeClient` | `https://data.humdata.org/` | 人道主义数据交换 (HDX) 是跨危机和跨组织共享数据的开放平台 | 🟢 免 Key |
| Healthcare.gov | `HealthcareGovClient` | `https://www.healthcare.gov/developers/` | 有关美国健康保险市场的教育内容 | 🟢 免 Key |
| openFDA | `OpenfdaClient` | `https://open.fda.gov` | FDA 有关药品、设备和食品的公开数据 | 🔴 需要认证 (apiKey) |
| COVID-19 Tracker Canada | `Covid19TrackerCanadaClient` | `https://api.covid19tracker.ca/docs/1.0/overview` | 加拿大各地 Covid-19 病例的详细信息 | 🟢 免 Key |
| Orion Health | `OrionHealthClient` | `https://developer.orionhealth.io/` | 医疗平台，允许开发针对不同医疗场景的应用程序 | 🔴 需要认证 (OAuth) |
| Nutritionix | `NutritionixClient` | `https://developer.nutritionix.com/` | 世界上最大的经过验证的营养数据库 | 🔴 需要认证 (apiKey) |
| MedlinePlus Genetics | `MedlineplusGeneticsClient` | `https://medlineplus.gov/about/developers/geneticsdatafilesapi/` | 遗传条件、基因、染色体和 mtDNA 数据 | 🟢 免 Key |
| FoodData Central | `FooddataCentralClient` | `https://fdc.nal.usda.gov/` | 国家营养标准参考数据库 | 🔴 需要认证 (apiKey) |
| Lexigram | `LexigramClient` | `https://docs.lexigram.io/` | NLP 从文本中提取临床概念的提及，提供临床本体论的访问 | 🔴 需要认证 (apiKey) |
| Open Disease | `OpenDiseaseClient` | `https://disease.sh/` | 当前病例以及有关 COVID-19 和流感的更多内容的 API | 🟢 免 Key |
| Infermedica | `InfermedicaClient` | `https://developer.infermedica.com/docs/` | 基于 NLP 的症状检查器和患者分类 API，用于通过文本进行健康诊断 | 🔴 需要认证 (apiKey) |
| NPPES | `NppesClient` | `https://npiregistry.cms.hhs.gov/registry/help-api` | 国家计划和提供者枚举系统，有关在美国注册的医疗保健提供者的信息 | 🟢 免 Key |
| Open Data NHS Scotland | `OpenDataNhsScotlandClient` | `https://www.opendata.nhs.scot` | 苏格兰公共卫生部门的医疗参考数据和统计数据 | 🟢 免 Key |
| Edamam | `EdamamClient` | `https://developer.edamam.com/` | 具有食谱搜索功能的食品和营养数据 API | 🔴 需要认证 (apiKey) |
| COVID-19 Tracker Sri Lanka | `Covid19TrackerSriLankaClient` | `https://www.hpb.health.gov.lk/en/api-documentation` | 提供斯里兰卡报告的 COVID-19 患者的情况 | 🟢 免 Key |
| Makeup | `MakeupClient` | `http://makeup-api.herokuapp.com/` | 彩妆资讯 | 🟢 免 Key |
| LAPIS | `LapisClient` | `https://cov-spectrum.ethz.ch/public` | 来自公共来源的 SARS-CoV-2 基因组序列 | 🟢 免 Key |
| Covid-19 Government Response | `Covid19GovernmentResponseClient` | `https://covidtracker.bsg.ox.ac.uk` | 政府应对 Covid-19 大流行的措施追踪器 | 🟢 免 Key |


### Documents & Productivity

本分类 (**文件和生产力**) 共包含 **28** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.documentsproductivity.DocumentsProductivityAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Airtable | `AirtableClient` | `https://airtable.com/api` | 与 Airtable 集成 | 🔴 需要认证 (apiKey) |
| Asana | `AsanaClient` | `https://developers.asana.com/docs` | 以编程方式访问体式系统中的所有数据 | 🔴 需要认证 (apiKey) |
| CraftMyPDF | `CraftmypdfClient` | `https://craftmypdf.com` | 使用拖放式编辑器和简单的 API 从模板生成 PDF 文档 | 🔴 需要认证 (apiKey) |
| Api2Convert | `Api2ConvertClient` | `https://www.api2convert.com/` | 在线文件转换API | 🔴 需要认证 (apiKey) |
| Todoist | `TodoistClient` | `https://developer.todoist.com` | 待办事项列表 | 🔴 需要认证 (OAuth) |
| Notion | `NotionClient` | `https://developers.notion.com/docs/getting-started` | 与概念整合 | 🔴 需要认证 (OAuth) |
| PandaDoc | `PandadocClient` | `https://developers.pandadoc.com` | DocGen 和电子签名 API | 🔴 需要认证 (apiKey) |
| apilayer pdflayer | `ApilayerPdflayerClient` | `https://pdflayer.com` | HTML/URL 转 PDF | 🔴 需要认证 (apiKey) |
| Code::Stats | `CodeStatsClient` | `https://codestats.net/api-docs` | 程序员的自动时间跟踪 | 🔴 需要认证 (apiKey) |
| Html2PDF | `Html2PdfClient` | `https://html2pdf.app/` | HTML/URL 转 PDF | 🔴 需要认证 (apiKey) |
| Vector Express v2.0 | `VectorExpressV20Client` | `https://vector.express` | 免费矢量文件转换API | 🟢 免 Key |
| Renderly | `RenderlyClient` | `https://renderlyapi.com` | 基于 Chromium 构建的 HTML 到 PDF 转换 API | 🔴 需要认证 (apiKey) |
| Flowdash | `FlowdashClient` | `https://docs.flowdash.com/docs/api-introduction` | 自动化业务工作流程 | 🔴 需要认证 (apiKey) |
| Cloudmersive Document and Data Conversion | `CloudmersiveDocumentAndDataConversionClient` | `https://cloudmersive.com/convert-api` | HTML/URL 到 PDF/PNG、Office 文档到 PDF、图像转换 | 🔴 需要认证 (apiKey) |
| Podio | `PodioClient` | `https://developers.podio.com` | 文件共享和生产力 | 🔴 需要认证 (OAuth) |
| ClickUp | `ClickupClient` | `https://clickup.com/api` | ClickUp 是一款强大的、基于云的项目管理工具，可提高生产力 | 🔴 需要认证 (OAuth) |
| BuildPDF | `BuildpdfClient` | `https://buildpdf.co/api/docs` | 将 HTML、图像和文本转换为 PDF | 🔴 需要认证 (apiKey) |
| JIRA | `JiraClient` | `https://developer.atlassian.com/server/jira/platform/rest-apis/` | JIRA 是一种专有的问题跟踪产品，允许错误跟踪和敏捷项目管理 | 🔴 需要认证 (OAuth) |
| staffSign | `StaffsignClient` | `https://staffsign.de/docs` | 数字雇佣合同 API，为人力资源和人员配置提供 QES/eIDAS 支持 | 🔴 需要认证 (apiKey) |
| Zube | `ZubeClient` | `https://zube.io/docs/api` | 全栈项目管理 | 🔴 需要认证 (OAuth) |
| Clockify | `ClockifyClient` | `https://clockify.me/developers-api` | Clockify 基于 REST 的 API 可用于向其中推送/拉取数据，并将其与其他系统集成 | 🔴 需要认证 (apiKey) |
| CloudConvert | `CloudconvertClient` | `https://cloudconvert.com/api/v2` | 用于音频、视频、文档、电子书、存档、图像、电子表格、演示文稿的在线文件转换器 | 🔴 需要认证 (apiKey) |
| PrexView | `PrexviewClient` | `https://prexview.com` | 将 XML 或 JSON 数据转换为 PDF、HTML 或图像 | 🔴 需要认证 (apiKey) |
| WakaTime | `WakatimeClient` | `https://wakatime.com/developers` | 程序员的自动时间跟踪排行榜 | 🟢 免 Key |
| Smart Image Enhancement | `SmartImageEnhancementClient` | `https://apilayer.com/marketplace/image_enhancement-api` | 通过多种超分辨率算法向图像添加细节来执行图像升级 | 🔴 需要认证 (apiKey) |
| Restpack | `RestpackClient` | `https://restpack.io/` | 提供屏幕截图、HTML 转 PDF 和内容提取 API | 🔴 需要认证 (apiKey) |
| iLovePDF | `IlovepdfClient` | `https://developer.ilovepdf.com/` | Convert, merge, split, extract text and add page numbers for PDFs. Free for 250 documents/month | 🔴 需要认证 (apiKey) |
| Mattermost | `MattermostClient` | `https://api.mattermost.com/` | 用于开发者协作的开源平台 | 🔴 需要认证 (OAuth) |


### Photography

本分类 (**摄影**) 共包含 **26** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.photography.PhotographyAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Flickr | `FlickrClient` | `https://www.flickr.com/services/api/` | Flickr 服务 | 🔴 需要认证 (OAuth) |
| Google Photos | `GooglePhotosClient` | `https://developers.google.com/photos` | 将 Google 相册与您的应用或设备集成 | 🔴 需要认证 (OAuth) |
| Readme typing SVG | `ReadmeTypingSvgClient` | `https://github.com/DenverCoder1/readme-typing-svg` | 可自定义的输入和删除文本 SVG | 🟢 免 Key |
| Lorem Picsum | `LoremPicsumClient` | `https://picsum.photos/` | 图片来自 Unsplash | 🟢 免 Key |
| Pexels | `PexelsClient` | `https://www.pexels.com/api/` | 免费照片和视频 | 🔴 需要认证 (apiKey) |
| Pixabay | `PixabayClient` | `https://pixabay.com/sk/service/about/api/` | 摄影 | 🔴 需要认证 (apiKey) |
| Duply | `DuplyClient` | `https://duply.co/docs#getting-started-api` | 更智能、更快速地生成、编辑、缩放和管理图像和视频 | 🔴 需要认证 (apiKey) |
| PhotoRoom | `PhotoroomClient` | `https://www.photoroom.com/api/` | 从图像中删除背景 | 🔴 需要认证 (apiKey) |
| CheetahO | `CheetahoClient` | `https://cheetaho.com/docs/getting-started/` | 照片优化和调整大小 | 🔴 需要认证 (apiKey) |
| ObjectCut | `ObjectcutClient` | `https://objectcut.com/` | 图像背景去除 | 🔴 需要认证 (apiKey) |
| Giphy | `GiphyClient` | `https://developers.giphy.com/docs/` | 获取你所有的 GIF 动图 | 🔴 需要认证 (apiKey) |
| Remove.bg | `RemoveBgClient` | `https://www.remove.bg/api` | 图像背景去除 | 🔴 需要认证 (apiKey) |
| Screenshotlayer | `ScreenshotlayerClient` | `https://screenshotlayer.com?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 屏幕截图的网址 | 🟢 免 Key |
| shutterstock | `ShutterstockClient` | `https://api-reference.shutterstock.com/` | 图库照片和视频 | 🔴 需要认证 (OAuth) |
| APITemplate.io | `ApitemplateIoClient` | `https://apitemplate.io` | 使用简单的 API 从模板动态生成图像和 PDF | 🔴 需要认证 (apiKey) |
| Dagpi | `DagpiClient` | `https://dagpi.xyz` | 图像操纵和处理 | 🔴 需要认证 (apiKey) |
| Imgur | `ImgurClient` | `https://apidocs.imgur.com/` | 图片 | 🔴 需要认证 (OAuth) |
| PlaceKeanu | `PlacekeanuClient` | `https://placekeanu.com/` | 可调整大小的基努·里维斯占位符图像，带有灰度和年轻基努选项 | 🟢 免 Key |
| Webdam | `WebdamClient` | `https://www.damsuccess.com/hc/en-us/articles/202134055-REST-API` | 图片 | 🔴 需要认证 (OAuth) |
| Imsea | `ImseaClient` | `https://imsea.herokuapp.com/` | 免费图片搜索 | 🟢 免 Key |
| DynaPictures | `DynapicturesClient` | `https://dynapictures.com/docs/` | 在几分钟内生成数百张个性化图像 | 🔴 需要认证 (apiKey) |
| Image Upload | `ImageUploadClient` | `https://apilayer.com/marketplace/image_upload-api` | 图像优化 | 🔴 需要认证 (apiKey) |
| Wallhaven | `WallhavenClient` | `https://wallhaven.cc/help/api` | 壁纸 | 🔴 需要认证 (apiKey) |
| Sirv | `SirvClient` | `https://apidocs.sirv.com/` | 图像管理解决方案，例如优化、操作、托管 | 🔴 需要认证 (apiKey) |
| Getty Images | `GettyImagesClient` | `http://developers.gettyimages.com/en/` | 使用世界上最强大的图像构建应用程序 | 🔴 需要认证 (OAuth) |
| Unsplash | `UnsplashClient` | `https://unsplash.com/developers` | 摄影 | 🔴 需要认证 (OAuth) |


### Animals

本分类 (**动物**) 共包含 **25** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.animals.AnimalsAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| MeowFacts | `MeowfactsClient` | `https://github.com/wh-iterabb-it/meowfacts` | 获取随机的猫事实 | 🟢 免 Key |
| Movebank | `MovebankClient` | `https://github.com/movebank/movebank-api-doc` | 动物的运动和迁徙数据 | 🟢 免 Key |
| Cat Facts | `CatFactsClient` | `https://catfact.ninja/` | 随机的猫事实 | 🟢 免 Key |
| eBird | `EbirdClient` | `https://documenter.getpostman.com/view/664302/S1ENwy59` | 检索某个区域内最近或值得注意的观鸟观测结果 | 🔴 需要认证 (apiKey) |
| Axolotl | `AxolotlClient` | `https://theaxolotlapi.netlify.app/` | 蝾螈图片和事实的集合 | 🟢 免 Key |
| Dog Facts | `DogFactsClient` | `https://dukengn.github.io/Dog-facts-API/` | 随机狗的事实 | 🟢 免 Key |
| Dog Facts | `DogFactsClient` | `https://kinduff.github.io/dog-api/` | 狗的随机事实 | 🟢 免 Key |
| Petfinder | `PetfinderClient` | `https://www.petfinder.com/developers/` | Petfinder 致力于帮助宠物找到家，这是领养宠物的另一种资源 | 🔴 需要认证 (apiKey) |
| Cat Facts | `CatFactsClient` | `https://alexwohlbruck.github.io/cat-facts/` | 每日猫知识 | 🟢 免 Key |
| AdoptAPet | `AdoptapetClient` | `https://www.adoptapet.com/public/apis/pet_list.html` | 帮助领养宠物的资源 | 🔴 需要认证 (apiKey) |
| Dogs | `DogsClient` | `https://dog.ceo/dog-api/` | 基于斯坦福狗数据集 | 🟢 免 Key |
| HTTP Dog | `HttpDogClient` | `https://http.dog/` | 每个 HTTP 响应状态代码的狗 | 🟢 免 Key |
| HTTP Cat | `HttpCatClient` | `https://http.cat/` | 针对每个 HTTP 状态的 Cat | 🟢 免 Key |
| xeno-canto | `XenoCantoClient` | `https://xeno-canto.org/explore/api` | 鸟类录音 | 🟢 免 Key |
| RandomDuck | `RandomduckClient` | `https://random-d.uk/api` | 鸭子的随机图片 | 🟢 免 Key |
| RandomFox | `RandomfoxClient` | `https://randomfox.ca/floof/` | 狐狸的随机图片 | 🟢 免 Key |
| PlaceDog | `PlacedogClient` | `https://place.dog` | 占位狗图片 | 🟢 免 Key |
| Zoo Animals | `ZooAnimalsClient` | `https://zoo-animal-api.herokuapp.com/` | 动物园动物的事实和图片 | 🟢 免 Key |
| Cataas | `CataasClient` | `https://cataas.com/` | 猫即服务（猫图片和 GIF） | 🟢 免 Key |
| PlaceBear | `PlacebearClient` | `https://placebear.com/` | 占位熊图片 | 🟢 免 Key |
| RandomDog | `RandomdogClient` | `https://random.dog/woof.json` | 狗的随机图片 | 🟢 免 Key |
| Cats | `CatsClient` | `https://docs.thecatapi.com/` | 猫的照片来自Tumblr | 🔴 需要认证 (apiKey) |
| The Dog | `TheDogClient` | `https://thedogapi.com/` | 一项关于狗的公共服务，在制作您喜欢的新应用程序、网站或服务时免费使用 | 🔴 需要认证 (apiKey) |
| FishWatch | `FishwatchClient` | `https://www.fishwatch.gov/developers` | 有关个别鱼类的信息和图片 | 🟢 免 Key |
| RescueGroups | `RescuegroupsClient` | `https://userguide.rescuegroups.org/display/APIDG/API+Developers+Guide+Home` | 领养 | 🟢 免 Key |


### Books

本分类 (**书籍**) 共包含 **24** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.books.BooksAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Crossref Metadata Search | `CrossrefMetadataSearchClient` | `https://github.com/CrossRef/rest-api-doc` | 书籍和文章元数据 | 🟢 免 Key |
| GurbaniNow | `GurbaninowClient` | `https://github.com/GurbaniNow/api` | 快速准确的 Gurbani RESTful API | 🟢 免 Key |
| PoetryDB | `PoetrydbClient` | `https://github.com/thundercomb/poetrydb#readme` | 使您能够从我们庞大的诗歌收藏中获取即时数据 | 🟢 免 Key |
| Quran-api | `QuranApiClient` | `https://github.com/fawazahmed0/quran-api#readme` | 免费的《古兰经》API 服务，包含 90 多种不同语言和 400 多种翻译 | 🟢 免 Key |
| Amanah Sunnah | `AmanahSunnahClient` | `https://sunnah.amanahagent.cloud/developers` | 对《古兰经》、《圣训》、《Tafsir》和 18K+ Rijal 叙述者进行语义搜索 | 🔴 需要认证 (apiKey) |
| Runyankole Bible | `RunyankoleBibleClient` | `https://runyankole-bible-api.vercel.app` | Runyankore-Rukiga 圣经的免费 REST API — 66 本书，31106 节经文 | 🟢 免 Key |
| Open Library | `OpenLibraryClient` | `https://openlibrary.org/developers/api` | 书籍、书籍封面和相关数据 | 🟢 免 Key |
| The Bible | `TheBibleClient` | `https://docs.api.bible` | 圣经中你需要的一切都集中在一个可发现的地方 | 🔴 需要认证 (apiKey) |
| Google Books | `GoogleBooksClient` | `https://developers.google.com/books/` | 书籍 | 🔴 需要认证 (OAuth) |
| Bible-api | `BibleApiClient` | `https://bible-api.com/` | 多种语言的免费圣经 API | 🟢 免 Key |
| Vedic Society | `VedicSocietyClient` | `https://aninditabasu.github.io/indica/html/vs.html` | 吠陀文献中所有名词（名字、地点、动物、事物）的描述 | 🟢 免 Key |
| Thirukkural | `ThirukkuralClient` | `https://api-thirukkural.web.app/` | 1330 首蒂鲁库拉尔诗歌及其泰米尔语和英语解释 | 🟢 免 Key |
| Ganjoor | `GanjoorClient` | `https://api.ganjoor.net` | 经典波斯诗歌作品，包括相关手稿、朗诵和音乐曲目 | 🔴 需要认证 (OAuth) |
| Rig Veda | `RigVedaClient` | `https://aninditabasu.github.io/indica/html/rv.html` | 诸神和诗人，他们的类别，以及韵律，以及曼达尔和苏克塔数 | 🟢 免 Key |
| Gutendex | `GutendexClient` | `https://gutendex.com/` | 用于从古腾堡计划图书图书馆获取数据的 Web-API | 🟢 免 Key |
| Wizard World | `WizardWorldClient` | `https://wizard-world-api.herokuapp.com/swagger/index.html` | 从哈利波特宇宙获取信息 | 🟢 免 Key |
| Urantia Papers | `UrantiaPapersClient` | `https://urantia.dev` | 整个 Urantia 文件的全文+语义搜索，包括音频旁白、实体、翻译 | 🟢 免 Key |
| Bhagavad Gita | `BhagavadGitaClient` | `https://bhagavadgita.io/api` | 薄伽梵歌文本 | 🔴 需要认证 (OAuth) |
| A Bíblia Digital | `ABBliaDigitalClient` | `https://www.abibliadigital.com.br/en` | 不用担心管理多个版本的圣经 | 🔴 需要认证 (apiKey) |
| Bhagavad Gita telugu | `BhagavadGitaTeluguClient` | `https://gita-api.vercel.app` | 泰卢固语和奥迪亚语的薄伽梵歌 API | 🟢 免 Key |
| Penguin Publishing | `PenguinPublishingClient` | `http://www.penguinrandomhouse.biz/webservices/rest/` | 书籍、书籍封面和相关数据 | 🟢 免 Key |
| Wolne Lektury | `WolneLekturyClient` | `https://wolnelektury.pl/api/` | 用于获取 WolneLektury.pl 网站上提供的电子书信息的 API | 🟢 免 Key |
| Quran Cloud | `QuranCloudClient` | `https://alquran.cloud/api` | 一个 RESTful 古兰经 API，用于检索 Ayah、Surah、Juz 或整个神圣古兰经 | 🟢 免 Key |
| Quran | `QuranClient` | `https://quran.api-docs.io/` | 具有多种语言的 RESTful Quran API | 🟢 免 Key |


### Machine Learning

本分类 (**机器学习**) 共包含 **24** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.machinelearning.MachineLearningAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| DeepAI | `DeepaiClient` | `https://deepai.org/` | 提供用于文本生成、图像处理等的人工智能驱动的 API | 🔴 需要认证 (apiKey) |
| AI For Thai | `AiForThaiClient` | `https://aiforthai.in.th/index.php` | 免费各种泰语AI API | 🔴 需要认证 (apiKey) |
| Hugging Face | `HuggingFaceClient` | `https://huggingface.co` | 具有用于 NLP、计算机视觉和音频的推理 API 的 AI 模型中心 | 🔴 需要认证 (apiKey) |
| Groq | `GroqClient` | `https://console.groq.com/docs/quickstart` | 具有免费套餐的快速 AI 推理 API，支持 Llama、Mixtral、Gemma 模型 | 🔴 需要认证 (apiKey) |
| Inferdo | `InferdoClient` | `https://rapidapi.com/user/inferdo` | 计算机视觉服务，例如面部检测、图像标记、NSFW 分类 | 🔴 需要认证 (apiKey) |
| Keen IO | `KeenIoClient` | `https://keen.io/` | 数据分析 | 🔴 需要认证 (apiKey) |
| Clarifai | `ClarifaiClient` | `https://docs.clarifai.com/api-guide/api-overview` | 计算机视觉 | 🔴 需要认证 (OAuth) |
| Cloudmersive | `CloudmersiveClient` | `https://www.cloudmersive.com/image-recognition-and-processing-api` | 图像字幕、人脸识别、NSFW 分类 | 🔴 需要认证 (apiKey) |
| Roboflow Universe | `RoboflowUniverseClient` | `https://universe.roboflow.com` | 预先训练的计算机视觉模型 | 🔴 需要认证 (apiKey) |
| Perspective | `PerspectiveClient` | `https://perspectiveapi.com` | NLP API 返回文本有毒、淫秽、侮辱或威胁的概率 | 🔴 需要认证 (apiKey) |
| EXUDE-API | `ExudeApiClient` | `http://uttesh.com/exude-api/` | 用于从文本数据中过滤停止词、词干词的主要方法 | 🟢 免 Key |
| Time Door | `TimeDoorClient` | `https://timedoor.io` | 时间序列分析 API | 🔴 需要认证 (apiKey) |
| TensorFeed | `TensorfeedClient` | `https://tensorfeed.ai/developers` | 实时人工智能新闻、模型定价、服务状态和代理活动源 | 🟢 免 Key |
| Imagga | `ImaggaClient` | `https://imagga.com/` | 图像识别解决方案，例如标记、视觉搜索、NSFW 审核 | 🔴 需要认证 (apiKey) |
| Dialogflow | `DialogflowClient` | `https://cloud.google.com/dialogflow/docs/` | 自然语言处理 | 🔴 需要认证 (apiKey) |
| WolframAlpha | `WolframalphaClient` | `https://products.wolframalpha.com/api/` | 使用数据和算法提供问题的具体答案 | 🔴 需要认证 (apiKey) |
| Unplugg | `UnpluggClient` | `https://unplu.gg/test_api.html` | 时间序列数据的预测 API | 🔴 需要认证 (apiKey) |
| Deepcode | `DeepcodeClient` | `https://www.deepcode.ai` | 人工智能进行代码审查 | 🟢 免 Key |
| SkyBiometry | `SkybiometryClient` | `https://skybiometry.com/documentation/` | 人脸检测、人脸识别和人脸分组 | 🔴 需要认证 (apiKey) |
| Irisnet | `IrisnetClient` | `https://irisnet.de/api/` | 实时内容审核 API，可实时阻止或模糊不需要的图像 | 🔴 需要认证 (apiKey) |
| Hirak FaceAPI | `HirakFaceapiClient` | `https://faceapi.hirak.site/` | 人脸检测、人脸识别+年龄估计/性别估计，准确，无配额限制 | 🔴 需要认证 (apiKey) |
| Machinetutors | `MachinetutorsClient` | `https://www.machinetutors.com/portfolio/MT_api.html` | AI 解决方案：视频/图像分类和标记、NSFW、图标/图像/音频搜索、NLP | 🔴 需要认证 (apiKey) |
| NLP Cloud | `NlpCloudClient` | `https://nlpcloud.io` | 使用 spaCy 和转换器进行 NER、情感、分类、摘要等的 NLP API | 🔴 需要认证 (apiKey) |
| MessengerX.io | `MessengerxIoClient` | `https://messengerx.rtfd.io` | 一个免费的 API，供开发人员构建基于 ML 的个性化聊天应用程序并从中获利 | 🔴 需要认证 (apiKey) |


### Food & Drink

本分类 (**食品和饮料**) 共包含 **22** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.fooddrink.FoodDrinkAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Foodish | `FoodishClient` | `https://github.com/surhud004/Foodish#readme` | 随意的食物菜肴图片 | 🟢 免 Key |
| The Report of the Week | `TheReportOfTheWeekClient` | `https://github.com/andyklimczak/TheReportOfTheWeek-API` | 食品和饮料评论 | 🟢 免 Key |
| TacoFancy | `TacofancyClient` | `https://github.com/evz/tacofancy-api` | 社区驱动的 taco 数据库 | 🟢 免 Key |
| Open Brewery DB | `OpenBreweryDbClient` | `https://www.openbrewerydb.org` | 啤酒厂、苹果酒店和精酿啤酒瓶店 | 🟢 免 Key |
| What's on the menu? | `WhatSOnTheMenuClient` | `http://nypl.github.io/menus-api/` | 纽约公共图书馆人工转录的历史菜单集 | 🔴 需要认证 (apiKey) |
| Chomp | `ChompClient` | `https://chompthis.com/api/` | 有关各种杂货产品和食品的数据 | 🔴 需要认证 (apiKey) |
| Spoonacular | `SpoonacularClient` | `https://spoonacular.com/food-api` | 食谱、食品和膳食计划 | 🔴 需要认证 (apiKey) |
| BaconMockup | `BaconmockupClient` | `https://baconmockup.com/` | 可调整大小的培根占位符图像 | 🟢 免 Key |
| Coffee | `CoffeeClient` | `https://coffee.alexflipnote.dev/` | 咖啡的随机图片 | 🟢 免 Key |
| Rustybeer | `RustybeerClient` | `https://rustybeer.herokuapp.com/` | 啤酒酿造工具 | 🟢 免 Key |
| TheMealDB | `ThemealdbClient` | `https://www.themealdb.com/api.php` | 膳食食谱 | 🔴 需要认证 (apiKey) |
| Fruityvice | `FruityviceClient` | `https://www.fruityvice.com` | 各类水果数据 | 🟢 免 Key |
| Edamam recipes | `EdamamRecipesClient` | `https://developer.edamam.com/edamam-docs-recipe-api` | 食谱搜索 | 🔴 需要认证 (apiKey) |
| RecipeAPI | `RecipeapiClient` | `https://recipeapi.io` | 食谱、配料、营养数据和烹饪说明 | 🔴 需要认证 (apiKey) |
| Tasty | `TastyClient` | `https://rapidapi.com/apidojo/api/tasty/` | 用于查询有关配方、计划、成分的数据的 API | 🔴 需要认证 (apiKey) |
| Edamam nutrition | `EdamamNutritionClient` | `https://developer.edamam.com/edamam-docs-nutrition-api` | 营养分析 | 🔴 需要认证 (apiKey) |
| TheCocktailDB | `ThecocktaildbClient` | `https://www.thecocktaildb.com/api.php` | 鸡尾酒配方 | 🔴 需要认证 (apiKey) |
| Open Food Facts | `OpenFoodFactsClient` | `https://world.openfoodfacts.org/data` | 食品数据库 | 🟢 免 Key |
| WhiskyHunter | `WhiskyhunterClient` | `https://whiskyhunter.net/api/` | 过往在线威士忌拍卖统计数据 | 🟢 免 Key |
| Untappd | `UntappdClient` | `https://untappd.com/api/docs` | 社交啤酒分享 | 🔴 需要认证 (OAuth) |
| Zestful | `ZestfulClient` | `https://zestfuldata.com/` | 解析食谱成分 | 🔴 需要认证 (apiKey) |
| Kroger | `KrogerClient` | `https://developer.kroger.com/reference` | 超市数据 | 🔴 需要认证 (apiKey) |


### Test Data

本分类 (**测试数据**) 共包含 **20** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.testdata.TestDataAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| JSONPlaceholder | `JsonplaceholderClient` | `http://jsonplaceholder.typicode.com/` | 用于测试和原型设计的虚假数据 | 🟢 免 Key |
| FakeStoreAPI | `FakestoreapiClient` | `https://fakestoreapi.com/` | 适用于您的电子商务或购物网站原型的假商店休息 API | 🟢 免 Key |
| English Random Words | `EnglishRandomWordsClient` | `https://random-words-api.vercel.app/word` | 生成带发音的英语随机单词 | 🟢 免 Key |
| ItsThisForThat | `ItsthisforthatClient` | `https://itsthisforthat.com/api.php` | 产生随机的创业想法 | 🟢 免 Key |
| RandomUser | `RandomuserClient` | `https://randomuser.me` | 生成并列出用户数据 | 🟢 免 Key |
| Mockaroo | `MockarooClient` | `https://www.mockaroo.com/docs` | 生成 JSON、CSV、TXT、SQL 和 XML 格式的虚假数据 | 🔴 需要认证 (apiKey) |
| Mailsac | `MailsacClient` | `https://mailsac.com/docs/api` | 一次性电子邮件 | 🔴 需要认证 (apiKey) |
| UUID Generator | `UuidGeneratorClient` | `https://www.uuidtools.com/docs` | 生成UUID | 🟢 免 Key |
| Bacon Ipsum | `BaconIpsumClient` | `https://baconipsum.com/json-api/` | Meatier Lorem Ipsum 生成器 | 🟢 免 Key |
| This Person Does not Exist | `ThisPersonDoesNotExistClient` | `https://thispersondoesnotexist.com` | 生成不存在的人的真实面孔 | 🟢 免 Key |
| Randommer | `RandommerClient` | `https://randommer.io/randommer-api` | 随机数据生成器 | 🔴 需要认证 (apiKey) |
| Spanish random names | `SpanishRandomNamesClient` | `https://random-names-api.herokuapp.com/public` | 随机生成西班牙名字（带性别） | 🟢 免 Key |
| Dicebear Avatars | `DicebearAvatarsClient` | `https://avatars.dicebear.com/` | 生成随机像素艺术头像 | 🟢 免 Key |
| Spanish random words | `SpanishRandomWordsClient` | `https://palabras-aleatorias-public-api.herokuapp.com` | 随机生成西班牙语单词 | 🟢 免 Key |
| GeneradorDNI | `GeneradordniClient` | `https://api.generadordni.es` | Data generator API. Profiles, vehicles, banks and cards, etc | 🔴 需要认证 (apiKey) |
| Yes No | `YesNoClient` | `https://yesno.wtf/api` | 随机生成是或否 | 🟢 免 Key |
| FakerAPI | `FakerapiClient` | `https://fakerapi.it/en` | 收集API以获取虚假数据 | 🟢 免 Key |
| What The Commit | `WhatTheCommitClient` | `http://whatthecommit.com/index.txt` | 随机提交消息生成器 | 🟢 免 Key |
| RoboHash | `RobohashClient` | `https://robohash.org/` | 生成随机机器人/外星人头像 | 🟢 免 Key |
| FakeJSON | `FakejsonClient` | `https://fakejson.com` | 生成测试数据和虚假数据的服务 | 🔴 需要认证 (apiKey) |


### Anime

本分类 (**动漫**) 共包含 **19** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.anime.AnimeAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| AnimeChan | `AnimechanClient` | `https://github.com/RocktimSaikia/anime-chan` | 动漫台词（超过 10k+） | 🟢 免 Key |
| AniList | `AnilistClient` | `https://github.com/AniList/ApiV2-GraphQL-Docs` | 动漫发现和追踪 | 🔴 需要认证 (OAuth) |
| AnimeFacts | `AnimefactsClient` | `https://chandan-02.github.io/anime-facts-rest-api/` | 动漫事实（超过 100 条） | 🟢 免 Key |
| Danbooru Anime | `DanbooruAnimeClient` | `https://danbooru.donmai.us/wiki_pages/help:api` | 数千动漫艺术家数据库，寻找优秀动漫艺术 | 🔴 需要认证 (apiKey) |
| Trace Moe | `TraceMoeClient` | `https://soruly.github.io/trace.moe-api/#/` | 一个有用的工具，可以从屏幕截图中获取动漫的准确场景 | 🟢 免 Key |
| NekosBest | `NekosbestClient` | `https://docs.nekos.best` | Neko 图像和动漫角色扮演 GIF | 🟢 免 Key |
| Kitsu | `KitsuClient` | `https://kitsu.docs.apiary.io/` | 动漫发现平台 | 🔴 需要认证 (OAuth) |
| AniDB | `AnidbClient` | `https://wiki.anidb.net/HTTP_API_Definition` | 动漫数据库 | 🔴 需要认证 (apiKey) |
| AnimeNewsNetwork | `AnimenewsnetworkClient` | `https://www.animenewsnetwork.com/encyclopedia/api.php` | 动漫行业新闻 | 🟢 免 Key |
| MyAnimeList | `MyanimelistClient` | `https://myanimelist.net/clubs.php?cid=13727` | 动漫数据库和社区 | 🔴 需要认证 (OAuth) |
| MangaDex | `MangadexClient` | `https://api.mangadex.org/docs.html` | 漫画数据库和社区 | 🔴 需要认证 (apiKey) |
| Catboy | `CatboyClient` | `https://catboys.com/api` | Neko 图片、有趣的 GIF 等 | 🟢 免 Key |
| Shikimori | `ShikimoriClient` | `https://shikimori.one/api/doc` | 动漫发现、追踪、论坛、费率 | 🔴 需要认证 (OAuth) |
| Mangapi | `MangapiClient` | `https://rapidapi.com/pierre.carcellermeunier/api/mangapi3/` | 将漫画页面从一种语言翻译成另一种语言 | 🔴 需要认证 (apiKey) |
| Jikan | `JikanClient` | `https://jikan.moe` | 非官方 MyAnimeList API | 🟢 免 Key |
| Studio Ghibli | `StudioGhibliClient` | `https://ghibliapi.herokuapp.com` | 吉卜力工作室电影的资源 | 🟢 免 Key |
| Waifu.pics | `WaifuPicsClient` | `https://waifu.pics/docs` | 动漫图片图片分享平台 | 🟢 免 Key |
| Waifu.im | `WaifuImClient` | `https://waifu.im/docs` | 从包含 4000 多张图像和多个标签的存档中获取 waifu 图片 | 🟢 免 Key |
| AniAPI | `AniapiClient` | `https://aniapi.com/docs/` | 动漫发现、流媒体和与追踪器同步 | 🔴 需要认证 (OAuth) |


### Art & Design

本分类 (**艺术与设计**) 共包含 **19** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.artdesign.ArtDesignAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| EmojiHub | `EmojihubClient` | `https://github.com/cheatsnake/emojihub` | 按类别和组获取表情符号 | 🟢 免 Key |
| Harvard Art Museums | `HarvardArtMuseumsClient` | `https://github.com/harvardartmuseums/api-docs` | 艺术 | 🔴 需要认证 (apiKey) |
| Colormind | `ColormindClient` | `http://colormind.io/api-access/` | 配色方案生成器 | 🟢 免 Key |
| Art Institute of Chicago | `ArtInstituteOfChicagoClient` | `https://api.artic.edu/docs/` | 艺术 | 🟢 免 Key |
| Europeana | `EuropeanaClient` | `https://pro.europeana.eu/resources/apis/search` | 欧洲博物馆和画廊内容 | 🔴 需要认证 (apiKey) |
| Icons8 | `Icons8Client` | `https://img.icons8.com/` | 图标（在页面中找到“搜索图标”超链接） | 🟢 免 Key |
| Metropolitan Museum of Art | `MetropolitanMuseumOfArtClient` | `https://metmuseum.github.io/` | 大都会艺术博物馆 | 🟢 免 Key |
| Icon Horse | `IconHorseClient` | `https://icon.horse` | 任何网站的网站图标，带有后备功能 | 🟢 免 Key |
| ColourLovers | `ColourloversClient` | `http://www.colourlovers.com/api` | 获取各种图案、调色板和图像 | 🟢 免 Key |
| Noun Project | `NounProjectClient` | `http://api.thenounproject.com/index.html` | 图标 | 🔴 需要认证 (OAuth) |
| Lordicon | `LordiconClient` | `https://lordicon.com/` | 带有预先完成的动画的图标 | 🟢 免 Key |
| Cooper Hewitt | `CooperHewittClient` | `https://collection.cooperhewitt.org/api` | 史密森尼设计博物馆 | 🔴 需要认证 (apiKey) |
| Rijksmuseum | `RijksmuseumClient` | `https://data.rijksmuseum.nl/object-metadata/api/` | 国家博物馆数据 | 🔴 需要认证 (apiKey) |
| Word Cloud | `WordCloudClient` | `https://wordcloudapi.com/` | 轻松创建词云 | 🔴 需要认证 (apiKey) |
| Dribbble | `DribbbleClient` | `https://developer.dribbble.com` | 发现世界顶级设计师和创意人士 | 🔴 需要认证 (OAuth) |
| PHP-Noise | `PhpNoiseClient` | `https://php-noise.com/` | 噪声背景图像生成器 | 🟢 免 Key |
| xColors | `XcolorsClient` | `https://x-colors.herokuapp.com/` | 生成和转换颜色 | 🟢 免 Key |
| Pixel Encounter | `PixelEncounterClient` | `https://pixelencounter.com/api` | SVG 图标生成器 | 🟢 免 Key |
| Iconfinder | `IconfinderClient` | `https://developer.iconfinder.com` | 图标 | 🔴 需要认证 (apiKey) |


### Cloud Storage & File Sharing

本分类 (**云存储和文件共享**) 共包含 **18** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.cloudstoragefilesharing.CloudStorageFileSharingAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| FileUp | `FileupClient` | `https://github.com/RealSinaSnp/FileUp` | 具有上传 API、过期时间和查看限制的临时文件托管 | 🟢 免 Key |
| Dropbox | `DropboxClient` | `https://www.dropbox.com/developers` | 文件共享和存储 | 🔴 需要认证 (OAuth) |
| GoFile | `GofileClient` | `https://gofile.io/api` | 免费无限大小文件上传 | 🔴 需要认证 (apiKey) |
| File.io | `FileIoClient` | `https://www.file.io` | 超级简单的文件共享，方便、匿名、安全 | 🟢 免 Key |
| ddownload | `DdownloadClient` | `https://ddownload.com/api` | 文件共享和存储 | 🔴 需要认证 (apiKey) |
| Gyazo | `GyazoClient` | `https://gyazo.com/api/docs` | 立即保存并分享屏幕截图 | 🔴 需要认证 (apiKey) |
| Box | `BoxClient` | `https://developer.box.com/` | 文件共享和存储 | 🔴 需要认证 (OAuth) |
| Pastebin | `PastebinClient` | `https://pastebin.com/doc_api` | 纯文本存储 | 🔴 需要认证 (apiKey) |
| Pinata | `PinataClient` | `https://docs.pinata.cloud/` | IPFS 固定服务 API | 🔴 需要认证 (apiKey) |
| Imgbb | `ImgbbClient` | `https://api.imgbb.com/` | 简单快捷的私密图片分享 | 🔴 需要认证 (apiKey) |
| Google Drive | `GoogleDriveClient` | `https://developers.google.com/drive/` | 文件共享和存储 | 🔴 需要认证 (OAuth) |
| The Null Pointer | `TheNullPointerClient` | `https://0x0.st` | 没有废话的文件托管和 URL 缩短服务 | 🟢 免 Key |
| Quip | `QuipClient` | `https://quip.com/dev/automation/documentation` | 群组文件共享和存储 | 🔴 需要认证 (apiKey) |
| Pantry | `PantryClient` | `https://getpantry.cloud/` | 小型项目的免费 JSON 存储 | 🟢 免 Key |
| Filestack | `FilestackClient` | `https://www.filestack.com` | Filestack 文件上传器和文件上传 API | 🔴 需要认证 (apiKey) |
| OneDrive | `OnedriveClient` | `https://developer.microsoft.com/onedrive` | 文件共享和存储 | 🔴 需要认证 (OAuth) |
| Storj | `StorjClient` | `https://docs.storj.io/dcs/` | 去中心化开源云存储 | 🔴 需要认证 (apiKey) |
| Web3 Storage | `Web3StorageClient` | `https://web3.storage/` | 1TB 空间免费文件共享和存储 | 🔴 需要认证 (apiKey) |


### Email

本分类 (**电子邮件**) 共包含 **18** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.email.EmailAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Email Validation | `EmailValidationClient` | `https://www.abstractapi.com/email-verification-validation-api` | 验证电子邮件地址的可送达性和垃圾邮件 | 🔴 需要认证 (apiKey) |
| Cloudmersive Validate | `CloudmersiveValidateClient` | `https://cloudmersive.com/validate-api` | 验证电子邮件地址、电话号码、增值税号码和域名 | 🔴 需要认证 (apiKey) |
| EmailJS | `EmailjsClient` | `https://www.emailjs.com/docs/` | 直接从客户端 JavaScript 发送电子邮件，无需后端服务器 | 🔴 需要认证 (apiKey) |
| mail.tm | `MailTmClient` | `https://docs.mail.tm` | 临时电子邮件服务 | 🟢 免 Key |
| mail.gw | `MailGwClient` | `https://docs.mail.gw` | 10 分钟邮件 | 🟢 免 Key |
| mailboxlayer | `MailboxlayerClient` | `https://mailboxlayer.com?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 电子邮件地址验证 | 🔴 需要认证 (apiKey) |
| Guerrilla Mail | `GuerrillaMailClient` | `https://www.guerrillamail.com/GuerrillaMailAPI.html` | 一次性临时电子邮件地址 | 🟢 免 Key |
| Mailtrap | `MailtrapClient` | `https://mailtrap.docs.apiary.io/#` | 用于安全测试从开发和暂存环境发送的电子邮件的服务 | 🔴 需要认证 (apiKey) |
| DropMail | `DropmailClient` | `https://dropmail.me/api/#live-demo` | 用于创建和管理临时电子邮件收件箱的 GraphQL API | 🟢 免 Key |
| Kickbox | `KickboxClient` | `https://open.kickbox.com/` | 邮箱验证API | 🟢 免 Key |
| ImprovMX | `ImprovmxClient` | `https://improvmx.com/api` | 免费电子邮件转发服务的 API | 🔴 需要认证 (apiKey) |
| MailboxValidator | `MailboxvalidatorClient` | `https://www.mailboxvalidator.com/api-email-free` | 验证电子邮件地址以提高送达率 | 🔴 需要认证 (apiKey) |
| Disify | `DisifyClient` | `https://www.disify.com/` | 验证并检测一次性和临时电子邮件地址 | 🟢 免 Key |
| PostStack | `PoststackClient` | `https://poststack.dev/docs` | 欧盟托管的电子邮件 API，用于交易和营销电子邮件，包含联系人、广播和分析 | 🔴 需要认证 (apiKey) |
| MailCheck.ai | `MailcheckAiClient` | `https://www.mailcheck.ai/#documentation` | 防止用户使用临时电子邮件地址注册 | 🟢 免 Key |
| Sendgrid | `SendgridClient` | `https://docs.sendgrid.com/api-reference/` | 基于云的 SMTP 提供商，让您无需维护电子邮件服务器即可发送电子邮件 | 🔴 需要认证 (apiKey) |
| Verifier | `VerifierClient` | `https://verifier.meetchopra.com/docs#/` | 验证给定的电子邮件是否真实 | 🔴 需要认证 (apiKey) |
| Sendinblue | `SendinblueClient` | `https://developers.sendinblue.com/docs` | 提供与营销和/或交易电子邮件和/或 SMS 相关的解决方案的服务 | 🔴 需要认证 (apiKey) |


### Jobs

本分类 (**工作机会**) 共包含 **18** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.jobs.JobsAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Open Skills | `OpenSkillsClient` | `https://github.com/workforce-data-initiative/skills-api/wiki/API-Overview` | 职位名称、技能和相关职位数据 | 🟢 免 Key |
| Jooble | `JoobleClient` | `https://jooble.org/api/about` | 职位搜索引擎 | 🔴 需要认证 (apiKey) |
| ZipRecruiter | `ZiprecruiterClient` | `https://www.ziprecruiter.com/publishers` | 求职应用程序和网站 | 🔴 需要认证 (apiKey) |
| Arbeitsamt | `ArbeitsamtClient` | `https://jobsuche.api.bund.dev/` | 德国求职板聚合器“Arbeitsamt”的 API | 🔴 需要认证 (OAuth) |
| Careerjet | `CareerjetClient` | `https://www.careerjet.com/partners/api/` | 职位搜索引擎 | 🔴 需要认证 (apiKey) |
| HeroHunt People Search | `HerohuntPeopleSearchClient` | `https://www.herohunt.ai/people-search-api` | 在 LinkedIn 和 GitHub 上搜索 10 亿人的个人资料以寻找人才 | 🔴 需要认证 (apiKey) |
| Arbeitnow | `ArbeitnowClient` | `https://documenter.getpostman.com/view/18545278/UVJbJdKh` | 欧洲/远程求职板聚合器 API | 🟢 免 Key |
| Juju | `JujuClient` | `http://www.juju.com/publisher/spec/` | 职位搜索引擎 | 🔴 需要认证 (apiKey) |
| Reed | `ReedClient` | `https://www.reed.co.uk/developers` | 工作板聚合器 | 🔴 需要认证 (apiKey) |
| Findwork | `FindworkClient` | `https://findwork.dev/developers/` | 求职板 | 🔴 需要认证 (apiKey) |
| AI Dev Jobs | `AiDevJobsClient` | `https://aidevboard.com/openapi.yaml` | 具有 REST、RSS 和 MCP 端点的 AI/ML 工程作业聚合器 | 🟢 免 Key |
| Upwork | `UpworkClient` | `https://developers.upwork.com/` | 自由职业委员会和管理系统 | 🔴 需要认证 (OAuth) |
| Adzuna | `AdzunaClient` | `https://developer.adzuna.com/overview` | 工作板聚合器 | 🔴 需要认证 (apiKey) |
| The Muse | `TheMuseClient` | `https://www.themuse.com/developers/api/v2` | 工作委员会和公司简介 | 🔴 需要认证 (apiKey) |
| WhatJobs | `WhatjobsClient` | `https://www.whatjobs.com/affiliates` | 职位搜索引擎 | 🔴 需要认证 (apiKey) |
| USAJOBS | `UsajobsClient` | `https://developer.usajobs.gov/` | 美国政府职位委员会 | 🔴 需要认证 (apiKey) |
| Jobs2Careers | `Jobs2CareersClient` | `http://api.jobs2careers.com/api/spec.pdf` | 职位聚合器 | 🔴 需要认证 (apiKey) |
| DevITjobs UK | `DevitjobsUkClient` | `https://devitjobs.uk/job_feed.xml` | 使用 GraphQL 的工作 | 🟢 免 Key |


### News

本分类 (**新闻动态**) 共包含 **18** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.news.NewsAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Feedbin | `FeedbinClient` | `https://github.com/feedbin/feedbin-api` | RSS阅读器 | 🔴 需要认证 (OAuth) |
| Florida Man | `FloridaManClient` | `https://github.com/juliayxhuang/florida-man-api#readme` | 按日期列出 10,000 多个佛罗里达男子头条新闻的静态 JSON 数据集 | 🟢 免 Key |
| Inshorts News | `InshortsNewsClient` | `https://github.com/cyberboysumanjay/Inshorts-News-API` | 提供来自 inshorts 的新闻 | 🟢 免 Key |
| The Old Reader | `TheOldReaderClient` | `https://github.com/theoldreader/api` | RSS阅读器 | 🔴 需要认证 (apiKey) |
| New York Times | `NewYorkTimesClient` | `https://developer.nytimes.com/` | 纽约时报开发者网络 | 🔴 需要认证 (apiKey) |
| News | `NewsClient` | `https://newsapi.org/` | 目前在一系列新闻来源和博客上发布的头条新闻 | 🔴 需要认证 (apiKey) |
| Spaceflight News | `SpaceflightNewsClient` | `https://spaceflightnewsapi.net` | 航天相关新闻🚀 | 🟢 免 Key |
| GNews | `GnewsClient` | `https://gnews.io/` | 从各种来源搜索新闻 | 🔴 需要认证 (apiKey) |
| Associated Press | `AssociatedPressClient` | `https://developer.ap.org/` | 搜索美联社的新闻和元数据 | 🔴 需要认证 (apiKey) |
| Trove | `TroveClient` | `https://trove.nla.gov.au/about/create-something/using-api` | 搜索澳大利亚国家图书馆收藏的数千份数字化报纸 | 🔴 需要认证 (apiKey) |
| Mediastack | `MediastackClient` | `https://mediastack.com?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 用于实时新闻和博客文章的免费、简单的 REST API | 🔴 需要认证 (apiKey) |
| NewsX | `NewsxClient` | `https://rapidapi.com/machaao-inc-machaao-inc-default/api/newsx/` | 使用 ML 支持的摘要获取或搜索最新突发新闻 🤖 | 🔴 需要认证 (apiKey) |
| Currents | `CurrentsClient` | `https://currentsapi.services/` | 具有多语言支持的实时和历史全球新闻 | 🔴 需要认证 (apiKey) |
| Chronicling America | `ChroniclingAmericaClient` | `http://chroniclingamerica.loc.gov/about/api/` | 提供从国会图书馆获取数百万页美国历史报纸的权限 | 🟢 免 Key |
| MarketAux | `MarketauxClient` | `https://www.marketaux.com/` | 带有标记的股票市场新闻 + 情绪和统计 JSON API | 🔴 需要认证 (apiKey) |
| NewsData | `NewsdataClient` | `https://newsdata.io/docs` | 新闻数据 API，用于来自知名新闻来源的实时突发新闻和头条新闻 | 🔴 需要认证 (apiKey) |
| TheNews | `ThenewsClient` | `https://www.thenewsapi.com/` | 聚合头条新闻、头条新闻和实时新闻 JSON API | 🔴 需要认证 (apiKey) |
| The Guardian | `TheGuardianClient` | `http://open-platform.theguardian.com/` | 访问卫报创建的所有内容，按标签和部分分类 | 🔴 需要认证 (apiKey) |


### Personality

本分类 (**个性**) 共包含 **18** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.personality.PersonalityAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Dictum | `DictumClient` | `https://github.com/fisenkodv/dictum` | API 可获取人类最鼓舞人心的表达方式的集合 | 🟢 免 Key |
| Quotable Quotes | `QuotableQuotesClient` | `https://github.com/lukePeavey/quotable` | Quotable 是一个免费、开源的报价 API | 🟢 免 Key |
| Programming Quotes | `ProgrammingQuotesClient` | `https://github.com/skolakoda/programming-quotes-api` | 开源项目的编程报价 API | 🟢 免 Key |
| Medium | `MediumClient` | `https://github.com/Medium/medium-api-docs` | 提供独特观点的读者和作家社区 | 🔴 需要认证 (OAuth) |
| Stoicism Quote | `StoicismQuoteClient` | `https://github.com/tlcheah2/stoic-quote-lambda-public-api` | 关于斯多葛主义的名言 | 🟢 免 Key |
| Dev.to | `DevToClient` | `https://developers.forem.com/api` | 通过 API 访问 Forem 文章、用户和其他资源 | 🔴 需要认证 (apiKey) |
| Udemy(instructor) | `UdemyInstructorClient` | `https://www.udemy.com/developers/instructor/` | Udemy 讲师 API | 🔴 需要认证 (apiKey) |
| icanhazdadjoke | `IcanhazdadjokeClient` | `https://icanhazdadjoke.com/api` | 互联网上最多的爸爸笑话精选 | 🟢 免 Key |
| Quotes on Design | `QuotesOnDesignClient` | `https://quotesondesign.com/api/` | 励志名言 | 🟢 免 Key |
| kimiquotes | `KimiquotesClient` | `https://kimiquotes.herokuapp.com/doc` | 芬兰 F1 传奇人物基米·莱科宁 (Kimi Räikkönen) 的车队广播和采访引述 | 🟢 免 Key |
| FavQs.com | `FavqsComClient` | `https://favqs.com/api` | FavQs 可让您收集、发现和分享您最喜欢的名言 | 🔴 需要认证 (apiKey) |
| Traitify | `TraitifyClient` | `https://app.traitify.com/developer` | 评估、收集和分析人格 | 🟢 免 Key |
| quoteclear | `QuoteclearClient` | `https://quoteclear.web.app/` | 詹姆斯·克利尔 (James Clear) 引用 3-2-1 时事通讯的内容不断增加 | 🟢 免 Key |
| They Said So Quotes | `TheySaidSoQuotesClient` | `https://theysaidso.com/api/` | 行情 受到全球众多财富品牌的信赖 | 🟢 免 Key |
| Advice Slip | `AdviceSlipClient` | `http://api.adviceslip.com/` | 生成随机建议单 | 🟢 免 Key |
| kanye.rest | `KanyeRestClient` | `https://kanye.rest` | 用于随机 Kanye West 报价的 REST API | 🟢 免 Key |
| FOAAS | `FoaasClient` | `http://www.foaas.com/` | 作为一项服务去他妈的 | 🟢 免 Key |
| Zen Quotes | `ZenQuotesClient` | `https://zenquotes.io/` | 大量禅宗名言以获取灵感 | 🟢 免 Key |


### URL Shorteners

本分类 (**网址缩短器**) 共包含 **18** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.urlshorteners.UrlShortenersAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| 1pt | `Api1PtClient` | `https://github.com/1pt-co/api/blob/main/README.md` | 一个简单的 URL 缩短器 | 🟢 免 Key |
| GoTiny | `GotinyClient` | `https://github.com/robvanbakel/gotiny-api` | 轻量级 URL 缩短器，专注于开发人员和最终用户的易用性 | 🟢 免 Key |
| Git.io | `GitIoClient` | `https://github.blog/2011-11-10-git-io-github-url-shortener/` | Git.io URL 缩短器 | 🟢 免 Key |
| Short Link | `ShortLinkClient` | `https://github.com/FayasNoushad/Short-Link-API` | 短网址支持如此多的域名 | 🟢 免 Key |
| Cutt.ly | `CuttLyClient` | `https://cutt.ly/api-documentation/cuttly-links-api` | URL缩短服务 | 🔴 需要认证 (apiKey) |
| Free Url Shortener | `FreeUrlShortenerClient` | `https://ulvis.net/developer.html` | 免费 URL 缩短器提供强大的 API 来与其他网站交互 | 🟢 免 Key |
| TinyURL | `TinyurlClient` | `https://tinyurl.com/app/dev` | 缩短长网址 | 🔴 需要认证 (apiKey) |
| Clico | `ClicoClient` | `https://cli.com/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config` | URL缩短服务 | 🔴 需要认证 (apiKey) |
| Shrtcode | `ShrtcodeClient` | `https://shrtco.de/docs` | 具有多个域的 URl 缩短器 | 🟢 免 Key |
| owo | `OwoClient` | `https://owo.vc/api` | 一个简单的链接混淆器/缩短器 | 🟢 免 Key |
| CleanURI | `CleanuriClient` | `https://cleanuri.com/docs` | URL缩短服务 | 🟢 免 Key |
| Bitly | `BitlyClient` | `http://dev.bitly.com/get_started.html` | URL 缩短器和链接管理 | 🔴 需要认证 (OAuth) |
| Rebrandly | `RebrandlyClient` | `https://developers.rebrandly.com/v1/docs` | 用于共享品牌链接的自定义 URL 缩短器 | 🔴 需要认证 (apiKey) |
| Mgnet.me | `MgnetMeClient` | `http://mgnet.me/api.html` | Torrent URL 缩短 API | 🟢 免 Key |
| Shrtlnk | `ShrtlnkClient` | `https://shrtlnk.dev/developer` | 简单高效的短链接创建 | 🔴 需要认证 (apiKey) |
| UrlBae | `UrlbaeClient` | `https://urlbae.com/developers` | 简单高效的短链接创建 | 🔴 需要认证 (apiKey) |
| RedirHub | `RedirhubClient` | `https://redirhub.com` | 使用自定义域、HTTPS、分析和 REST API 进行 URL 重定向管理 | 🔴 需要认证 (apiKey) |
| Drivet URL Shortener | `DrivetUrlShortenerClient` | `https://wiki.drivet.xyz/en/url-shortener/add-links` | 轻松快速地缩短长网址 | 🟢 免 Key |


### Business

本分类 (**商务**) 共包含 **17** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.business.BusinessAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| mailjet | `MailjetClient` | `https://www.mailjet.com/` | 可以发送营销电子邮件，并且可以使用 API 发送以 MJML 或 HTML 制作的邮件模板 | 🔴 需要认证 (apiKey) |
| Mailchimp | `MailchimpClient` | `https://mailchimp.com/developer/` | 发送营销活动和交易邮件 | 🔴 需要认证 (apiKey) |
| Instatus | `InstatusClient` | `https://instatus.com/help/api` | 通过 HTTP REST API 在状态页面上发布和更新维护和事件 | 🔴 需要认证 (apiKey) |
| Apache Superset | `ApacheSupersetClient` | `https://superset.apache.org/docs/api` | 用于在 Superset 上管理 BI 仪表板和数据源的 API | 🔴 需要认证 (apiKey) |
| Google Analytics | `GoogleAnalyticsClient` | `https://developers.google.com/analytics/` | 收集、配置和分析您的数据以吸引合适的受众 | 🔴 需要认证 (OAuth) |
| Domainsdb.info | `DomainsdbInfoClient` | `https://domainsdb.info/` | 注册域名搜索 | 🟢 免 Key |
| Gmail | `GmailClient` | `https://developers.google.com/gmail/api/` | 灵活、RESTful 访问用户收件箱 | 🔴 需要认证 (OAuth) |
| Square | `SquareClient` | `https://developer.squareup.com/reference/square` | 轻松付款、管理退款并帮助客户在线结帐 | 🔴 需要认证 (OAuth) |
| Freelancer | `FreelancerClient` | `https://developers.freelancer.com` | 雇用自由职业者来完成工作 | 🔴 需要认证 (OAuth) |
| Tomba email finder | `TombaEmailFinderClient` | `https://tomba.io/api` | 用于 B2B 销售和电子邮件营销的电子邮件查找器以及电子邮件验证器 | 🔴 需要认证 (apiKey) |
| Redash | `RedashClient` | `https://redash.io/help/user-guide/integrations-and-api/api` | 在 Redash 上访问您的查询和仪表板 | 🔴 需要认证 (apiKey) |
| markerapi | `MarkerapiClient` | `https://markerapi.com` | 商标检索 | 🟢 免 Key |
| Trello | `TrelloClient` | `https://developers.trello.com/` | 帮助您组织项目并确定项目优先级的看板、列表和卡片 | 🔴 需要认证 (OAuth) |
| Smartsheet | `SmartsheetClient` | `https://smartsheet.redoc.ly/` | 允许您以编程方式访问 Smartsheet 数据和帐户信息 | 🔴 需要认证 (OAuth) |
| Charity Search | `CharitySearchClient` | `http://charityapi.orghunter.com/` | 非营利慈善数据 | 🔴 需要认证 (apiKey) |
| SwiftKanban | `SwiftkanbanClient` | `https://www.digite.com/knowledge-base/swiftkanban/article/api-for-swift-kanban-web-services/#restapi` | 看板软件，可视化工作，增加组织的交付时间、吞吐量和生产力 | 🔴 需要认证 (apiKey) |
| Clearbit Logo | `ClearbitLogoClient` | `https://clearbit.com/docs#logo-api` | 搜索公司徽标并将其嵌入您的项目中 | 🔴 需要认证 (apiKey) |


### Currency Exchange

本分类 (**货币兑换**) 共包含 **17** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.currencyexchange.CurrencyExchangeAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Currency-api | `CurrencyApiClient` | `https://github.com/fawazahmed0/currency-api#readme` | 免费货币汇率 API，支持 150 多种货币且无汇率限制 | 🟢 免 Key |
| ExchangeRate-API | `ExchangerateApiClient` | `https://www.exchangerate-api.com` | 免费货币兑换 | 🔴 需要认证 (apiKey) |
| Currencylayer | `CurrencylayerClient` | `https://currencylayer.com?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 汇率和货币换算 | 🔴 需要认证 (apiKey) |
| CurrencyFreaks | `CurrencyfreaksClient` | `https://currencyfreaks.com/` | 通过每月 1K 请求的免费计划提供当前和历史货币汇率 | 🔴 需要认证 (apiKey) |
| Exchangeratesapi.io | `ExchangeratesapiIoClient` | `https://exchangeratesapi.io?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 汇率与货币换算 | 🔴 需要认证 (apiKey) |
| Exchangerate.host | `ExchangerateHostClient` | `https://exchangerate.host?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 免费外汇和加密货币汇率 API | 🟢 免 Key |
| Czech National Bank | `CzechNationalBankClient` | `https://www.cnb.cz/cs/financni_trhy/devizovy_trh/kurzy_devizoveho_trhu/denni_kurz.xml` | 汇率集合 | 🟢 免 Key |
| Fixer | `FixerClient` | `https://fixer.io?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 汇率和货币换算 | 🔴 需要认证 (apiKey) |
| VATComply.com | `VatcomplyComClient` | `https://www.vatcomply.com/documentation` | 汇率、地理位置和增值税号验证 | 🟢 免 Key |
| Amdoren | `AmdorenClient` | `https://www.amdoren.com/currency-api/` | 包含超过 150 种货币的免费货币 API | 🔴 需要认证 (apiKey) |
| Bank of Russia | `BankOfRussiaClient` | `https://www.cbr.ru/development/SXML/` | 汇率和货币换算 | 🟢 免 Key |
| 1Forge | `Api1ForgeClient` | `https://1forge.com/forex-data-api/api-documentation` | 外汇货币市场数据 | 🔴 需要认证 (apiKey) |
| paralelo.bo | `ParaleloBoClient` | `https://paralelo.bo/api` | 玻利维亚平行市场 USD/BOB 汇率，每 60 秒从 P2P 来源汇总一次 | 🟢 免 Key |
| National Bank of Poland | `NationalBankOfPolandClient` | `http://api.nbp.pl/en.html` | 货币汇率集合（XML 和 JSON 格式的数据） | 🟢 免 Key |
| CurrencyScoop | `CurrencyscoopClient` | `https://currencyscoop.com/api-documentation` | 实时和历史货币汇率 JSON API | 🔴 需要认证 (apiKey) |
| Frankfurter | `FrankfurterClient` | `https://www.frankfurter.app/docs` | 汇率、货币换算和时间序列 | 🟢 免 Key |
| Economia.Awesome | `EconomiaAwesomeClient` | `https://docs.awesomeapi.com.br/api-de-moedas` | 葡萄牙语自由货币价格和转换，无汇率限制 | 🟢 免 Key |


### Text Analysis

本分类 (**文本分析**) 共包含 **15** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.textanalysis.TextAnalysisAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Cloudmersive Natural Language Processing | `CloudmersiveNaturalLanguageProcessingClient` | `https://www.cloudmersive.com/nlp-api` | 自然语言处理和文本分析 | 🔴 需要认证 (apiKey) |
| Code Detection | `CodeDetectionClient` | `https://codedetectionapi.runtime.dev` | 检测、标记、格式化和丰富应用程序或数据管道中的代码 | 🔴 需要认证 (OAuth) |
| Audexum | `AudexumClient` | `https://audexum.com/docs` | 具有 43 种语音和 33 种语言的文本转语音 REST API | 🔴 需要认证 (apiKey) |
| Lecto Translation | `LectoTranslationClient` | `https://rapidapi.com/lecto-lecto-default/api/lecto-translation/` | 翻译 API 免费且价格合理 | 🔴 需要认证 (apiKey) |
| Detect Language | `DetectLanguageClient` | `https://detectlanguage.com/` | 检测文本语言 | 🔴 需要认证 (apiKey) |
| GeoScore | `GeoscoreClient` | `https://geoscoreapi.com` | 使用 0-100 GEO 分数和 8 个结构指标对 AI 搜索引文准备情况的内容进行评分 | 🔴 需要认证 (apiKey) |
| apilayer languagelayer | `ApilayerLanguagelayerClient` | `https://languagelayer.com/` | 语言检测 JSON API 支持 173 种语言 | 🔴 需要认证 (OAuth) |
| ELI | `EliClient` | `https://nlp.insightera.co.th/docs/v1.0` | 泰语自然语言处理工具 | 🔴 需要认证 (apiKey) |
| Google Cloud Natural | `GoogleCloudNaturalClient` | `https://cloud.google.com/natural-language/docs/` | 自然语言理解技术，包括情感、实体和语法分析 | 🔴 需要认证 (apiKey) |
| LibreTranslate | `LibretranslateClient` | `https://libretranslate.com/docs` | 具有 17 种可用语言的翻译工具 | 🟢 免 Key |
| Tisane | `TisaneClient` | `https://tisane.ai/` | 文本分析，重点检测滥用内容和执法应用程序 | 🔴 需要认证 (OAuth) |
| Watson Natural Language Understanding | `WatsonNaturalLanguageUnderstandingClient` | `https://cloud.ibm.com/apidocs/natural-language-understanding/natural-language-understanding` | 用于高级文本分析的自然语言处理 | 🔴 需要认证 (OAuth) |
| Semantria | `SemantriaClient` | `https://semantria.readme.io/docs` | 具有情感分析、分类和命名实体提取的文本分析 | 🔴 需要认证 (OAuth) |
| Hirak OCR | `HirakOcrClient` | `https://ocr.hirak.site/` | 图片转文字-文字识别-从图片100多种语言，精准，无限请求 | 🔴 需要认证 (apiKey) |
| Hirak Translation | `HirakTranslationClient` | `https://translate.hirak.site/` | 在 21 种最常用语言之间进行翻译，准确，无限制的请求 | 🔴 需要认证 (apiKey) |


### Anti-Malware

本分类 (**反恶意软件**) 共包含 **14** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.antimalware.AntiMalwareAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| MalwareBazaar | `MalwarebazaarClient` | `https://bazaar.abuse.ch/api/` | 收集并共享恶意软件样本 | 🔴 需要认证 (apiKey) |
| Web of Trust | `WebOfTrustClient` | `https://support.mywot.com/hc/en-us/sections/360004477734-API-` | IP/域名/URL 信誉 | 🔴 需要认证 (apiKey) |
| VirusTotal | `VirustotalClient` | `https://docs.virustotal.com/reference/overview` | VirusTotal 文件/URL 分析 | 🔴 需要认证 (apiKey) |
| Google Safe Browsing | `GoogleSafeBrowsingClient` | `https://developers.google.com/safe-browsing/` | Google 链接/域标记 | 🔴 需要认证 (apiKey) |
| CAPEsandbox | `CapesandboxClient` | `https://capev2.readthedocs.io/en/latest/usage/api.html` | 恶意软件执行和分析 | 🔴 需要认证 (apiKey) |
| AbuseIPDB | `AbuseipdbClient` | `https://docs.abuseipdb.com/` | IP/域名/URL 信誉 | 🔴 需要认证 (apiKey) |
| URLhaus | `UrlhausClient` | `https://urlhaus-api.abuse.ch/` | 批量查询和下载恶意软件样本 | 🟢 免 Key |
| AlienVault Open Threat Exchange (OTX) | `AlienvaultOpenThreatExchangeOtxClient` | `https://otx.alienvault.com/api` | IP/域名/URL 信誉 | 🔴 需要认证 (apiKey) |
| NoPhishy | `NophishyClient` | `https://rapidapi.com/Amiichu/api/exerra-phishing-check/` | 检查链接以查看它们是否是已知的网络钓鱼尝试 | 🔴 需要认证 (apiKey) |
| MalShare | `MalshareClient` | `https://malshare.com/doc.php` | 恶意软件档案/文件来源 | 🔴 需要认证 (apiKey) |
| URLScan.io | `UrlscanIoClient` | `https://urlscan.io/about-api/` | 扫描并分析 URL | 🔴 需要认证 (apiKey) |
| MalDatabase | `MaldatabaseClient` | `https://maldatabase.com/api-doc.html` | 提供恶意软件数据集和威胁情报源 | 🔴 需要认证 (apiKey) |
| Metacert | `MetacertClient` | `https://metacert.com/` | Metacert 链接标记 | 🔴 需要认证 (apiKey) |
| Scanii | `ScaniiClient` | `https://docs.scanii.com/` | 简单的 REST API，可以扫描提交的文档/文件是否存在威胁 | 🔴 需要认证 (apiKey) |


### Calendar

本分类 (**日历**) 共包含 **14** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.calendar.CalendarAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Non-Working Days | `NonWorkingDaysClient` | `https://github.com/gadael/icsdb` | 非工作日 ICS 文件数据库 | 🟢 免 Key |
| Russian Calendar | `RussianCalendarClient` | `https://github.com/egno/work-calendar` | 检查日期是否是俄罗斯假期 | 🟢 免 Key |
| Nager.Date | `NagerDateClient` | `https://date.nager.at` | 90多个国家的公共假期 | 🟢 免 Key |
| UK Bank Holidays | `UkBankHolidaysClient` | `https://www.gov.uk/bank-holidays.json` | 英格兰和威尔士、苏格兰和北爱尔兰的银行假期 | 🟢 免 Key |
| Calendarific | `CalendarificClient` | `https://calendarific.com/` | 全球假期 | 🔴 需要认证 (apiKey) |
| Czech Namedays Calendar | `CzechNamedaysCalendarClient` | `https://svatky.adresa.info` | 查找姓名并返回命名日日期 | 🟢 免 Key |
| Holidays | `HolidaysClient` | `https://holidayapi.com/` | 有关假期的历史数据 | 🔴 需要认证 (apiKey) |
| Google Calendar | `GoogleCalendarClient` | `https://developers.google.com/google-apps/calendar/` | 显示、创建和修改 Google 日历事件 | 🔴 需要认证 (OAuth) |
| Namedays Calendar | `NamedaysCalendarClient` | `https://nameday.abalin.net` | 提供多个国家的命名日 | 🟢 免 Key |
| Public Holidays | `PublicHolidaysClient` | `https://www.abstractapi.com/holidays-api` | 通过 API 获取有关国家、地区和宗教节日的数据 | 🔴 需要认证 (apiKey) |
| Hebrew Calendar | `HebrewCalendarClient` | `https://www.hebcal.com/home/developer-apis` | 在公历和希伯来语之间转换，获取安息日和假日时间等 | 🟢 免 Key |
| Checkiday - National Holiday | `CheckidayNationalHolidayClient` | `https://apilayer.com/marketplace/checkiday-api` | 行业领先的假期数据，包含 5,000 多个假期和数千种描述 | 🔴 需要认证 (apiKey) |
| LectServe | `LectserveClient` | `http://www.lectserve.com` | 新教礼拜日历 | 🟢 免 Key |
| Non-Working Days | `NonWorkingDaysClient` | `https://isdayoff.ru` | 简单的 REST API，用于检查俄罗斯、独联体、美国和其他国家的工作时间、非工作时间或短天数 | 🟢 免 Key |


### Entertainment

本分类 (**娱乐**) 共包含 **14** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.entertainment.EntertainmentAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Corporate Buzz Words | `CorporateBuzzWordsClient` | `https://github.com/sameerkumar18/corporate-bs-generator-api` | 用于企业流行语的 REST API | 🟢 免 Key |
| NaMoMemes | `NamomemesClient` | `https://github.com/theIYD/NaMoMemes` | 关于纳伦德拉·莫迪的模因 | 🟢 免 Key |
| Yo Momma Jokes | `YoMommaJokesClient` | `https://github.com/beanboi7/yomomma-apiv2` | Yo Momma 笑话的 REST API | 🟢 免 Key |
| Techy | `TechyClient` | `https://techy-api.vercel.app/` | JSON 和纯文本 API，用于听起来技术精湛的短语 | 🟢 免 Key |
| Imgflip | `ImgflipClient` | `https://imgflip.com/api` | 获取一系列流行的模因 | 🟢 免 Key |
| justmeme.wtf | `JustmemeWtfClient` | `https://justmeme.wtf/api-docs` | 免费 meme API，包含 2400 多个模板、搜索、趋势和 AI 生成 | 🟢 免 Key |
| Anycrap | `AnycrapClient` | `https://anycrap.shop/developers` | 超过 35,000 个 AI 生成的荒诞产品概念，包含名称、描述和图像 | 🔴 需要认证 (apiKey) |
| Meme Maker | `MemeMakerClient` | `https://mememaker.github.io/API/` | 用于创建您自己的 meme 的 REST API | 🟢 免 Key |
| Excuser | `ExcuserClient` | `https://excuser.herokuapp.com/` | 为各种情况找随机的借口 | 🟢 免 Key |
| chucknorris.io | `ChucknorrisIoClient` | `https://api.chucknorris.io` | 用于手工策划 Chuck Norris 笑话的 JSON API | 🟢 免 Key |
| Memesio | `MemesioClient` | `https://memesio.com/developers/api` | 具有模板、可编辑标题和托管共享链接的 Meme 创建 API | 🟢 免 Key |
| TasteDive | `TastediveClient` | `https://tastedive.com/read/api` | 基于内容的电影、音乐、电视节目、书籍、游戏和播客推荐 | 🔴 需要认证 (apiKey) |
| Random Useless Facts | `RandomUselessFactsClient` | `https://uselessfacts.jsph.pl/` | 获取无用但真实的事实 | 🟢 免 Key |
| Fun Fact | `FunFactClient` | `https://api.aakhilv.me` | 一个简单的 HTTPS api，可以从 FFA 数据库中随机选择并返回事实 | 🟢 免 Key |


### Environment

本分类 (**环境**) 共包含 **14** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.environment.EnvironmentAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| IQAir | `IqairClient` | `https://www.iqair.com/air-pollution-data-api` | 空气质量和天气数据 | 🔴 需要认证 (apiKey) |
| OpenAQ | `OpenaqClient` | `https://docs.openaq.org/` | 露天空气质量数据 | 🔴 需要认证 (apiKey) |
| Website Carbon | `WebsiteCarbonClient` | `https://api.websitecarbon.com/` | 用于估算加载网页的碳足迹的 API | 🟢 免 Key |
| PM2.5 Open Data Portal | `Pm25OpenDataPortalClient` | `https://pm25.lass-net.org/#apis` | 开放低成本PM2.5传感器数据 | 🟢 免 Key |
| GrünstromIndex | `GrNstromindexClient` | `https://gruenstromindex.de/` | 德国绿色电力指数 (Grünstromindex/GSI) | 🟢 免 Key |
| UK Carbon Intensity | `UkCarbonIntensityClient` | `https://carbon-intensity.github.io/api-definitions/#carbon-intensity-api-v1-0-0` | 由国家电网开发的英国官方碳强度 API | 🟢 免 Key |
| Carbon Interface | `CarbonInterfaceClient` | `https://docs.carboninterface.com/` | 用于计算常见二氧化碳排放活动的碳 (CO2) 排放估算的 API | 🔴 需要认证 (apiKey) |
| BreezoMeter Pollen | `BreezometerPollenClient` | `https://docs.breezometer.com/api-documentation/pollen-api/v2/` | 特定地点的每日花粉状况预测数据 | 🔴 需要认证 (apiKey) |
| Srp Energy | `SrpEnergyClient` | `https://srpenergy-api-client-python.readthedocs.io/en/latest/api.html` | Srp 客户的每小时使用能源报告 | 🔴 需要认证 (apiKey) |
| Danish data service Energi | `DanishDataServiceEnergiClient` | `https://www.energidataservice.dk/` | 向社会开放 Energinet 的能源数据 | 🟢 免 Key |
| Climatiq | `ClimatiqClient` | `https://docs.climatiq.io` | 计算各种排放活动产生的环境足迹 | 🔴 需要认证 (apiKey) |
| CO2 Offset | `Co2OffsetClient` | `https://co2offset.io/api.html` | API计算并验证碳足迹 | 🟢 免 Key |
| Luchtmeetnet | `LuchtmeetnetClient` | `https://api-docs.luchtmeetnet.nl/` | 荷兰的预测和实际空气质量成分（RIVM） | 🟢 免 Key |
| Cloverly | `CloverlyClient` | `https://www.cloverly.com/carbon-offset-documentation` | API实时计算常见碳密集型活动的影响 | 🔴 需要认证 (apiKey) |


### Dictionaries

本分类 (**词典**) 共包含 **13** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.dictionaries.DictionariesAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Chinese Text Project | `ChineseTextProjectClient` | `https://ctext.org/tools/api` | 在线开放获取前现代中文文本数字图书馆 | 🟢 免 Key |
| Collins | `CollinsClient` | `https://api.collinsdictionary.com/api/v1/documentation/html/` | 双语词典和词库数据 | 🔴 需要认证 (apiKey) |
| Merriam-Webster | `MerriamWebsterClient` | `https://dictionaryapi.com/` | 词典和同义词库数据 | 🔴 需要认证 (apiKey) |
| OwlBot | `OwlbotClient` | `https://owlbot.info/` | 带有例句和照片的定义（如果有） | 🔴 需要认证 (apiKey) |
| Free Dictionary | `FreeDictionaryClient` | `https://dictionaryapi.dev/` | 定义、语音、发音、词性、示例、同义词 | 🟢 免 Key |
| Wordnik | `WordnikClient` | `https://developer.wordnik.com` | 词典数据 | 🔴 需要认证 (apiKey) |
| Synonyms | `SynonymsClient` | `https://www.synonyms.com/synonyms_api.php` | 任何给定单词的同义词、同义词库和反义词信息 | 🔴 需要认证 (apiKey) |
| Chinese Character Web | `ChineseCharacterWebClient` | `http://ccdb.hemiola.com/` | 汉字定义和发音 | 🟢 免 Key |
| Wiktionary | `WiktionaryClient` | `https://en.wiktionary.org/w/api.php` | 协作词典数据 | 🟢 免 Key |
| Lingua Robot | `LinguaRobotClient` | `https://www.linguarobot.io` | 单词定义、发音、同义词、反义词等 | 🔴 需要认证 (apiKey) |
| Indonesia Dictionary | `IndonesiaDictionaryClient` | `https://new-kbbi-api.herokuapp.com/` | 印度尼西亚词典很多单词 | 🟢 免 Key |
| Words | `WordsClient` | `https://www.wordsapi.com/docs/` | 超过 150,000 个单词的定义和同义词 | 🔴 需要认证 (apiKey) |
| Oxford | `OxfordClient` | `https://developer.oxforddictionaries.com/` | 词典数据 | 🔴 需要认证 (apiKey) |


### Shopping

本分类 (**购物**) 共包含 **12** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.shopping.ShoppingAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Digi-Key | `DigiKeyClient` | `https://www.digikey.com/en/resources/api-solutions` | 检索电子元件的价格和库存以及下订单 | 🔴 需要认证 (OAuth) |
| Best Buy | `BestBuyClient` | `https://bestbuyapis.github.io/api-documentation/#overview` | 产品、购买选项、类别、推荐、商店和商务 | 🔴 需要认证 (apiKey) |
| Shopee | `ShopeeClient` | `https://open.shopee.com/documents?version=1` | Shopee官方API，用于集成Shopee的各种服务 | 🔴 需要认证 (apiKey) |
| Lazada | `LazadaClient` | `https://open.lazada.com/doc/doc.htm` | 检索产品评级和卖家绩效指标 | 🔴 需要认证 (apiKey) |
| WooCommerce | `WoocommerceClient` | `https://woocommerce.github.io/woocommerce-rest-api-docs/` | WooCommerce REST API 用于在 WordPress 网站上以 JSON 格式创建、读取、更新和删除数据 | 🔴 需要认证 (apiKey) |
| Rappi | `RappiClient` | `https://dev-portal.rappi.com/` | 通过 Rappi 的应用程序管理订单 | 🔴 需要认证 (OAuth) |
| Octopart | `OctopartClient` | `https://octopart.com/api/v4/reference` | 用于制造、设计和采购的电子零件数据 | 🔴 需要认证 (apiKey) |
| Mercadolibre | `MercadolibreClient` | `https://developers.mercadolibre.cl/es_ar/api-docs-es` | 管理销售、广告、产品、服务和商店 | 🔴 需要认证 (apiKey) |
| Dummy Products | `DummyProductsClient` | `https://dummyproducts-api.herokuapp.com/` | 用于获取带有占位符图像的虚拟电子商务产品 JSON 数据的 api | 🔴 需要认证 (apiKey) |
| OLX Poland | `OlxPolandClient` | `https://developer.olx.pl/api/doc#section/` | 通过发布、管理广告以及与 OLX 用户沟通来与本地网站集成 | 🔴 需要认证 (apiKey) |
| Etsy | `EtsyClient` | `https://www.etsy.com/developers/documentation/getting_started/api_basics` | 管理商店并与列表互动 | 🔴 需要认证 (OAuth) |
| Tokopedia | `TokopediaClient` | `https://developer.tokopedia.com/openapi/guide/#/` | Tokopedia 的官方 API，用于集成 Tokopedia 的各种服务 | 🔴 需要认证 (OAuth) |


### Blockchain

本分类 (**区块链**) 共包含 **10** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.blockchain.BlockchainAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Etherscan | `EtherscanClient` | `https://etherscan.io/apis` | 以太坊浏览器API | 🔴 需要认证 (apiKey) |
| Steem | `SteemClient` | `https://developers.steem.io/` | 基于区块链的博客和社交媒体网站 | 🟢 免 Key |
| The Graph | `TheGraphClient` | `https://thegraph.com` | 使用 GraphQL 查询以太坊等网络的索引协议 | 🔴 需要认证 (apiKey) |
| Watchdata | `WatchdataClient` | `https://docs.watchdata.io` | 提供对以太坊区块链的简单可靠的API访问 | 🔴 需要认证 (apiKey) |
| Chainpoint | `ChainpointClient` | `https://tierion.com/chainpoint/` | Chainpoint 是一个将数据锚定到比特币区块链的全球网络 | 🟢 免 Key |
| Nownodes | `NownodesClient` | `https://nownodes.io/` | 通过 API 提供高质量连接的区块链即服务解决方案 | 🔴 需要认证 (apiKey) |
| Chainlink | `ChainlinkClient` | `https://chain.link/developer-resources` | 使用 Chainlink 构建混合智能合约 | 🟢 免 Key |
| Helium | `HeliumClient` | `https://docs.helium.com/api/blockchain/introduction/` | Helium 是一个全球分布式热点网络，可创建公共远程无线覆盖 | 🟢 免 Key |
| Bitquery | `BitqueryClient` | `https://graphql.bitquery.io/ide` | 链上 GraphQL API 和 DEX API | 🔴 需要认证 (apiKey) |
| Covalent | `CovalentClient` | `https://www.covalenthq.com/docs/api/` | 多区块链数据聚合平台 | 🔴 需要认证 (apiKey) |


### Open Source Projects

本分类 (**开源项目**) 共包含 **9** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.opensourceprojects.OpenSourceProjectsAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| GitHub ReadMe Stats | `GithubReadmeStatsClient` | `https://github.com/anuraghazra/github-readme-stats` | 将动态生成的统计信息添加到您的 GitHub 配置文件自述文件中 | 🟢 免 Key |
| GitHub Contribution Chart Generator | `GithubContributionChartGeneratorClient` | `https://github-contributions.vercel.app` | 创建您的 GitHub 贡献的图像 | 🟢 免 Key |
| Drupal.org | `DrupalOrgClient` | `https://www.drupal.org/drupalorg/docs/api` | Drupal.org | 🟢 免 Key |
| Shields | `ShieldsClient` | `https://shields.io/` | SVG 和光栅格式的简洁、一致且清晰的徽章 | 🟢 免 Key |
| Countly | `CountlyClient` | `https://api.count.ly/reference` | Countly 网络分析 | 🟢 免 Key |
| Evil Insult Generator | `EvilInsultGeneratorClient` | `https://evilinsult.com/api` | 邪恶的侮辱 | 🟢 免 Key |
| Metabase | `MetabaseClient` | `https://www.metabase.com/` | 用于在公司内部共享数据和分析的开源商业智能服务器 | 🟢 免 Key |
| Datamuse | `DatamuseClient` | `https://www.datamuse.com/api/` | 找词查询引擎 | 🟢 免 Key |
| Creative Commons Catalog | `CreativeCommonsCatalogClient` | `https://api.creativecommons.engineering/` | 在公开许可和公共领域的作品中搜索 | 🔴 需要认证 (OAuth) |


### Tracking

本分类 (**追踪**) 共包含 **9** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.tracking.TrackingAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Pixela | `PixelaClient` | `https://pixe.la` | 用于记录和跟踪习惯或努力、例程的 API | 🔴 需要认证 (X-Mashape-Key) |
| PostNord | `PostnordClient` | `https://developer.postnord.com/api` | 提供有关瑞典和丹麦运输包裹的信息 | 🔴 需要认证 (apiKey) |
| WeCanTrack | `WecantrackClient` | `https://docs.wecantrack.com` | 自动在联属链接中放置子广告，将联属营销转化归因于点击数据 | 🔴 需要认证 (apiKey) |
| WhereParcel | `WhereparcelClient` | `https://whereparcel.com/docs` | 全球 60 多家承运商（USPS、FedEx、UPS、DHL 等）的统一包裹追踪 API | 🔴 需要认证 (apiKey) |
| PostalPinCode | `PostalpincodeClient` | `http://www.postalpincode.in/Api-Details` | 用于获取印度 Pincode 详细信息的 API | 🟢 免 Key |
| Aftership | `AftershipClient` | `https://developers.aftership.com/reference/quick-start` | API 可有效更新、管理和跟踪货运 | 🔴 需要认证 (apiKey) |
| Postmon | `PostmonClient` | `http://postmon.com.br` | 用于轻松、快速、免费查询巴西邮政编码和订单的 API | 🟢 免 Key |
| WhatPulse | `WhatpulseClient` | `https://developer.whatpulse.org/#web-api` | 测量键盘/鼠标使用情况的小应用程序 | 🟢 免 Key |
| Correios | `CorreiosClient` | `https://cws.correios.com.br/ajuda` | 使用 Correio 的服务进行集成以提供信息并准备发货 | 🔴 需要认证 (apiKey) |


### Data Validation

本分类 (**数据验证**) 共包含 **7** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.datavalidation.DataValidationAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| US Extract | `UsExtractClient` | `https://www.smarty.com/products/apis/us-extract-api` | 从包括电子邮件在内的任何文本中提取邮政地址 | 🔴 需要认证 (apiKey) |
| US Street Address | `UsStreetAddressClient` | `https://www.smarty.com/docs/cloud/us-street-api` | 验证并附加任何美国邮政地址的数据 | 🔴 需要认证 (apiKey) |
| PurgoMalum | `PurgomalumClient` | `http://www.purgomalum.com` | 针对亵渎和淫秽内容的内容验证器 | 🟢 免 Key |
| US Autocomplete | `UsAutocompleteClient` | `https://www.smarty.com/docs/cloud/us-autocomplete-pro-api` | 通过实时地址建议快速输入地址数据 | 🔴 需要认证 (apiKey) |
| VATlayer | `VatlayerClient` | `https://vatlayer.com/?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 增值税号验证 | 🔴 需要认证 (apiKey) |
| Lob.com | `LobComClient` | `https://lob.com/` | 美国地址验证 | 🔴 需要认证 (apiKey) |
| Postman Echo | `PostmanEchoClient` | `https://www.postman-echo.com` | 测试 api 服务器从 HTTP 方法接收并返回值 | 🟢 免 Key |


### Vehicle

本分类 (**车辆**) 共包含 **7** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.vehicle.VehicleAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Brazilian Vehicles and Prices | `BrazilianVehiclesAndPricesClient` | `https://deividfortuna.github.io/fipe/` | 来自 Fundação Instituto de Pesquisas Econômicas - Fipe 的车辆信息 | 🟢 免 Key |
| Helipaddy sites | `HelipaddySitesClient` | `https://helipaddy.com/api/` | 直升机和客运无人机着陆点目录、Helipaddy 数据等等 | 🔴 需要认证 (apiKey) |
| RevCarData | `RevcardataClient` | `https://revcardata.com` | 86,000 多个全球车辆规格和电动汽车指标 | 🔴 需要认证 (apiKey) |
| Mercedes-Benz | `MercedesBenzClient` | `https://developer.mercedes-benz.com/apis` | 远程信息处理数据、远程访问车辆功能、汽车配置器、定位服务经销商 | 🔴 需要认证 (apiKey) |
| Kelley Blue Book | `KelleyBlueBookClient` | `http://developer.kbb.com/#!/data/1-Default` | 车辆信息、定价、配置等等 | 🔴 需要认证 (apiKey) |
| Smartcar | `SmartcarClient` | `https://smartcar.com/docs/` | Lock and unlock vehicles and get data like odometer reading and location. Works on most new cars | 🔴 需要认证 (OAuth) |
| NHTSA | `NhtsaClient` | `https://vpic.nhtsa.dot.gov/api/` | NHTSA 产品信息目录和车辆清单 | 🟢 免 Key |


### Authentication & Authorization

本分类 (**认证与授权**) 共包含 **6** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.authenticationauthorization.AuthenticationAuthorizationAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Auth0 | `Auth0Client` | `https://auth0.com` | 易于实施、适应性强的身份验证和授权平台 | 🔴 需要认证 (apiKey) |
| MojoAuth | `MojoauthClient` | `https://mojoauth.com` | 安全、现代的无密码身份验证平台 | 🔴 需要认证 (apiKey) |
| Warrant | `WarrantClient` | `https://warrant.dev/` | 用于授权和访问控制的 API | 🔴 需要认证 (apiKey) |
| GetOTP | `GetotpClient` | `https://otp.dev/en/docs/` | 快速实施 OTP 流程 | 🔴 需要认证 (apiKey) |
| Stytch | `StytchClient` | `https://stytch.com/` | 现代应用程序的用户基础设施 | 🔴 需要认证 (apiKey) |
| Micro User Service | `MicroUserServiceClient` | `https://m3o.com/user` | 用户管理和认证 | 🔴 需要认证 (apiKey) |


### Continuous Integration

本分类 (**持续集成**) 共包含 **6** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.continuousintegration.ContinuousIntegrationAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| CircleCI | `CircleciClient` | `https://circleci.com/docs/api/v1-reference/` | 使用持续集成和持续交付实现软件开发流程自动化 | 🔴 需要认证 (apiKey) |
| Bitrise | `BitriseClient` | `https://api-docs.bitrise.io/` | 构建工具和流程集成以创建高效的开发管道 | 🔴 需要认证 (apiKey) |
| Azure DevOps Health | `AzureDevopsHealthClient` | `https://docs.microsoft.com/en-us/rest/api/resourcehealth` | 当 Azure 问题影响您的资源时，资源运行状况可帮助您诊断并获得支持 | 🔴 需要认证 (apiKey) |
| Buddy | `BuddyClient` | `https://buddy.works/docs/api/getting-started/overview` | 最快的持续集成和持续交付平台 | 🔴 需要认证 (OAuth) |
| Codeship | `CodeshipClient` | `https://docs.cloudbees.com/docs/cloudbees-codeship/latest/api-overview/` | Codeship 是一个云端持续集成平台 | 🔴 需要认证 (apiKey) |
| Travis CI | `TravisCiClient` | `https://docs.travis-ci.com/api/` | 将您的 GitHub 项目与 Travis CI 同步，以在几分钟内测试您的代码 | 🔴 需要认证 (apiKey) |


### Phone

本分类 (**电话**) 共包含 **6** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.phone.PhoneAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Phone Specification | `PhoneSpecificationClient` | `https://github.com/azharimm/phone-specs-api` | 手机规格的 Rest Api | 🟢 免 Key |
| Phone Validation | `PhoneValidationClient` | `https://www.abstractapi.com/phone-validation-api` | 验证全球电话号码 | 🔴 需要认证 (apiKey) |
| Cloudmersive Validate | `CloudmersiveValidateClient` | `https://cloudmersive.com/phone-number-validation-API` | 验证国际电话号码 | 🔴 需要认证 (apiKey) |
| Veriphone | `VeriphoneClient` | `https://veriphone.io` | 电话号码验证和运营商查找 | 🔴 需要认证 (apiKey) |
| Numlookup | `NumlookupClient` | `https://numlookupapi.com` | 覆盖全球的电话号码验证和运营商查找 API | 🔴 需要认证 (apiKey) |
| Numverify | `NumverifyClient` | `https://numverify.com?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | 电话号码验证 | 🔴 需要认证 (apiKey) |


### Patent

本分类 (**专利**) 共包含 **4** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.patent.PatentAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| EPO | `EpoClient` | `https://developers.epo.org/` | 欧洲专利检索系统API | 🔴 需要认证 (OAuth) |
| TIPO | `TipoClient` | `https://tiponet.tipo.gov.tw/Gazette/OpenData/OD/OD05.aspx?QryDS=API00` | 台湾专利检索系统API | 🔴 需要认证 (apiKey) |
| USPTO | `UsptoClient` | `https://www.uspto.gov/learning-and-resources/open-data-and-mobility` | 美国专利API服务 | 🟢 免 Key |
| PatentsView | `PatentsviewClient` | `https://patentsview.org/apis/purpose` | API 旨在探索和可视化美国创新格局的趋势/模式 | 🟢 免 Key |


### Programming

本分类 (**编程**) 共包含 **4** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.programming.ProgrammingAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Hackerearth | `HackerearthClient` | `https://www.hackerearth.com/docs/wiki/developers/v4/` | 用于编译和运行多种语言的代码 | 🔴 需要认证 (apiKey) |
| Codeforces | `CodeforcesClient` | `https://codeforces.com/apiHelp` | 访问 Codeforces 数据 | 🔴 需要认证 (apiKey) |
| Judge0 CE | `Judge0CeClient` | `https://ce.judge0.com/` | 在线代码执行系统 | 🔴 需要认证 (apiKey) |
| Mintlify | `MintlifyClient` | `https://docs.mintlify.com` | 用于以编程方式生成代码文档 | 🔴 需要认证 (apiKey) |


### Events

本分类 (**活动**) 共包含 **3** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.events.EventsAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Eventbrite | `EventbriteClient` | `https://www.eventbrite.com/platform/api/` | 查找活动 | 🔴 需要认证 (OAuth) |
| SeatGeek | `SeatgeekClient` | `https://platform.seatgeek.com/` | 搜索活动、场地和表演者 | 🔴 需要认证 (apiKey) |
| Ticketmaster | `TicketmasterClient` | `http://developer.ticketmaster.com/products-and-docs/apis/getting-started/` | 搜索活动、景点或场地 | 🔴 需要认证 (apiKey) |

