package com.github.zhangquanli.qcloud.im;

import com.github.zhangquanli.qcloud.im.constants.TlsSig;
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
    private Long sdkAppId;
    /**
     * 私钥路径，请放置在resources目录下
     */
    private String privateKeyPath;
    /**
     * 管理账号，在腾讯云控制台添加
     */
    private String adminIdentifier;
    /**
     * 签名算法，2019.07.19 之前使用 ECDSA_SHA256 算法，2019.07.19 之后使用 HMAC_SHA256 算法。
     */
    private TlsSig tlsSig;
    /**
     * 过期时间，默认为180天，单位为秒。
     */
    private Long expire = 15552000L;

    public Long getSdkAppId() {
        return sdkAppId;
    }

    public void setSdkAppId(Long sdkAppId) {
        this.sdkAppId = sdkAppId;
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

    public TlsSig getTlsSig() {
        return tlsSig;
    }

    public void setTlsSig(TlsSig tlsSig) {
        this.tlsSig = tlsSig;
    }

    public Long getExpire() {
        return expire;
    }

    public void setExpire(Long expire) {
        this.expire = expire;
    }
}
