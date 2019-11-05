package com.github.zhangquanli.qcloud.im;

import com.github.zhangquanli.qcloud.im.module.account.AccountService;
import com.github.zhangquanli.qcloud.im.module.msg.MsgService;

/**
 * QcloudIm
 *
 * @author zhangquanli
 */
public interface QcloudIm {

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
