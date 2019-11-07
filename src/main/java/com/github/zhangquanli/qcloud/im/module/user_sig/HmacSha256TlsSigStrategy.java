package com.github.zhangquanli.qcloud.im.module.user_sig;

import com.tencentyun.TLSSigAPIv2;

/**
 * HmacSha256TlsSigStrategy
 *
 * @author zhangquanli
 */
public class HmacSha256TlsSigStrategy implements TlsSigStrategy {

    @Override
    public String genSig(long sdkAppId, String privateKey, long expire, String identifier) {
        TLSSigAPIv2 tlsSigAPIv2 = new TLSSigAPIv2(sdkAppId, privateKey);
        return tlsSigAPIv2.genSig(identifier, expire);
    }
}
