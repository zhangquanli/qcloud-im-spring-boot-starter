package com.github.zhangquanli.qcloud.im.module.user_sig;

import com.tencentyun.TLSSigAPIv2;

/**
 * HmacSha256UserSig
 *
 * @author zhangquanli
 */
public class HmacSha256UserSig implements UserSig {

    @Override
    public String generate(long sdkAppId, String privateKey, long expire, String identifier) {
        TLSSigAPIv2 tlsSigAPIv2 = new TLSSigAPIv2(sdkAppId, privateKey);
        return tlsSigAPIv2.genSig(identifier, expire);
    }
}
