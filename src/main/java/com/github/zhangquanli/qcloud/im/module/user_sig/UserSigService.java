package com.github.zhangquanli.qcloud.im.module.user_sig;

/**
 * UserSigService
 *
 * @author zhangquanli
 */
public interface UserSigService {

    /**
     * 生成密码
     *
     * @param identifier 账号
     * @return UserSig
     */
    String generateUserSig(String identifier);
}
