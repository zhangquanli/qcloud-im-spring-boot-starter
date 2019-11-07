package com.github.zhangquanli.qcloud.im.module.user_sig;

/**
 * TlsSigStrategy
 *
 * @author zhangquanli
 */
public interface TlsSigStrategy {

    /**
     * 生成签名
     *
     * @param sdkAppId   应用编号
     * @param privateKey 私钥
     * @param expire     过期时间
     * @param identifier 账号
     * @return 签名字符串
     */
    String genSig(long sdkAppId, String privateKey, long expire, String identifier);
}
