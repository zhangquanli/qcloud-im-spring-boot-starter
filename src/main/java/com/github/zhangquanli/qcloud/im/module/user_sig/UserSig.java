package com.github.zhangquanli.qcloud.im.module.user_sig;

/**
 * 用户签名，即账号的密码
 *
 * @author zhangquanli
 */
public interface UserSig {

    /**
     * 生成
     *
     * @param sdkAppId   应用编号
     * @param privateKey 私钥
     * @param expire     过期时间
     * @param identifier 账号
     * @return 用户签名的字符串
     */
    String generate(long sdkAppId, String privateKey, long expire, String identifier);
}
