package com.github.zhangquanli.qcloud.im.module.user_sig;

/**
 * UserSig
 *
 * @author zhangquanli
 */
public class UserSig {

    private TlsSigStrategy tlsSigStrategy;

    public UserSig(TlsSigStrategy tlsSigStrategy) {
        this.tlsSigStrategy = tlsSigStrategy;
    }

    /**
     * 生成
     *
     * @param sdkAppId   应用编号
     * @param privateKey 私钥
     * @param expire     过期时间
     * @param identifier 账号
     * @return 用户签名的字符串
     */
    public String generate(long sdkAppId, String privateKey, long expire, String identifier) {
        return tlsSigStrategy.genSig(sdkAppId, privateKey, expire, identifier);
    }
}
