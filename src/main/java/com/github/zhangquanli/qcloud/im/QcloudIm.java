package com.github.zhangquanli.qcloud.im;

import com.github.zhangquanli.qcloud.im.module.account.AccountService;
import com.github.zhangquanli.qcloud.im.module.msg.MsgService;
import com.github.zhangquanli.qcloud.im.module.user_sig.UserSigService;

/**
 * QcloudIm
 *
 * @author zhangquanli
 */
public interface QcloudIm {

    /**
     * 用户签名
     *
     * @return UserSigService
     */
    UserSigService getUserSigService();

    /**
     * 账号管理
     *
     * @return AccountService
     */
    AccountService getAccountService();

    /**
     * 单聊消息
     *
     * @return MsgService
     */
    MsgService getMsgService();
}
