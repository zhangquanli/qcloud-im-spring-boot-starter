# qcloud-im-spring-boot-starter
基于 `Spring Boot` 框架，快速集成【腾讯云】【即时通信】服务

## 快速集成
1. 在 `pom.xml` 文件中，引入依赖
    ```xml
    <dependency>
        <groupId>com.github.zhangquanli</groupId>
        <artifactId>qcloud-im-spring-boot-starter</artifactId>
        <version>1.0.0</version>
    </dependency>
    ```
2. 在 `application.properties` 或 `application.yml` 文件中，进行配置
    ```properties
    qcloud.im.sdk-app-id=sdkAppId
    qcloud.im.private-key-path=privateKeyPath
    qcloud.im.admin-identifier=adminIdentifier
    qcloud.im.tls-sig=ecdsa_sha256
    qcloud.im.expire=15552000
    ```
    ```yaml
    qcloud:
      im:
        sdk-app-id: sdkAppId
        private-key-path: privateKeyPath
        admin-identifier: adminIdentifier
        tls-sig: ecdsa_sha256
        expire: 15552000
    ```

## 快速开发
1. 在 `Spring Boot` 项目中，可以直接注入 `QcloudIm` 接口
    ```java
    @Resource
    private QcloudIm qcloudIm;
    ```
2. 使用 `QcloudIm` 接口中封装好的方法

## 更新日志
### 1.0.0
1. 生成 `UserSig` 接口
2. 账号管理接口
3. 单聊消息接口
