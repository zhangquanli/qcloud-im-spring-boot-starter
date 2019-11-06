package com.github.zhangquanli.qcloud.im.module.user_sig;

import com.github.zhangquanli.qcloud.im.QcloudImProperties;
import com.github.zhangquanli.qcloud.im.module.AbstractHttpClient;

/**
 * UserSigServiceImpl
 *
 * @author zhangquanli
 */
public class UserSigServiceImpl extends AbstractHttpClient implements UserSigService {

    public UserSigServiceImpl(QcloudImProperties qcloudImProperties) {
        super(qcloudImProperties);
    }

    @Override
    public String getUserSig(String identifier) {
        return generateUserSig(identifier);
    }
}
