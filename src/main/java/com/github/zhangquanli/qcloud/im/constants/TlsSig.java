package com.github.zhangquanli.qcloud.im.constants;

import com.github.zhangquanli.qcloud.im.module.user_sig.EcdsaSha256TlsSigStrategy;
import com.github.zhangquanli.qcloud.im.module.user_sig.HmacSha256TlsSigStrategy;
import com.github.zhangquanli.qcloud.im.module.user_sig.TlsSigStrategy;

/**
 * TlsSig
 *
 * @author zhangquanli
 */
public enum TlsSig {

    /**
     * 老版本算法。2019.07.19 之前创建的 SDKAppID ，使用老版本的签名算法。
     */
    ECDSA_SHA256(EcdsaSha256TlsSigStrategy.class),
    /**
     * 新版本算法。2019.07.19 以后创建的 SDKAppID ，使用新版本的签名算法。
     */
    HMAC_SHA256(HmacSha256TlsSigStrategy.class),
    ;

    private final Class<? extends TlsSigStrategy> strategy;

    TlsSig(Class<? extends TlsSigStrategy> strategy) {
        this.strategy = strategy;
    }

    public Class<? extends TlsSigStrategy> getStrategy() {
        return strategy;
    }
}
