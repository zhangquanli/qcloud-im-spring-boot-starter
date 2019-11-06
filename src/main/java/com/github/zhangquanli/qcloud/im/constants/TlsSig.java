package com.github.zhangquanli.qcloud.im.constants;

import com.github.zhangquanli.qcloud.im.module.user_sig.EcdsaSha256UserSig;
import com.github.zhangquanli.qcloud.im.module.user_sig.HmacSha256UserSig;
import com.github.zhangquanli.qcloud.im.module.user_sig.UserSig;

/**
 * TlsSig
 *
 * @author zhangquanli
 */
public enum TlsSig {

    /**
     * 老版本算法。2019.07.19 之前创建的 SDKAppID ，使用老版本的签名算法。
     */
    ECDSA_SHA256(EcdsaSha256UserSig.class),
    /**
     * 新版本算法。2019.07.19 以后创建的 SDKAppID ，使用新版本的签名算法。
     */
    HMAC_SHA256(HmacSha256UserSig.class),
    ;

    private final Class<? extends UserSig> userSig;

    TlsSig(Class<? extends UserSig> userSig) {
        this.userSig = userSig;
    }

    public Class<? extends UserSig> getUserSig() {
        return userSig;
    }
}
