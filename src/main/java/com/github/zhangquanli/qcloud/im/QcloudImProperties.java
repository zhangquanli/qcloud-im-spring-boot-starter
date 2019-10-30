package com.github.zhangquanli.qcloud.im;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * QcloudImProperties
 *
 * @author zhangquanli
 */
@ConfigurationProperties(prefix = "qcloud.im")
public class QcloudImProperties {

    /**
     * 应用编号
     */
    private Integer appId;
    /**
     * 多少秒后，userSig过期，默认180天后过期
     */
    private Integer expire = 15552000;
    /**
     * 私钥路径（请放置在resources目录下）
     */
    private String privateKeyPath;
    /**
     * 管理员账号
     */
    private String adminIdentifier;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getExpire() {
        return expire;
    }

    public void setExpire(Integer expire) {
        this.expire = expire;
    }

    public String getPrivateKeyPath() {
        return privateKeyPath;
    }

    public void setPrivateKeyPath(String privateKeyPath) {
        this.privateKeyPath = privateKeyPath;
    }

    public String getAdminIdentifier() {
        return adminIdentifier;
    }

    public void setAdminIdentifier(String adminIdentifier) {
        this.adminIdentifier = adminIdentifier;
    }
}
