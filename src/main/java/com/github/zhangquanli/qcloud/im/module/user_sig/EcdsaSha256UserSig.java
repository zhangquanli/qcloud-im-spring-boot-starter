package com.github.zhangquanli.qcloud.im.module.user_sig;

import com.tls.tls_sigature.tls_sigature;

/**
 * EcdsaSha256UserSig
 *
 * @author zhangquanli
 */
public class EcdsaSha256UserSig implements UserSig {

    @Override
    public String generate(long sdkAppId, String privateKey, long expire, String identifier) {
        return tls_sigature.genSig(sdkAppId, identifier, (int) expire, privateKey).urlSig;
    }
}
