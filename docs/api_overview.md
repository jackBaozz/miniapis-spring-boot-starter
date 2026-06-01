# Miniapis SDK - 集成 API 总览

本 Starter 深度集成了由 `public-apis` 社区收集的全球丰富且免费的公共 API 接口（共包含 **51** 个核心分类，合计 **1,490+** 个可用客户端）。底层基于 Spring Boot 3.3.x 提供的声明式 HTTP Interfaces 架构（`RestClient` + `HttpExchange`），直接使用依赖注入对应的 Client 接口即可调用这些服务。

## 📂 API 分类索引目录

| 分类名称 (Category) | API 客户端数量 | 包路径 (Package) |
| :--- | :---: | :--- |
| [**Development**](#development) | 127 | `com.bzz.miniapis.sdk.development` |
| [**Games & Comics**](#games-comics) | 95 | `com.bzz.miniapis.sdk.gamescomics` |
| [**Geocoding**](#geocoding) | 90 | `com.bzz.miniapis.sdk.geocoding` |
| [**Government**](#government) | 90 | `com.bzz.miniapis.sdk.government` |
| [**Transportation**](#transportation) | 71 | `com.bzz.miniapis.sdk.transportation` |
| [**Cryptocurrency**](#cryptocurrency) | 66 | `com.bzz.miniapis.sdk.cryptocurrency` |
| [**Finance**](#finance) | 48 | `com.bzz.miniapis.sdk.finance` |
| [**Video**](#video) | 44 | `com.bzz.miniapis.sdk.video` |
| [**Social**](#social) | 42 | `com.bzz.miniapis.sdk.social` |
| [**Open Data**](#open-data) | 40 | `com.bzz.miniapis.sdk.opendata` |
| [**Security**](#security) | 40 | `com.bzz.miniapis.sdk.security` |
| [**Sports & Fitness**](#sports-fitness) | 36 | `com.bzz.miniapis.sdk.sportsfitness` |
| [**Music**](#music) | 35 | `com.bzz.miniapis.sdk.music` |
| [**Science & Math**](#science-math) | 35 | `com.bzz.miniapis.sdk.sciencemath` |
| [**Weather**](#weather) | 34 | `com.bzz.miniapis.sdk.weather` |
| [**Health**](#health) | 33 | `com.bzz.miniapis.sdk.health` |
| [**Documents & Productivity**](#documents-productivity) | 31 | `com.bzz.miniapis.sdk.documentsproductivity` |
| [**Photography**](#photography) | 29 | `com.bzz.miniapis.sdk.photography` |
| [**Animals**](#animals) | 28 | `com.bzz.miniapis.sdk.animals` |
| [**Books**](#books) | 26 | `com.bzz.miniapis.sdk.books` |
| [**Machine Learning**](#machine-learning) | 26 | `com.bzz.miniapis.sdk.machinelearning` |
| [**Food & Drink**](#food-drink) | 25 | `com.bzz.miniapis.sdk.fooddrink` |
| [**Test Data**](#test-data) | 25 | `com.bzz.miniapis.sdk.testdata` |
| [**Business**](#business) | 23 | `com.bzz.miniapis.sdk.business` |
| [**Personality**](#personality) | 23 | `com.bzz.miniapis.sdk.personality` |
| [**Art & Design**](#art-design) | 20 | `com.bzz.miniapis.sdk.artdesign` |
| [**Cloud Storage & File Sharing**](#cloud-storage-file-sharing) | 20 | `com.bzz.miniapis.sdk.cloudstoragefilesharing` |
| [**News**](#news) | 20 | `com.bzz.miniapis.sdk.news` |
| [**URL Shorteners**](#url-shorteners) | 20 | `com.bzz.miniapis.sdk.urlshorteners` |
| [**Anime**](#anime) | 19 | `com.bzz.miniapis.sdk.anime` |
| [**Email**](#email) | 19 | `com.bzz.miniapis.sdk.email` |
| [**Jobs**](#jobs) | 19 | `com.bzz.miniapis.sdk.jobs` |
| [**Currency Exchange**](#currency-exchange) | 18 | `com.bzz.miniapis.sdk.currencyexchange` |
| [**Environment**](#environment) | 17 | `com.bzz.miniapis.sdk.environment` |
| [**Text Analysis**](#text-analysis) | 17 | `com.bzz.miniapis.sdk.textanalysis` |
| [**Calendar**](#calendar) | 16 | `com.bzz.miniapis.sdk.calendar` |
| [**Anti-Malware**](#anti-malware) | 15 | `com.bzz.miniapis.sdk.antimalware` |
| [**Entertainment**](#entertainment) | 14 | `com.bzz.miniapis.sdk.entertainment` |
| [**Shopping**](#shopping) | 14 | `com.bzz.miniapis.sdk.shopping` |
| [**Dictionaries**](#dictionaries) | 13 | `com.bzz.miniapis.sdk.dictionaries` |
| [**Blockchain**](#blockchain) | 11 | `com.bzz.miniapis.sdk.blockchain` |
| [**Tracking**](#tracking) | 10 | `com.bzz.miniapis.sdk.tracking` |
| [**Open Source Projects**](#open-source-projects) | 9 | `com.bzz.miniapis.sdk.opensourceprojects` |
| [**Authentication & Authorization**](#authentication-authorization) | 7 | `com.bzz.miniapis.sdk.authenticationauthorization` |
| [**Data Validation**](#data-validation) | 7 | `com.bzz.miniapis.sdk.datavalidation` |
| [**Vehicle**](#vehicle) | 7 | `com.bzz.miniapis.sdk.vehicle` |
| [**Continuous Integration**](#continuous-integration) | 6 | `com.bzz.miniapis.sdk.continuousintegration` |
| [**Phone**](#phone) | 6 | `com.bzz.miniapis.sdk.phone` |
| [**Programming**](#programming) | 5 | `com.bzz.miniapis.sdk.programming` |
| [**Patent**](#patent) | 4 | `com.bzz.miniapis.sdk.patent` |
| [**Events**](#events) | 3 | `com.bzz.miniapis.sdk.events` |

---

## 🛠️ API 分类详细列表

### Development

本分类共包含 **127** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.development.DevelopmentAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Userstack | `UserstackClient` | `https://userstack.com/?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | Secure User-Agent String Lookup JSON API | `OAuth` |
| 24 Pull Requests | `Api24PullRequestsClient` | `https://24pullrequests.com/api` | Project to promote open source collaboration during December | `免 Key` |
| Agify.io | `AgifyIoClient` | `https://agify.io` | Estimates the age from a first name | `免 Key` |
| API Grátis | `ApiGrTisClient` | `https://apigratis.com.br/` | Multiples services and public APIs | `免 Key` |
| ApicAgent | `ApicagentClient` | `https://www.apicagent.com` | Extract device details from user-agent string | `免 Key` |
| ApiFlash | `ApiflashClient` | `https://apiflash.com/` | Chrome based screenshot API for developers | `apiKey` |
| APIs.guru | `ApisGuruClient` | `https://apis.guru/api-doc/` | Wikipedia for Web APIs, OpenAPI/Swagger specs for public APIs | `免 Key` |
| Azure DevOps | `AzureDevopsClient` | `https://docs.microsoft.com/en-us/rest/api/azure/devops` | The Azure DevOps basic components of a REST API request/response pair | `apiKey` |
| Base | `BaseClient` | `https://www.base-api.io/` | Building quick backends | `apiKey` |
| Beeceptor | `BeeceptorClient` | `https://beeceptor.com/` | Build a mock Rest API endpoint in seconds | `免 Key` |
| Bitbucket | `BitbucketClient` | `https://developer.atlassian.com/bitbucket/api/2/reference/` | Bitbucket API | `OAuth` |
| Blague.xyz | `BlagueXyzClient` | `https://blague.xyz/` | La plus grande API de Blagues FR/The biggest FR jokes API | `apiKey` |
| Blitapp | `BlitappClient` | `https://blitapp.com/api/` | Schedule screenshots of web pages and sync them to your cloud | `apiKey` |
| Blynk-Cloud | `BlynkCloudClient` | `https://blynkapi.docs.apiary.io/#` | Control IoT Devices from Blynk IoT Cloud | `apiKey` |
| Bored | `BoredClient` | `https://www.boredapi.com/` | Find random activities to fight boredom | `免 Key` |
| Brainshop.ai | `BrainshopAiClient` | `https://brainshop.ai/` | Make A Free A.I Brain | `apiKey` |
| BrewPage | `BrewpageClient` | `https://brewpage.app` | Free hosting for HTML, JSON, key-value, files, multi-file sites with short URLs and TTL retention | `免 Key` |
| Browshot | `BrowshotClient` | `https://browshot.com/api/documentation` | Easily make screenshots of web pages in any screen size, as any device | `apiKey` |
| CDNJS | `CdnjsClient` | `https://api.cdnjs.com/libraries/jquery` | Library info on CDNJS | `免 Key` |
| Changelogs.md | `ChangelogsMdClient` | `https://changelogs.md` | Structured changelog metadata from open source projects | `免 Key` |
| Ciprand | `CiprandClient` | `https://github.com/polarspetroll/ciprand` | Secure random string generator | `免 Key` |
| Cloudflare Trace | `CloudflareTraceClient` | `https://github.com/fawazahmed0/cloudflare-trace-api` | Get IP Address, Timestamp, User Agent, Country Code, IATA, HTTP Version, TLS/SSL Version & More | `免 Key` |
| Codex | `CodexClient` | `https://github.com/Jaagrav/CodeX` | Online Compiler for Various Languages | `免 Key` |
| Contentful Images | `ContentfulImagesClient` | `https://www.contentful.com/developers/docs/references/images-api/` | Used to retrieve and apply transformations to images | `apiKey` |
| CORS Proxy | `CorsProxyClient` | `https://github.com/burhanuday/cors-proxy` | Get around the dreaded CORS error by using this proxy as a middle man | `免 Key` |
| CountAPI | `CountapiClient` | `https://countapi.xyz` | Free and simple counting service. You can use it to track page hits and specific events | `免 Key` |
| Databricks | `DatabricksClient` | `https://docs.databricks.com/dev-tools/api/latest/index.html` | Service to manage your databricks account,clusters, notebooks, jobs and workspaces | `apiKey` |
| DigitalOcean Status | `DigitaloceanStatusClient` | `https://status.digitalocean.com/api` | Status of all DigitalOcean services | `免 Key` |
| Docker Hub | `DockerHubClient` | `https://docs.docker.com/docker-hub/api/latest/` | Interact with Docker Hub | `apiKey` |
| DomainDb Info | `DomaindbInfoClient` | `https://api.domainsdb.info/` | Domain name search to find all domains containing particular words/phrases/etc | `免 Key` |
| ExtendsClass JSON Storage | `ExtendsclassJsonStorageClient` | `https://extendsclass.com/json-storage.html` | A simple JSON store API | `免 Key` |
| GeekFlare | `GeekflareClient` | `https://apidocs.geekflare.com/docs/geekflare-api` | Provide numerous capabilities for important testing and monitoring methods for websites | `apiKey` |
| Genderize.io | `GenderizeIoClient` | `https://genderize.io` | Estimates a gender from a first name | `免 Key` |
| GETPing | `GetpingClient` | `https://www.getping.info` | Trigger an email notification with a simple GET request | `apiKey` |
| Ghost | `GhostClient` | `https://ghost.org/` | Get Published content into your Website, App or other embedded media | `apiKey` |
| GitHub | `GithubClient` | `https://docs.github.com/en/free-pro-team@latest/rest` | Make use of GitHub repositories, code and user info programmatically | `OAuth` |
| Gitlab | `GitlabClient` | `https://docs.gitlab.com/ee/api/` | Automate GitLab interaction programmatically | `OAuth` |
| Gitter | `GitterClient` | `https://developer.gitter.im/docs/welcome` | Chat for Developers | `OAuth` |
| Glitterly | `GlitterlyClient` | `https://developers.glitterly.app` | Image generation API | `apiKey` |
| Google Docs | `GoogleDocsClient` | `https://developers.google.com/docs/api/reference/rest` | API to read, write, and format Google Docs documents | `OAuth` |
| Google Firebase | `GoogleFirebaseClient` | `https://firebase.google.com/docs` | Google's mobile application development platform that helps build, improve, and grow app | `apiKey` |
| Google Fonts | `GoogleFontsClient` | `https://developers.google.com/fonts/docs/developer_api` | Metadata for all families served by Google Fonts | `apiKey` |
| Google Keep | `GoogleKeepClient` | `https://developers.google.com/keep/api/reference/rest` | API to read, write, and format Google Keep notes | `OAuth` |
| Google Sheets | `GoogleSheetsClient` | `https://developers.google.com/sheets/api/reference/rest` | API to read, write, and format Google Sheets data | `OAuth` |
| Google Slides | `GoogleSlidesClient` | `https://developers.google.com/slides/api/reference/rest` | API to read, write, and format Google Slides presentations | `OAuth` |
| Gorest | `GorestClient` | `https://gorest.co.in/` | Online REST API for Testing and Prototyping | `OAuth` |
| Hasura | `HasuraClient` | `https://hasura.io/opensource/` | GraphQL and REST API Engine with built in Authorization | `apiKey` |
| Heroku | `HerokuClient` | `https://devcenter.heroku.com/articles/platform-api-reference/` | REST API to programmatically create apps, provision add-ons and perform other task on Heroku | `OAuth` |
| host-t.com | `HostTComClient` | `https://host-t.com` | Basic DNS query via HTTP GET request | `免 Key` |
| Host.io | `HostIoClient` | `https://host.io` | Domains Data API for Developers | `apiKey` |
| HTTP2.Pro | `Http2ProClient` | `https://http2.pro/doc/api` | Test endpoints for client and server HTTP/2 protocol support | `免 Key` |
| Httpbin | `HttpbinClient` | `https://httpbin.org/` | A Simple HTTP Request & Response Service | `免 Key` |
| Httpbin Cloudflare | `HttpbinCloudflareClient` | `https://cloudflare-quic.com/b/` | A Simple HTTP Request & Response Service with HTTP/3 Support by Cloudflare | `免 Key` |
| Hunter | `HunterClient` | `https://hunter.io/api` | API for domain search, professional email finder, author finder and email verifier | `apiKey` |
| IBM Text to Speech | `IbmTextToSpeechClient` | `https://cloud.ibm.com/docs/text-to-speech/getting-started.html` | Convert text to speech | `apiKey` |
| Icanhazepoch | `IcanhazepochClient` | `https://icanhazepoch.com` | Get Epoch time | `免 Key` |
| Icanhazip | `IcanhazipClient` | `https://major.io/icanhazip-com-faq/` | IP Address API | `免 Key` |
| IFTTT | `IftttClient` | `https://platform.ifttt.com/docs/connect_api` | IFTTT Connect API | `免 Key` |
| Image-Charts | `ImageChartsClient` | `https://documentation.image-charts.com/` | Generate charts, QR codes and graph images | `免 Key` |
| import.io | `ImportIoClient` | `http://api.docs.import.io/` | Retrieve structured data from a website or RSS feed | `apiKey` |
| ip-fast.com | `IpFastComClient` | `https://ip-fast.com/docs/` | IP address, country and city | `免 Key` |
| IP2WHOIS Information Lookup | `Ip2WhoisInformationLookupClient` | `https://www.ip2whois.com/` | WHOIS domain name lookup | `apiKey` |
| ipfind.io | `IpfindIoClient` | `https://ipfind.io` | Geographic location of an IP address or any domain name along with some other useful information | `apiKey` |
| IPify | `IpifyClient` | `https://www.ipify.org/` | A simple IP Address API | `免 Key` |
| IPinfo | `IpinfoClient` | `https://ipinfo.io/developers` | Another simple IP Address API | `免 Key` |
| isitdownstatus | `IsitdownstatusClient` | `https://isitdownstatus.com` | Check if websites and online services are currently down | `免 Key` |
| jsDelivr | `JsdelivrClient` | `https://github.com/jsdelivr/data.jsdelivr.com` | Package info and download stats on jsDelivr CDN | `免 Key` |
| JSON 2 JSONP | `Json2JsonpClient` | `https://json2jsonp.com/` | Convert JSON to JSONP (on-the-fly) for easy cross-domain data requests using client-side JavaScript | `免 Key` |
| JSONbin.io | `JsonbinIoClient` | `https://jsonbin.io` | Free JSON storage service. Ideal for small scale Web apps, Websites and Mobile apps | `apiKey` |
| JSONPlaceholder | `JsonplaceholderClient` | `https://jsonplaceholder.typicode.com` | Fake REST API for testing and prototyping | `免 Key` |
| Kroki | `KrokiClient` | `https://kroki.io` | Creates diagrams from textual descriptions | `免 Key` |
| License-API | `LicenseApiClient` | `https://github.com/cmccandless/license-api/blob/master/README.md` | Unofficial REST API for choosealicense.com | `免 Key` |
| Logs.to | `LogsToClient` | `https://logs.to/` | Generate logs | `apiKey` |
| Lua Decompiler | `LuaDecompilerClient` | `https://lua-decompiler.ferib.dev/` | Online Lua 5.1 Decompiler | `免 Key` |
| MAC address vendor lookup | `MacAddressVendorLookupClient` | `https://macaddress.io/api` | Retrieve vendor details and other information regarding a given MAC address or an OUI | `apiKey` |
| Micro DB | `MicroDbClient` | `https://m3o.com/db` | Simple database service | `apiKey` |
| MicroENV | `MicroenvClient` | `https://microenv.com/` | Fake Rest API for developers | `免 Key` |
| Mocky | `MockyClient` | `https://designer.mocky.io/` | Mock user defined test JSON for REST API endpoints | `免 Key` |
| MY IP | `MyIpClient` | `https://www.myip.com/api-docs/` | Get IP address information | `免 Key` |
| Nationalize.io | `NationalizeIoClient` | `https://nationalize.io` | Estimate the nationality of a first name | `免 Key` |
| Netlify | `NetlifyClient` | `https://docs.netlify.com/api/get-started/` | Netlify is a hosting service for the programmable web | `OAuth` |
| NetworkCalc | `NetworkcalcClient` | `https://networkcalc.com/api/docs` | Network calculators, including subnets, DNS, binary, and security tools | `免 Key` |
| npm Registry | `NpmRegistryClient` | `https://github.com/npm/registry/blob/master/docs/REGISTRY-API.md` | Query information about your favorite Node.js libraries programatically | `免 Key` |
| OneSignal | `OnesignalClient` | `https://documentation.onesignal.com/docs/onesignal-api` | Self-serve customer engagement solution for Push Notifications, Email, SMS & In-App | `apiKey` |
| Open Page Rank | `OpenPageRankClient` | `https://www.domcop.com/openpagerank/` | API for calculating and comparing metrics of different websites using Page Rank algorithm | `apiKey` |
| OpenAPIHub | `OpenapihubClient` | `https://hub.openapihub.com/` | The All-in-one API Platform | `X-Mashape-Key` |
| OpenGraphr | `OpengraphrClient` | `https://opengraphr.com/docs/1.0/overview` | Really simple API to retrieve Open Graph data from an URL | `apiKey` |
| oyyi | `OyyiClient` | `https://oyyi.xyz/docs/1.0` | API for Fake Data, image/video conversion, optimization, pdf optimization and thumbnail generation | `免 Key` |
| PageCDN | `PagecdnClient` | `https://pagecdn.com/docs/public-api` | Public API for javascript, css and font libraries on PageCDN | `apiKey` |
| Postman | `PostmanClient` | `https://www.postman.com/postman/workspace/postman-public-workspace/documentation/12959542-c8142d51-e97c-46b6-bd77-52bb66712c9a` | Tool for testing APIs | `apiKey` |
| ProxyCrawl | `ProxycrawlClient` | `https://proxycrawl.com` | Scraping and crawling anticaptcha service | `apiKey` |
| ProxyKingdom | `ProxykingdomClient` | `https://proxykingdom.com` | Rotating Proxy API that produces a working proxy on every request | `apiKey` |
| Pusher Beams | `PusherBeamsClient` | `https://pusher.com/beams` | Push notifications for Android & iOS | `apiKey` |
| QR & Barcode | `QrBarcodeClient` | `https://solsigs.com/qrapi/` | QR codes and barcodes (Code 128, EAN-13, Data Matrix, PDF417 + more). SVG or PNG output | `免 Key` |
| QR code | `QrCodeClient` | `https://www.qrtag.net/api/` | Create an easy to read QR code and URL shortener | `免 Key` |
| QR code | `QrCodeClient` | `http://goqr.me/api/` | Generate and decode / read QR code graphics | `免 Key` |
| Qrcode Monkey | `QrcodeMonkeyClient` | `https://www.qrcode-monkey.com/qr-code-api-with-logo/` | Integrate custom and unique looking QR codes into your system or workflow | `免 Key` |
| QuickChart | `QuickchartClient` | `https://quickchart.io/` | Generate chart and graph images | `免 Key` |
| Random Stuff | `RandomStuffClient` | `https://api-docs.pgamerx.com/` | Can be used to get AI Response, jokes, memes, and much more at lightning-fast speed | `apiKey` |
| Rejax | `RejaxClient` | `https://rejax.io/` | Reverse AJAX service to notify clients | `apiKey` |
| ReqRes | `ReqresClient` | `https://reqres.in/` | A hosted REST-API ready to respond to your AJAX requests | `免 Key` |
| RSS feed to JSON | `RssFeedToJsonClient` | `https://rss-to-json-serverless-api.vercel.app` | Returns RSS feed in JSON format using feed URL | `免 Key` |
| SavePage.io | `SavepageIoClient` | `https://www.savepage.io` | A free, RESTful API used to screenshot any desktop, or mobile website | `apiKey` |
| ScrapeNinja | `ScrapeninjaClient` | `https://scrapeninja.net` | Scraping API with Chrome fingerprint and residential proxies | `apiKey` |
| ScraperApi | `ScraperapiClient` | `https://www.scraperapi.com` | Easily build scalable web scrapers | `apiKey` |
| scraperBox | `ScraperboxClient` | `https://scraperbox.com/` | Undetectable web scraping API | `apiKey` |
| scrapestack | `ScrapestackClient` | `https://scrapestack.com/` | Real-time, Scalable Proxy & Web Scraping REST API | `apiKey` |
| ScrapingAnt | `ScrapingantClient` | `https://scrapingant.com` | Headless Chrome scraping with a simple API | `apiKey` |
| ScrapingDog | `ScrapingdogClient` | `https://www.scrapingdog.com/` | Proxy API for Web scraping | `apiKey` |
| Screenshot | `ScreenshotClient` | `https://www.abstractapi.com/website-screenshot-api` | Take programmatic screenshots of web pages from any website | `apiKey` |
| ScreenshotAPI.net | `ScreenshotapiNetClient` | `https://screenshotapi.net/` | Create pixel-perfect website screenshots | `apiKey` |
| Serialif Color | `SerialifColorClient` | `https://color.serialif.com/` | Color conversion, complementary, grayscale and contrasted text | `免 Key` |
| serpstack | `SerpstackClient` | `https://serpstack.com/` | Real-Time & Accurate Google Search Results API | `apiKey` |
| Sheetsu | `SheetsuClient` | `https://sheetsu.com/` | Easy google sheets integration | `apiKey` |
| SHOUTCLOUD | `ShoutcloudClient` | `http://shoutcloud.io/` | ALL-CAPS AS A SERVICE | `免 Key` |
| Sonar | `SonarClient` | `https://github.com/Cgboal/SonarSearch` | Project Sonar DNS Enumeration API | `免 Key` |
| SonarQube | `SonarqubeClient` | `https://sonarcloud.io/web_api` | SonarQube REST APIs to detect bugs, code smells & security vulnerabilities | `OAuth` |
| StackExchange | `StackexchangeClient` | `https://api.stackexchange.com/` | Q&A forum for developers | `OAuth` |
| Statically | `StaticallyClient` | `https://statically.io/` | A free CDN for developers | `免 Key` |
| Supportivekoala | `SupportivekoalaClient` | `https://developers.supportivekoala.com/` | Autogenerate images with template | `apiKey` |
| Suprsonic | `SuprsonicClient` | `https://suprsonic.ai` | Unified agent API: search, scrape, enrich, image gen, TTS, STT, messaging. One key, 20+ capabilities | `apiKey` |
| Talordata | `TalordataClient` | `https://docs.talordata.com/` | SERP data from major search engines with a free trial | `apiKey` |
| Thunderbit | `ThunderbitClient` | `https://thunderbit.com/docs/introduction` | Extract web pages as Markdown or structured data for AI apps | `apiKey` |
| Tyk | `TykClient` | `https://tyk.io/open-source/` | Api and service management platform | `apiKey` |
| Wandbox | `WandboxClient` | `https://github.com/melpon/wandbox/blob/master/kennel2/API.rst` | Code compiler supporting 35+ languages mentioned at wandbox.org | `免 Key` |
| WebScraping.AI | `WebscrapingAiClient` | `https://webscraping.ai/` | Web Scraping API with built-in proxies and JS rendering | `apiKey` |
| ZenRows | `ZenrowsClient` | `https://www.zenrows.com/` | Web Scraping API that bypasses anti-bot solutions while offering JS rendering, and rotating proxies | `apiKey` |


### Games & Comics

本分类共包含 **95** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.gamescomics.GamesComicsAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| AmiiboAPI | `AmiiboapiClient` | `https://amiiboapi.com/` | Nintendo Amiibo Information | `免 Key` |
| Animal Crossing: New Horizons | `AnimalCrossingNewHorizonsClient` | `http://acnhapi.com/` | API for critters, fossils, art, music, furniture and villagers | `免 Key` |
| Autochess VNG | `AutochessVngClient` | `https://github.com/didadadida93/autochess-vng-api` | Rest Api for Autochess VNG | `免 Key` |
| Barter.VG | `BarterVgClient` | `https://github.com/bartervg/barter.vg/wiki` | Provides information about Game, DLC, Bundles, Giveaways, Trading | `免 Key` |
| Battle.net | `BattleNetClient` | `https://develop.battle.net/documentation/guides/getting-started` | Diablo III, Hearthstone, StarCraft II and World of Warcraft game data APIs | `OAuth` |
| Board Game Geek | `BoardGameGeekClient` | `https://boardgamegeek.com/wiki/page/BGG_XML_API2` | Board games, RPG and videogames | `免 Key` |
| Brawl Stars | `BrawlStarsClient` | `https://developer.brawlstars.com` | Brawl Stars Game Information | `apiKey` |
| Bugsnax | `BugsnaxClient` | `https://www.bugsnaxapi.com/` | Get information about Bugsnax | `免 Key` |
| CheapShark | `CheapsharkClient` | `https://www.cheapshark.com/api` | Steam/PC Game Prices and Deals | `免 Key` |
| Chess.com | `ChessComClient` | `https://www.chess.com/news/view/published-data-api` | Chess.com read-only REST API | `免 Key` |
| Chuck Norris Database | `ChuckNorrisDatabaseClient` | `http://www.icndb.com/api/` | Jokes | `免 Key` |
| Clash of Clans | `ClashOfClansClient` | `https://developer.clashofclans.com` | Clash of Clans Game Information | `apiKey` |
| Clash Royale | `ClashRoyaleClient` | `https://developer.clashroyale.com` | Clash Royale Game Information | `apiKey` |
| Comic Vine | `ComicVineClient` | `https://comicvine.gamespot.com/api/documentation` | Comics | `免 Key` |
| Crafatar | `CrafatarClient` | `https://crafatar.com` | API for Minecraft skins and faces | `免 Key` |
| Cross Universe | `CrossUniverseClient` | `https://crossuniverse.psychpsyo.com/apiDocs.html` | Cross Universe Card Data | `免 Key` |
| Deck of Cards | `DeckOfCardsClient` | `http://deckofcardsapi.com/` | Deck of Cards | `免 Key` |
| Destiny The Game | `DestinyTheGameClient` | `https://bungie-net.github.io/multi/index.html` | Bungie Platform API | `apiKey` |
| Digimon Information | `DigimonInformationClient` | `https://digimon-api.vercel.app/` | Provides information about digimon creatures | `免 Key` |
| Digimon TCG | `DigimonTcgClient` | `https://documenter.getpostman.com/view/14059948/TzecB4fH` | Search for Digimon cards in digimoncard.io | `免 Key` |
| Disney | `DisneyClient` | `https://disneyapi.dev` | Information of Disney characters | `免 Key` |
| Dota 2 | `Dota2Client` | `https://docs.opendota.com/` | Provides information about Player stats , Match stats, Rankings for Dota 2 | `apiKey` |
| Dungeons and Dragons | `DungeonsAndDragonsClient` | `https://www.dnd5eapi.co/docs/` | Reference for 5th edition spells, classes, monsters, and more | `免 Key` |
| Dungeons and Dragons (Alternate) | `DungeonsAndDragonsAlternateClient` | `https://open5e.com/` | Includes all monsters and spells from the SRD (System Reference Document) as well as a search API | `免 Key` |
| Eve Online | `EveOnlineClient` | `https://esi.evetech.net/ui` | Third-Party Developer Documentation | `OAuth` |
| FFXIV Collect | `FfxivCollectClient` | `https://ffxivcollect.com/` | Final Fantasy XIV data on collectables | `免 Key` |
| FIFA Ultimate Team | `FifaUltimateTeamClient` | `https://www.easports.com/fifa/ultimate-team/api/fut/item` | FIFA Ultimate Team items API | `免 Key` |
| Final Fantasy XIV | `FinalFantasyXivClient` | `https://xivapi.com/` | Final Fantasy XIV Game data API | `免 Key` |
| Fortnite | `FortniteClient` | `https://fortnitetracker.com/site-api` | Fortnite Stats | `apiKey` |
| Forza | `ForzaClient` | `https://docs.forza-api.tk` | Show random image of car from Forza | `免 Key` |
| FreeToGame | `FreetogameClient` | `https://www.freetogame.com/api-doc` | Free-To-Play Games Database | `免 Key` |
| Fun Facts | `FunFactsClient` | `https://asli-fun-fact-api.herokuapp.com/` | Random Fun Facts | `免 Key` |
| FunTranslations | `FuntranslationsClient` | `https://api.funtranslations.com/` | Translate Text into funny languages | `免 Key` |
| GamerPower | `GamerpowerClient` | `https://www.gamerpower.com/api-read` | Game Giveaways Tracker | `免 Key` |
| GDBrowser | `GdbrowserClient` | `https://gdbrowser.com/api` | Easy way to use the Geometry Dash Servers | `免 Key` |
| Geek-Jokes | `GeekJokesClient` | `https://github.com/sameerkumar18/geek-joke-api` | Fetch a random geeky/programming related joke for use in all sorts of applications | `免 Key` |
| Genshin Impact | `GenshinImpactClient` | `https://genshin.dev` | Genshin Impact game data | `免 Key` |
| Giant Bomb | `GiantBombClient` | `https://www.giantbomb.com/api/documentation` | Video Games | `apiKey` |
| GraphQL Pokemon | `GraphqlPokemonClient` | `https://github.com/favware/graphql-pokemon` | GraphQL powered Pokemon API. Supports generations 1 through 8 | `免 Key` |
| Guild Wars 2 | `GuildWars2Client` | `https://wiki.guildwars2.com/wiki/API:Main` | Guild Wars 2 Game Information | `apiKey` |
| GW2Spidy | `Gw2SpidyClient` | `https://github.com/rubensayshi/gw2spidy/wiki` | GW2Spidy API, Items data on the Guild Wars 2 Trade Market | `免 Key` |
| Halo | `HaloClient` | `https://developer.haloapi.com/` | Halo 5 and Halo Wars 2 Information | `apiKey` |
| Hearthstone | `HearthstoneClient` | `http://hearthstoneapi.com/` | Hearthstone Cards Information | `X-Mashape-Key` |
| Humble Bundle | `HumbleBundleClient` | `https://rapidapi.com/Ziggoto/api/humble-bundle` | Humble Bundle's current bundles | `apiKey` |
| Humor | `HumorClient` | `https://humorapi.com` | Humor, Jokes, and Memes | `apiKey` |
| Hypixel | `HypixelClient` | `https://api.hypixel.net/` | Hypixel player stats | `apiKey` |
| Hyrule Compendium | `HyruleCompendiumClient` | `https://github.com/gadhagod/Hyrule-Compendium-API` | Data on all interactive items from The Legend of Zelda: BOTW | `免 Key` |
| Hytale | `HytaleClient` | `https://hytale-api.com/` | Hytale blog posts and jobs | `免 Key` |
| IGDB.com | `IgdbComClient` | `https://api-docs.igdb.com` | Video Game Database | `apiKey` |
| JokeAPI | `JokeapiClient` | `https://sv443.net/jokeapi/v2/` | Programming, Miscellaneous and Dark Jokes | `免 Key` |
| Jokes One | `JokesOneClient` | `https://jokes.one/api/joke/` | Joke of the day and large category of jokes accessible via REST API | `apiKey` |
| Jservice | `JserviceClient` | `http://jservice.io` | Jeopardy Question Database | `免 Key` |
| Lichess | `LichessClient` | `https://lichess.org/api` | Access to all data of users, games, puzzles and etc on Lichess | `OAuth` |
| Magic The Gathering | `MagicTheGatheringClient` | `http://magicthegathering.io/` | Magic The Gathering Game Information | `免 Key` |
| Mario Kart Tour | `MarioKartTourClient` | `https://mario-kart-tour-api.herokuapp.com/` | API for Drivers, Karts, Gliders and Courses | `OAuth` |
| Marvel | `MarvelClient` | `https://developer.marvel.com` | Marvel Comics | `apiKey` |
| Minecraft Server Status | `MinecraftServerStatusClient` | `https://api.mcsrvstat.us` | API to get Information about a Minecraft Server | `免 Key` |
| MMO Games | `MmoGamesClient` | `https://www.mmobomb.com/api` | MMO Games Database, News and Giveaways | `免 Key` |
| mod.io | `ModIoClient` | `https://docs.mod.io` | Cross Platform Mod API | `apiKey` |
| Mojang | `MojangClient` | `https://wiki.vg/Mojang_API` | Mojang / Minecraft API | `apiKey` |
| Monster Hunter World | `MonsterHunterWorldClient` | `https://docs.mhw-db.com/` | Monster Hunter World data | `免 Key` |
| Open Trivia | `OpenTriviaClient` | `https://opentdb.com/api_config.php` | Trivia Questions | `免 Key` |
| PandaScore | `PandascoreClient` | `https://developers.pandascore.co/` | E-sports games and results | `apiKey` |
| Path of Exile | `PathOfExileClient` | `https://www.pathofexile.com/developer/docs` | Path of Exile Game Information | `OAuth` |
| PlayerDB | `PlayerdbClient` | `https://playerdb.co/` | Query Minecraft, Steam and XBox Accounts | `免 Key` |
| Pokéapi | `PokApiClient` | `https://pokeapi.co` | Pokémon Information | `免 Key` |
| PokéAPI (GraphQL) | `PokApiGraphqlClient` | `https://github.com/mazipan/graphql-pokeapi` | The Unofficial GraphQL for PokeAPI | `免 Key` |
| Pokémon TCG | `PokMonTcgClient` | `https://pokemontcg.io` | Pokémon TCG Information | `免 Key` |
| Psychonauts | `PsychonautsClient` | `https://psychonauts-api.netlify.app/` | Psychonauts World Characters Information and PSI Powers | `免 Key` |
| PUBG | `PubgClient` | `https://developer.pubg.com/` | Access in-game PUBG data | `apiKey` |
| Puyo Nexus | `PuyoNexusClient` | `https://github.com/deltadex7/puyodb-api-deno` | Puyo Puyo information from Puyo Nexus Wiki | `免 Key` |
| quizapi.io | `QuizapiIoClient` | `https://quizapi.io/` | Access to various kind of quiz questions | `apiKey` |
| Raider | `RaiderClient` | `https://raider.io/api` | Provides detailed character and guild rankings for Raiding and Mythic+ content in World of Warcraft | `免 Key` |
| RAWG.io | `RawgIoClient` | `https://rawg.io/apidocs` | 500,000+ games for 50 platforms including mobiles | `apiKey` |
| Rick and Morty | `RickAndMortyClient` | `https://rickandmortyapi.com` | All the Rick and Morty information, including images | `免 Key` |
| Riot Games | `RiotGamesClient` | `https://developer.riotgames.com/` | League of Legends Game Information | `apiKey` |
| RPS 101 | `Rps101Client` | `https://rps101.pythonanywhere.com/api` | Rock, Paper, Scissors with 101 objects | `免 Key` |
| RuneScape | `RunescapeClient` | `https://runescape.wiki/w/Application_programming_interface` | RuneScape and OSRS RPGs information | `免 Key` |
| Sakura CardCaptor | `SakuraCardcaptorClient` | `https://github.com/JessVel/sakura-card-captor-api` | Sakura CardCaptor Cards Information | `免 Key` |
| Scryfall | `ScryfallClient` | `https://scryfall.com/docs/api` | Magic: The Gathering database | `免 Key` |
| SpaceTradersAPI | `SpacetradersapiClient` | `https://spacetraders.io?rel=pub-apis` | A playable inter-galactic space trading MMOAPI | `OAuth` |
| Steam | `SteamClient` | `https://steamapi.xpaw.me/` | Steam Web API documentation | `apiKey` |
| Steam | `SteamClient` | `https://github.com/Revadike/InternalSteamWebAPI/wiki` | Internal Steam Web API documentation | `免 Key` |
| SuperHeroes | `SuperheroesClient` | `https://superheroapi.com` | All SuperHeroes and Villains data from all universes under a single API | `apiKey` |
| TCGdex | `TcgdexClient` | `https://www.tcgdex.net/docs` | Multi languages Pokémon TCG Information | `免 Key` |
| Tebex | `TebexClient` | `https://docs.tebex.io/plugin/` | Tebex API for information about game purchases | `X-Mashape-Key` |
| TETR.IO | `TetrIoClient` | `https://tetr.io/about/api/` | TETR.IO Tetra Channel API | `免 Key` |
| Tronald Dump | `TronaldDumpClient` | `https://www.tronalddump.io/` | The dumbest things Donald Trump has ever said | `免 Key` |
| Universalis | `UniversalisClient` | `https://universalis.app/docs/index.html` | Final Fantasy XIV market board data | `免 Key` |
| Valorant (non-official) | `ValorantNonOfficialClient` | `https://valorant-api.com` | An extensive API containing data of most Valorant in-game items, assets and more | `免 Key` |
| Warface (non-official) | `WarfaceNonOfficialClient` | `https://api.wfstats.cf` | Official API proxy with better data structure and more features | `免 Key` |
| Wargaming.net | `WargamingNetClient` | `https://developers.wargaming.net/` | Wargaming.net info and stats | `apiKey` |
| When is next MCU film | `WhenIsNextMcuFilmClient` | `https://github.com/DiljotSG/MCU-Countdown/blob/develop/docs/API.md` | Upcoming MCU film information | `免 Key` |
| xkcd | `XkcdClient` | `https://xkcd.com/json.html` | Retrieve xkcd comics as JSON | `免 Key` |
| Yu-Gi-Oh! | `YuGiOhClient` | `https://db.ygoprodeck.com/api-guide/` | Yu-Gi-Oh! TCG Information | `免 Key` |


### Geocoding

本分类共包含 **90** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.geocoding.GeocodingAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| IPstack | `IpstackClient` | `https://ipstack.com/?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | Locate and identify website visitors by IP address | `apiKey` |
| ipapi.com | `IpapiComClient` | `https://ipapi.com/?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | Real-time Geolocation & Reverse IP Lookup REST API | `apiKey` |
| Actinia Grass GIS | `ActiniaGrassGisClient` | `https://actinia.mundialis.de/api_docs/` | Actinia is an open source REST API for geographical data that uses GRASS GIS | `apiKey` |
| administrative-divisons-db | `AdministrativeDivisonsDbClient` | `https://github.com/kamikazechaser/administrative-divisions-db` | Get all administrative divisions of a country | `免 Key` |
| ApogeoAPI | `ApogeoapiClient` | `https://apogeoapi.com` | Bundled API for countries, states, cities, IP geolocation, and live exchange rates | `apiKey` |
| adresse.data.gouv.fr | `AdresseDataGouvFrClient` | `https://adresse.data.gouv.fr` | Address database of France, geocoding and reverse | `免 Key` |
| Airtel IP | `AirtelIpClient` | `https://sys.airtel.lv/ip2country/1.1.1.1/?full=true` | IP Geolocation API. Collecting data from multiple sources | `免 Key` |
| Apiip | `ApiipClient` | `https://apiip.net/` | Get location information by IP address | `apiKey` |
| Battuta | `BattutaClient` | `http://battuta.medunes.net` | A (country/region/city) in-cascade location API | `apiKey` |
| BdAPIs | `BdapisClient` | `https://bdapis.com/` | Get divisions, districts, and upazzilas of Bangladesh | `免 Key` |
| BigDataCloud | `BigdatacloudClient` | `https://www.bigdatacloud.com/ip-geolocation-apis` | Provides fast and accurate IP geolocation APIs along with security checks and confidence area | `apiKey` |
| Bing Maps | `BingMapsClient` | `https://www.microsoft.com/maps/` | Create/customize digital maps based on Bing Maps data | `apiKey` |
| bng2latlong | `Bng2LatlongClient` | `https://www.getthedata.com/bng2latlong` | Convert British OSGB36 easting and northing (British National Grid) to WGS84 latitude and longitude | `免 Key` |
| Cartes.io | `CartesIoClient` | `https://github.com/M-Media-Group/Cartes.io/wiki/API` | Create maps and markers for anything | `免 Key` |
| Cep.la | `CepLaClient` | `http://cep.la/` | Brazil RESTful API to find information about streets, zip codes, neighborhoods, cities and states | `免 Key` |
| CitySDK | `CitysdkClient` | `http://www.citysdk.eu/citysdk-toolkit/` | Open APIs for select European cities | `免 Key` |
| Country | `CountryClient` | `http://country.is/` | Get your visitor's country from their IP | `免 Key` |
| CountryStateCity | `CountrystatecityClient` | `https://countrystatecity.in/` | World countries, states, regions, provinces, cities & towns in JSON, SQL, XML, YAML, & CSV format | `apiKey` |
| Ducks Unlimited | `DucksUnlimitedClient` | `https://gis.ducks.org/datasets/du-university-chapters/api` | API explorer that gives a query URL with a JSON response of locations and cities | `免 Key` |
| GeoApi | `GeoapiClient` | `https://api.gouv.fr/api/geoapi.html` | French geographical data | `免 Key` |
| Geoapify | `GeoapifyClient` | `https://www.geoapify.com/api/geocoding-api/` | Forward and reverse geocoding, address autocomplete | `apiKey` |
| Geocod.io | `GeocodIoClient` | `https://www.geocod.io/` | Address geocoding / reverse geocoding in bulk | `apiKey` |
| Geocode.xyz | `GeocodeXyzClient` | `https://geocode.xyz/api` | Provides worldwide forward/reverse geocoding, batch geocoding and geoparsing | `免 Key` |
| Geocodify.com | `GeocodifyComClient` | `https://geocodify.com/` | Worldwide geocoding, geoparsing and autocomplete for addresses | `apiKey` |
| Geodata.gov.gr | `GeodataGovGrClient` | `https://geodata.gov.gr/en/` | Open geospatial data and API service for Greece | `免 Key` |
| GeoDataSource | `GeodatasourceClient` | `https://www.geodatasource.com/web-service` | Geocoding of city name by using latitude and longitude coordinates | `apiKey` |
| GeoDB Cities | `GeodbCitiesClient` | `http://geodb-cities-api.wirefreethought.com/` | Get global city, region, and country data | `apiKey` |
| GeographQL | `GeographqlClient` | `https://geographql.netlify.app` | A Country, State, and City GraphQL API | `免 Key` |
| GeoJS | `GeojsClient` | `https://www.geojs.io/` | IP geolocation with ChatOps integration | `免 Key` |
| Geokeo | `GeokeoClient` | `https://geokeo.com` | Geokeo geocoding service- with 2500 free api requests daily | `免 Key` |
| GeoNames | `GeonamesClient` | `http://www.geonames.org/export/web-services.html` | Place names and other geographical data | `免 Key` |
| geoPlugin | `GeopluginClient` | `https://www.geoplugin.com` | IP geolocation and currency conversion | `免 Key` |
| Google Earth Engine | `GoogleEarthEngineClient` | `https://developers.google.com/earth-engine/` | A cloud-based platform for planetary-scale environmental data analysis | `apiKey` |
| Google Maps | `GoogleMapsClient` | `https://developers.google.com/maps/` | Create/customize digital maps based on Google Maps data | `apiKey` |
| Graph Countries | `GraphCountriesClient` | `https://github.com/lennertVanSever/graphcountries` | Country-related data like currencies, languages, flags, regions+subregions and bordering countries | `免 Key` |
| HackMyIP | `HackmyipClient` | `https://hackmyip.com/api` | IP geolocation, ISP and privacy/VPN scoring, email breach checks, DNS and WHOIS lookups | `免 Key` |
| HelloSalut | `HellosalutClient` | `https://fourtonfish.com/project/hellosalut-api/` | Get hello translation following user language | `免 Key` |
| HERE Maps | `HereMapsClient` | `https://developer.here.com` | Create/customize digital maps based on HERE Maps data | `apiKey` |
| Hirak IP to Country | `HirakIpToCountryClient` | `https://iplocation.hirak.site/` | Ip to location with country code, currency code & currency name, fast response, unlimited requests | `apiKey` |
| Hong Kong GeoData Store | `HongKongGeodataStoreClient` | `https://geodata.gov.hk/gs/` | API for accessing geo-data of Hong Kong | `免 Key` |
| IBGE | `IbgeClient` | `https://servicodados.ibge.gov.br/api/docs/` | Aggregate services of IBGE (Brazilian Institute of Geography and Statistics) | `免 Key` |
| IP 2 Country | `Ip2CountryClient` | `https://ip2country.info` | Map an IP to a country | `免 Key` |
| IP Address Details | `IpAddressDetailsClient` | `https://ipinfo.io/` | Find geolocation with ip address | `免 Key` |
| IP Vigilante | `IpVigilanteClient` | `https://www.ipvigilante.com/` | Free IP Geolocation API | `免 Key` |
| ip-api | `IpApiClient` | `https://ip-api.com/docs` | Find location with IP address or domain | `免 Key` |
| IP Geolocation | `IpGeolocationClient` | `https://www.abstractapi.com/ip-geolocation-api` | Geolocate website visitors from their IPs | `apiKey` |
| IP2Location | `Ip2LocationClient` | `https://www.ip2location.com/web-service/ip2location` | IP geolocation web service to get more than 55 parameters | `apiKey` |
| IP2Proxy | `Ip2ProxyClient` | `https://www.ip2location.com/web-service/ip2proxy` | Detect proxy and VPN using IP address | `apiKey` |
| ipapi.co | `IpapiCoClient` | `https://ipapi.co/api/#introduction` | Find IP address location information | `免 Key` |
| IPGEO | `IpgeoClient` | `https://api.techniknews.net/ipgeo/` | Unlimited free IP Address API with useful information | `免 Key` |
| ipgeolocation | `IpgeolocationClient` | `https://ipgeolocation.io/` | IP Geolocation AP with free plan 30k requests per month | `apiKey` |
| IPInfoDB | `IpinfodbClient` | `https://www.ipinfodb.com/api` | Free Geolocation tools and APIs for country, region, city and time zone lookup by IP address | `apiKey` |
| ipstack | `IpstackClient` | `https://ipstack.com/` | Locate and identify website visitors by IP address | `apiKey` |
| Kakao Maps | `KakaoMapsClient` | `https://apis.map.kakao.com` | Kakao Maps provide multiple APIs for Korean maps | `apiKey` |
| keycdn IP Location Finder | `KeycdnIpLocationFinderClient` | `https://tools.keycdn.com/geo` | Get the IP geolocation data through the simple REST API. All the responses are JSON encoded | `apiKey` |
| LocationIQ | `LocationiqClient` | `https://locationiq.org/docs/` | Provides forward/reverse geocoding and batch geocoding | `apiKey` |
| Longdo Map | `LongdoMapClient` | `https://map.longdo.com/docs/` | Interactive map with detailed places and information portal in Thailand | `apiKey` |
| Mapbox | `MapboxClient` | `https://docs.mapbox.com/` | Create/customize beautiful digital maps | `apiKey` |
| MapQuest | `MapquestClient` | `https://developer.mapquest.com/` | To access tools and resources to map the world | `apiKey` |
| Mexico | `MexicoClient` | `https://github.com/IcaliaLabs/sepomex` | Mexico RESTful zip codes API | `免 Key` |
| Nominatim | `NominatimClient` | `https://nominatim.org/release-docs/latest/api/Overview/` | Provides worldwide forward / reverse geocoding | `免 Key` |
| One Map, Singapore | `OneMapSingaporeClient` | `https://www.onemap.gov.sg/docs/` | Singapore Land Authority REST API services for Singapore addresses | `apiKey` |
| OnWater | `OnwaterClient` | `https://onwater.io/` | Determine if a lat/lon is on water or land | `免 Key` |
| Open Topo Data | `OpenTopoDataClient` | `https://www.opentopodata.org` | Elevation and ocean depth for a latitude and longitude | `免 Key` |
| OpenCage | `OpencageClient` | `https://opencagedata.com` | Forward and reverse geocoding using open data | `apiKey` |
| openrouteservice.org | `OpenrouteserviceOrgClient` | `https://openrouteservice.org/` | Directions, POIs, isochrones, geocoding (+reverse), elevation, and more | `apiKey` |
| OpenStreetMap | `OpenstreetmapClient` | `http://wiki.openstreetmap.org/wiki/API` | Navigation, geolocation and geographical data | `OAuth` |
| Pinball Map | `PinballMapClient` | `https://pinballmap.com/api/v1/docs` | A crowdsourced map of public pinball machines | `免 Key` |
| positionstack | `PositionstackClient` | `https://positionstack.com/` | Forward & Reverse Batch Geocoding REST API | `apiKey` |
| Postali | `PostaliClient` | `https://postali.app/api` | Mexico Zip Codes API | `免 Key` |
| PostcodeData.nl | `PostcodedataNlClient` | `http://api.postcodedata.nl/v1/postcode/?postcode=1211EP&streetnumber=60&ref=domeinnaam.nl&type=json` | Provide geolocation data based on postcode for Dutch addresses | `免 Key` |
| Postcodes.io | `PostcodesIoClient` | `https://postcodes.io` | Postcode lookup & Geolocation for the UK | `免 Key` |
| PostalCodes | `PostalcodesClient` | `https://postalcodes.info/api` | Postal code search, country exports, and address validation data | `免 Key` |
| Queimadas INPE | `QueimadasInpeClient` | `https://queimadas.dgi.inpe.br/queimadas/dados-abertos/` | Access to heat focus data (probable wildfire) | `免 Key` |
| REST Countries | `RestCountriesClient` | `https://restcountries.com` | Get information about countries via a RESTful API | `免 Key` |
| RoadGoat Cities | `RoadgoatCitiesClient` | `https://www.roadgoat.com/business/cities-api` | Cities content & photos API | `apiKey` |
| Rwanda Locations | `RwandaLocationsClient` | `https://rapidapi.com/victorkarangwa4/api/rwanda` | Rwanda Provences, Districts, Cities, Capital City, Sector, cells, villages and streets | `免 Key` |
| SLF | `SlfClient` | `https://github.com/slftool/slftool.github.io/blob/master/API.md` | German city, country, river, database | `免 Key` |
| SpotSense | `SpotsenseClient` | `https://spotsense.io/` | Add location based interactions to your mobile app | `apiKey` |
| Telize | `TelizeClient` | `https://rapidapi.com/fcambus/api/telize/` | Telize offers location information from any IP address | `apiKey` |
| TomTom | `TomtomClient` | `https://developer.tomtom.com/` | Maps, Directions, Places and Traffic APIs | `apiKey` |
| Uebermaps | `UebermapsClient` | `https://uebermaps.com/api/v2` | Discover and share maps with friends | `apiKey` |
| US ZipCode | `UsZipcodeClient` | `https://www.smarty.com/docs/cloud/us-zipcode-api` | Validate and append data for any US ZipCode | `apiKey` |
| Utah AGRC | `UtahAgrcClient` | `https://api.mapserv.utah.gov` | Utah Web API for geocoding Utah addresses | `apiKey` |
| ViaCep | `ViacepClient` | `https://viacep.com.br` | Brazil RESTful zip codes API | `免 Key` |
| What3Words | `What3WordsClient` | `https://what3words.com` | Three words as rememberable and unique coordinates worldwide | `apiKey` |
| Yandex.Maps Geocoder | `YandexMapsGeocoderClient` | `https://yandex.com/dev/maps/geocoder` | Use geocoding to get an object's coordinates from its address | `apiKey` |
| ZipCodeAPI | `ZipcodeapiClient` | `https://www.zipcodeapi.com` | US zip code distance, radius and location API | `apiKey` |
| Zippopotam.us | `ZippopotamUsClient` | `http://www.zippopotam.us` | Get information about place such as country, city, state, etc | `免 Key` |
| Ziptastic | `ZiptasticClient` | `https://ziptasticapi.com/` | Get the country, state, and city of any US zip-code | `免 Key` |


### Government

本分类共包含 **90** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.government.GovernmentAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Bank Negara Malaysia Open Data | `BankNegaraMalaysiaOpenDataClient` | `https://apikijangportal.bnm.gov.my/` | Malaysia Central Bank Open Data | `免 Key` |
| BCLaws | `BclawsClient` | `https://www.bclaws.gov.bc.ca/civix/template/complete/api/index.html` | Access to the laws of British Columbia | `免 Key` |
| Brazil | `BrazilClient` | `https://brasilapi.com.br/` | Community driven API for Brazil Public Data | `免 Key` |
| Brazil Central Bank Open Data | `BrazilCentralBankOpenDataClient` | `https://dadosabertos.bcb.gov.br/` | Brazil Central Bank Open Data | `免 Key` |
| Brazil Receita WS | `BrazilReceitaWsClient` | `https://www.receitaws.com.br/` | Consult companies by CNPJ for Brazilian companies | `免 Key` |
| Brazilian Chamber of Deputies Open Data | `BrazilianChamberOfDeputiesOpenDataClient` | `https://dadosabertos.camara.leg.br/swagger/api.html` | Provides legislative information in Apis XML and JSON, as well as files in various formats | `免 Key` |
| CPFHub | `CpfhubClient` | `https://cpfhub.io` | Brazilian CPF lookup — returns full name, birth date, and gender for any CPF | `apiKey` |
| Census.gov | `CensusGovClient` | `https://www.census.gov/data/developers/data-sets.html` | The US Census Bureau provides various APIs and data sets on demographics and businesses | `免 Key` |
| City, Berlin | `CityBerlinClient` | `https://daten.berlin.de/` | Berlin(DE) City Open Data | `免 Key` |
| City, Gdańsk | `CityGdaSkClient` | `https://ckan.multimediagdansk.pl/en` | Gdańsk (PL) City Open Data | `免 Key` |
| City, Gdynia | `CityGdyniaClient` | `http://otwartedane.gdynia.pl/en/api_doc.html` | Gdynia (PL) City Open Data | `免 Key` |
| City, Helsinki | `CityHelsinkiClient` | `https://hri.fi/en_gb/` | Helsinki(FI) City Open Data | `免 Key` |
| City, Lviv | `CityLvivClient` | `https://opendata.city-adm.lviv.ua/` | Lviv(UA) City Open Data | `免 Key` |
| City, Nantes Open Data | `CityNantesOpenDataClient` | `https://data.nantesmetropole.fr/pages/home/` | Nantes(FR) City Open Data | `apiKey` |
| City, New York Open Data | `CityNewYorkOpenDataClient` | `https://opendata.cityofnewyork.us/` | New York (US) City Open Data | `免 Key` |
| City, Prague Open Data | `CityPragueOpenDataClient` | `http://opendata.praha.eu/en` | Prague(CZ) City Open Data | `免 Key` |
| City, Toronto Open Data | `CityTorontoOpenDataClient` | `https://open.toronto.ca/` | Toronto (CA) City Open Data | `免 Key` |
| Code.gov | `CodeGovClient` | `https://code.gov` | The primary platform for Open Source and code sharing for the U.S. Federal Government | `apiKey` |
| Colorado Information Marketplace | `ColoradoInformationMarketplaceClient` | `https://data.colorado.gov/` | Colorado State Government Open Data | `免 Key` |
| Data USA | `DataUsaClient` | `https://datausa.io/about/api/` | US Public Data | `免 Key` |
| Data.gov | `DataGovClient` | `https://api.data.gov/` | US Government Data | `apiKey` |
| Data.parliament.uk | `DataParliamentUkClient` | `https://explore.data.parliament.uk/?learnmore=Members` | Contains live datasets including information about petitions, bills, MP votes, attendance and more | `免 Key` |
| Deutscher Bundestag DIP | `DeutscherBundestagDipClient` | `https://dip.bundestag.de/documents/informationsblatt_zur_dip_api_v01.pdf` | This API provides read access to DIP entities (e.g. activities, persons, printed material) | `apiKey` |
| District of Columbia Open Data | `DistrictOfColumbiaOpenDataClient` | `http://opendata.dc.gov/pages/using-apis` | Contains D.C. government public datasets, including crime, GIS, financial data, and so on | `免 Key` |
| EPA | `EpaClient` | `https://www.epa.gov/developers/data-data-products#apis` | Web services and data sets from the US Environmental Protection Agency | `免 Key` |
| FBI Wanted | `FbiWantedClient` | `https://www.fbi.gov/wanted/api` | Access information on the FBI Wanted program | `免 Key` |
| FEC | `FecClient` | `https://api.open.fec.gov/developers/` | Information on campaign donations in federal elections | `apiKey` |
| Federal Register | `FederalRegisterClient` | `https://www.federalregister.gov/reader-aids/developer-resources/rest-api` | The Daily Journal of the United States Government | `免 Key` |
| Food Standards Agency | `FoodStandardsAgencyClient` | `http://ratings.food.gov.uk/open-data/en-GB` | UK food hygiene rating data API | `免 Key` |
| Gazette Data, UK | `GazetteDataUkClient` | `https://www.thegazette.co.uk/data` | UK official public record API | `OAuth` |
| Gun Policy | `GunPolicyClient` | `https://www.gunpolicy.org/api` | International firearm injury prevention and policy | `apiKey` |
| Indian Pincode | `IndianPincodeClient` | `https://indianpincode.com/` | Free India PIN code lookup with GPS coordinates, 165k+ post offices, state & district data | `免 Key` |
| INEI | `IneiClient` | `http://iinei.inei.gob.pe/microdatos/` | Peruvian Statistical Government Open Data | `免 Key` |
| Interpol Red Notices | `InterpolRedNoticesClient` | `https://interpol.api.bund.dev/` | Access and search Interpol Red Notices | `免 Key` |
| Istanbul (İBB) Open Data | `IstanbulBbOpenDataClient` | `https://data.ibb.gov.tr` | Data sets from the İstanbul Metropolitan Municipality (İBB) | `免 Key` |
| LocalGov.jp | `LocalgovJpClient` | `https://localgov.jp/` | Japan grants and subsidies (central J-Grants + 1,916 municipalities) | `免 Key` |
| National Park Service, US | `NationalParkServiceUsClient` | `https://www.nps.gov/subjects/developer/` | Data from the US National Park Service | `apiKey` |
| Open Government, ACT | `OpenGovernmentActClient` | `https://www.data.act.gov.au/` | Australian Capital Territory Open Data | `免 Key` |
| Open Government, Argentina | `OpenGovernmentArgentinaClient` | `https://datos.gob.ar/` | Argentina Government Open Data | `免 Key` |
| Open Government, Australia | `OpenGovernmentAustraliaClient` | `https://www.data.gov.au/` | Australian Government Open Data | `免 Key` |
| Open Government, Austria | `OpenGovernmentAustriaClient` | `https://www.data.gv.at/` | Austria Government Open Data | `免 Key` |
| Open Government, Belgium | `OpenGovernmentBelgiumClient` | `https://data.gov.be/` | Belgium Government Open Data | `免 Key` |
| Open Government, Canada | `OpenGovernmentCanadaClient` | `http://open.canada.ca/en` | Canadian Government Open Data | `免 Key` |
| Open Government, Colombia | `OpenGovernmentColombiaClient` | `https://www.dane.gov.co/` | Colombia Government Open Data | `免 Key` |
| Open Government, Cyprus | `OpenGovernmentCyprusClient` | `https://data.gov.cy/?language=en` | Cyprus Government Open Data | `免 Key` |
| Open Government, Czech Republic | `OpenGovernmentCzechRepublicClient` | `https://data.gov.cz/english/` | Czech Republic Government Open Data | `免 Key` |
| Open Government, Denmark | `OpenGovernmentDenmarkClient` | `https://www.opendata.dk/` | Denmark Government Open Data | `免 Key` |
| Open Government, Estonia | `OpenGovernmentEstoniaClient` | `https://avaandmed.eesti.ee/instructions/opendata-dataset-api` | Estonia Government Open Data | `apiKey` |
| Open Government, Finland | `OpenGovernmentFinlandClient` | `https://www.avoindata.fi/en` | Finland Government Open Data | `免 Key` |
| Open Government, France | `OpenGovernmentFranceClient` | `https://www.data.gouv.fr/` | French Government Open Data | `apiKey` |
| Open Government, Germany | `OpenGovernmentGermanyClient` | `https://www.govdata.de/daten/-/details/govdata-metadatenkatalog` | Germany Government Open Data | `免 Key` |
| Open Government, Greece | `OpenGovernmentGreeceClient` | `https://data.gov.gr/` | Greece Government Open Data | `OAuth` |
| Open Government, India | `OpenGovernmentIndiaClient` | `https://data.gov.in/` | Indian Government Open Data | `apiKey` |
| Open Government, Ireland | `OpenGovernmentIrelandClient` | `https://data.gov.ie/pages/developers` | Ireland Government Open Data | `免 Key` |
| Open Government, Italy | `OpenGovernmentItalyClient` | `https://www.dati.gov.it/` | Italy Government Open Data | `免 Key` |
| Open Government, Korea | `OpenGovernmentKoreaClient` | `https://www.data.go.kr/` | Korea Government Open Data | `apiKey` |
| Open Government, Lithuania | `OpenGovernmentLithuaniaClient` | `https://data.gov.lt/public/api/1` | Lithuania Government Open Data | `免 Key` |
| Open Government, Luxembourg | `OpenGovernmentLuxembourgClient` | `https://data.public.lu` | Luxembourgish Government Open Data | `apiKey` |
| Open Government, Mexico | `OpenGovernmentMexicoClient` | `https://www.inegi.org.mx/datos/` | Mexican Statistical Government Open Data | `免 Key` |
| Open Government, Mexico | `OpenGovernmentMexicoClient` | `https://datos.gob.mx/` | Mexico Government Open Data | `免 Key` |
| Open Government, Netherlands | `OpenGovernmentNetherlandsClient` | `https://data.overheid.nl/en/ondersteuning/data-publiceren/api` | Netherlands Government Open Data | `免 Key` |
| Open Government, New South Wales | `OpenGovernmentNewSouthWalesClient` | `https://api.nsw.gov.au/` | New South Wales Government Open Data | `apiKey` |
| Open Government, New Zealand | `OpenGovernmentNewZealandClient` | `https://www.data.govt.nz/` | New Zealand Government Open Data | `免 Key` |
| Open Government, Norway | `OpenGovernmentNorwayClient` | `https://data.norge.no/dataservices` | Norwegian Government Open Data | `免 Key` |
| Open Government, Peru | `OpenGovernmentPeruClient` | `https://www.datosabiertos.gob.pe/` | Peru Government Open Data | `免 Key` |
| Open Government, Poland | `OpenGovernmentPolandClient` | `https://dane.gov.pl/en` | Poland Government Open Data | `免 Key` |
| Open Government, Portugal | `OpenGovernmentPortugalClient` | `https://dados.gov.pt/en/docapi/` | Portugal Government Open Data | `免 Key` |
| Open Government, Queensland Government | `OpenGovernmentQueenslandGovernmentClient` | `https://www.data.qld.gov.au/` | Queensland Government Open Data | `免 Key` |
| Open Government, Romania | `OpenGovernmentRomaniaClient` | `http://data.gov.ro/` | Romania Government Open Data | `免 Key` |
| Open Government, Saudi Arabia | `OpenGovernmentSaudiArabiaClient` | `https://data.gov.sa` | Saudi Arabia Government Open Data | `免 Key` |
| Open Government, Singapore | `OpenGovernmentSingaporeClient` | `https://data.gov.sg/developer` | Singapore Government Open Data | `免 Key` |
| Open Government, Slovakia | `OpenGovernmentSlovakiaClient` | `https://data.gov.sk/en/` | Slovakia Government Open Data | `免 Key` |
| Open Government, Slovenia | `OpenGovernmentSloveniaClient` | `https://podatki.gov.si/` | Slovenia Government Open Data | `免 Key` |
| Open Government, South Australian Government | `OpenGovernmentSouthAustralianGovernmentClient` | `https://data.sa.gov.au/` | South Australian Government Open Data | `免 Key` |
| Open Government, Spain | `OpenGovernmentSpainClient` | `https://datos.gob.es/en` | Spain Government Open Data | `免 Key` |
| Open Government, Sweden | `OpenGovernmentSwedenClient` | `https://www.dataportal.se/en/dataservice/91_29789/api-for-the-statistical-database` | Sweden Government Open Data | `免 Key` |
| Open Government, Switzerland | `OpenGovernmentSwitzerlandClient` | `https://handbook.opendata.swiss/de/content/nutzen/api-nutzen.html` | Switzerland Government Open Data | `免 Key` |
| Open Government, Taiwan | `OpenGovernmentTaiwanClient` | `https://data.gov.tw/` | Taiwan Government Open Data | `免 Key` |
| Open Government, Thailand | `OpenGovernmentThailandClient` | `https://data.go.th/` | Thailand Government Open Data | `apiKey` |
| Open Government, UK | `OpenGovernmentUkClient` | `https://data.gov.uk/` | UK Government Open Data | `免 Key` |
| Open Government, USA | `OpenGovernmentUsaClient` | `https://www.data.gov/` | United States Government Open Data | `免 Key` |
| Open Government, Victoria State Government | `OpenGovernmentVictoriaStateGovernmentClient` | `https://www.data.vic.gov.au/` | Victoria State Government Open Data | `免 Key` |
| Open Government, West Australia | `OpenGovernmentWestAustraliaClient` | `https://data.wa.gov.au/` | West Australia Open Data | `免 Key` |
| OpenRegistry | `OpenregistryClient` | `https://openregistry.sophymarine.com` | Real-time queries to 27 national company registries (UK, FR, DE, IT, ES, KR + 21 more) | `OAuth` |
| PRC Exam Schedule | `PrcExamScheduleClient` | `https://api.whenisthenextboardexam.com/docs/` | Unofficial Philippine Professional Regulation Commission's examination schedule | `免 Key` |
| Represent by Open North | `RepresentByOpenNorthClient` | `https://represent.opennorth.ca/` | Find Canadian Government Representatives | `免 Key` |
| UK Companies House | `UkCompaniesHouseClient` | `https://developer.company-information.service.gov.uk/` | UK Companies House Data from the UK government | `OAuth` |
| US Presidential Election Data by TogaTech | `UsPresidentialElectionDataByTogatechClient` | `https://uselection.togatech.org/api/` | Basic candidate data and live electoral vote counts for top two parties in US presidential election | `免 Key` |
| USA.gov | `UsaGovClient` | `https://www.usa.gov/developer` | Authoritative information on U.S. programs, events, services and more | `apiKey` |
| USAspending.gov | `UsaspendingGovClient` | `https://api.usaspending.gov/` | US federal spending data | `免 Key` |


### Transportation

本分类共包含 **71** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.transportation.TransportationAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| ADS-B Exchange | `AdsBExchangeClient` | `https://www.adsbexchange.com/data/` | Access real-time and historical data of any and all airborne aircraft | `免 Key` |
| airportsapi | `AirportsapiClient` | `https://airport-web.appspot.com/api/docs/` | Get name and website-URL for airports by ICAO code | `免 Key` |
| AIS Hub | `AisHubClient` | `http://www.aishub.net/api` | Real-time data of any marine and inland vessel equipped with AIS tracking system | `apiKey` |
| Amadeus for Developers | `AmadeusForDevelopersClient` | `https://developers.amadeus.com/self-service` | Travel Search - Limited usage | `OAuth` |
| apilayer aviationstack | `ApilayerAviationstackClient` | `https://aviationstack.com/` | Real-time Flight Status & Global Aviation Data API | `OAuth` |
| Apimetro | `ApimetroClient` | `https://apimetro.dev/swagger/index.html` | Geospatial data for Mexico City public transport system (Metro, Metrobús, Cablebús, RTP, etc.) | `免 Key` |
| AviationAPI | `AviationapiClient` | `https://docs.aviationapi.com` | FAA Aeronautical Charts and Publications, Airport Information, and Airport Weather | `免 Key` |
| AZ511 | `Az511Client` | `https://www.az511.com/developers/doc` | Access traffic data from the ADOT API | `apiKey` |
| Bay Area Rapid Transit | `BayAreaRapidTransitClient` | `http://api.bart.gov` | Stations and predicted arrivals for BART | `apiKey` |
| BC Ferries | `BcFerriesClient` | `https://www.bcferriesapi.ca` | Sailing times and capacities for BC Ferries | `免 Key` |
| BIC-Boxtech | `BicBoxtechClient` | `https://docs.bic-boxtech.org/` | Container technical detail for the global container fleet | `OAuth` |
| BlaBlaCar | `BlablacarClient` | `https://dev.blablacar.com` | Search car sharing trips | `apiKey` |
| Boston MBTA Transit | `BostonMbtaTransitClient` | `https://www.mbta.com/developers/v3-api` | Stations and predicted arrivals for MBTA | `apiKey` |
| Community Transit | `CommunityTransitClient` | `https://github.com/transitland/transitland-datastore/blob/master/README.md#api-endpoints` | Transitland API | `免 Key` |
| Compare Flight Prices | `CompareFlightPricesClient` | `https://rapidapi.com/obryan-software-obryan-software-default/api/compare-flight-prices/` | API for comparing flight prices across platforms | `apiKey` |
| CTS | `CtsClient` | `https://api.cts-strasbourg.eu/` | CTS Realtime API | `apiKey` |
| Grab | `GrabClient` | `https://developer.grab.com/docs/` | Track deliveries, ride fares, payments and loyalty points | `OAuth` |
| GraphHopper | `GraphhopperClient` | `https://docs.graphhopper.com/` | A-to-B routing with turn-by-turn instructions | `apiKey` |
| Icelandic APIs | `IcelandicApisClient` | `http://docs.apis.is/` | Open APIs that deliver services in or regarding Iceland | `免 Key` |
| Impala Hotel Bookings | `ImpalaHotelBookingsClient` | `https://docs.impala.travel/docs/booking-api/` | Hotel content, rates and room bookings | `apiKey` |
| Izi | `IziClient` | `http://api-docs.izi.travel/` | Audio guide for travellers | `apiKey` |
| Land Transport Authority DataMall, Singapore | `LandTransportAuthorityDatamallSingaporeClient` | `https://datamall.lta.gov.sg/content/dam/datamall/datasets/LTA_DataMall_API_User_Guide.pdf` | Singapore transport information | `apiKey` |
| Metro Lisboa | `MetroLisboaClient` | `http://app.metrolisboa.pt/status/getLinhas.php` | Delays in subway lines | `免 Key` |
| Navitia | `NavitiaClient` | `https://doc.navitia.io/` | The open API for building cool stuff with transport data | `apiKey` |
| Open Charge Map | `OpenChargeMapClient` | `https://openchargemap.org/site/develop/api` | Global public registry of electric vehicle charging locations | `apiKey` |
| Orizn Visa | `OriznVisaClient` | `https://visa.orizn.app` | Visa requirements for 199 countries, 39K+ passport-destination pairs in 15 languages | `apiKey` |
| OpenSky Network | `OpenskyNetworkClient` | `https://opensky-network.org/apidoc/index.html` | Free real-time ADS-B aviation data | `免 Key` |
| Railway Transport for France | `RailwayTransportForFranceClient` | `https://www.digital.sncf.com/startup/api` | SNCF public API | `apiKey` |
| REFUGE Restrooms | `RefugeRestroomsClient` | `https://www.refugerestrooms.org/api/docs/#!/restrooms` | Provides safe restroom access for transgender, intersex and gender nonconforming individuals | `免 Key` |
| Sabre for Developers | `SabreForDevelopersClient` | `https://developer.sabre.com/guides/travel-agency/quickstart/getting-started-in-travel` | Travel Search - Limited usage | `apiKey` |
| Schiphol Airport | `SchipholAirportClient` | `https://developer.schiphol.nl/` | Schiphol | `apiKey` |
| Tankerkoenig | `TankerkoenigClient` | `https://creativecommons.tankerkoenig.de/swagger/` | German realtime gas/diesel prices | `apiKey` |
| TransitLand | `TransitlandClient` | `https://www.transit.land/documentation/datastore/api-endpoints.html` | Transit Aggregation | `免 Key` |
| Transport for Atlanta, US | `TransportForAtlantaUsClient` | `http://www.itsmarta.com/app-developer-resources.aspx` | Marta | `免 Key` |
| Transport for Auckland, New Zealand | `TransportForAucklandNewZealandClient` | `https://dev-portal.at.govt.nz/` | Auckland Transport | `免 Key` |
| Transport for Belgium | `TransportForBelgiumClient` | `https://docs.irail.be/` | The iRail API is a third-party API for Belgian public transport by train | `免 Key` |
| Transport for Berlin, Germany | `TransportForBerlinGermanyClient` | `https://github.com/derhuerst/vbb-rest/blob/3/docs/index.md` | Third-party VBB API | `免 Key` |
| Transport for Bordeaux, France | `TransportForBordeauxFranceClient` | `https://opendata.bordeaux-metropole.fr/explore/` | Bordeaux Métropole public transport and more (France) | `apiKey` |
| Transport for Budapest, Hungary | `TransportForBudapestHungaryClient` | `https://bkkfutar.docs.apiary.io` | Budapest public transport API | `免 Key` |
| Transport for Chicago, US | `TransportForChicagoUsClient` | `http://www.transitchicago.com/developers/` | Chicago Transit Authority (CTA) | `apiKey` |
| Transport for Czech Republic | `TransportForCzechRepublicClient` | `https://www.chaps.cz/eng/products/idos-internet` | Czech transport API | `免 Key` |
| Transport for Denver, US | `TransportForDenverUsClient` | `http://www.rtd-denver.com/gtfs-developer-guide.shtml` | RTD | `免 Key` |
| Transport for Finland | `TransportForFinlandClient` | `https://digitransit.fi/en/developers/` | Finnish transport API | `免 Key` |
| Transport for Germany | `TransportForGermanyClient` | `http://data.deutschebahn.com/dataset/api-fahrplan` | Deutsche Bahn (DB) API | `apiKey` |
| Transport for Grenoble, France | `TransportForGrenobleFranceClient` | `https://www.mobilites-m.fr/pages/opendata/OpenDataApi.html` | Grenoble public transport | `免 Key` |
| Transport for Hessen, Germany | `TransportForHessenGermanyClient` | `https://opendata.rmv.de/site/start.html` | RMV API (Public Transport in Hessen) | `免 Key` |
| Transport for Honolulu, US | `TransportForHonoluluUsClient` | `http://hea.thebus.org/api_info.asp` | Honolulu Transportation Information | `apiKey` |
| Transport for Lisbon, Portugal | `TransportForLisbonPortugalClient` | `https://emel.city-platform.com/opendata/` | Data about buses routes, parking and traffic | `apiKey` |
| Transport for London, England | `TransportForLondonEnglandClient` | `https://api.tfl.gov.uk` | TfL API | `apiKey` |
| Transport for Los Angeles, US | `TransportForLosAngelesUsClient` | `https://developer.metro.net/api/` | Data about positions of Metro vehicles in real time and travel their routes | `免 Key` |
| Transport for Manchester, England | `TransportForManchesterEnglandClient` | `https://developer.tfgm.com/` | TfGM transport network data | `apiKey` |
| Transport for Norway | `TransportForNorwayClient` | `https://developer.entur.org/` | Transport APIs and dataset for Norway | `免 Key` |
| Transport for Ottawa, Canada | `TransportForOttawaCanadaClient` | `https://www.octranspo.com/en/plan-your-trip/travel-tools/developers` | OC Transpo API | `apiKey` |
| Transport for Paris, France | `TransportForParisFranceClient` | `http://data.ratp.fr/api/v1/console/datasets/1.0/search/` | RATP Open Data API | `免 Key` |
| Transport for Philadelphia, US | `TransportForPhiladelphiaUsClient` | `http://www3.septa.org/hackathon/` | SEPTA APIs | `免 Key` |
| Transport for Sao Paulo, Brazil | `TransportForSaoPauloBrazilClient` | `http://www.sptrans.com.br/desenvolvedores/api-do-olho-vivo-guia-de-referencia/documentacao-api/` | SPTrans | `OAuth` |
| Transport for Spain | `TransportForSpainClient` | `https://data.renfe.com/api/1/util/snippet/api_info.html?resource_id=a2368cff-1562-4dde-8466-9635ea3a572a` | Public trains of Spain | `免 Key` |
| Transport for Sweden | `TransportForSwedenClient` | `https://www.trafiklab.se/api` | Public Transport consumer | `OAuth` |
| Transport for Switzerland | `TransportForSwitzerlandClient` | `https://opentransportdata.swiss/en/` | Official Swiss Public Transport Open Data | `apiKey` |
| Transport for Switzerland | `TransportForSwitzerlandClient` | `https://transport.opendata.ch/` | Swiss public transport API | `免 Key` |
| Transport for The Netherlands | `TransportForTheNetherlandsClient` | `http://www.ns.nl/reisinformatie/ns-api` | NS, only trains | `apiKey` |
| Transport for The Netherlands | `TransportForTheNetherlandsClient` | `https://github.com/skywave/KV78Turbo-OVAPI/wiki` | OVAPI, country-wide public transport | `免 Key` |
| Transport for Toronto, Canada | `TransportForTorontoCanadaClient` | `https://myttc.ca/developers` | TTC | `免 Key` |
| Transport for UK | `TransportForUkClient` | `https://developer.transportapi.com` | Transport API and dataset for UK | `apiKey` |
| Transport for United States | `TransportForUnitedStatesClient` | `https://retro.umoiq.com/xmlFeedDocs/NextBusXMLFeed.pdf` | NextBus API | `免 Key` |
| Transport for Vancouver, Canada | `TransportForVancouverCanadaClient` | `https://developer.translink.ca/` | TransLink | `OAuth` |
| Transport for Washington, US | `TransportForWashingtonUsClient` | `https://developer.wmata.com/` | Washington Metro transport API | `OAuth` |
| transport.rest | `TransportRestClient` | `https://transport.rest` | Community maintained, developer-friendly public transport API | `免 Key` |
| Tripadvisor | `TripadvisorClient` | `https://developer-tripadvisor.com/home/` | Rating content for a hotel, restaurant, attraction or destination | `apiKey` |
| Uber | `UberClient` | `https://developer.uber.com/products` | Uber ride requests and price estimation | `OAuth` |
| Velib metropolis, Paris, France | `VelibMetropolisParisFranceClient` | `https://www.velib-metropole.fr/donnees-open-data-gbfs-du-service-velib-metropole` | Velib Open Data API | `免 Key` |


### Cryptocurrency

本分类共包含 **66** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.cryptocurrency.CryptocurrencyAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Coinlayer | `CoinlayerClient` | `https://coinlayer.com?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | Real-time Crypto Currency Exchange Rates | `apiKey` |
| 0x | `Api0XClient` | `https://0x.org/api` | API for querying token and pool stats across various liquidity pools | `免 Key` |
| 1inch | `Api1InchClient` | `https://1inch.io/api/` | API for querying decentralize exchange | `免 Key` |
| Alchemy Ethereum | `AlchemyEthereumClient` | `https://docs.alchemy.com/alchemy/` | Ethereum Node-as-a-Service Provider | `apiKey` |
| Alpha (Mossland) | `AlphaMosslandClient` | `https://alpha.moss.land/developers` | Korean crypto channel stance + RAG Q&A + canonical entity/topic/event store | `免 Key` |
| Binance | `BinanceClient` | `https://github.com/binance/binance-spot-api-docs` | Exchange for Trading Cryptocurrencies based in China | `apiKey` |
| Bitcambio | `BitcambioClient` | `https://nova.bitcambio.com.br/api/v3/docs#a-public` | Get the list of all traded assets in the exchange | `免 Key` |
| BitcoinAverage | `BitcoinaverageClient` | `https://apiv2.bitcoinaverage.com/` | Digital Asset Price Data for the blockchain industry | `apiKey` |
| BitcoinCharts | `BitcoinchartsClient` | `https://bitcoincharts.com/about/exchanges/` | Financial and Technical Data related to the Bitcoin Network | `免 Key` |
| Bitfinex | `BitfinexClient` | `https://docs.bitfinex.com/docs` | Cryptocurrency Trading Platform | `apiKey` |
| Bitmex | `BitmexClient` | `https://www.bitmex.com/app/apiOverview` | Real-Time Cryptocurrency derivatives trading platform based in Hong Kong | `apiKey` |
| Bittrex | `BittrexClient` | `https://bittrex.github.io/api/v3` | Next Generation Crypto Trading Platform | `apiKey` |
| Block | `BlockClient` | `https://block.io/docs/basic` | Bitcoin Payment, Wallet & Transaction Data | `apiKey` |
| Blockchain | `BlockchainClient` | `https://www.blockchain.com/api` | Bitcoin Payment, Wallet & Transaction Data | `apiKey` |
| blockfrost Cardano | `BlockfrostCardanoClient` | `https://blockfrost.io/` | Interaction with the Cardano mainnet and several testnets | `apiKey` |
| Brave NewCoin | `BraveNewcoinClient` | `https://bravenewcoin.com/developers` | Real-time and historic crypto data from more than 200+ exchanges | `apiKey` |
| BtcTurk | `BtcturkClient` | `https://docs.btcturk.com/` | Real-time cryptocurrency data, graphs and API that allows buy&sell | `apiKey` |
| Bybit | `BybitClient` | `https://bybit-exchange.github.io/docs/linear/#t-introduction` | Cryptocurrency data feed and algorithmic trading | `apiKey` |
| CoinAPI | `CoinapiClient` | `https://docs.coinapi.io/` | All Currency Exchanges integrate under a single api | `apiKey` |
| Coinbase | `CoinbaseClient` | `https://developers.coinbase.com` | Bitcoin, Bitcoin Cash, Litecoin and Ethereum Prices | `apiKey` |
| Coinbase Pro | `CoinbaseProClient` | `https://docs.pro.coinbase.com/#api` | Cryptocurrency Trading Platform | `apiKey` |
| CoinCap | `CoincapClient` | `https://docs.coincap.io/` | Real time Cryptocurrency prices through a RESTful API | `免 Key` |
| CoinDCX | `CoindcxClient` | `https://docs.coindcx.com/` | Cryptocurrency Trading Platform | `apiKey` |
| CoinDesk | `CoindeskClient` | `https://old.coindesk.com/coindesk-api/` | CoinDesk's Bitcoin Price Index (BPI) in multiple currencies | `免 Key` |
| CoinGecko | `CoingeckoClient` | `http://www.coingecko.com/api` | Cryptocurrency Price, Market, and Developer/Social Data | `免 Key` |
| Coinigy | `CoinigyClient` | `https://coinigy.docs.apiary.io` | Interacting with Coinigy Accounts and Exchange Directly | `apiKey` |
| Coinlib | `CoinlibClient` | `https://coinlib.io/apidocs` | Crypto Currency Prices | `apiKey` |
| Coinlore | `CoinloreClient` | `https://www.coinlore.com/cryptocurrency-data-api` | Cryptocurrencies prices, volume and more | `免 Key` |
| CoinMarketCap | `CoinmarketcapClient` | `https://coinmarketcap.com/api/` | Cryptocurrencies Prices | `apiKey` |
| Coinpaprika | `CoinpaprikaClient` | `https://api.coinpaprika.com` | Cryptocurrencies prices, volume and more | `免 Key` |
| CoinRanking | `CoinrankingClient` | `https://developers.coinranking.com/api/documentation` | Live Cryptocurrency data | `apiKey` |
| Coinremitter | `CoinremitterClient` | `https://coinremitter.com/docs` | Cryptocurrencies Payment & Prices | `apiKey` |
| CoinStats | `CoinstatsClient` | `https://documenter.getpostman.com/view/5734027/RzZ6Hzr3?version=latest` | Crypto Tracker | `免 Key` |
| CryptAPI | `CryptapiClient` | `https://docs.cryptapi.io/` | Cryptocurrency Payment Processor | `免 Key` |
| CryptingUp | `CryptingupClient` | `https://www.cryptingup.com/apidoc/#introduction` | Cryptocurrency data | `免 Key` |
| CryptoCompare | `CryptocompareClient` | `https://www.cryptocompare.com/api#` | Cryptocurrencies Comparison | `免 Key` |
| CryptoMarket | `CryptomarketClient` | `https://api.exchange.cryptomkt.com/` | Cryptocurrencies Trading platform | `apiKey` |
| Cryptonator | `CryptonatorClient` | `https://www.cryptonator.com/api/` | Cryptocurrencies Exchange Rates | `免 Key` |
| dYdX | `DydxClient` | `https://docs.dydx.exchange/` | Decentralized cryptocurrency exchange | `apiKey` |
| Ethplorer | `EthplorerClient` | `https://github.com/EverexIO/Ethplorer/wiki/Ethplorer-API` | Ethereum tokens, balances, addresses, history of transactions, contracts, and custom structures | `apiKey` |
| EXMO | `ExmoClient` | `https://documenter.getpostman.com/view/10287440/SzYXWKPi` | Cryptocurrencies exchange based in UK | `apiKey` |
| FTX | `FtxClient` | `https://docs.ftx.com/` | Complete REST, websocket, and FTX APIs to suit your algorithmic trading needs | `apiKey` |
| Gateio | `GateioClient` | `https://www.gate.io/api2` | API provides spot, margin and futures trading operations | `apiKey` |
| Gemini | `GeminiClient` | `https://docs.gemini.com/rest-api/` | Cryptocurrencies Exchange | `免 Key` |
| Hirak Exchange Rates | `HirakExchangeRatesClient` | `https://rates.hirak.site/` | Exchange rates between 162 currency & 300 crypto currency update each 5 min, accurate, no limits | `apiKey` |
| Huobi | `HuobiClient` | `https://huobiapi.github.io/docs/spot/v1/en/` | Seychelles based cryptocurrency exchange | `apiKey` |
| icy.tools | `IcyToolsClient` | `https://developers.icy.tools/` | GraphQL based NFT API | `apiKey` |
| Indodax | `IndodaxClient` | `https://github.com/btcid/indodax-official-api-docs` | Trade your Bitcoin and other assets with rupiah | `apiKey` |
| INFURA Ethereum | `InfuraEthereumClient` | `https://infura.io/product/ethereum` | Interaction with the Ethereum mainnet and several testnets | `apiKey` |
| Kraken | `KrakenClient` | `https://docs.kraken.com/rest/` | Cryptocurrencies Exchange | `apiKey` |
| KuCoin | `KucoinClient` | `https://docs.kucoin.com/` | Cryptocurrency Trading Platform | `apiKey` |
| Localbitcoins | `LocalbitcoinsClient` | `https://localbitcoins.com/api-docs/` | P2P platform to buy and sell Bitcoins | `免 Key` |
| Mempool | `MempoolClient` | `https://mempool.space/api` | Bitcoin API Service focusing on the transaction fee | `免 Key` |
| MercadoBitcoin | `MercadobitcoinClient` | `https://www.mercadobitcoin.com.br/api-doc/` | Brazilian Cryptocurrency Information | `免 Key` |
| Messari | `MessariClient` | `https://messari.io/api` | Provides API endpoints for thousands of crypto assets | `免 Key` |
| Nexchange | `NexchangeClient` | `https://nexchange2.docs.apiary.io/` | Automated cryptocurrency exchange service | `免 Key` |
| Nomics | `NomicsClient` | `https://nomics.com/docs/` | Historical and realtime cryptocurrency prices and market data | `apiKey` |
| NovaDax | `NovadaxClient` | `https://doc.novadax.com/en-US/#introduction` | NovaDAX API to access all market data, trading management endpoints | `apiKey` |
| OKEx | `OkexClient` | `https://www.okex.com/docs/` | Cryptocurrency exchange based in Seychelles | `apiKey` |
| Poloniex | `PoloniexClient` | `https://docs.poloniex.com` | US based digital asset exchange | `apiKey` |
| PumpFunData | `PumpfundataClient` | `https://pumpfundata.com/docs` | Historical Pump.fun and PumpSwap AMM swap data as hourly Parquet files | `apiKey` |
| Solana JSON RPC | `SolanaJsonRpcClient` | `https://docs.solana.com/developing/clients/jsonrpc-api` | Provides various endpoints to interact with the Solana Blockchain | `免 Key` |
| Technical Analysis | `TechnicalAnalysisClient` | `https://technical-analysis-api.com` | Cryptocurrency prices and technical analysis | `apiKey` |
| VALR | `ValrClient` | `https://docs.valr.com/` | Cryptocurrency Exchange based in South Africa | `apiKey` |
| WorldCoinIndex | `WorldcoinindexClient` | `https://www.worldcoinindex.com/apiservice` | Cryptocurrencies Prices | `apiKey` |
| ZMOK | `ZmokClient` | `https://zmok.io` | Ethereum JSON RPC API and Web3 provider | `免 Key` |


### Finance

本分类共包含 **48** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.finance.FinanceAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Marketstack | `MarketstackClient` | `https://marketstack.com/?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | Real-Time, Intraday & Historical Market Data API | `apiKey` |
| Aletheia | `AletheiaClient` | `https://aletheiaapi.com/` | Insider trading data, earnings call analysis, financial statements, and more | `apiKey` |
| Alpaca | `AlpacaClient` | `https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-data-api-v2/` | Realtime and historical market data on all US equities and ETFs | `apiKey` |
| Alpha Vantage | `AlphaVantageClient` | `https://www.alphavantage.co/` | Realtime and historical stock data | `apiKey` |
| Banco do Brasil | `BancoDoBrasilClient` | `https://developers.bb.com.br/home` | All Banco do Brasil financial transaction APIs | `OAuth` |
| Bank Data | `BankDataClient` | `https://apilayer.com/marketplace/bank_data-api` | Instant IBAN and SWIFT number validation across the globe | `apiKey` |
| Billplz | `BillplzClient` | `https://www.billplz.com/api` | Payment platform | `apiKey` |
| Binlist | `BinlistClient` | `https://binlist.net/` | Public access to a database of IIN/BIN information | `免 Key` |
| Boleto.Cloud | `BoletoCloudClient` | `https://boleto.cloud/` | A api to generate boletos in Brazil | `apiKey` |
| Citi | `CitiClient` | `https://sandbox.developerhub.citi.com/api-catalog-list` | All Citigroup account and statement data APIs | `apiKey` |
| Econdb | `EcondbClient` | `https://www.econdb.com/api/` | Global macroeconomic data | `免 Key` |
| EconPulse | `EconpulseClient` | `https://econpulse.io` | Live economic data — CPI, PPI, energy, treasury rates, BTC premium | `apiKey` |
| Fed Treasury | `FedTreasuryClient` | `https://fiscaldata.treasury.gov/api-documentation/` | U.S. Department of the Treasury Data | `免 Key` |
| Finage | `FinageClient` | `https://finage.co.uk` | Finage is a stock, currency, cryptocurrency, indices, and ETFs real-time & historical data provider | `apiKey` |
| Financial Modeling Prep | `FinancialModelingPrepClient` | `https://site.financialmodelingprep.com/developer/docs` | Realtime and historical stock data | `apiKey` |
| Finnhub | `FinnhubClient` | `https://finnhub.io/docs/api` | Real-Time RESTful APIs and Websocket for Stocks, Currencies, and Crypto | `apiKey` |
| FRED | `FredClient` | `https://fred.stlouisfed.org/docs/api/fred/` | Economic data from the Federal Reserve Bank of St. Louis | `apiKey` |
| Front Accounting APIs | `FrontAccountingApisClient` | `https://frontaccounting.com/fawiki/index.php?n=Devel.SimpleAPIModule` | Front accounting is multilingual and multicurrency software for small businesses | `OAuth` |
| Helium | `HeliumClient` | `https://heliumtrades.com/mcp-page/` | News with media bias scoring, balanced news synthesis, live market data, AI options pricing | `免 Key` |
| Hotstoks | `HotstoksClient` | `https://hotstoks.com?utm_source=public-apis` | Stock market data powered by SQL | `apiKey` |
| IBANforge | `IbanforgeClient` | `https://api.ibanforge.com` | IBAN validation and BIC/SWIFT lookup for 75+ countries with 121K+ bank entries | `免 Key` |
| IEX Cloud | `IexCloudClient` | `https://iexcloud.io/docs/api/` | Realtime & Historical Stock and Market Data | `apiKey` |
| IG | `IgClient` | `https://labs.ig.com/gettingstarted` | Spreadbetting and CFD Market Data | `apiKey` |
| Indian Mutual Fund | `IndianMutualFundClient` | `https://www.mfapi.in/` | Get complete history of India Mutual Funds Data | `免 Key` |
| Intrinio | `IntrinioClient` | `https://intrinio.com/` | A wide selection of financial data feeds | `apiKey` |
| Klarna | `KlarnaClient` | `https://docs.klarna.com/klarna-payments/api/payments-api/` | Klarna payment and shopping service | `apiKey` |
| MercadoPago | `MercadopagoClient` | `https://www.mercadopago.com.br/developers/es/reference` | Mercado Pago API reference - all the information you need to develop your integrations | `apiKey` |
| Mono | `MonoClient` | `https://mono.co/` | Connect with users’ bank accounts and access transaction data in Africa | `apiKey` |
| Moov | `MoovClient` | `https://docs.moov.io/api/` | The Moov API makes it simple for platforms to send, receive, and store money | `apiKey` |
| Nordigen | `NordigenClient` | `https://nordigen.com/en/account_information_documenation/integration/quickstart_guide/` | Connect to bank accounts using official bank APIs and get raw transaction data | `apiKey` |
| OpenFIGI | `OpenfigiClient` | `https://www.openfigi.com/api` | Equity, index, futures, options symbology from Bloomberg LP | `apiKey` |
| Plaid | `PlaidClient` | `https://www.plaid.com/docs` | Connect with user's bank accounts and access transaction data | `apiKey` |
| Polygon | `PolygonClient` | `https://polygon.io/` | Historical stock market data | `apiKey` |
| Portfolio Optimizer | `PortfolioOptimizerClient` | `https://portfoliooptimizer.io/` | Portfolio analysis and optimization | `免 Key` |
| Razorpay IFSC | `RazorpayIfscClient` | `https://razorpay.com/docs/` | Indian Financial Systems Code (Bank Branch Codes) | `免 Key` |
| Real Time Finance | `RealTimeFinanceClient` | `https://github.com/Real-time-finance/finance-websocket-API/` | Websocket API to access realtime stock data | `apiKey` |
| SEC EDGAR Data | `SecEdgarDataClient` | `https://www.sec.gov/edgar/sec-api-documentation` | API to access annual reports of public US companies | `免 Key` |
| SmartAPI | `SmartapiClient` | `https://smartapi.angelbroking.com/` | Gain access to set of <SmartAPI> and create end-to-end broking services | `apiKey` |
| StockData | `StockdataClient` | `https://www.StockData.org` | Real-Time, Intraday & Historical Market Data, News and Sentiment API | `apiKey` |
| Styvio | `StyvioClient` | `https://www.Styvio.com` | Realtime and historical stock data and current stock sentiment | `apiKey` |
| Tax Data | `TaxDataClient` | `https://apilayer.com/marketplace/tax_data-api` | Instant VAT number and tax validation across the globe | `apiKey` |
| Tradier | `TradierClient` | `https://developer.tradier.com` | US equity/option market data (delayed, intraday, historical) | `OAuth` |
| Twelve Data | `TwelveDataClient` | `https://twelvedata.com/` | Stock market data (real-time & historical) | `apiKey` |
| VAT Validation | `VatValidationClient` | `https://www.abstractapi.com/vat-validation-rates-api` | Validate VAT numbers and calculate VAT rates | `apiKey` |
| WallstreetBets | `WallstreetbetsClient` | `https://dashboard.nbshare.io/apps/reddit/api/` | WallstreetBets Stock Comments Sentiment Analysis | `免 Key` |
| Yahoo Finance | `YahooFinanceClient` | `https://www.yahoofinanceapi.com/` | Real time low latency Yahoo Finance API for stock market, crypto currencies, and currency exchange | `apiKey` |
| YNAB | `YnabClient` | `https://api.youneedabudget.com/` | Budgeting & Planning | `OAuth` |
| Zoho Books | `ZohoBooksClient` | `https://www.zoho.com/books/api/v3/` | Online accounting software, built for your business | `OAuth` |


### Video

本分类共包含 **44** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.video.VideoAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| An API of Ice And Fire | `AnApiOfIceAndFireClient` | `https://anapioficeandfire.com/` | Game Of Thrones API | `免 Key` |
| Bob's Burgers | `BobSBurgersClient` | `https://bobs-burgers-api-ui.herokuapp.com` | Bob's Burgers API | `免 Key` |
| Breaking Bad | `BreakingBadClient` | `https://breakingbadapi.com/documentation` | Breaking Bad API | `免 Key` |
| Breaking Bad Quotes | `BreakingBadQuotesClient` | `https://github.com/shevabam/breaking-bad-quotes` | Some Breaking Bad quotes | `免 Key` |
| Catalogopolis | `CatalogopolisClient` | `https://api.catalogopolis.xyz/docs/` | Doctor Who API | `免 Key` |
| Catch The Show | `CatchTheShowClient` | `https://catchtheshow.herokuapp.com/api/documentation` | REST API for next-episode.net | `免 Key` |
| Czech Television | `CzechTelevisionClient` | `http://www.ceskatelevize.cz/xml/tv-program/` | TV programme of Czech TV | `免 Key` |
| Dailymotion | `DailymotionClient` | `https://developer.dailymotion.com/` | Dailymotion Developer API | `OAuth` |
| Dune | `DuneClient` | `https://github.com/ywalia01/dune-api` | A simple API which provides you with book, character, movie and quotes JSON data | `免 Key` |
| Final Space | `FinalSpaceClient` | `https://finalspaceapi.com/docs/` | Final Space API | `免 Key` |
| Game of Thrones Quotes | `GameOfThronesQuotesClient` | `https://gameofthronesquotes.xyz/` | Some Game of Thrones quotes | `免 Key` |
| Harry Potter Charactes | `HarryPotterCharactesClient` | `https://hp-api.herokuapp.com/` | Harry Potter Characters Data with with imagery | `免 Key` |
| Hyperserve | `HyperserveClient` | `https://hyperserve.io/` | Video backend API: upload any format, transcode to MP4, deliver via CDN | `apiKey` |
| IMDb-API | `ImdbApiClient` | `https://imdb-api.com/` | API for receiving movie, serial and cast information | `apiKey` |
| IMDbOT | `ImdbotClient` | `https://github.com/SpEcHiDe/IMDbOT` | Unofficial IMDb Movie / Series Information | `免 Key` |
| JSON2Video | `Json2VideoClient` | `https://json2video.com` | Create and edit videos programmatically: watermarks,resizing,slideshows,voice-over,text animations | `apiKey` |
| Lucifer Quotes | `LuciferQuotesClient` | `https://github.com/shadowoff09/lucifer-quotes` | Returns Lucifer quotes | `免 Key` |
| MCU Countdown | `McuCountdownClient` | `https://github.com/DiljotSG/MCU-Countdown` | A Countdown to the next MCU Film | `免 Key` |
| Motivational Quotes | `MotivationalQuotesClient` | `https://nodejs-quoteapp.herokuapp.com/` | Random Motivational Quotes | `免 Key` |
| Movie Quote | `MovieQuoteClient` | `https://github.com/F4R4N/movie-quote/` | Random Movie and Series Quotes | `免 Key` |
| Open Movie Database | `OpenMovieDatabaseClient` | `http://www.omdbapi.com/` | Movie information | `apiKey` |
| Owen Wilson Wow | `OwenWilsonWowClient` | `https://owen-wilson-wow-api.herokuapp.com` | API for actor Owen Wilson's "wow" exclamations in movies | `免 Key` |
| Ron Swanson Quotes | `RonSwansonQuotesClient` | `https://github.com/jamesseanwright/ron-swanson-quotes#ron-swanson-quotes-api` | Television | `免 Key` |
| Simkl | `SimklClient` | `https://simkl.docs.apiary.io` | Movie, TV and Anime data | `apiKey` |
| STAPI | `StapiClient` | `http://stapi.co` | Information on all things Star Trek | `免 Key` |
| Stranger Things Quotes | `StrangerThingsQuotesClient` | `https://github.com/shadowoff09/strangerthings-quotes` | Returns Stranger Things quotes | `免 Key` |
| Stream | `StreamClient` | `https://api.stream.cz/graphiql` | Czech internet television, films, series and online videos for free | `免 Key` |
| Stromberg Quotes | `StrombergQuotesClient` | `https://www.stromberg-api.de/` | Returns Stromberg quotes and more | `免 Key` |
| SWAPI | `SwapiClient` | `https://swapi.dev/` | All the Star Wars data you've ever wanted | `免 Key` |
| SWAPI | `SwapiClient` | `https://www.swapi.tech` | All things Star Wars | `免 Key` |
| SWAPI GraphQL | `SwapiGraphqlClient` | `https://graphql.org/swapi-graphql` | Star Wars GraphQL API | `免 Key` |
| The Lord of the Rings | `TheLordOfTheRingsClient` | `https://the-one-api.dev/` | The Lord of the Rings API | `apiKey` |
| The Vampire Diaries | `TheVampireDiariesClient` | `https://vampire-diaries-api.netlify.app/` | TV Show Data | `apiKey` |
| ThronesApi | `ThronesapiClient` | `https://thronesapi.com/` | Game Of Thrones Characters Data with imagery | `免 Key` |
| TMDb | `TmdbClient` | `https://www.themoviedb.org/documentation/api` | Community-based movie data | `apiKey` |
| TrailerAddict | `TraileraddictClient` | `https://www.traileraddict.com/trailerapi` | Easily embed trailers from TrailerAddict | `apiKey` |
| Trakt | `TraktClient` | `https://trakt.docs.apiary.io/` | Movie and TV Data | `apiKey` |
| TVDB | `TvdbClient` | `https://thetvdb.com/api-information` | Television data | `apiKey` |
| TVMaze | `TvmazeClient` | `http://www.tvmaze.com/api` | TV Show Data | `免 Key` |
| uNoGS | `UnogsClient` | `https://rapidapi.com/unogs/api/unogsng` | Unofficial Netflix Online Global Search, Search all netflix regions in one place | `apiKey` |
| Vimeo | `VimeoClient` | `https://developer.vimeo.com/` | Vimeo Developer API | `OAuth` |
| Watchmode | `WatchmodeClient` | `https://api.watchmode.com/` | API for finding out the streaming availability of movies & shows | `apiKey` |
| Web Series Quotes Generator | `WebSeriesQuotesGeneratorClient` | `https://github.com/yogeshwaran01/web-series-quotes` | API generates various Web Series Quote Images | `免 Key` |
| YouTube | `YoutubeClient` | `https://developers.google.com/youtube/` | Add YouTube functionality to your sites and apps | `OAuth` |


### Social

本分类共包含 **42** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.social.SocialAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| 4chan | `Api4ChanClient` | `https://github.com/4chan/4chan-API` | Simple image-based bulletin board dedicated to a variety of topics | `免 Key` |
| Ayrshare | `AyrshareClient` | `https://www.ayrshare.com` | Social media APIs to post, get analytics, and manage multiple users social media accounts | `apiKey` |
| aztro | `AztroClient` | `https://aztro.sameerkumar.website/` | Daily horoscope info for yesterday, today, and tomorrow | `免 Key` |
| Blogger | `BloggerClient` | `https://developers.google.com/blogger/` | The Blogger APIs allows client applications to view and update Blogger content | `OAuth` |
| Bluesky | `BlueskyClient` | `https://docs.bsky.app/` | Decentralized social networking via the AT protocol | `免 Key` |
| Cisco Spark | `CiscoSparkClient` | `https://developer.ciscospark.com` | Team Collaboration Software | `OAuth` |
| Dangerous Discord Database | `DangerousDiscordDatabaseClient` | `https://discord.riverside.rocks/docs/index.php` | Database of malicious Discord accounts | `apiKey` |
| Discord | `DiscordClient` | `https://discord.com/developers/docs/intro` | Make bots for Discord, integrate Discord onto an external platform | `OAuth` |
| Disqus | `DisqusClient` | `https://disqus.com/api/docs/auth/` | Communicate with Disqus data | `OAuth` |
| Doge-Meme | `DogeMemeClient` | `https://api.doge-meme.lol/docs` | Top meme posts from r/dogecoin which include 'Meme' flair | `免 Key` |
| Facebook | `FacebookClient` | `https://developers.facebook.com/` | Facebook Login, Share on FB, Social Plugins, Analytics and more | `OAuth` |
| Foursquare | `FoursquareClient` | `https://developer.foursquare.com/` | Interact with Foursquare users and places (geolocation-based checkins, photos, tips, events, etc) | `OAuth` |
| Fuck Off as a Service | `FuckOffAsAServiceClient` | `https://www.foaas.com` | Asks someone to fuck off | `免 Key` |
| Full Contact | `FullContactClient` | `https://docs.fullcontact.com/` | Get Social Media profiles and contact Information | `OAuth` |
| GetXAPI | `GetxapiClient` | `https://www.getxapi.com/` | Read Twitter / X data and post tweets, likes, retweets, follows, DMs via REST | `apiKey` |
| HackerNews | `HackernewsClient` | `https://github.com/HackerNews/API` | Social news for CS and entrepreneurship | `免 Key` |
| Hashnode | `HashnodeClient` | `https://hashnode.com` | A blogging platform built for developers | `免 Key` |
| Instagram | `InstagramClient` | `https://www.instagram.com/developer/` | Instagram Login, Share on Instagram, Social Plugins and more | `OAuth` |
| Kakao | `KakaoClient` | `https://developers.kakao.com/` | Kakao Login, Share on KakaoTalk, Social Plugins and more | `OAuth` |
| Lanyard | `LanyardClient` | `https://github.com/Phineas/lanyard` | Retrieve your presence on Discord through an HTTP REST API or WebSocket | `免 Key` |
| Line | `LineClient` | `https://developers.line.biz/` | Line Login, Share on Line, Social Plugins and more | `OAuth` |
| LinkedIn | `LinkedinClient` | `https://docs.microsoft.com/en-us/linkedin/?context=linkedin/context` | The foundation of all digital integrations with LinkedIn | `OAuth` |
| Meetup.com | `MeetupComClient` | `https://www.meetup.com/api/guide` | Data about Meetups from Meetup.com | `apiKey` |
| Microsoft Graph | `MicrosoftGraphClient` | `https://docs.microsoft.com/en-us/graph/api/overview` | Access the data and intelligence in Microsoft 365, Windows 10, and Enterprise Mobility | `OAuth` |
| NAVER | `NaverClient` | `https://developers.naver.com/main/` | NAVER Login, Share on NAVER, Social Plugins and more | `OAuth` |
| Open Collective | `OpenCollectiveClient` | `https://docs.opencollective.com/help/developers/api` | Get Open Collective data | `免 Key` |
| Pinterest | `PinterestClient` | `https://developers.pinterest.com/` | The world's catalog of ideas | `OAuth` |
| Product Hunt | `ProductHuntClient` | `https://api.producthunt.com/v2/docs` | The best new products in tech | `OAuth` |
| Reddit | `RedditClient` | `https://www.reddit.com/dev/api` | Homepage of the internet | `OAuth` |
| Revolt | `RevoltClient` | `https://developers.revolt.chat/api/` | Revolt open source Discord alternative | `apiKey` |
| Saidit | `SaiditClient` | `https://www.saidit.net/dev/api` | Open Source Reddit Clone | `OAuth` |
| Slack | `SlackClient` | `https://api.slack.com/` | Team Instant Messaging | `OAuth` |
| TamTam | `TamtamClient` | `https://dev.tamtam.chat/` | Bot API to interact with TamTam | `apiKey` |
| Telegram Bot | `TelegramBotClient` | `https://core.telegram.org/bots/api` | Simplified HTTP version of the MTProto API for bots | `apiKey` |
| Telegram MTProto | `TelegramMtprotoClient` | `https://core.telegram.org/api#getting-started` | Read and write Telegram data | `OAuth` |
| Telegraph | `TelegraphClient` | `https://telegra.ph/api` | Create attractive blogs easily, to share | `apiKey` |
| TikTok | `TiktokClient` | `https://developers.tiktok.com/doc/login-kit-web` | Fetches user info and user's video posts on TikTok platform | `OAuth` |
| Trash Nothing | `TrashNothingClient` | `https://trashnothing.com/developer` | A freecycling community with thousands of free items posted every day | `OAuth` |
| Tumblr | `TumblrClient` | `https://www.tumblr.com/docs/en/api/v2` | Read and write Tumblr Data | `OAuth` |
| Twitch | `TwitchClient` | `https://dev.twitch.tv/docs` | Game Streaming API | `OAuth` |
| Twitter | `TwitterClient` | `https://developer.twitter.com/en/docs` | Read and write Twitter data | `OAuth` |
| vk | `VkClient` | `https://vk.com/dev/sites` | Read and write vk data | `OAuth` |


### Open Data

本分类共包含 **40** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.opendata.OpenDataAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| 18F | `Api18FClient` | `http://18f.github.io/API-All-the-X/` | Unofficial US Federal Government API Development | `免 Key` |
| AcreLens | `AcrelensClient` | `https://www.acrelens.com` | Land suitability scoring API for any US property: off-grid, rural, recreational, investment | `apiKey` |
| API Setu | `ApiSetuClient` | `https://www.apisetu.gov.in/` | An Indian Government platform that provides a lot of APIS for KYC, business, education & employment | `免 Key` |
| Archive.org | `ArchiveOrgClient` | `https://archive.readme.io/docs` | The Internet Archive | `免 Key` |
| Black History Facts | `BlackHistoryFactsClient` | `https://www.blackhistoryapi.io/docs` | Contribute or search one of the largest black history fact databases on the web | `apiKey` |
| BotsArchive | `BotsarchiveClient` | `https://botsarchive.com/docs.html` | JSON formatted details about Telegram Bots available in database | `免 Key` |
| Callook.info | `CallookInfoClient` | `https://callook.info` | United States ham radio callsigns | `免 Key` |
| CARTO | `CartoClient` | `https://carto.com/` | Location Information Prediction | `apiKey` |
| CollegeScoreCard.ed.gov | `CollegescorecardEdGovClient` | `https://collegescorecard.ed.gov/data/` | Data on higher education institutions in the United States | `免 Key` |
| Enigma Public | `EnigmaPublicClient` | `https://developers.enigma.com/docs` | Broadest collection of public data | `apiKey` |
| French Address Search | `FrenchAddressSearchClient` | `https://geo.api.gouv.fr/adresse` | Address search via the French Government | `免 Key` |
| GENESIS | `GenesisClient` | `https://www.destatis.de/EN/Service/OpenData/api-webservice.html` | Federal Statistical Office Germany | `OAuth` |
| Joshua Project | `JoshuaProjectClient` | `https://api.joshuaproject.net/` | People groups of the world with the fewest followers of Christ | `apiKey` |
| Kaggle | `KaggleClient` | `https://www.kaggle.com/docs/api` | Create and interact with Datasets, Notebooks, and connect with Kaggle | `apiKey` |
| LinkPreview | `LinkpreviewClient` | `https://www.linkpreview.net` | Get JSON formatted summary with title, description and preview image for any requested URL | `apiKey` |
| Lowy Asia Power Index | `LowyAsiaPowerIndexClient` | `https://github.com/0x0is1/lowy-index-api-docs` | Get measure resources and influence to rank the relative power of states in Asia | `免 Key` |
| Microlink.io | `MicrolinkIoClient` | `https://microlink.io` | Extract structured data from any website | `免 Key` |
| ModelPartFinder Error Codes | `ModelpartfinderErrorCodesClient` | `https://modelpartfinder.com/docs/api` | Lookup appliance and equipment error codes by brand and code, with recommended replacement parts | `免 Key` |
| Nasdaq Data Link | `NasdaqDataLinkClient` | `https://docs.data.nasdaq.com/` | Stock market data | `apiKey` |
| Nobel Prize | `NobelPrizeClient` | `https://www.nobelprize.org/about/developer-zone-2/` | Open data about nobel prizes and events | `免 Key` |
| Onyx Bazaar | `OnyxBazaarClient` | `https://onyx-actions.onrender.com/bazaar` | Free public leaderboard of x402 paid HTTP services indexed from Coinbase CDP discovery API | `免 Key` |
| Open Data Minneapolis | `OpenDataMinneapolisClient` | `https://opendata.minneapolismn.gov/` | Spatial (GIS) and non-spatial city data for Minneapolis | `免 Key` |
| Open Scholarships | `OpenScholarshipsClient` | `https://scholarships.grudged.io` | Free, openly-licensed directory of US scholarships and student aid from official sources | `免 Key` |
| openAFRICA | `OpenafricaClient` | `https://africaopendata.org/` | Large datasets repository of African open data | `免 Key` |
| OpenCorporates | `OpencorporatesClient` | `http://api.opencorporates.com/documentation/API-Reference` | Data on corporate entities and directors in many countries | `apiKey` |
| OpenSanctions | `OpensanctionsClient` | `https://www.opensanctions.org/docs/api/` | Data on international sanctions, crime and politically exposed persons | `免 Key` |
| PeakMetrics | `PeakmetricsClient` | `https://rapidapi.com/peakmetrics-peakmetrics-default/api/peakmetrics-news` | News articles and public datasets | `apiKey` |
| Recreation Information Database | `RecreationInformationDatabaseClient` | `https://ridb.recreation.gov/` | Recreational areas, federal lands, historic sites, museums, and other attractions/resources(US) | `apiKey` |
| Scoop.it | `ScoopItClient` | `http://www.scoop.it/dev` | Content Curation Service | `apiKey` |
| Socrata | `SocrataClient` | `https://dev.socrata.com/` | Access to Open Data from Governments, Non-profits and NGOs around the world | `OAuth` |
| Teleport | `TeleportClient` | `https://developers.teleport.org/` | Quality of Life Data | `免 Key` |
| Umeå Open Data | `UmeOpenDataClient` | `https://opendata.umea.se/api/` | Open data of the city Umeå in northen Sweden | `免 Key` |
| Universities List | `UniversitiesListClient` | `https://github.com/Hipo/university-domains-list` | University names, countries and domains | `免 Key` |
| University of Oslo | `UniversityOfOsloClient` | `https://data.uio.no/` | Courses, lecture videos, detailed information for courses etc. for the University of Oslo (Norway) | `免 Key` |
| UPC database | `UpcDatabaseClient` | `https://upcdatabase.org/api` | More than 1.5 million barcode numbers from all around the world | `apiKey` |
| Urban Observatory | `UrbanObservatoryClient` | `https://urbanobservatory.ac.uk` | The largest set of publicly available real time urban data in the UK | `免 Key` |
| Voidly | `VoidlyClient` | `https://voidly.ai/api-docs` | Internet censorship measurements, incidents, and ISP-level blocking data across 126 countries | `免 Key` |
| Wikidata | `WikidataClient` | `https://www.wikidata.org/w/api.php?action=help` | Collaboratively edited knowledge base operated by the Wikimedia Foundation | `OAuth` |
| Wikipedia | `WikipediaClient` | `https://www.mediawiki.org/wiki/API:Main_page` | Mediawiki Encyclopedia | `免 Key` |
| Yelp | `YelpClient` | `https://www.yelp.com/developers/documentation/v3` | Find Local Business | `OAuth` |


### Security

本分类共包含 **40** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.security.SecurityAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Application Environment Verification | `ApplicationEnvironmentVerificationClient` | `https://github.com/fingerprintjs/aev` | Android library and API to verify the safety of user devices, detect rooted devices and other risks | `apiKey` |
| BinaryEdge | `BinaryedgeClient` | `https://docs.binaryedge.io/api-v2.html` | Provide access to BinaryEdge 40fy scanning platform | `apiKey` |
| BitWarden | `BitwardenClient` | `https://bitwarden.com/help/api/` | Best open-source password manager | `OAuth` |
| Botd | `BotdClient` | `https://github.com/fingerprintjs/botd` | Botd is a browser library for JavaScript bot detection | `apiKey` |
| Bugcrowd | `BugcrowdClient` | `https://docs.bugcrowd.com/api/getting-started/` | Bugcrowd API for interacting and tracking the reported issues programmatically | `apiKey` |
| Censys | `CensysClient` | `https://search.censys.io/api` | Search engine for Internet connected host and devices | `apiKey` |
| Classify | `ClassifyClient` | `https://classify-web.herokuapp.com/#/api` | Encrypting & decrypting text messages | `免 Key` |
| Complete Criminal Checks | `CompleteCriminalChecksClient` | `https://completecriminalchecks.com/Developers` | Provides data of offenders from all U.S. States and Pureto Rico | `apiKey` |
| CRXcavator | `CrxcavatorClient` | `https://crxcavator.io/apidocs` | Chrome extension risk scoring | `apiKey` |
| dead-drop | `DeadDropClient` | `https://api.dead-drop.xyz/api/v1/docs` | Ephemeral zero-knowledge encrypted data sharing | `免 Key` |
| Dehash.lt | `DehashLtClient` | `https://github.com/Dehash-lt/api` | Hash decryption MD5, SHA1, SHA3, SHA256, SHA384, SHA512 | `免 Key` |
| EmailRep | `EmailrepClient` | `https://docs.emailrep.io/` | Email address threat and risk prediction | `免 Key` |
| Escape | `EscapeClient` | `https://github.com/polarspetroll/EscapeAPI` | An API for escaping different kind of queries | `免 Key` |
| FilterLists | `FilterlistsClient` | `https://filterlists.com` | Lists of filters for adblockers and firewalls | `免 Key` |
| FingerprintJS Pro | `FingerprintjsProClient` | `https://dev.fingerprintjs.com/docs` | Fraud detection API offering highly accurate browser fingerprinting | `apiKey` |
| FraudLabs Pro | `FraudlabsProClient` | `https://www.fraudlabspro.com/developer/api/screen-order` | Screen order information using AI to detect frauds | `apiKey` |
| FullHunt | `FullhuntClient` | `https://api-docs.fullhunt.io/#introduction` | Searchable attack surface database of the entire internet | `apiKey` |
| GitGuardian | `GitguardianClient` | `https://api.gitguardian.com/doc` | Scan files for secrets (API Keys, database credentials) | `apiKey` |
| GreyNoise | `GreynoiseClient` | `https://docs.greynoise.io/reference/get_v3-community-ip` | Query IPs in the GreyNoise dataset and retrieve a subset of the full IP context data | `apiKey` |
| HackerOne | `HackeroneClient` | `https://api.hackerone.com/` | The industry’s first hacker API that helps increase productivity towards creative bug bounty hunting | `apiKey` |
| Hashable | `HashableClient` | `https://hashable.space/pages/api/` | A REST API to access high level cryptographic functions and methods | `免 Key` |
| HaveIBeenPwned | `HaveibeenpwnedClient` | `https://haveibeenpwned.com/API/v3` | Passwords which have previously been exposed in data breaches | `apiKey` |
| Intelligence X | `IntelligenceXClient` | `https://github.com/IntelligenceX/SDK/blob/master/Intelligence%20X%20API.pdf` | Perform OSINT via Intelligence X | `apiKey` |
| IPLogs | `IplogsClient` | `https://iplogs.com/docs` | Free VPN, proxy, Tor and datacenter IP detection. 13 sources, active probing | `免 Key` |
| LoginRadius | `LoginradiusClient` | `https://www.loginradius.com/docs/` | Managed User Authentication Service | `apiKey` |
| Microsoft Security Response Center (MSRC) | `MicrosoftSecurityResponseCenterMsrcClient` | `https://msrc.microsoft.com/report/developer` | Programmatic interfaces to engage with the Microsoft Security Response Center (MSRC) | `免 Key` |
| Mozilla http scanner | `MozillaHttpScannerClient` | `https://github.com/mozilla/http-observatory/blob/master/httpobs/docs/api.md` | Mozilla observatory http scanner | `免 Key` |
| Mozilla tls scanner | `MozillaTlsScannerClient` | `https://github.com/mozilla/tls-observatory#api-endpoints` | Mozilla observatory tls scanner | `免 Key` |
| National Vulnerability Database | `NationalVulnerabilityDatabaseClient` | `https://nvd.nist.gov/vuln/Data-Feeds/JSON-feed-changelog` | U.S. National Vulnerability Database | `免 Key` |
| Passwordinator | `PasswordinatorClient` | `https://github.com/fawazsullia/password-generator/` | Generate random passwords of varying complexities | `免 Key` |
| PhishStats | `PhishstatsClient` | `https://phishstats.info/` | Phishing database | `免 Key` |
| Privacy.com | `PrivacyComClient` | `https://privacy.com/developer/docs` | Generate merchant-specific and one-time use credit card numbers that link back to your bank | `apiKey` |
| Pulsedive | `PulsediveClient` | `https://pulsedive.com/api/` | Scan, search and collect threat intelligence data in real-time | `apiKey` |
| SecurityTrails | `SecuritytrailsClient` | `https://securitytrails.com/corp/apidocs` | Domain and IP related information such as current and historical WHOIS and DNS records | `apiKey` |
| Shodan | `ShodanClient` | `https://developer.shodan.io/` | Search engine for Internet connected devices | `apiKey` |
| Spyse | `SpyseClient` | `https://spyse-dev.readme.io/reference/quick-start` | Access data on all Internet assets and build powerful attack surface management applications | `apiKey` |
| Threat Jammer | `ThreatJammerClient` | `https://threatjammer.com/docs/index` | Risk scoring service from curated threat intelligence data | `apiKey` |
| UK Police | `UkPoliceClient` | `https://data.police.uk/docs/` | UK Police data | `免 Key` |
| Virushee | `VirusheeClient` | `https://api.virushee.com/` | Virushee file/data scanning | `免 Key` |
| VulDB | `VuldbClient` | `https://vuldb.com/?doc.api` | VulDB API allows to initiate queries for one or more items along with transactional bots | `apiKey` |


### Sports & Fitness

本分类共包含 **36** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.sportsfitness.SportsFitnessAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| API-FOOTBALL | `ApiFootballClient` | `https://www.api-football.com/documentation-v3` | Get information about Football Leagues & Cups | `apiKey` |
| ApiMedic | `ApimedicClient` | `https://apimedic.com/` | ApiMedic offers a medical symptom checker API primarily for patients | `apiKey` |
| balldontlie | `BalldontlieClient` | `https://www.balldontlie.io` | Balldontlie provides access to stats data from the NBA | `免 Key` |
| Canadian Football League (CFL) | `CanadianFootballLeagueCflClient` | `http://api.cfl.ca/` | Official JSON API providing real-time league, team and player statistics about the CFL | `apiKey` |
| City Bikes | `CityBikesClient` | `https://api.citybik.es/v2/` | City Bikes around the world | `免 Key` |
| Cloudbet | `CloudbetClient` | `https://www.cloudbet.com/api/` | Official Cloudbet API provides real-time sports odds and betting API to place bets programmatically | `apiKey` |
| CollegeFootballData.com | `CollegefootballdataComClient` | `https://collegefootballdata.com` | Unofficial detailed American college football statistics, records, and results API | `apiKey` |
| DiscGolf | `DiscgolfClient` | `https://discgolfapi.com/docs/` | Structured disc golf course data | `免 Key` |
| Ergast F1 | `ErgastF1Client` | `http://ergast.com/mrd/` | F1 data from the beginning of the world championships in 1950 | `免 Key` |
| Fitbit | `FitbitClient` | `https://dev.fitbit.com/` | Fitbit Information | `OAuth` |
| Football | `FootballClient` | `https://rapidapi.com/GiulianoCrescimbeni/api/football98/` | A simple Open Source Football API to get squads’ stats, best scorers and more | `X-Mashape-Key` |
| Football (Soccer) Videos | `FootballSoccerVideosClient` | `https://www.scorebat.com/video-api/` | Embed codes for goals and highlights from Premier League, Bundesliga, Serie A and many more | `免 Key` |
| Football Standings | `FootballStandingsClient` | `https://github.com/azharimm/football-standings-api` | Display football standings e.g epl, la liga, serie a etc. The data is based on espn site | `免 Key` |
| Football-Data | `FootballDataClient` | `https://www.football-data.org` | Football data with matches info, players, teams, and competitions | `X-Mashape-Key` |
| JCDecaux Bike | `JcdecauxBikeClient` | `https://developer.jcdecaux.com/` | JCDecaux's self-service bicycles | `apiKey` |
| MLB Records and Stats | `MlbRecordsAndStatsClient` | `https://appac.github.io/mlb-data-api-docs/` | Current and historical MLB statistics | `免 Key` |
| NBA Data | `NbaDataClient` | `https://rapidapi.com/api-sports/api/api-nba/` | All NBA Stats DATA, Games, Livescore, Standings, Statistics | `apiKey` |
| NBA Stats | `NbaStatsClient` | `https://any-api.com/nba_com/nba_com/docs/API_Description` | Current and historical NBA Statistics | `免 Key` |
| NHL Records and Stats | `NhlRecordsAndStatsClient` | `https://gitlab.com/dword4/nhlapi` | NHL historical data and statistics | `免 Key` |
| Oddsmagnet | `OddsmagnetClient` | `https://data.oddsmagnet.com` | Odds history from multiple UK bookmakers | `免 Key` |
| OpenLigaDB | `OpenligadbClient` | `https://www.openligadb.de` | Crowd sourced sports league results | `免 Key` |
| Premier League Standings | `PremierLeagueStandingsClient` | `https://rapidapi.com/heisenbug/api/premier-league-live-scores/` | All Current Premier League Standings and Statistics | `apiKey` |
| RacingHub | `RacinghubClient` | `https://racinghub.net/api/v1/docs#/` | Formula 1 historical data and statistics | `免 Key` |
| Sport Data | `SportDataClient` | `https://sportdataapi.com` | Get sports data from all over the world | `apiKey` |
| Sport List & Data | `SportListDataClient` | `https://developers.decathlon.com/products/sports` | List of and resources related to sports | `免 Key` |
| Sport Places | `SportPlacesClient` | `https://developers.decathlon.com/products/sport-places` | Crowd-source sports places around the world | `免 Key` |
| Sport Vision | `SportVisionClient` | `https://developers.decathlon.com/products/sport-vision` | Identify sport, brands and gear in an image. Also does image sports captioning | `apiKey` |
| Sportmonks Cricket | `SportmonksCricketClient` | `https://docs.sportmonks.com/cricket/` | Live cricket score, player statistics and fantasy API | `apiKey` |
| Sportmonks Football | `SportmonksFootballClient` | `https://docs.sportmonks.com/football/` | Football score/schedule, news api, tv channels, stats, history, display standing e.g. epl, la liga | `apiKey` |
| Squiggle | `SquiggleClient` | `https://api.squiggle.com.au` | Fixtures, results and predictions for Australian Football League matches | `免 Key` |
| Strava | `StravaClient` | `https://strava.github.io/api/` | Connect with athletes, activities and more | `OAuth` |
| SuredBits | `SuredbitsClient` | `https://suredbits.com/api/` | Query sports data, including teams, players, games, scores and statistics | `免 Key` |
| TheSportsDB | `ThesportsdbClient` | `https://www.thesportsdb.com/api.php` | Crowd-Sourced Sports Data and Artwork | `apiKey` |
| TourneyRadar | `TourneyradarClient` | `https://tourneyradar-api.vercel.app` | Upcoming chess tournaments from 140+ national federations worldwide | `免 Key` |
| Tredict | `TredictClient` | `https://www.tredict.com/blog/oauth_docs/` | Get and set activities, health data and more | `OAuth` |
| Wger | `WgerClient` | `https://wger.de/en/software/api` | Workout manager data as exercises, muscles or equipment | `apiKey` |


### Music

本分类共包含 **35** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.music.MusicAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| 7digital | `Api7DigitalClient` | `https://docs.7digital.com/reference` | Api of Music store 7digital | `OAuth` |
| AI Mastering | `AiMasteringClient` | `https://aimastering.com/api_docs/` | Automated Music Mastering | `apiKey` |
| Audiomack | `AudiomackClient` | `https://www.audiomack.com/data-api/docs` | Api of the streaming music hub Audiomack | `OAuth` |
| Bandcamp | `BandcampClient` | `https://bandcamp.com/developer` | API of Music store Bandcamp | `OAuth` |
| Bandsintown | `BandsintownClient` | `https://app.swaggerhub.com/apis/Bandsintown/PublicAPI/3.0.0` | Music Events | `免 Key` |
| Deezer | `DeezerClient` | `https://developers.deezer.com/api` | Music | `OAuth` |
| Discogs | `DiscogsClient` | `https://www.discogs.com/developers/` | Music | `OAuth` |
| Freesound | `FreesoundClient` | `https://freesound.org/docs/api/` | Music Samples | `apiKey` |
| Gaana | `GaanaClient` | `https://github.com/cyberboysumanjay/GaanaAPI` | API to retrieve song information from Gaana | `免 Key` |
| Genius | `GeniusClient` | `https://docs.genius.com/` | Crowdsourced lyrics and music knowledge | `OAuth` |
| Genrenator | `GenrenatorClient` | `https://binaryjazz.us/genrenator-api/` | Music genre generator | `免 Key` |
| iTunes Search | `ItunesSearchClient` | `https://affiliate.itunes.apple.com/resources/documentation/itunes-store-web-service-search-api/` | Software products | `免 Key` |
| Jamendo | `JamendoClient` | `https://developer.jamendo.com/v3.0/docs` | Music | `OAuth` |
| JioSaavn | `JiosaavnClient` | `https://github.com/cyberboysumanjay/JioSaavnAPI` | API to retrieve song information, album meta data and many more from JioSaavn | `免 Key` |
| KKBOX | `KkboxClient` | `https://developer.kkbox.com` | Get music libraries, playlists, charts, and perform out of KKBOX's platform | `OAuth` |
| KSoft.Si Lyrics | `KsoftSiLyricsClient` | `https://docs.ksoft.si/api/lyrics-api` | API to get lyrics for songs | `apiKey` |
| LastFm | `LastfmClient` | `https://www.last.fm/api` | Music | `apiKey` |
| Lyrics.ovh | `LyricsOvhClient` | `https://lyricsovh.docs.apiary.io` | Simple API to retrieve the lyrics of a song | `免 Key` |
| Mixcloud | `MixcloudClient` | `https://www.mixcloud.com/developers/` | Music | `OAuth` |
| MusicBrainz | `MusicbrainzClient` | `https://musicbrainz.org/doc/Development/XML_Web_Service/Version_2` | Music | `免 Key` |
| Musixmatch | `MusixmatchClient` | `https://developer.musixmatch.com/` | Music | `apiKey` |
| Napster | `NapsterClient` | `https://developer.napster.com/api/v2.2` | Music | `apiKey` |
| Openwhyd | `OpenwhydClient` | `https://openwhyd.github.io/openwhyd/API` | Download curated playlists of streaming tracks (YouTube, SoundCloud, etc...) | `免 Key` |
| Phishin | `PhishinClient` | `https://phish.in/api-docs` | A web-based archive of legal live audio recordings of the improvisational rock band Phish | `apiKey` |
| Radio Browser | `RadioBrowserClient` | `https://api.radio-browser.info/` | List of internet radio stations | `免 Key` |
| Songkick | `SongkickClient` | `https://www.songkick.com/developer/` | Music Events | `apiKey` |
| Songlink / Odesli | `SonglinkOdesliClient` | `https://www.notion.so/API-d0ebe08a5e304a55928405eb682f6741` | Get all the services on which a song is available | `apiKey` |
| Songsterr | `SongsterrClient` | `https://www.songsterr.com/a/wa/api/` | Provides guitar, bass and drums tabs and chords | `免 Key` |
| SoundCloud | `SoundcloudClient` | `https://developers.soundcloud.com/docs/api/guide` | With SoundCloud API you can build applications that will give more power to control your content | `OAuth` |
| Spotify | `SpotifyClient` | `https://beta.developer.spotify.com/documentation/web-api/` | View Spotify music catalog, manage users' libraries, get recommendations and more | `OAuth` |
| Sunor | `SunorClient` | `https://docs.sunor.cc` | AI music generation API via Suno, with pay-as-you-go credits | `apiKey` |
| TasteDive | `TastediveClient` | `https://tastedive.com/read/api` | Similar artist API (also works for movies and TV shows) | `apiKey` |
| TheAudioDB | `TheaudiodbClient` | `https://www.theaudiodb.com/api_guide.php` | Music | `apiKey` |
| Vagalume | `VagalumeClient` | `https://api.vagalume.com.br/docs/` | Crowdsourced lyrics and music knowledge | `apiKey` |
| Verome | `VeromeClient` | `https://github.com/Kirazul/Verome-API` | Music API for searching, streaming and exploring music data from YouTube Music, YouTube, and Last.fm | `免 Key` |


### Science & Math

本分类共包含 **35** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.sciencemath.ScienceMathAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| arcsecond.io | `ArcsecondIoClient` | `https://api.arcsecond.io/` | Multiple astronomy data sources | `免 Key` |
| arXiv | `ArxivClient` | `https://arxiv.org/help/api/user-manual` | Curated research-sharing platform: physics, mathematics, quantitative finance, and economics | `免 Key` |
| CodeCogs | `CodecogsClient` | `https://editor.codecogs.com/docs/4-LaTeX_rendering.php` | Render LaTeX equations in PNG, GIF, SVG, EMF, PDF, JSON, or download formats with styling options | `免 Key` |
| CORE | `CoreClient` | `https://core.ac.uk/services#api` | Access the world's Open Access research papers | `apiKey` |
| GBIF | `GbifClient` | `https://www.gbif.org/developer/summary` | Global Biodiversity Information Facility | `免 Key` |
| iDigBio | `IdigbioClient` | `https://github.com/idigbio/idigbio-search-api/wiki` | Access millions of museum specimens from organizations around the world | `免 Key` |
| inspirehep.net | `InspirehepNetClient` | `https://github.com/inspirehep/rest-api-doc` | High Energy Physics info. system | `免 Key` |
| isEven (humor) | `IsevenHumorClient` | `https://isevenapi.xyz/` | Check if a number is even | `免 Key` |
| ISRO | `IsroClient` | `https://isro.vercel.app` | ISRO Space Crafts Information | `免 Key` |
| ITIS | `ItisClient` | `https://www.itis.gov/ws_description.html` | Integrated Taxonomic Information System | `免 Key` |
| Launch Library 2 | `LaunchLibrary2Client` | `https://thespacedevs.com/llapi` | Spaceflight launches and events database | `免 Key` |
| Materials Platform for Data Science | `MaterialsPlatformForDataScienceClient` | `https://mpds.io` | Curated experimental data for materials science | `apiKey` |
| Minor Planet Center | `MinorPlanetCenterClient` | `http://www.asterank.com/mpc` | Asterank.com Information | `免 Key` |
| NASA | `NasaClient` | `https://api.nasa.gov` | NASA data, including imagery | `免 Key` |
| NASA ADS | `NasaAdsClient` | `https://ui.adsabs.harvard.edu/help/api/api-docs.html` | NASA Astrophysics Data System | `OAuth` |
| Newton | `NewtonClient` | `https://newton.vercel.app` | Symbolic and Arithmetic Math Calculator | `免 Key` |
| Noctua | `NoctuaClient` | `https://api.noctuasky.com/api/v1/swaggerdoc/` | REST API used to access NoctuaSky features | `免 Key` |
| Numbers | `NumbersClient` | `https://math.tools/api/numbers/` | Number of the day, random number, number facts and anything else you want to do with numbers | `apiKey` |
| Numbers | `NumbersClient` | `http://numbersapi.com` | Facts about numbers | `免 Key` |
| Ocean Facts | `OceanFactsClient` | `https://oceanfacts.herokuapp.com/` | Facts pertaining to the physical science of Oceanography | `免 Key` |
| Open Notify | `OpenNotifyClient` | `http://open-notify.org/Open-Notify-API/` | ISS astronauts, current location, etc | `免 Key` |
| Open Science Framework | `OpenScienceFrameworkClient` | `https://developer.osf.io` | Repository and archive for study designs, research materials, data, manuscripts, etc | `免 Key` |
| OpenAlex | `OpenalexClient` | `https://docs.openalex.org/` | Open catalog of scholarly works, authors, institutions, sources, and concepts | `免 Key` |
| Purple Air | `PurpleAirClient` | `https://www2.purpleair.com/` | Real Time Air Quality Monitoring | `免 Key` |
| Remote Calc | `RemoteCalcClient` | `https://github.com/elizabethadegbaju/remotecalc` | Decodes base64 encoding and parses it to return a solution to the calculation in JSON | `免 Key` |
| SHARE | `ShareClient` | `https://share.osf.io/api/v2/` | A free, open, dataset about research and scholarly activities | `免 Key` |
| SpaceX | `SpacexClient` | `https://github.com/r-spacex/SpaceX-API` | Company, vehicle, launchpad and launch data | `免 Key` |
| SpaceX | `SpacexClient` | `https://api.spacex.land/graphql/` | GraphQL, Company, Ships, launchpad and launch data | `免 Key` |
| Sunrise and Sunset | `SunriseAndSunsetClient` | `https://sunrise-sunset.org/api` | Sunset and sunrise times for a given latitude and longitude | `免 Key` |
| Times Adder | `TimesAdderClient` | `https://github.com/FranP-code/API-Times-Adder` | With this API you can add each of the times introduced in the array sended | `免 Key` |
| TLE | `TleClient` | `https://tle.ivanstanojevic.me/#/docs` | Satellite information | `免 Key` |
| USGS Earthquake Hazards Program | `UsgsEarthquakeHazardsProgramClient` | `https://earthquake.usgs.gov/fdsnws/event/1/` | Earthquakes data real-time | `免 Key` |
| USGS Water Services | `UsgsWaterServicesClient` | `https://waterservices.usgs.gov/` | Water quality and level info for rivers and lakes | `免 Key` |
| World Bank | `WorldBankClient` | `https://datahelpdesk.worldbank.org/knowledgebase/topics/125589` | World Data | `免 Key` |
| xMath | `XmathClient` | `https://x-math.herokuapp.com/` | Random mathematical expressions | `免 Key` |


### Weather

本分类共包含 **34** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.weather.WeatherAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Weatherstack | `WeatherstackClient` | `https://weatherstack.com/?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | Real-Time & Historical World Weather Data API | `apiKey` |
| 7Timer! | `Api7TimerClient` | `http://www.7timer.info/doc.php?lang=en` | Weather, especially for Astroweather | `免 Key` |
| AccuWeather | `AccuweatherClient` | `https://developer.accuweather.com/apis` | Weather and forecast data | `apiKey` |
| Aemet | `AemetClient` | `https://opendata.aemet.es/centrodedescargas/inicio` | Weather and forecast data from Spain | `apiKey` |
| APIXU | `ApixuClient` | `https://www.apixu.com/doc/request.aspx` | Weather | `apiKey` |
| AQICN | `AqicnClient` | `https://aqicn.org/api/` | Air Quality Index Data for over 1000 cities | `apiKey` |
| AviationWeather | `AviationweatherClient` | `https://www.aviationweather.gov/dataserver` | NOAA aviation weather forecasts and observations | `免 Key` |
| ColorfulClouds | `ColorfulcloudsClient` | `https://open.caiyunapp.com/ColorfulClouds_Weather_API` | Weather | `apiKey` |
| Euskalmet | `EuskalmetClient` | `https://opendata.euskadi.eus/api-euskalmet/-/api-de-euskalmet/` | Meteorological data of the Basque Country | `apiKey` |
| Foreca | `ForecaClient` | `https://developer.foreca.com` | Weather | `OAuth` |
| HG Weather | `HgWeatherClient` | `https://hgbrasil.com/status/weather` | Provides weather forecast data for cities in Brazil | `apiKey` |
| Hong Kong Obervatory | `HongKongObervatoryClient` | `https://www.hko.gov.hk/en/abouthko/opendata_intro.htm` | Provide weather information, earthquake information, and climate data | `免 Key` |
| IPMA | `IpmaClient` | `https://api.ipma.pt/open-data/` | Portuguese weather and climate data | `免 Key` |
| MetaWeather | `MetaweatherClient` | `https://www.metaweather.com/api/` | Weather | `免 Key` |
| Meteorologisk Institutt | `MeteorologiskInstituttClient` | `https://api.met.no/weatherapi/documentation` | Weather and climate data | `User-Agent` |
| Micro Weather | `MicroWeatherClient` | `https://m3o.com/weather/api` | Real time weather forecasts and historic data | `apiKey` |
| ODWeather | `OdweatherClient` | `http://api.oceandrivers.com/static/docs.html` | Weather and weather webcams | `免 Key` |
| Oikolab | `OikolabClient` | `https://docs.oikolab.com` | 70+ years of global, hourly historical and forecast weather data from NOAA and ECMWF | `apiKey` |
| Open-Meteo | `OpenMeteoClient` | `https://open-meteo.com/` | Global weather forecast API for non-commercial use | `免 Key` |
| openSenseMap | `OpensensemapClient` | `https://api.opensensemap.org/` | Data from Personal Weather Stations called senseBoxes | `免 Key` |
| OpenUV | `OpenuvClient` | `https://www.openuv.io` | Real-time UV Index Forecast | `apiKey` |
| OpenWeatherMap | `OpenweathermapClient` | `https://openweathermap.org/api` | Weather | `apiKey` |
| Pirate Weather | `PirateWeatherClient` | `https://pirateweather.net/en/latest/` | Free weather API with forecast data similar to Dark Sky | `免 Key` |
| QWeather | `QweatherClient` | `https://dev.qweather.com/en/` | Location-based weather data | `apiKey` |
| RainViewer | `RainviewerClient` | `https://www.rainviewer.com/api.html` | Radar data collected from different websites across the Internet | `免 Key` |
| Storm Glass | `StormGlassClient` | `https://stormglass.io/` | Global marine weather from multiple sources | `apiKey` |
| Tomorrow | `TomorrowClient` | `https://docs.tomorrow.io` | Weather API Powered by Proprietary Technology | `apiKey` |
| US Weather | `UsWeatherClient` | `https://www.weather.gov/documentation/services-web-api` | US National Weather Service | `免 Key` |
| Visual Crossing | `VisualCrossingClient` | `https://www.visualcrossing.com/weather-api` | Global historical and weather forecast data | `apiKey` |
| weather-api | `WeatherApiClient` | `https://github.com/robertoduessmann/weather-api` | A RESTful free API to check the weather | `免 Key` |
| WeatherAPI | `WeatherapiClient` | `https://www.weatherapi.com/` | Weather API with other stuff like Astronomy and Geolocation API | `apiKey` |
| Weatherbit | `WeatherbitClient` | `https://www.weatherbit.io/api` | Weather | `apiKey` |
| wttr.in | `WttrInClient` | `https://wttr.in/:help` | Weather in your terminal, supports JSON output | `免 Key` |
| Yandex.Weather | `YandexWeatherClient` | `https://yandex.com/dev/weather/` | Assesses weather condition in specific locations | `apiKey` |


### Health

本分类共包含 **33** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.health.HealthAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| CMS.gov | `CmsGovClient` | `https://data.cms.gov/provider-data/` | Access to the data from the CMS - medicare.gov | `apiKey` |
| Coronavirus | `CoronavirusClient` | `https://pipedream.com/@pravin/http-api-for-latest-wuhan-coronavirus-data-2019-ncov-p_G6CLVM/readme` | HTTP API for Latest Covid-19 Data | `免 Key` |
| Coronavirus in the UK | `CoronavirusInTheUkClient` | `https://coronavirus.data.gov.uk/details/developers-guide` | UK Government coronavirus data, including deaths and cases by region | `免 Key` |
| Covid Tracking Project | `CovidTrackingProjectClient` | `https://covidtracking.com/data/api/version-2` | Covid-19  data for the US | `免 Key` |
| Covid-19 | `Covid19Client` | `https://covid19api.com/` | Covid 19 spread, infection and recovery | `免 Key` |
| Covid-19 | `Covid19Client` | `https://github.com/M-Media-Group/Covid-19-API` | Covid 19 cases, deaths and recovery per country | `免 Key` |
| Covid-19 Datenhub | `Covid19DatenhubClient` | `https://npgeo-corona-npgeo-de.hub.arcgis.com` | Maps, datasets, applications and more in the context of COVID-19 | `免 Key` |
| Covid-19 Government Response | `Covid19GovernmentResponseClient` | `https://covidtracker.bsg.ox.ac.uk` | Government measures tracker to fight against the Covid-19 pandemic | `免 Key` |
| Covid-19 India | `Covid19IndiaClient` | `https://data.covid19india.org/` | Covid 19 statistics state and district wise about cases, vaccinations, recovery within India | `免 Key` |
| Covid-19 JHU CSSE | `Covid19JhuCsseClient` | `https://nuttaphat.com/covid19-api/` | Open-source API for exploring Covid19 cases based on JHU CSSE | `免 Key` |
| Covid-19 Live Data | `Covid19LiveDataClient` | `https://github.com/mathdroid/covid-19-api` | Global and countrywise data of Covid 19 daily Summary, confirmed cases, recovered and deaths | `免 Key` |
| Covid-19 Philippines | `Covid19PhilippinesClient` | `https://github.com/Simperfy/Covid-19-API-Philippines-DOH` | Unofficial Covid-19 Web API for Philippines from data collected by DOH | `免 Key` |
| COVID-19 Tracker Canada | `Covid19TrackerCanadaClient` | `https://api.covid19tracker.ca/docs/1.0/overview` | Details on Covid-19 cases across Canada | `免 Key` |
| COVID-19 Tracker Sri Lanka | `Covid19TrackerSriLankaClient` | `https://www.hpb.health.gov.lk/en/api-documentation` | Provides situation of the COVID-19 patients reported in Sri Lanka | `免 Key` |
| COVID-ID | `CovidIdClient` | `https://data.covid19.go.id/public/api/prov.json` | Indonesian government Covid data per province | `免 Key` |
| Dataflow Kit COVID-19 | `DataflowKitCovid19Client` | `https://covid-19.dataflowkit.com` | COVID-19 live statistics into sites per hour | `免 Key` |
| Edamam | `EdamamClient` | `https://developer.edamam.com/` | Food and nutrition data API with recipe search | `apiKey` |
| FoodData Central | `FooddataCentralClient` | `https://fdc.nal.usda.gov/` | National Nutrient Database for Standard Reference | `apiKey` |
| Healthcare.gov | `HealthcareGovClient` | `https://www.healthcare.gov/developers/` | Educational content about the US Health Insurance Marketplace | `免 Key` |
| Humanitarian Data Exchange | `HumanitarianDataExchangeClient` | `https://data.humdata.org/` | Humanitarian Data Exchange (HDX) is open platform for sharing data across crises and organisations | `免 Key` |
| Infermedica | `InfermedicaClient` | `https://developer.infermedica.com/docs/` | NLP based symptom checker and patient triage API for health diagnosis from text | `apiKey` |
| LAPIS | `LapisClient` | `https://cov-spectrum.ethz.ch/public` | SARS-CoV-2 genomic sequences from public sources | `免 Key` |
| Lexigram | `LexigramClient` | `https://docs.lexigram.io/` | NLP that extracts mentions of clinical concepts from text, gives access to clinical ontology | `apiKey` |
| Makeup | `MakeupClient` | `http://makeup-api.herokuapp.com/` | Makeup Information | `免 Key` |
| MedlinePlus Genetics | `MedlineplusGeneticsClient` | `https://medlineplus.gov/about/developers/geneticsdatafilesapi/` | Genetic conditions, genes, chromosomes and mtDNA data | `免 Key` |
| MyVaccination | `MyvaccinationClient` | `https://documenter.getpostman.com/view/16605343/Tzm8GG7u` | Vaccination data for Malaysia | `免 Key` |
| NPPES | `NppesClient` | `https://npiregistry.cms.hhs.gov/registry/help-api` | National Plan & Provider Enumeration System, info on healthcare providers registered in US | `免 Key` |
| Nutritionix | `NutritionixClient` | `https://developer.nutritionix.com/` | Worlds largest verified nutrition database | `apiKey` |
| Open Data NHS Scotland | `OpenDataNhsScotlandClient` | `https://www.opendata.nhs.scot` | Medical reference data and statistics by Public Health Scotland | `免 Key` |
| Open Disease | `OpenDiseaseClient` | `https://disease.sh/` | API for Current cases and more stuff about COVID-19 and Influenza | `免 Key` |
| openFDA | `OpenfdaClient` | `https://open.fda.gov` | Public FDA data about drugs, devices and foods | `apiKey` |
| Orion Health | `OrionHealthClient` | `https://developer.orionhealth.io/` | Medical platform which allows the development of applications for different healthcare scenarios | `OAuth` |
| Quarantine | `QuarantineClient` | `https://quarantine.country/coronavirus/api/` | Coronavirus API with free COVID-19 live updates | `免 Key` |


### Documents & Productivity

本分类共包含 **31** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.documentsproductivity.DocumentsProductivityAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Airtable | `AirtableClient` | `https://airtable.com/api` | Integrate with Airtable | `apiKey` |
| Api2Convert | `Api2ConvertClient` | `https://www.api2convert.com/` | Online File Conversion API | `apiKey` |
| apilayer pdflayer | `ApilayerPdflayerClient` | `https://pdflayer.com` | HTML/URL to PDF | `apiKey` |
| Asana | `AsanaClient` | `https://developers.asana.com/docs` | Programmatic access to all data in your asana system | `apiKey` |
| BuildPDF | `BuildpdfClient` | `https://buildpdf.co/api/docs` | Convert HTML, images, and text to PDF | `apiKey` |
| ClickUp | `ClickupClient` | `https://clickup.com/api` | ClickUp is a robust, cloud-based project management tool for boosting productivity | `OAuth` |
| Clockify | `ClockifyClient` | `https://clockify.me/developers-api` | Clockify's REST-based API can be used to push/pull data to/from it & integrate it with other systems | `apiKey` |
| CloudConvert | `CloudconvertClient` | `https://cloudconvert.com/api/v2` | Online file converter for audio, video, document, ebook, archive, image, spreadsheet, presentation | `apiKey` |
| Cloudmersive Document and Data Conversion | `CloudmersiveDocumentAndDataConversionClient` | `https://cloudmersive.com/convert-api` | HTML/URL to PDF/PNG, Office documents to PDF, image conversion | `apiKey` |
| Code::Stats | `CodeStatsClient` | `https://codestats.net/api-docs` | Automatic time tracking for programmers | `apiKey` |
| CraftMyPDF | `CraftmypdfClient` | `https://craftmypdf.com` | Generate PDF documents from templates with a drop-and-drop editor and a simple API | `apiKey` |
| Flowdash | `FlowdashClient` | `https://docs.flowdash.com/docs/api-introduction` | Automate business workflows | `apiKey` |
| Html2PDF | `Html2PdfClient` | `https://html2pdf.app/` | HTML/URL to PDF | `apiKey` |
| iLovePDF | `IlovepdfClient` | `https://developer.ilovepdf.com/` | Convert, merge, split, extract text and add page numbers for PDFs. Free for 250 documents/month | `apiKey` |
| JIRA | `JiraClient` | `https://developer.atlassian.com/server/jira/platform/rest-apis/` | JIRA is a proprietary issue tracking product that allows bug tracking and agile project management | `OAuth` |
| Mattermost | `MattermostClient` | `https://api.mattermost.com/` | An open source platform for developer collaboration | `OAuth` |
| Mercury | `MercuryClient` | `https://mercury.postlight.com/web-parser/` | Web parser | `apiKey` |
| Monday | `MondayClient` | `https://api.developer.monday.com/docs` | Programmatically access and update data inside a monday.com account | `apiKey` |
| Notion | `NotionClient` | `https://developers.notion.com/docs/getting-started` | Integrate with Notion | `OAuth` |
| PandaDoc | `PandadocClient` | `https://developers.pandadoc.com` | DocGen and eSignatures API | `apiKey` |
| Pocket | `PocketClient` | `https://getpocket.com/developer/` | Bookmarking service | `OAuth` |
| Podio | `PodioClient` | `https://developers.podio.com` | File sharing and productivity | `OAuth` |
| PrexView | `PrexviewClient` | `https://prexview.com` | Data from XML or JSON to PDF, HTML or Image | `apiKey` |
| Renderly | `RenderlyClient` | `https://renderlyapi.com` | HTML to PDF conversion API built on Chromium | `apiKey` |
| Restpack | `RestpackClient` | `https://restpack.io/` | Provides screenshot, HTML to PDF and content extraction APIs | `apiKey` |
| Todoist | `TodoistClient` | `https://developer.todoist.com` | Todo Lists | `OAuth` |
| Smart Image Enhancement | `SmartImageEnhancementClient` | `https://apilayer.com/marketplace/image_enhancement-api` | Performs image upscaling by adding detail to images through multiple super-resolution algorithms | `apiKey` |
| staffSign | `StaffsignClient` | `https://staffsign.de/docs` | Digital employment contract API with QES/eIDAS support for HR and staffing | `apiKey` |
| Vector Express v2.0 | `VectorExpressV20Client` | `https://vector.express` | Free vector file converting API | `免 Key` |
| WakaTime | `WakatimeClient` | `https://wakatime.com/developers` | Automated time tracking leaderboards for programmers | `免 Key` |
| Zube | `ZubeClient` | `https://zube.io/docs/api` | Full stack project management | `OAuth` |


### Photography

本分类共包含 **29** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.photography.PhotographyAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Screenshotlayer | `ScreenshotlayerClient` | `https://screenshotlayer.com?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | URL to screenshot | `免 Key` |
| APITemplate.io | `ApitemplateIoClient` | `https://apitemplate.io` | Dynamically generate images and PDFs from templates with a simple API | `apiKey` |
| Bruzu | `BruzuClient` | `https://docs.bruzu.com` | Image generation with query string | `apiKey` |
| CheetahO | `CheetahoClient` | `https://cheetaho.com/docs/getting-started/` | Photo optimization and resize | `apiKey` |
| Dagpi | `DagpiClient` | `https://dagpi.xyz` | Image manipulation and processing | `apiKey` |
| Duply | `DuplyClient` | `https://duply.co/docs#getting-started-api` | Generate, Edit, Scale and Manage Images and Videos Smarter & Faster | `apiKey` |
| DynaPictures | `DynapicturesClient` | `https://dynapictures.com/docs/` | Generate Hundreds of Personalized Images in Minutes | `apiKey` |
| Flickr | `FlickrClient` | `https://www.flickr.com/services/api/` | Flickr Services | `OAuth` |
| Getty Images | `GettyImagesClient` | `http://developers.gettyimages.com/en/` | Build applications using the world's most powerful imagery | `OAuth` |
| Gfycat | `GfycatClient` | `https://developers.gfycat.com/api/` | Jiffier GIFs | `OAuth` |
| Giphy | `GiphyClient` | `https://developers.giphy.com/docs/` | Get all your gifs | `apiKey` |
| Google Photos | `GooglePhotosClient` | `https://developers.google.com/photos` | Integrate Google Photos with your apps or devices | `OAuth` |
| Image Upload | `ImageUploadClient` | `https://apilayer.com/marketplace/image_upload-api` | Image Optimization | `apiKey` |
| Imgur | `ImgurClient` | `https://apidocs.imgur.com/` | Images | `OAuth` |
| Imsea | `ImseaClient` | `https://imsea.herokuapp.com/` | Free image search | `免 Key` |
| Lorem Picsum | `LoremPicsumClient` | `https://picsum.photos/` | Images from Unsplash | `免 Key` |
| ObjectCut | `ObjectcutClient` | `https://objectcut.com/` | Image Background removal | `apiKey` |
| Pexels | `PexelsClient` | `https://www.pexels.com/api/` | Free Stock Photos and Videos | `apiKey` |
| PhotoRoom | `PhotoroomClient` | `https://www.photoroom.com/api/` | Remove background from images | `apiKey` |
| Pixabay | `PixabayClient` | `https://pixabay.com/sk/service/about/api/` | Photography | `apiKey` |
| PlaceKeanu | `PlacekeanuClient` | `https://placekeanu.com/` | Resizable Keanu Reeves placeholder images with grayscale and young Keanu options | `免 Key` |
| Readme typing SVG | `ReadmeTypingSvgClient` | `https://github.com/DenverCoder1/readme-typing-svg` | Customizable typing and deleting text SVG | `免 Key` |
| Remove.bg | `RemoveBgClient` | `https://www.remove.bg/api` | Image Background removal | `apiKey` |
| ReSmush.it | `ResmushItClient` | `https://resmush.it/api` | Photo optimization | `免 Key` |
| shutterstock | `ShutterstockClient` | `https://api-reference.shutterstock.com/` | Stock Photos and Videos | `OAuth` |
| Sirv | `SirvClient` | `https://apidocs.sirv.com/` | Image management solutions like optimization, manipulation, hosting | `apiKey` |
| Unsplash | `UnsplashClient` | `https://unsplash.com/developers` | Photography | `OAuth` |
| Wallhaven | `WallhavenClient` | `https://wallhaven.cc/help/api` | Wallpapers | `apiKey` |
| Webdam | `WebdamClient` | `https://www.damsuccess.com/hc/en-us/articles/202134055-REST-API` | Images | `OAuth` |


### Animals

本分类共包含 **28** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.animals.AnimalsAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| AdoptAPet | `AdoptapetClient` | `https://www.adoptapet.com/public/apis/pet_list.html` | Resource to help get pets adopted | `apiKey` |
| Axolotl | `AxolotlClient` | `https://theaxolotlapi.netlify.app/` | Collection of axolotl pictures and facts | `免 Key` |
| Cat Facts | `CatFactsClient` | `https://alexwohlbruck.github.io/cat-facts/` | Daily cat facts | `免 Key` |
| Cat Facts | `CatFactsClient` | `https://catfact.ninja/` | Random cat facts | `免 Key` |
| Cataas | `CataasClient` | `https://cataas.com/` | Cat as a service (cats pictures and gifs) | `免 Key` |
| Cats | `CatsClient` | `https://docs.thecatapi.com/` | Pictures of cats from Tumblr | `apiKey` |
| Dog Facts | `DogFactsClient` | `https://dukengn.github.io/Dog-facts-API/` | Random dog facts | `免 Key` |
| Dog Facts | `DogFactsClient` | `https://kinduff.github.io/dog-api/` | Random facts of Dogs | `免 Key` |
| Dogs | `DogsClient` | `https://dog.ceo/dog-api/` | Based on the Stanford Dogs Dataset | `免 Key` |
| eBird | `EbirdClient` | `https://documenter.getpostman.com/view/664302/S1ENwy59` | Retrieve recent or notable birding observations within a region | `apiKey` |
| FishWatch | `FishwatchClient` | `https://www.fishwatch.gov/developers` | Information and pictures about individual fish species | `免 Key` |
| HTTP Cat | `HttpCatClient` | `https://http.cat/` | Cat for every HTTP Status | `免 Key` |
| HTTP Dog | `HttpDogClient` | `https://http.dog/` | Dogs for every HTTP response status code | `免 Key` |
| IUCN | `IucnClient` | `http://apiv3.iucnredlist.org/api/v3/docs` | IUCN Red List of Threatened Species | `apiKey` |
| MeowFacts | `MeowfactsClient` | `https://github.com/wh-iterabb-it/meowfacts` | Get random cat facts | `免 Key` |
| Movebank | `MovebankClient` | `https://github.com/movebank/movebank-api-doc` | Movement and Migration data of animals | `免 Key` |
| Petfinder | `PetfinderClient` | `https://www.petfinder.com/developers/` | Petfinder is dedicated to helping pets find homes, another resource to get pets adopted | `apiKey` |
| PlaceBear | `PlacebearClient` | `https://placebear.com/` | Placeholder bear pictures | `免 Key` |
| PlaceDog | `PlacedogClient` | `https://place.dog` | Placeholder Dog pictures | `免 Key` |
| PlaceKitten | `PlacekittenClient` | `https://placekitten.com/` | Placeholder Kitten pictures | `免 Key` |
| RandomDog | `RandomdogClient` | `https://random.dog/woof.json` | Random pictures of dogs | `免 Key` |
| RandomDuck | `RandomduckClient` | `https://random-d.uk/api` | Random pictures of ducks | `免 Key` |
| RandomFox | `RandomfoxClient` | `https://randomfox.ca/floof/` | Random pictures of foxes | `免 Key` |
| RescueGroups | `RescuegroupsClient` | `https://userguide.rescuegroups.org/display/APIDG/API+Developers+Guide+Home` | Adoption | `免 Key` |
| Shibe.Online | `ShibeOnlineClient` | `http://shibe.online/` | Random pictures of Shiba Inu, cats or birds | `免 Key` |
| The Dog | `TheDogClient` | `https://thedogapi.com/` | A public service all about Dogs, free to use when making your fancy new App, Website or Service | `apiKey` |
| xeno-canto | `XenoCantoClient` | `https://xeno-canto.org/explore/api` | Bird recordings | `免 Key` |
| Zoo Animals | `ZooAnimalsClient` | `https://zoo-animal-api.herokuapp.com/` | Facts and pictures of zoo animals | `免 Key` |


### Books

本分类共包含 **26** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.books.BooksAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| A Bíblia Digital | `ABBliaDigitalClient` | `https://www.abibliadigital.com.br/en` | Do not worry about managing the multiple versions of the Bible | `apiKey` |
| Amanah Sunnah | `AmanahSunnahClient` | `https://sunnah.amanahagent.cloud/developers` | Semantic search across Quran, Hadith, Tafsir & 18K+ Rijal narrators | `apiKey` |
| Bhagavad Gita | `BhagavadGitaClient` | `https://docs.bhagavadgitaapi.in` | Open Source Shrimad Bhagavad Gita API including 21+ authors translation in Sanskrit/English/Hindi | `apiKey` |
| Bhagavad Gita | `BhagavadGitaClient` | `https://bhagavadgita.io/api` | Bhagavad Gita text | `OAuth` |
| Bhagavad Gita telugu | `BhagavadGitaTeluguClient` | `https://gita-api.vercel.app` | Bhagavad Gita API in telugu and odia languages | `免 Key` |
| Bible-api | `BibleApiClient` | `https://bible-api.com/` | Free Bible API with multiple languages | `免 Key` |
| British National Bibliography | `BritishNationalBibliographyClient` | `http://bnb.data.bl.uk/` | Books | `免 Key` |
| Crossref Metadata Search | `CrossrefMetadataSearchClient` | `https://github.com/CrossRef/rest-api-doc` | Books & Articles Metadata | `免 Key` |
| Ganjoor | `GanjoorClient` | `https://api.ganjoor.net` | Classic Persian poetry works including access to related manuscripts, recitations and music tracks | `OAuth` |
| Google Books | `GoogleBooksClient` | `https://developers.google.com/books/` | Books | `OAuth` |
| GurbaniNow | `GurbaninowClient` | `https://github.com/GurbaniNow/api` | Fast and Accurate Gurbani RESTful API | `免 Key` |
| Gutendex | `GutendexClient` | `https://gutendex.com/` | Web-API for fetching data from Project Gutenberg Books Library | `免 Key` |
| Open Library | `OpenLibraryClient` | `https://openlibrary.org/developers/api` | Books, book covers and related data | `免 Key` |
| Penguin Publishing | `PenguinPublishingClient` | `http://www.penguinrandomhouse.biz/webservices/rest/` | Books, book covers and related data | `免 Key` |
| PoetryDB | `PoetrydbClient` | `https://github.com/thundercomb/poetrydb#readme` | Enables you to get instant data from our vast poetry collection | `免 Key` |
| Quran | `QuranClient` | `https://quran.api-docs.io/` | RESTful Quran API with multiple languages | `免 Key` |
| Quran Cloud | `QuranCloudClient` | `https://alquran.cloud/api` | A RESTful Quran API to retrieve an Ayah, Surah, Juz or the entire Holy Quran | `免 Key` |
| Quran-api | `QuranApiClient` | `https://github.com/fawazahmed0/quran-api#readme` | Free Quran API Service with 90+ different languages and 400+ translations | `免 Key` |
| Rig Veda | `RigVedaClient` | `https://aninditabasu.github.io/indica/html/rv.html` | Gods and poets, their categories, and the verse meters, with the mandal and sukta number | `免 Key` |
| Runyankole Bible | `RunyankoleBibleClient` | `https://runyankole-bible-api.vercel.app` | Free REST API for the Runyankore-Rukiga Bible — 66 books, 31106 verses | `免 Key` |
| The Bible | `TheBibleClient` | `https://docs.api.bible` | Everything you need from the Bible in one discoverable place | `apiKey` |
| Thirukkural | `ThirukkuralClient` | `https://api-thirukkural.web.app/` | 1330 Thirukkural poems and explanation in Tamil and English | `免 Key` |
| Urantia Papers | `UrantiaPapersClient` | `https://urantia.dev` | Full-text + semantic search across the Urantia Papers, with audio narration, entities, translations | `免 Key` |
| Vedic Society | `VedicSocietyClient` | `https://aninditabasu.github.io/indica/html/vs.html` | Descriptions of all nouns (names, places, animals, things) from vedic literature | `免 Key` |
| Wizard World | `WizardWorldClient` | `https://wizard-world-api.herokuapp.com/swagger/index.html` | Get information from the Harry Potter universe | `免 Key` |
| Wolne Lektury | `WolneLekturyClient` | `https://wolnelektury.pl/api/` | API for obtaining information about e-books available on the WolneLektury.pl website | `免 Key` |


### Machine Learning

本分类共包含 **26** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.machinelearning.MachineLearningAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| AI For Thai | `AiForThaiClient` | `https://aiforthai.in.th/index.php` | Free Various Thai AI API | `apiKey` |
| Clarifai | `ClarifaiClient` | `https://docs.clarifai.com/api-guide/api-overview` | Computer Vision | `OAuth` |
| Cloudmersive | `CloudmersiveClient` | `https://www.cloudmersive.com/image-recognition-and-processing-api` | Image captioning, face recognition, NSFW classification | `apiKey` |
| DeepAI | `DeepaiClient` | `https://deepai.org/` | Provides AI-powered APIs for text generation, image processing, and more | `apiKey` |
| Deepcode | `DeepcodeClient` | `https://www.deepcode.ai` | AI for code review | `免 Key` |
| Dialogflow | `DialogflowClient` | `https://cloud.google.com/dialogflow/docs/` | Natural Language Processing | `apiKey` |
| EXUDE-API | `ExudeApiClient` | `http://uttesh.com/exude-api/` | Used for the primary ways for filtering the stopping, stemming words from the text data | `免 Key` |
| Groq | `GroqClient` | `https://console.groq.com/docs/quickstart` | Fast AI inference API with free tier, supports Llama, Mixtral, Gemma models | `apiKey` |
| Hirak FaceAPI | `HirakFaceapiClient` | `https://faceapi.hirak.site/` | Face detection, face recognition with age estimation/gender estimation, accurate, no quota limits | `apiKey` |
| Hugging Face | `HuggingFaceClient` | `https://huggingface.co` | AI model hub with inference API for NLP, computer vision, and audio | `apiKey` |
| Imagga | `ImaggaClient` | `https://imagga.com/` | Image Recognition Solutions like Tagging, Visual Search, NSFW moderation | `apiKey` |
| Inferdo | `InferdoClient` | `https://rapidapi.com/user/inferdo` | Computer Vision services like Facial detection, Image labeling, NSFW classification | `apiKey` |
| IPS Online | `IpsOnlineClient` | `https://docs.identity.ps/docs` | Face and License Plate Anonymization | `apiKey` |
| Irisnet | `IrisnetClient` | `https://irisnet.de/api/` | Realtime content moderation API that blocks or blurs unwanted images in real-time | `apiKey` |
| Keen IO | `KeenIoClient` | `https://keen.io/` | Data Analytics | `apiKey` |
| Machinetutors | `MachinetutorsClient` | `https://www.machinetutors.com/portfolio/MT_api.html` | AI Solutions: Video/Image Classification & Tagging, NSFW, Icon/Image/Audio Search, NLP | `apiKey` |
| MessengerX.io | `MessengerxIoClient` | `https://messengerx.rtfd.io` | A FREE API for developers to build and monetize personalized ML based chat apps | `apiKey` |
| NLP Cloud | `NlpCloudClient` | `https://nlpcloud.io` | NLP API using spaCy and transformers for NER, sentiments, classification, summarization, and more | `apiKey` |
| OpenVisionAPI | `OpenvisionapiClient` | `https://openvisionapi.com` | Open source computer vision API based on open source models | `免 Key` |
| Perspective | `PerspectiveClient` | `https://perspectiveapi.com` | NLP API to return probability that if text is toxic, obscene, insulting or threatening | `apiKey` |
| Roboflow Universe | `RoboflowUniverseClient` | `https://universe.roboflow.com` | Pre-trained computer vision models | `apiKey` |
| SkyBiometry | `SkybiometryClient` | `https://skybiometry.com/documentation/` | Face Detection, Face Recognition and Face Grouping | `apiKey` |
| TensorFeed | `TensorfeedClient` | `https://tensorfeed.ai/developers` | Real-time AI news, model pricing, service status, and agent activity feeds | `免 Key` |
| Time Door | `TimeDoorClient` | `https://timedoor.io` | A time series analysis API | `apiKey` |
| Unplugg | `UnpluggClient` | `https://unplu.gg/test_api.html` | Forecasting API for timeseries data | `apiKey` |
| WolframAlpha | `WolframalphaClient` | `https://products.wolframalpha.com/api/` | Provides specific answers to questions using data and algorithms | `apiKey` |


### Food & Drink

本分类共包含 **25** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.fooddrink.FoodDrinkAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| BaconMockup | `BaconmockupClient` | `https://baconmockup.com/` | Resizable bacon placeholder images | `免 Key` |
| Chomp | `ChompClient` | `https://chompthis.com/api/` | Data about various grocery products and foods | `apiKey` |
| Coffee | `CoffeeClient` | `https://coffee.alexflipnote.dev/` | Random pictures of coffee | `免 Key` |
| Edamam nutrition | `EdamamNutritionClient` | `https://developer.edamam.com/edamam-docs-nutrition-api` | Nutrition Analysis | `apiKey` |
| Edamam recipes | `EdamamRecipesClient` | `https://developer.edamam.com/edamam-docs-recipe-api` | Recipe Search | `apiKey` |
| Foodish | `FoodishClient` | `https://github.com/surhud004/Foodish#readme` | Random pictures of food dishes | `免 Key` |
| Fruityvice | `FruityviceClient` | `https://www.fruityvice.com` | Data about all kinds of fruit | `免 Key` |
| Kroger | `KrogerClient` | `https://developer.kroger.com/reference` | Supermarket Data | `apiKey` |
| LCBO | `LcboClient` | `https://lcboapi.com/` | Alcohol | `apiKey` |
| Open Brewery DB | `OpenBreweryDbClient` | `https://www.openbrewerydb.org` | Breweries, Cideries and Craft Beer Bottle Shops | `免 Key` |
| Open Food Facts | `OpenFoodFactsClient` | `https://world.openfoodfacts.org/data` | Food Products Database | `免 Key` |
| PunkAPI | `PunkapiClient` | `https://punkapi.com/` | Brewdog Beer Recipes | `免 Key` |
| RecipeAPI | `RecipeapiClient` | `https://recipeapi.io` | Recipes, ingredients, nutrition data and cooking instructions | `apiKey` |
| Rustybeer | `RustybeerClient` | `https://rustybeer.herokuapp.com/` | Beer brewing tools | `免 Key` |
| Spoonacular | `SpoonacularClient` | `https://spoonacular.com/food-api` | Recipes, Food Products, and Meal Planning | `apiKey` |
| Systembolaget | `SystembolagetClient` | `https://api-portal.systembolaget.se` | Govornment owned liqour store in Sweden | `apiKey` |
| TacoFancy | `TacofancyClient` | `https://github.com/evz/tacofancy-api` | Community-driven taco database | `免 Key` |
| Tasty | `TastyClient` | `https://rapidapi.com/apidojo/api/tasty/` | API to query data about recipe, plan, ingredients | `apiKey` |
| The Report of the Week | `TheReportOfTheWeekClient` | `https://github.com/andyklimczak/TheReportOfTheWeek-API` | Food & Drink Reviews | `免 Key` |
| TheCocktailDB | `ThecocktaildbClient` | `https://www.thecocktaildb.com/api.php` | Cocktail Recipes | `apiKey` |
| TheMealDB | `ThemealdbClient` | `https://www.themealdb.com/api.php` | Meal Recipes | `apiKey` |
| Untappd | `UntappdClient` | `https://untappd.com/api/docs` | Social beer sharing | `OAuth` |
| What's on the menu? | `WhatSOnTheMenuClient` | `http://nypl.github.io/menus-api/` | NYPL human-transcribed historical menu collection | `apiKey` |
| WhiskyHunter | `WhiskyhunterClient` | `https://whiskyhunter.net/api/` | Past online whisky auctions statistical data | `免 Key` |
| Zestful | `ZestfulClient` | `https://zestfuldata.com/` | Parse recipe ingredients | `apiKey` |


### Test Data

本分类共包含 **25** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.testdata.TestDataAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Bacon Ipsum | `BaconIpsumClient` | `https://baconipsum.com/json-api/` | A Meatier Lorem Ipsum Generator | `免 Key` |
| Dicebear Avatars | `DicebearAvatarsClient` | `https://avatars.dicebear.com/` | Generate random pixel-art avatars | `免 Key` |
| English Random Words | `EnglishRandomWordsClient` | `https://random-words-api.vercel.app/word` | Generate English Random Words with Pronunciation | `免 Key` |
| FakeJSON | `FakejsonClient` | `https://fakejson.com` | Service to generate test and fake data | `apiKey` |
| FakerAPI | `FakerapiClient` | `https://fakerapi.it/en` | APIs collection to get fake data | `免 Key` |
| FakeStoreAPI | `FakestoreapiClient` | `https://fakestoreapi.com/` | Fake store rest API for your e-commerce or shopping website prototype | `免 Key` |
| GeneradorDNI | `GeneradordniClient` | `https://api.generadordni.es` | Data generator API. Profiles, vehicles, banks and cards, etc | `apiKey` |
| ItsThisForThat | `ItsthisforthatClient` | `https://itsthisforthat.com/api.php` | Generate Random startup ideas | `免 Key` |
| JSONPlaceholder | `JsonplaceholderClient` | `http://jsonplaceholder.typicode.com/` | Fake data for testing and prototyping | `免 Key` |
| Loripsum | `LoripsumClient` | `http://loripsum.net/` | The "lorem ipsum" generator that doesn't suck | `免 Key` |
| Mailsac | `MailsacClient` | `https://mailsac.com/docs/api` | Disposable Email | `apiKey` |
| Metaphorsum | `MetaphorsumClient` | `http://metaphorpsum.com/` | Generate demo paragraphs giving number of words and sentences | `免 Key` |
| Mockaroo | `MockarooClient` | `https://www.mockaroo.com/docs` | Generate fake data to JSON, CSV, TXT, SQL and XML | `apiKey` |
| QuickMocker | `QuickmockerClient` | `https://quickmocker.com` | API mocking tool to generate contextual, fake or random data | `免 Key` |
| Random Data | `RandomDataClient` | `https://random-data-api.com` | Random data generator | `免 Key` |
| Randommer | `RandommerClient` | `https://randommer.io/randommer-api` | Random data generator | `apiKey` |
| RandomUser | `RandomuserClient` | `https://randomuser.me` | Generates and list user data | `免 Key` |
| RoboHash | `RobohashClient` | `https://robohash.org/` | Generate random robot/alien avatars | `免 Key` |
| Spanish random names | `SpanishRandomNamesClient` | `https://random-names-api.herokuapp.com/public` | Generate spanish names (with gender) randomly | `免 Key` |
| Spanish random words | `SpanishRandomWordsClient` | `https://palabras-aleatorias-public-api.herokuapp.com` | Generate spanish words randomly | `免 Key` |
| This Person Does not Exist | `ThisPersonDoesNotExistClient` | `https://thispersondoesnotexist.com` | Generates real-life faces of people who do not exist | `免 Key` |
| Toolcarton | `ToolcartonClient` | `https://testimonialapi.toolcarton.com/` | Generate random testimonial data | `免 Key` |
| UUID Generator | `UuidGeneratorClient` | `https://www.uuidtools.com/docs` | Generate UUIDs | `免 Key` |
| What The Commit | `WhatTheCommitClient` | `http://whatthecommit.com/index.txt` | Random commit message generator | `免 Key` |
| Yes No | `YesNoClient` | `https://yesno.wtf/api` | Generate yes or no randomly | `免 Key` |


### Business

本分类共包含 **23** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.business.BusinessAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Apache Superset | `ApacheSupersetClient` | `https://superset.apache.org/docs/api` | API to manage your BI dashboards and data sources on Superset | `apiKey` |
| Charity Search | `CharitySearchClient` | `http://charityapi.orghunter.com/` | Non-profit charity data | `apiKey` |
| Clearbit Logo | `ClearbitLogoClient` | `https://clearbit.com/docs#logo-api` | Search for company logos and embed them in your projects | `apiKey` |
| Domainsdb.info | `DomainsdbInfoClient` | `https://domainsdb.info/` | Registered Domain Names Search | `免 Key` |
| Freelancer | `FreelancerClient` | `https://developers.freelancer.com` | Hire freelancers to get work done | `OAuth` |
| Gmail | `GmailClient` | `https://developers.google.com/gmail/api/` | Flexible, RESTful access to the user's inbox | `OAuth` |
| Google Analytics | `GoogleAnalyticsClient` | `https://developers.google.com/analytics/` | Collect, configure and analyze your data to reach the right audience | `OAuth` |
| Instatus | `InstatusClient` | `https://instatus.com/help/api` | Post to and update maintenance and incidents on your status page through an HTTP REST API | `apiKey` |
| Mailchimp | `MailchimpClient` | `https://mailchimp.com/developer/` | Send marketing campaigns and transactional mails | `apiKey` |
| mailjet | `MailjetClient` | `https://www.mailjet.com/` | Marketing email can be sent and mail templates made in MJML or HTML can be sent using API | `apiKey` |
| markerapi | `MarkerapiClient` | `https://markerapi.com` | Trademark Search | `免 Key` |
| ORB Intelligence | `OrbIntelligenceClient` | `https://api.orb-intelligence.com/docs/` | Company lookup | `apiKey` |
| Redash | `RedashClient` | `https://redash.io/help/user-guide/integrations-and-api/api` | Access your queries and dashboards on Redash | `apiKey` |
| Smartsheet | `SmartsheetClient` | `https://smartsheet.redoc.ly/` | Allows you to programmatically access and Smartsheet data and account information | `OAuth` |
| Square | `SquareClient` | `https://developer.squareup.com/reference/square` | Easy way to take payments, manage refunds, and help customers checkout online | `OAuth` |
| SwiftKanban | `SwiftkanbanClient` | `https://www.digite.com/knowledge-base/swiftkanban/article/api-for-swift-kanban-web-services/#restapi` | Kanban software, Visualize Work, Increase Organizations Lead Time, Throughput & Productivity | `apiKey` |
| Tenders in Hungary | `TendersInHungaryClient` | `https://tenders.guru/hu/api` | Get data for procurements in Hungary in JSON format | `免 Key` |
| Tenders in Poland | `TendersInPolandClient` | `https://tenders.guru/pl/api` | Get data for procurements in Poland in JSON format | `免 Key` |
| Tenders in Romania | `TendersInRomaniaClient` | `https://tenders.guru/ro/api` | Get data for procurements in Romania in JSON format | `免 Key` |
| Tenders in Spain | `TendersInSpainClient` | `https://tenders.guru/es/api` | Get data for procurements in Spain in JSON format | `免 Key` |
| Tenders in Ukraine | `TendersInUkraineClient` | `https://tenders.guru/ua/api` | Get data for procurements in Ukraine in JSON format | `免 Key` |
| Tomba email finder | `TombaEmailFinderClient` | `https://tomba.io/api` | Email Finder for B2B sales and email marketing and email verifier | `apiKey` |
| Trello | `TrelloClient` | `https://developers.trello.com/` | Boards, lists and cards to help you organize and prioritize your projects | `OAuth` |


### Personality

本分类共包含 **23** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.personality.PersonalityAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Advice Slip | `AdviceSlipClient` | `http://api.adviceslip.com/` | Generate random advice slips | `免 Key` |
| Biriyani As A Service | `BiriyaniAsAServiceClient` | `https://biriyani.anoram.com/` | Biriyani images placeholder | `免 Key` |
| Dev.to | `DevToClient` | `https://developers.forem.com/api` | Access Forem articles, users and other resources via API | `apiKey` |
| Dictum | `DictumClient` | `https://github.com/fisenkodv/dictum` | API to get access to the collection of the most inspiring expressions of mankind | `免 Key` |
| FavQs.com | `FavqsComClient` | `https://favqs.com/api` | FavQs allows you to collect, discover and share your favorite quotes | `apiKey` |
| FOAAS | `FoaasClient` | `http://www.foaas.com/` | Fuck Off As A Service | `免 Key` |
| Forismatic | `ForismaticClient` | `http://forismatic.com/en/api/` | Inspirational Quotes | `免 Key` |
| icanhazdadjoke | `IcanhazdadjokeClient` | `https://icanhazdadjoke.com/api` | The largest selection of dad jokes on the internet | `免 Key` |
| Inspiration | `InspirationClient` | `https://inspiration.goprogram.ai/docs/` | Motivational and Inspirational quotes | `免 Key` |
| kanye.rest | `KanyeRestClient` | `https://kanye.rest` | REST API for random Kanye West quotes | `免 Key` |
| kimiquotes | `KimiquotesClient` | `https://kimiquotes.herokuapp.com/doc` | Team radio and interview quotes by Finnish F1 legend Kimi Räikkönen | `免 Key` |
| Medium | `MediumClient` | `https://github.com/Medium/medium-api-docs` | Community of readers and writers offering unique perspectives on ideas | `OAuth` |
| Programming Quotes | `ProgrammingQuotesClient` | `https://github.com/skolakoda/programming-quotes-api` | Programming Quotes API for open source projects | `免 Key` |
| Quotable Quotes | `QuotableQuotesClient` | `https://github.com/lukePeavey/quotable` | Quotable is a free, open source quotations API | `免 Key` |
| Quote Garden | `QuoteGardenClient` | `https://pprathameshmore.github.io/QuoteGarden/` | REST API for more than 5000 famous quotes | `免 Key` |
| quoteclear | `QuoteclearClient` | `https://quoteclear.web.app/` | Ever-growing list of James Clear quotes from the 3-2-1 Newsletter | `免 Key` |
| Quotes on Design | `QuotesOnDesignClient` | `https://quotesondesign.com/api/` | Inspirational Quotes | `免 Key` |
| Stoicism Quote | `StoicismQuoteClient` | `https://github.com/tlcheah2/stoic-quote-lambda-public-api` | Quotes about Stoicism | `免 Key` |
| They Said So Quotes | `TheySaidSoQuotesClient` | `https://theysaidso.com/api/` | Quotes Trusted by many fortune brands around the world | `免 Key` |
| Traitify | `TraitifyClient` | `https://app.traitify.com/developer` | Assess, collect and analyze Personality | `免 Key` |
| Udemy(instructor) | `UdemyInstructorClient` | `https://www.udemy.com/developers/instructor/` | API for instructors on Udemy | `apiKey` |
| Vadivelu HTTP Codes | `VadiveluHttpCodesClient` | `https://vadivelu.anoram.com/` | On demand HTTP Codes with images | `免 Key` |
| Zen Quotes | `ZenQuotesClient` | `https://zenquotes.io/` | Large collection of Zen quotes for inspiration | `免 Key` |


### Art & Design

本分类共包含 **20** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.artdesign.ArtDesignAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Améthyste | `AmThysteClient` | `https://api.amethyste.moe/` | Generate images for Discord users | `apiKey` |
| Art Institute of Chicago | `ArtInstituteOfChicagoClient` | `https://api.artic.edu/docs/` | Art | `免 Key` |
| Colormind | `ColormindClient` | `http://colormind.io/api-access/` | Color scheme generator | `免 Key` |
| ColourLovers | `ColourloversClient` | `http://www.colourlovers.com/api` | Get various patterns, palettes and images | `免 Key` |
| Cooper Hewitt | `CooperHewittClient` | `https://collection.cooperhewitt.org/api` | Smithsonian Design Museum | `apiKey` |
| Dribbble | `DribbbleClient` | `https://developer.dribbble.com` | Discover the world’s top designers & creatives | `OAuth` |
| EmojiHub | `EmojihubClient` | `https://github.com/cheatsnake/emojihub` | Get emojis by categories and groups | `免 Key` |
| Europeana | `EuropeanaClient` | `https://pro.europeana.eu/resources/apis/search` | European Museum and Galleries content | `apiKey` |
| Harvard Art Museums | `HarvardArtMuseumsClient` | `https://github.com/harvardartmuseums/api-docs` | Art | `apiKey` |
| Icon Horse | `IconHorseClient` | `https://icon.horse` | Favicons for any website, with fallbacks | `免 Key` |
| Iconfinder | `IconfinderClient` | `https://developer.iconfinder.com` | Icons | `apiKey` |
| Icons8 | `Icons8Client` | `https://img.icons8.com/` | Icons (find "search icon" hyperlink in page) | `免 Key` |
| Lordicon | `LordiconClient` | `https://lordicon.com/` | Icons with predone Animations | `免 Key` |
| Metropolitan Museum of Art | `MetropolitanMuseumOfArtClient` | `https://metmuseum.github.io/` | Met Museum of Art | `免 Key` |
| Noun Project | `NounProjectClient` | `http://api.thenounproject.com/index.html` | Icons | `OAuth` |
| PHP-Noise | `PhpNoiseClient` | `https://php-noise.com/` | Noise Background Image Generator | `免 Key` |
| Pixel Encounter | `PixelEncounterClient` | `https://pixelencounter.com/api` | SVG Icon Generator | `免 Key` |
| Rijksmuseum | `RijksmuseumClient` | `https://data.rijksmuseum.nl/object-metadata/api/` | RijksMuseum Data | `apiKey` |
| Word Cloud | `WordCloudClient` | `https://wordcloudapi.com/` | Easily create word clouds | `apiKey` |
| xColors | `XcolorsClient` | `https://x-colors.herokuapp.com/` | Generate & convert colors | `免 Key` |


### Cloud Storage & File Sharing

本分类共包含 **20** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.cloudstoragefilesharing.CloudStorageFileSharingAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| AnonFiles | `AnonfilesClient` | `https://anonfiles.com/docs/api` | Upload and share your files anonymously | `免 Key` |
| BayFiles | `BayfilesClient` | `https://bayfiles.com/docs/api` | Upload and share your files | `免 Key` |
| Box | `BoxClient` | `https://developer.box.com/` | File Sharing and Storage | `OAuth` |
| ddownload | `DdownloadClient` | `https://ddownload.com/api` | File Sharing and Storage | `apiKey` |
| Dropbox | `DropboxClient` | `https://www.dropbox.com/developers` | File Sharing and Storage | `OAuth` |
| File.io | `FileIoClient` | `https://www.file.io` | Super simple file sharing, convenient, anonymous and secure | `免 Key` |
| Filestack | `FilestackClient` | `https://www.filestack.com` | Filestack File Uploader & File Upload API | `apiKey` |
| FileUp | `FileupClient` | `https://github.com/RealSinaSnp/FileUp` | Temporary file hosting with upload API, expiration times, and view limits | `免 Key` |
| GoFile | `GofileClient` | `https://gofile.io/api` | Unlimited size file uploads for free | `apiKey` |
| Google Drive | `GoogleDriveClient` | `https://developers.google.com/drive/` | File Sharing and Storage | `OAuth` |
| Gyazo | `GyazoClient` | `https://gyazo.com/api/docs` | Save & Share screen captures instantly | `apiKey` |
| Imgbb | `ImgbbClient` | `https://api.imgbb.com/` | Simple and quick private image sharing | `apiKey` |
| OneDrive | `OnedriveClient` | `https://developer.microsoft.com/onedrive` | File Sharing and Storage | `OAuth` |
| Pantry | `PantryClient` | `https://getpantry.cloud/` | Free JSON storage for small projects | `免 Key` |
| Pastebin | `PastebinClient` | `https://pastebin.com/doc_api` | Plain Text Storage | `apiKey` |
| Pinata | `PinataClient` | `https://docs.pinata.cloud/` | IPFS Pinning Services API | `apiKey` |
| Quip | `QuipClient` | `https://quip.com/dev/automation/documentation` | File Sharing and Storage for groups | `apiKey` |
| Storj | `StorjClient` | `https://docs.storj.io/dcs/` | Decentralized Open-Source Cloud Storage | `apiKey` |
| The Null Pointer | `TheNullPointerClient` | `https://0x0.st` | No-bullshit file hosting and URL shortening service | `免 Key` |
| Web3 Storage | `Web3StorageClient` | `https://web3.storage/` | File Sharing and Storage for Free with 1TB Space | `apiKey` |


### News

本分类共包含 **20** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.news.NewsAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Mediastack | `MediastackClient` | `https://mediastack.com?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | Free, Simple REST API for Live News & Blog Articles | `apiKey` |
| Associated Press | `AssociatedPressClient` | `https://developer.ap.org/` | Search for news and metadata from Associated Press | `apiKey` |
| Chronicling America | `ChroniclingAmericaClient` | `http://chroniclingamerica.loc.gov/about/api/` | Provides access to millions of pages of historic US newspapers from the Library of Congress | `免 Key` |
| Currents | `CurrentsClient` | `https://currentsapi.services/` | Real-time and historical global news with multilingual support | `apiKey` |
| Feedbin | `FeedbinClient` | `https://github.com/feedbin/feedbin-api` | RSS reader | `OAuth` |
| Florida Man | `FloridaManClient` | `https://github.com/juliayxhuang/florida-man-api#readme` | Static JSON dataset of 10,000+ Florida Man headlines by date | `免 Key` |
| GNews | `GnewsClient` | `https://gnews.io/` | Search for news from various sources | `apiKey` |
| Graphs for Coronavirus | `GraphsForCoronavirusClient` | `https://corona.dnsforfamily.com/api.txt` | Each Country separately and Worldwide Graphs for Coronavirus. Daily updates | `免 Key` |
| Inshorts News | `InshortsNewsClient` | `https://github.com/cyberboysumanjay/Inshorts-News-API` | Provides news from inshorts | `免 Key` |
| MarketAux | `MarketauxClient` | `https://www.marketaux.com/` | Live stock market news with tagged tickers + sentiment and stats JSON API | `apiKey` |
| New York Times | `NewYorkTimesClient` | `https://developer.nytimes.com/` | The New York Times Developer Network | `apiKey` |
| News | `NewsClient` | `https://newsapi.org/` | Headlines currently published on a range of news sources and blogs | `apiKey` |
| NewsData | `NewsdataClient` | `https://newsdata.io/docs` | News data API for live-breaking news and headlines from reputed  news sources | `apiKey` |
| NewsX | `NewsxClient` | `https://rapidapi.com/machaao-inc-machaao-inc-default/api/newsx/` | Get or Search Latest Breaking News with ML Powered Summaries 🤖 | `apiKey` |
| NPR One | `NprOneClient` | `http://dev.npr.org/api/` | Personalized news listening experience from NPR | `OAuth` |
| Spaceflight News | `SpaceflightNewsClient` | `https://spaceflightnewsapi.net` | Spaceflight related news 🚀 | `免 Key` |
| The Guardian | `TheGuardianClient` | `http://open-platform.theguardian.com/` | Access all the content the Guardian creates, categorised by tags and section | `apiKey` |
| The Old Reader | `TheOldReaderClient` | `https://github.com/theoldreader/api` | RSS reader | `apiKey` |
| TheNews | `ThenewsClient` | `https://www.thenewsapi.com/` | Aggregated headlines, top story and live news JSON API | `apiKey` |
| Trove | `TroveClient` | `https://trove.nla.gov.au/about/create-something/using-api` | Search through the National Library of Australia collection of 1000s of digitised newspapers | `apiKey` |


### URL Shorteners

本分类共包含 **20** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.urlshorteners.UrlShortenersAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| 1pt | `Api1PtClient` | `https://github.com/1pt-co/api/blob/main/README.md` | A simple URL shortener | `免 Key` |
| Bitly | `BitlyClient` | `http://dev.bitly.com/get_started.html` | URL shortener and link management | `OAuth` |
| CleanURI | `CleanuriClient` | `https://cleanuri.com/docs` | URL shortener service | `免 Key` |
| ClickMeter | `ClickmeterClient` | `https://support.clickmeter.com/hc/en-us/categories/201474986` | Monitor, compare and optimize your marketing links | `apiKey` |
| Clico | `ClicoClient` | `https://cli.com/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config` | URL shortener service | `apiKey` |
| Cutt.ly | `CuttLyClient` | `https://cutt.ly/api-documentation/cuttly-links-api` | URL shortener service | `apiKey` |
| Drivet URL Shortener | `DrivetUrlShortenerClient` | `https://wiki.drivet.xyz/en/url-shortener/add-links` | Shorten a long URL easily and fast | `免 Key` |
| Free Url Shortener | `FreeUrlShortenerClient` | `https://ulvis.net/developer.html` | Free URL Shortener offers a powerful API to interact with other sites | `免 Key` |
| Git.io | `GitIoClient` | `https://github.blog/2011-11-10-git-io-github-url-shortener/` | Git.io URL shortener | `免 Key` |
| GoTiny | `GotinyClient` | `https://github.com/robvanbakel/gotiny-api` | A lightweight URL shortener, focused on ease-of-use for the developer and end-user | `免 Key` |
| Kutt | `KuttClient` | `https://docs.kutt.it/` | Free Modern URL Shortener | `apiKey` |
| Mgnet.me | `MgnetMeClient` | `http://mgnet.me/api.html` | Torrent URL shorten API | `免 Key` |
| owo | `OwoClient` | `https://owo.vc/api` | A simple link obfuscator/shortener | `免 Key` |
| Rebrandly | `RebrandlyClient` | `https://developers.rebrandly.com/v1/docs` | Custom URL shortener for sharing branded links | `apiKey` |
| RedirHub | `RedirhubClient` | `https://redirhub.com` | URL redirect management with custom domains, HTTPS, analytics, and REST API | `apiKey` |
| Short Link | `ShortLinkClient` | `https://github.com/FayasNoushad/Short-Link-API` | Short URLs support so many domains | `免 Key` |
| Shrtcode | `ShrtcodeClient` | `https://shrtco.de/docs` | URl Shortener with multiple Domains | `免 Key` |
| Shrtlnk | `ShrtlnkClient` | `https://shrtlnk.dev/developer` | Simple and efficient short link creation | `apiKey` |
| TinyURL | `TinyurlClient` | `https://tinyurl.com/app/dev` | Shorten long URLs | `apiKey` |
| UrlBae | `UrlbaeClient` | `https://urlbae.com/developers` | Simple and efficient short link creation | `apiKey` |


### Anime

本分类共包含 **19** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.anime.AnimeAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| AniAPI | `AniapiClient` | `https://aniapi.com/docs/` | Anime discovery, streaming & syncing with trackers | `OAuth` |
| AniDB | `AnidbClient` | `https://wiki.anidb.net/HTTP_API_Definition` | Anime Database | `apiKey` |
| AniList | `AnilistClient` | `https://github.com/AniList/ApiV2-GraphQL-Docs` | Anime discovery & tracking | `OAuth` |
| AnimeChan | `AnimechanClient` | `https://github.com/RocktimSaikia/anime-chan` | Anime quotes (over 10k+) | `免 Key` |
| AnimeFacts | `AnimefactsClient` | `https://chandan-02.github.io/anime-facts-rest-api/` | Anime Facts (over 100+) | `免 Key` |
| AnimeNewsNetwork | `AnimenewsnetworkClient` | `https://www.animenewsnetwork.com/encyclopedia/api.php` | Anime industry news | `免 Key` |
| Catboy | `CatboyClient` | `https://catboys.com/api` | Neko images, funny GIFs & more | `免 Key` |
| Danbooru Anime | `DanbooruAnimeClient` | `https://danbooru.donmai.us/wiki_pages/help:api` | Thousands of anime artist database to find good anime art | `apiKey` |
| Jikan | `JikanClient` | `https://jikan.moe` | Unofficial MyAnimeList API | `免 Key` |
| Kitsu | `KitsuClient` | `https://kitsu.docs.apiary.io/` | Anime discovery platform | `OAuth` |
| MangaDex | `MangadexClient` | `https://api.mangadex.org/docs.html` | Manga Database and Community | `apiKey` |
| Mangapi | `MangapiClient` | `https://rapidapi.com/pierre.carcellermeunier/api/mangapi3/` | Translate manga pages from one language to another | `apiKey` |
| MyAnimeList | `MyanimelistClient` | `https://myanimelist.net/clubs.php?cid=13727` | Anime and Manga Database and Community | `OAuth` |
| NekosBest | `NekosbestClient` | `https://docs.nekos.best` | Neko Images & Anime roleplaying GIFs | `免 Key` |
| Shikimori | `ShikimoriClient` | `https://shikimori.one/api/doc` | Anime discovery, tracking, forum, rates | `OAuth` |
| Studio Ghibli | `StudioGhibliClient` | `https://ghibliapi.herokuapp.com` | Resources from Studio Ghibli films | `免 Key` |
| Trace Moe | `TraceMoeClient` | `https://soruly.github.io/trace.moe-api/#/` | A useful tool to get the exact scene of an anime from a screenshot | `免 Key` |
| Waifu.im | `WaifuImClient` | `https://waifu.im/docs` | Get waifu pictures from an archive of over 4000 images and multiple tags | `免 Key` |
| Waifu.pics | `WaifuPicsClient` | `https://waifu.pics/docs` | Image sharing platform for anime images | `免 Key` |


### Email

本分类共包含 **19** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.email.EmailAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| mailboxlayer | `MailboxlayerClient` | `https://mailboxlayer.com?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | Email address validation | `apiKey` |
| Cloudmersive Validate | `CloudmersiveValidateClient` | `https://cloudmersive.com/validate-api` | Validate email addresses, phone numbers, VAT numbers and domain names | `apiKey` |
| Disify | `DisifyClient` | `https://www.disify.com/` | Validate and detect disposable and temporary email addresses | `免 Key` |
| DropMail | `DropmailClient` | `https://dropmail.me/api/#live-demo` | GraphQL API for creating and managing ephemeral e-mail inboxes | `免 Key` |
| EmailJS | `EmailjsClient` | `https://www.emailjs.com/docs/` | Send emails directly from client-side JavaScript without a backend server | `apiKey` |
| Email Validation | `EmailValidationClient` | `https://www.abstractapi.com/email-verification-validation-api` | Validate email addresses for deliverability and spam | `apiKey` |
| EVA | `EvaClient` | `https://eva.pingutil.com/` | Validate email addresses | `免 Key` |
| Guerrilla Mail | `GuerrillaMailClient` | `https://www.guerrillamail.com/GuerrillaMailAPI.html` | Disposable temporary Email addresses | `免 Key` |
| ImprovMX | `ImprovmxClient` | `https://improvmx.com/api` | API for free email forwarding service | `apiKey` |
| Kickbox | `KickboxClient` | `https://open.kickbox.com/` | Email verification API | `免 Key` |
| mail.gw | `MailGwClient` | `https://docs.mail.gw` | 10 Minute Mail | `免 Key` |
| mail.tm | `MailTmClient` | `https://docs.mail.tm` | Temporary Email Service | `免 Key` |
| MailboxValidator | `MailboxvalidatorClient` | `https://www.mailboxvalidator.com/api-email-free` | Validate email address to improve deliverability | `apiKey` |
| MailCheck.ai | `MailcheckAiClient` | `https://www.mailcheck.ai/#documentation` | Prevent users to sign up with temporary email addresses | `免 Key` |
| Mailtrap | `MailtrapClient` | `https://mailtrap.docs.apiary.io/#` | A service for the safe testing of emails sent from the development and staging environments | `apiKey` |
| PostStack | `PoststackClient` | `https://poststack.dev/docs` | EU-hosted email API for transactional and marketing email, with contacts, broadcasts, and analytics | `apiKey` |
| Sendgrid | `SendgridClient` | `https://docs.sendgrid.com/api-reference/` | A cloud-based SMTP provider that allows you to send emails without having to maintain email servers | `apiKey` |
| Sendinblue | `SendinblueClient` | `https://developers.sendinblue.com/docs` | A service that provides solutions relating to marketing and/or transactional email and/or SMS | `apiKey` |
| Verifier | `VerifierClient` | `https://verifier.meetchopra.com/docs#/` | Verifies that a given email is real | `apiKey` |


### Jobs

本分类共包含 **19** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.jobs.JobsAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| AI Dev Jobs | `AiDevJobsClient` | `https://aidevboard.com/openapi.yaml` | AI/ML engineering job aggregator with REST, RSS, and MCP endpoints | `免 Key` |
| Adzuna | `AdzunaClient` | `https://developer.adzuna.com/overview` | Job board aggregator | `apiKey` |
| Arbeitnow | `ArbeitnowClient` | `https://documenter.getpostman.com/view/18545278/UVJbJdKh` | API for Job board aggregator in Europe / Remote | `免 Key` |
| Arbeitsamt | `ArbeitsamtClient` | `https://jobsuche.api.bund.dev/` | API for the "Arbeitsamt", which is a german Job board aggregator | `OAuth` |
| Careerjet | `CareerjetClient` | `https://www.careerjet.com/partners/api/` | Job search engine | `apiKey` |
| DevITjobs UK | `DevitjobsUkClient` | `https://devitjobs.uk/job_feed.xml` | Jobs with GraphQL | `免 Key` |
| Findwork | `FindworkClient` | `https://findwork.dev/developers/` | Job board | `apiKey` |
| GraphQL Jobs | `GraphqlJobsClient` | `https://graphql.jobs/docs/api/` | Jobs with GraphQL | `免 Key` |
| HeroHunt People Search | `HerohuntPeopleSearchClient` | `https://www.herohunt.ai/people-search-api` | Search 1 billion people profiles across LinkedIn and GitHub for talent sourcing | `apiKey` |
| Jobs2Careers | `Jobs2CareersClient` | `http://api.jobs2careers.com/api/spec.pdf` | Job aggregator | `apiKey` |
| Jooble | `JoobleClient` | `https://jooble.org/api/about` | Job search engine | `apiKey` |
| Juju | `JujuClient` | `http://www.juju.com/publisher/spec/` | Job search engine | `apiKey` |
| Open Skills | `OpenSkillsClient` | `https://github.com/workforce-data-initiative/skills-api/wiki/API-Overview` | Job titles, skills and related jobs data | `免 Key` |
| Reed | `ReedClient` | `https://www.reed.co.uk/developers` | Job board aggregator | `apiKey` |
| The Muse | `TheMuseClient` | `https://www.themuse.com/developers/api/v2` | Job board and company profiles | `apiKey` |
| Upwork | `UpworkClient` | `https://developers.upwork.com/` | Freelance job board and management system | `OAuth` |
| USAJOBS | `UsajobsClient` | `https://developer.usajobs.gov/` | US government job board | `apiKey` |
| WhatJobs | `WhatjobsClient` | `https://www.whatjobs.com/affiliates` | Job search engine | `apiKey` |
| ZipRecruiter | `ZiprecruiterClient` | `https://www.ziprecruiter.com/publishers` | Job search app and website | `apiKey` |


### Currency Exchange

本分类共包含 **18** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.currencyexchange.CurrencyExchangeAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Currencylayer | `CurrencylayerClient` | `https://currencylayer.com?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | Exchange rates and currency conversion | `apiKey` |
| Exchangerate.host | `ExchangerateHostClient` | `https://exchangerate.host?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | Free foreign exchange & crypto rates API | `免 Key` |
| Exchangeratesapi.io | `ExchangeratesapiIoClient` | `https://exchangeratesapi.io?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | Exchange rates with currency conversion | `apiKey` |
| Fixer | `FixerClient` | `https://fixer.io?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | Exchange rates and currency conversion | `apiKey` |
| 1Forge | `Api1ForgeClient` | `https://1forge.com/forex-data-api/api-documentation` | Forex currency market data | `apiKey` |
| Amdoren | `AmdorenClient` | `https://www.amdoren.com/currency-api/` | Free currency API with over 150 currencies | `apiKey` |
| Bank of Russia | `BankOfRussiaClient` | `https://www.cbr.ru/development/SXML/` | Exchange rates and currency conversion | `免 Key` |
| Currency-api | `CurrencyApiClient` | `https://github.com/fawazahmed0/currency-api#readme` | Free Currency Exchange Rates API with 150+ Currencies & No Rate Limits | `免 Key` |
| CurrencyFreaks | `CurrencyfreaksClient` | `https://currencyfreaks.com/` | Provides current and historical currency exchange rates with free plan 1K requests/month | `apiKey` |
| CurrencyScoop | `CurrencyscoopClient` | `https://currencyscoop.com/api-documentation` | Real-time and historical currency rates JSON API | `apiKey` |
| Czech National Bank | `CzechNationalBankClient` | `https://www.cnb.cz/cs/financni_trhy/devizovy_trh/kurzy_devizoveho_trhu/denni_kurz.xml` | A collection of exchange rates | `免 Key` |
| Economia.Awesome | `EconomiaAwesomeClient` | `https://docs.awesomeapi.com.br/api-de-moedas` | Portuguese free currency prices and conversion with no rate limits | `免 Key` |
| ExchangeRate-API | `ExchangerateApiClient` | `https://www.exchangerate-api.com` | Free currency conversion | `apiKey` |
| Frankfurter | `FrankfurterClient` | `https://www.frankfurter.app/docs` | Exchange rates, currency conversion and time series | `免 Key` |
| FreeForexAPI | `FreeforexapiClient` | `https://freeforexapi.com/Home/Api` | Real-time foreign exchange rates for major currency pairs | `免 Key` |
| National Bank of Poland | `NationalBankOfPolandClient` | `http://api.nbp.pl/en.html` | A collection of currency exchange rates (data in XML and JSON) | `免 Key` |
| paralelo.bo | `ParaleloBoClient` | `https://paralelo.bo/api` | Bolivia parallel-market USD/BOB exchange rate, aggregated from P2P sources every 60s | `免 Key` |
| VATComply.com | `VatcomplyComClient` | `https://www.vatcomply.com/documentation` | Exchange rates, geolocation and VAT number validation | `免 Key` |


### Environment

本分类共包含 **17** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.environment.EnvironmentAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| BreezoMeter Pollen | `BreezometerPollenClient` | `https://docs.breezometer.com/api-documentation/pollen-api/v2/` | Daily Forecast pollen conditions data for a specific location | `apiKey` |
| Carbon Interface | `CarbonInterfaceClient` | `https://docs.carboninterface.com/` | API to calculate carbon (C02) emissions estimates for common C02 emitting activities | `apiKey` |
| Climatiq | `ClimatiqClient` | `https://docs.climatiq.io` | Calculate the environmental footprint created by a broad range of emission-generating activities | `apiKey` |
| Cloverly | `CloverlyClient` | `https://www.cloverly.com/carbon-offset-documentation` | API calculates the impact of common carbon-intensive activities in real time | `apiKey` |
| CO2 Offset | `Co2OffsetClient` | `https://co2offset.io/api.html` | API calculates and validates the carbon footprint | `免 Key` |
| Danish data service Energi | `DanishDataServiceEnergiClient` | `https://www.energidataservice.dk/` | Open energy data from Energinet to society | `免 Key` |
| GrünstromIndex | `GrNstromindexClient` | `https://gruenstromindex.de/` | Green Power Index for Germany (Grünstromindex/GSI) | `免 Key` |
| IQAir | `IqairClient` | `https://www.iqair.com/air-pollution-data-api` | Air quality and weather data | `apiKey` |
| Luchtmeetnet | `LuchtmeetnetClient` | `https://api-docs.luchtmeetnet.nl/` | Predicted and actual air quality components for The Netherlands (RIVM) | `免 Key` |
| National Grid ESO | `NationalGridEsoClient` | `https://data.nationalgrideso.com/` | Open data from Great Britain’s Electricity System Operator | `免 Key` |
| OpenAQ | `OpenaqClient` | `https://docs.openaq.org/` | Open air quality data | `apiKey` |
| PM2.5 Open Data Portal | `Pm25OpenDataPortalClient` | `https://pm25.lass-net.org/#apis` | Open low-cost PM2.5 sensor data | `免 Key` |
| PM25.in | `Pm25InClient` | `http://www.pm25.in/api_doc` | Air quality of China | `apiKey` |
| PVWatts | `PvwattsClient` | `https://developer.nrel.gov/docs/solar/pvwatts/v6/` | Energy production photovoltaic (PV) energy systems | `apiKey` |
| Srp Energy | `SrpEnergyClient` | `https://srpenergy-api-client-python.readthedocs.io/en/latest/api.html` | Hourly usage energy report for Srp customers | `apiKey` |
| UK Carbon Intensity | `UkCarbonIntensityClient` | `https://carbon-intensity.github.io/api-definitions/#carbon-intensity-api-v1-0-0` | The Official Carbon Intensity API for Great Britain developed by National Grid | `免 Key` |
| Website Carbon | `WebsiteCarbonClient` | `https://api.websitecarbon.com/` | API to estimate the carbon footprint of loading web pages | `免 Key` |


### Text Analysis

本分类共包含 **17** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.textanalysis.TextAnalysisAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Code Detection | `CodeDetectionClient` | `https://codedetectionapi.runtime.dev` | Detect, label, format and enrich the code in your app or in your data pipeline | `OAuth` |
| apilayer languagelayer | `ApilayerLanguagelayerClient` | `https://languagelayer.com/` | Language Detection JSON API supporting 173 languages | `OAuth` |
| Aylien Text Analysis | `AylienTextAnalysisClient` | `https://docs.aylien.com/textapi/#getting-started` | A collection of information retrieval and natural language APIs | `apiKey` |
| Audexum | `AudexumClient` | `https://audexum.com/docs` | Text-to-speech REST API with 43 voices and 33 languages | `apiKey` |
| Cloudmersive Natural Language Processing | `CloudmersiveNaturalLanguageProcessingClient` | `https://www.cloudmersive.com/nlp-api` | Natural language processing and text analysis | `apiKey` |
| Detect Language | `DetectLanguageClient` | `https://detectlanguage.com/` | Detects text language | `apiKey` |
| ELI | `EliClient` | `https://nlp.insightera.co.th/docs/v1.0` | Natural Language Processing Tools for Thai Language | `apiKey` |
| Google Cloud Natural | `GoogleCloudNaturalClient` | `https://cloud.google.com/natural-language/docs/` | Natural language understanding technology, including sentiment, entity and syntax analysis | `apiKey` |
| GeoScore | `GeoscoreClient` | `https://geoscoreapi.com` | Score content for AI search citation readiness with a 0-100 GEO score and 8 structural metrics | `apiKey` |
| Hirak OCR | `HirakOcrClient` | `https://ocr.hirak.site/` | Image to text -text recognition- from image more than 100 language, accurate, unlimited requests | `apiKey` |
| Hirak Translation | `HirakTranslationClient` | `https://translate.hirak.site/` | Translate between 21 of most used languages, accurate, unlimited requests | `apiKey` |
| Lecto Translation | `LectoTranslationClient` | `https://rapidapi.com/lecto-lecto-default/api/lecto-translation/` | Translation API with free tier and reasonable prices | `apiKey` |
| LibreTranslate | `LibretranslateClient` | `https://libretranslate.com/docs` | Translation tool with 17 available languages | `免 Key` |
| Semantria | `SemantriaClient` | `https://semantria.readme.io/docs` | Text Analytics with sentiment analysis, categorization & named entity extraction | `OAuth` |
| Sentiment Analysis | `SentimentAnalysisClient` | `https://www.meaningcloud.com/developer/sentiment-analysis` | Multilingual sentiment analysis of texts from different sources | `apiKey` |
| Tisane | `TisaneClient` | `https://tisane.ai/` | Text Analytics with focus on detection of abusive content and law enforcement applications | `OAuth` |
| Watson Natural Language Understanding | `WatsonNaturalLanguageUnderstandingClient` | `https://cloud.ibm.com/apidocs/natural-language-understanding/natural-language-understanding` | Natural language processing for advanced text analysis | `OAuth` |


### Calendar

本分类共包含 **16** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.calendar.CalendarAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Calendarific | `CalendarificClient` | `https://calendarific.com/` | Worldwide Holidays | `apiKey` |
| Checkiday - National Holiday | `CheckidayNationalHolidayClient` | `https://apilayer.com/marketplace/checkiday-api` | Industry-leading holiday data with over 5,000 holidays and thousands of descriptions | `apiKey` |
| Church Calendar | `ChurchCalendarClient` | `http://calapi.inadiutorium.cz/` | Catholic liturgical calendar | `免 Key` |
| Czech Namedays Calendar | `CzechNamedaysCalendarClient` | `https://svatky.adresa.info` | Lookup for a name and returns nameday date | `免 Key` |
| Festivo Public Holidays | `FestivoPublicHolidaysClient` | `https://docs.getfestivo.com/docs/products/public-holidays-api/intro` | Fastest and most advanced public holiday and observance service on the market | `apiKey` |
| Google Calendar | `GoogleCalendarClient` | `https://developers.google.com/google-apps/calendar/` | Display, create and modify Google calendar events | `OAuth` |
| Hebrew Calendar | `HebrewCalendarClient` | `https://www.hebcal.com/home/developer-apis` | Convert between Gregorian and Hebrew, fetch Shabbat and Holiday times, etc | `免 Key` |
| Holidays | `HolidaysClient` | `https://holidayapi.com/` | Historical data regarding holidays | `apiKey` |
| LectServe | `LectserveClient` | `http://www.lectserve.com` | Protestant liturgical calendar | `免 Key` |
| Nager.Date | `NagerDateClient` | `https://date.nager.at` | Public holidays for more than 90 countries | `免 Key` |
| Namedays Calendar | `NamedaysCalendarClient` | `https://nameday.abalin.net` | Provides namedays for multiple countries | `免 Key` |
| Non-Working Days | `NonWorkingDaysClient` | `https://github.com/gadael/icsdb` | Database of ICS files for non working days | `免 Key` |
| Non-Working Days | `NonWorkingDaysClient` | `https://isdayoff.ru` | Simple REST API for checking working, non-working or short days for Russia, CIS, USA and other | `免 Key` |
| Public Holidays | `PublicHolidaysClient` | `https://www.abstractapi.com/holidays-api` | Data on national, regional, and religious holidays via API | `apiKey` |
| Russian Calendar | `RussianCalendarClient` | `https://github.com/egno/work-calendar` | Check if a date is a Russian holiday or not | `免 Key` |
| UK Bank Holidays | `UkBankHolidaysClient` | `https://www.gov.uk/bank-holidays.json` | Bank holidays in England and Wales, Scotland and Northern Ireland | `免 Key` |


### Anti-Malware

本分类共包含 **15** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.antimalware.AntiMalwareAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| AbuseIPDB | `AbuseipdbClient` | `https://docs.abuseipdb.com/` | IP/domain/URL reputation | `apiKey` |
| AlienVault Open Threat Exchange (OTX) | `AlienvaultOpenThreatExchangeOtxClient` | `https://otx.alienvault.com/api` | IP/domain/URL reputation | `apiKey` |
| CAPEsandbox | `CapesandboxClient` | `https://capev2.readthedocs.io/en/latest/usage/api.html` | Malware execution and analysis | `apiKey` |
| Google Safe Browsing | `GoogleSafeBrowsingClient` | `https://developers.google.com/safe-browsing/` | Google Link/Domain Flagging | `apiKey` |
| MalDatabase | `MaldatabaseClient` | `https://maldatabase.com/api-doc.html` | Provide malware datasets and threat intelligence feeds | `apiKey` |
| MalShare | `MalshareClient` | `https://malshare.com/doc.php` | Malware Archive / file sourcing | `apiKey` |
| MalwareBazaar | `MalwarebazaarClient` | `https://bazaar.abuse.ch/api/` | Collect and share malware samples | `apiKey` |
| Metacert | `MetacertClient` | `https://metacert.com/` | Metacert Link Flagging | `apiKey` |
| NoPhishy | `NophishyClient` | `https://rapidapi.com/Amiichu/api/exerra-phishing-check/` | Check links to see if they're known phishing attempts | `apiKey` |
| Phisherman | `PhishermanClient` | `https://phisherman.gg/` | IP/domain/URL reputation | `apiKey` |
| Scanii | `ScaniiClient` | `https://docs.scanii.com/` | Simple REST API that can scan submitted documents/files for the presence of threats | `apiKey` |
| URLhaus | `UrlhausClient` | `https://urlhaus-api.abuse.ch/` | Bulk queries and Download Malware Samples | `免 Key` |
| URLScan.io | `UrlscanIoClient` | `https://urlscan.io/about-api/` | Scan and Analyse URLs | `apiKey` |
| VirusTotal | `VirustotalClient` | `https://docs.virustotal.com/reference/overview` | VirusTotal File/URL Analysis | `apiKey` |
| Web of Trust | `WebOfTrustClient` | `https://support.mywot.com/hc/en-us/sections/360004477734-API-` | IP/domain/URL reputation | `apiKey` |


### Entertainment

本分类共包含 **14** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.entertainment.EntertainmentAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Anycrap | `AnycrapClient` | `https://anycrap.shop/developers` | 35,000+ absurdist AI-generated product concepts with names, descriptions, and images | `apiKey` |
| chucknorris.io | `ChucknorrisIoClient` | `https://api.chucknorris.io` | JSON API for hand curated Chuck Norris jokes | `免 Key` |
| Corporate Buzz Words | `CorporateBuzzWordsClient` | `https://github.com/sameerkumar18/corporate-bs-generator-api` | REST API for Corporate Buzz Words | `免 Key` |
| Excuser | `ExcuserClient` | `https://excuser.herokuapp.com/` | Get random excuses for various situations | `免 Key` |
| Fun Fact | `FunFactClient` | `https://api.aakhilv.me` | A simple HTTPS api that can randomly select and return a fact from the FFA database | `免 Key` |
| Imgflip | `ImgflipClient` | `https://imgflip.com/api` | Gets an array of popular memes | `免 Key` |
| justmeme.wtf | `JustmemeWtfClient` | `https://justmeme.wtf/api-docs` | Free meme API with 2400+ templates, search, trending, and AI generation | `免 Key` |
| Meme Maker | `MemeMakerClient` | `https://mememaker.github.io/API/` | REST API for create your own meme | `免 Key` |
| Memesio | `MemesioClient` | `https://memesio.com/developers/api` | Meme creation API with templates, editable captions and hosted share links | `免 Key` |
| NaMoMemes | `NamomemesClient` | `https://github.com/theIYD/NaMoMemes` | Memes on Narendra Modi | `免 Key` |
| Random Useless Facts | `RandomUselessFactsClient` | `https://uselessfacts.jsph.pl/` | Get useless, but true facts | `免 Key` |
| TasteDive | `TastediveClient` | `https://tastedive.com/read/api` | Content-based recommendations for movies, music, TV shows, books, games, and podcasts | `apiKey` |
| Techy | `TechyClient` | `https://techy-api.vercel.app/` | JSON and Plaintext API for tech-savvy sounding phrases | `免 Key` |
| Yo Momma Jokes | `YoMommaJokesClient` | `https://github.com/beanboi7/yomomma-apiv2` | REST API for Yo Momma Jokes | `免 Key` |


### Shopping

本分类共包含 **14** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.shopping.ShoppingAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Best Buy | `BestBuyClient` | `https://bestbuyapis.github.io/api-documentation/#overview` | Products, Buying Options, Categories, Recommendations, Stores and Commerce | `apiKey` |
| Digi-Key | `DigiKeyClient` | `https://www.digikey.com/en/resources/api-solutions` | Retrieve price and inventory of electronic components as well as place orders | `OAuth` |
| Dummy Products | `DummyProductsClient` | `https://dummyproducts-api.herokuapp.com/` | An api to fetch dummy e-commerce products JSON data with placeholder images | `apiKey` |
| eBay | `EbayClient` | `https://developer.ebay.com/` | Sell and Buy on eBay | `OAuth` |
| Etsy | `EtsyClient` | `https://www.etsy.com/developers/documentation/getting_started/api_basics` | Manage shop and interact with listings | `OAuth` |
| Flipkart Marketplace | `FlipkartMarketplaceClient` | `https://seller.flipkart.com/api-docs/FMSAPI.html` | Product listing management, Order Fulfilment in the Flipkart Marketplace | `OAuth` |
| Lazada | `LazadaClient` | `https://open.lazada.com/doc/doc.htm` | Retrieve product ratings and seller performance metrics | `apiKey` |
| Mercadolibre | `MercadolibreClient` | `https://developers.mercadolibre.cl/es_ar/api-docs-es` | Manage sales, ads, products, services and Shops | `apiKey` |
| Octopart | `OctopartClient` | `https://octopart.com/api/v4/reference` | Electronic part data for manufacturing, design, and sourcing | `apiKey` |
| OLX Poland | `OlxPolandClient` | `https://developer.olx.pl/api/doc#section/` | Integrate with local sites by posting, managing adverts and communicating with OLX users | `apiKey` |
| Rappi | `RappiClient` | `https://dev-portal.rappi.com/` | Manage orders from Rappi's app | `OAuth` |
| Shopee | `ShopeeClient` | `https://open.shopee.com/documents?version=1` | Shopee's official API for integration of various services from Shopee | `apiKey` |
| Tokopedia | `TokopediaClient` | `https://developer.tokopedia.com/openapi/guide/#/` | Tokopedia's Official API for integration of various services from Tokopedia | `OAuth` |
| WooCommerce | `WoocommerceClient` | `https://woocommerce.github.io/woocommerce-rest-api-docs/` | WooCommerce REST APIS to create, read, update, and delete data on wordpress website in JSON format | `apiKey` |


### Dictionaries

本分类共包含 **13** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.dictionaries.DictionariesAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Chinese Character Web | `ChineseCharacterWebClient` | `http://ccdb.hemiola.com/` | Chinese character definitions and pronunciations | `免 Key` |
| Chinese Text Project | `ChineseTextProjectClient` | `https://ctext.org/tools/api` | Online open-access digital library for pre-modern Chinese texts | `免 Key` |
| Collins | `CollinsClient` | `https://api.collinsdictionary.com/api/v1/documentation/html/` | Bilingual Dictionary and Thesaurus Data | `apiKey` |
| Free Dictionary | `FreeDictionaryClient` | `https://dictionaryapi.dev/` | Definitions, phonetics, pronounciations, parts of speech, examples, synonyms | `免 Key` |
| Indonesia Dictionary | `IndonesiaDictionaryClient` | `https://new-kbbi-api.herokuapp.com/` | Indonesia dictionary many words | `免 Key` |
| Lingua Robot | `LinguaRobotClient` | `https://www.linguarobot.io` | Word definitions, pronunciations, synonyms, antonyms and others | `apiKey` |
| Merriam-Webster | `MerriamWebsterClient` | `https://dictionaryapi.com/` | Dictionary and Thesaurus Data | `apiKey` |
| OwlBot | `OwlbotClient` | `https://owlbot.info/` | Definitions with example sentence and photo if available | `apiKey` |
| Oxford | `OxfordClient` | `https://developer.oxforddictionaries.com/` | Dictionary Data | `apiKey` |
| Synonyms | `SynonymsClient` | `https://www.synonyms.com/synonyms_api.php` | Synonyms, thesaurus and antonyms information for any given word | `apiKey` |
| Wiktionary | `WiktionaryClient` | `https://en.wiktionary.org/w/api.php` | Collaborative dictionary data | `免 Key` |
| Wordnik | `WordnikClient` | `https://developer.wordnik.com` | Dictionary Data | `apiKey` |
| Words | `WordsClient` | `https://www.wordsapi.com/docs/` | Definitions and synonyms for more than 150,000 words | `apiKey` |


### Blockchain

本分类共包含 **11** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.blockchain.BlockchainAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Bitquery | `BitqueryClient` | `https://graphql.bitquery.io/ide` | Onchain GraphQL APIs & DEX APIs | `apiKey` |
| Chainlink | `ChainlinkClient` | `https://chain.link/developer-resources` | Build hybrid smart contracts with Chainlink | `免 Key` |
| Chainpoint | `ChainpointClient` | `https://tierion.com/chainpoint/` | Chainpoint is a global network for anchoring data to the Bitcoin blockchain | `免 Key` |
| Covalent | `CovalentClient` | `https://www.covalenthq.com/docs/api/` | Multi-blockchain data aggregator platform | `apiKey` |
| Etherscan | `EtherscanClient` | `https://etherscan.io/apis` | Ethereum explorer API | `apiKey` |
| Helium | `HeliumClient` | `https://docs.helium.com/api/blockchain/introduction/` | Helium is a global, distributed network of Hotspots that create public, long-range wireless coverage | `免 Key` |
| Nownodes | `NownodesClient` | `https://nownodes.io/` | Blockchain-as-a-service solution that provides high-quality connection via API | `apiKey` |
| Steem | `SteemClient` | `https://developers.steem.io/` | Blockchain-based blogging and social media website | `免 Key` |
| The Graph | `TheGraphClient` | `https://thegraph.com` | Indexing protocol for querying networks like Ethereum with GraphQL | `apiKey` |
| Walltime | `WalltimeClient` | `https://walltime.info/api.html` | To retrieve Walltime's market info | `免 Key` |
| Watchdata | `WatchdataClient` | `https://docs.watchdata.io` | Provide simple and reliable API access to Ethereum blockchain | `apiKey` |


### Tracking

本分类共包含 **10** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.tracking.TrackingAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Aftership | `AftershipClient` | `https://developers.aftership.com/reference/quick-start` | API to update, manage and track shipment efficiently | `apiKey` |
| Correios | `CorreiosClient` | `https://cws.correios.com.br/ajuda` | Integration to provide information and prepare shipments using Correio's services | `apiKey` |
| Pixela | `PixelaClient` | `https://pixe.la` | API for recording and tracking habits or effort, routines | `X-Mashape-Key` |
| PostalPinCode | `PostalpincodeClient` | `http://www.postalpincode.in/Api-Details` | API for getting Pincode details in India | `免 Key` |
| Postmon | `PostmonClient` | `http://postmon.com.br` | An API to query Brazilian ZIP codes and orders easily, quickly and free | `免 Key` |
| PostNord | `PostnordClient` | `https://developer.postnord.com/api` | Provides information about parcels in transport for Sweden and Denmark | `apiKey` |
| UPS | `UpsClient` | `https://www.ups.com/upsdeveloperkit` | Shipment and Address information | `apiKey` |
| WeCanTrack | `WecantrackClient` | `https://docs.wecantrack.com` | Automatically place subids in affiliate links to attribute affiliate conversions to click data | `apiKey` |
| WhatPulse | `WhatpulseClient` | `https://developer.whatpulse.org/#web-api` | Small application that measures your keyboard/mouse usage | `免 Key` |
| WhereParcel | `WhereparcelClient` | `https://whereparcel.com/docs` | Unified parcel tracking API across 60+ carriers worldwide (USPS, FedEx, UPS, DHL, etc.) | `apiKey` |


### Open Source Projects

本分类共包含 **9** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.opensourceprojects.OpenSourceProjectsAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Countly | `CountlyClient` | `https://api.count.ly/reference` | Countly web analytics | `免 Key` |
| Creative Commons Catalog | `CreativeCommonsCatalogClient` | `https://api.creativecommons.engineering/` | Search among openly licensed and public domain works | `OAuth` |
| Datamuse | `DatamuseClient` | `https://www.datamuse.com/api/` | Word-finding query engine | `免 Key` |
| Drupal.org | `DrupalOrgClient` | `https://www.drupal.org/drupalorg/docs/api` | Drupal.org | `免 Key` |
| Evil Insult Generator | `EvilInsultGeneratorClient` | `https://evilinsult.com/api` | Evil Insults | `免 Key` |
| GitHub Contribution Chart Generator | `GithubContributionChartGeneratorClient` | `https://github-contributions.vercel.app` | Create an image of your GitHub contributions | `免 Key` |
| GitHub ReadMe Stats | `GithubReadmeStatsClient` | `https://github.com/anuraghazra/github-readme-stats` | Add dynamically generated statistics to your GitHub profile ReadMe | `免 Key` |
| Metabase | `MetabaseClient` | `https://www.metabase.com/` | An open source Business Intelligence server to share data and analytics inside your company | `免 Key` |
| Shields | `ShieldsClient` | `https://shields.io/` | Concise, consistent, and legible badges in SVG and raster format | `免 Key` |


### Authentication & Authorization

本分类共包含 **7** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.authenticationauthorization.AuthenticationAuthorizationAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Auth0 | `Auth0Client` | `https://auth0.com` | Easy to implement, adaptable authentication and authorization platform | `apiKey` |
| GetOTP | `GetotpClient` | `https://otp.dev/en/docs/` | Implement OTP flow quickly | `apiKey` |
| Micro User Service | `MicroUserServiceClient` | `https://m3o.com/user` | User management and authentication | `apiKey` |
| MojoAuth | `MojoauthClient` | `https://mojoauth.com` | Secure and modern passwordless authentication platform | `apiKey` |
| SAWO Labs | `SawoLabsClient` | `https://sawolabs.com` | Simplify login and improve user experience by integrating passwordless authentication in your app | `apiKey` |
| Stytch | `StytchClient` | `https://stytch.com/` | User infrastructure for modern applications | `apiKey` |
| Warrant | `WarrantClient` | `https://warrant.dev/` | APIs for authorization and access control | `apiKey` |


### Data Validation

本分类共包含 **7** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.datavalidation.DataValidationAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| VATlayer | `VatlayerClient` | `https://vatlayer.com/?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | VAT number validation | `apiKey` |
| Lob.com | `LobComClient` | `https://lob.com/` | US Address Verification | `apiKey` |
| Postman Echo | `PostmanEchoClient` | `https://www.postman-echo.com` | Test api server to receive and return value from HTTP method | `免 Key` |
| PurgoMalum | `PurgomalumClient` | `http://www.purgomalum.com` | Content validator against profanity & obscenity | `免 Key` |
| US Autocomplete | `UsAutocompleteClient` | `https://www.smarty.com/docs/cloud/us-autocomplete-pro-api` | Enter address data quickly with real-time address suggestions | `apiKey` |
| US Extract | `UsExtractClient` | `https://www.smarty.com/products/apis/us-extract-api` | Extract postal addresses from any text including emails | `apiKey` |
| US Street Address | `UsStreetAddressClient` | `https://www.smarty.com/docs/cloud/us-street-api` | Validate and append data for any US postal address | `apiKey` |


### Vehicle

本分类共包含 **7** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.vehicle.VehicleAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Brazilian Vehicles and Prices | `BrazilianVehiclesAndPricesClient` | `https://deividfortuna.github.io/fipe/` | Vehicles information from Fundação Instituto de Pesquisas Econômicas - Fipe | `免 Key` |
| Helipaddy sites | `HelipaddySitesClient` | `https://helipaddy.com/api/` | Helicopter and passenger drone landing site directory, Helipaddy data and much more | `apiKey` |
| Kelley Blue Book | `KelleyBlueBookClient` | `http://developer.kbb.com/#!/data/1-Default` | Vehicle info, pricing, configuration, plus much more | `apiKey` |
| Mercedes-Benz | `MercedesBenzClient` | `https://developer.mercedes-benz.com/apis` | Telematics data, remotely access vehicle functions, car configurator, locate service dealers | `apiKey` |
| NHTSA | `NhtsaClient` | `https://vpic.nhtsa.dot.gov/api/` | NHTSA Product Information Catalog and Vehicle Listing | `免 Key` |
| RevCarData | `RevcardataClient` | `https://revcardata.com` | 86,000+ global vehicle specifications and EV metrics | `apiKey` |
| Smartcar | `SmartcarClient` | `https://smartcar.com/docs/` | Lock and unlock vehicles and get data like odometer reading and location. Works on most new cars | `OAuth` |


### Continuous Integration

本分类共包含 **6** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.continuousintegration.ContinuousIntegrationAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Azure DevOps Health | `AzureDevopsHealthClient` | `https://docs.microsoft.com/en-us/rest/api/resourcehealth` | Resource health helps you diagnose and get support when an Azure issue impacts your resources | `apiKey` |
| Bitrise | `BitriseClient` | `https://api-docs.bitrise.io/` | Build tool and processes integrations to create efficient development pipelines | `apiKey` |
| Buddy | `BuddyClient` | `https://buddy.works/docs/api/getting-started/overview` | The fastest continuous integration and continuous delivery platform | `OAuth` |
| CircleCI | `CircleciClient` | `https://circleci.com/docs/api/v1-reference/` | Automate the software development process using continuous integration and continuous delivery | `apiKey` |
| Codeship | `CodeshipClient` | `https://docs.cloudbees.com/docs/cloudbees-codeship/latest/api-overview/` | Codeship is a Continuous Integration Platform in the cloud | `apiKey` |
| Travis CI | `TravisCiClient` | `https://docs.travis-ci.com/api/` | Sync your GitHub projects with Travis CI to test your code in minutes | `apiKey` |


### Phone

本分类共包含 **6** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.phone.PhoneAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Numlookup | `NumlookupClient` | `https://numlookupapi.com` | Phone number validation and carrier lookup API with global coverage | `apiKey` |
| Numverify | `NumverifyClient` | `https://numverify.com?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers` | Phone number validation | `apiKey` |
| Cloudmersive Validate | `CloudmersiveValidateClient` | `https://cloudmersive.com/phone-number-validation-API` | Validate international phone numbers | `apiKey` |
| Phone Specification | `PhoneSpecificationClient` | `https://github.com/azharimm/phone-specs-api` | Rest Api for Phone specifications | `免 Key` |
| Phone Validation | `PhoneValidationClient` | `https://www.abstractapi.com/phone-validation-api` | Validate phone numbers globally | `apiKey` |
| Veriphone | `VeriphoneClient` | `https://veriphone.io` | Phone number validation & carrier lookup | `apiKey` |


### Programming

本分类共包含 **5** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.programming.ProgrammingAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Codeforces | `CodeforcesClient` | `https://codeforces.com/apiHelp` | Get access to Codeforces data | `apiKey` |
| Hackerearth | `HackerearthClient` | `https://www.hackerearth.com/docs/wiki/developers/v4/` | For compiling and running code in several languages | `apiKey` |
| Judge0 CE | `Judge0CeClient` | `https://ce.judge0.com/` | Online code execution system | `apiKey` |
| KONTESTS | `KontestsClient` | `https://kontests.net/api` | For upcoming and ongoing competitive coding contests | `免 Key` |
| Mintlify | `MintlifyClient` | `https://docs.mintlify.com` | For programmatically generating documentation for code | `apiKey` |


### Patent

本分类共包含 **4** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.patent.PatentAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| EPO | `EpoClient` | `https://developers.epo.org/` | European patent search system api | `OAuth` |
| PatentsView | `PatentsviewClient` | `https://patentsview.org/apis/purpose` | API is intended to explore and visualize trends/patterns across the US innovation landscape | `免 Key` |
| TIPO | `TipoClient` | `https://tiponet.tipo.gov.tw/Gazette/OpenData/OD/OD05.aspx?QryDS=API00` | Taiwan patent search system api | `apiKey` |
| USPTO | `UsptoClient` | `https://www.uspto.gov/learning-and-resources/open-data-and-mobility` | USA patent api services | `免 Key` |


### Events

本分类共包含 **3** 个 API 客户端，自动配置类为 `com.bzz.miniapis.sdk.events.EventsAutoConfiguration`。

| API 名称 | 客户端类名 (Client Class) | 基础 URL (Base URL) | 功能描述 (Description) | 授权方式 |
| :--- | :--- | :--- | :--- | :---: |
| Eventbrite | `EventbriteClient` | `https://www.eventbrite.com/platform/api/` | Find events | `OAuth` |
| SeatGeek | `SeatgeekClient` | `https://platform.seatgeek.com/` | Search events, venues and performers | `apiKey` |
| Ticketmaster | `TicketmasterClient` | `http://developer.ticketmaster.com/products-and-docs/apis/getting-started/` | Search events, attractions, or venues | `apiKey` |

