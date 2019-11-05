package com.github.zhangquanli.qcloud.im;

import com.github.zhangquanli.qcloud.im.module.account.AccountService;
import com.github.zhangquanli.qcloud.im.module.msg.MsgService;

/**
 * QcloudImImpl
 *
 * @author zhangquanli
 */
public class QcloudImImpl implements QcloudIm {

    private AccountService accountService;
    private MsgService msgService;

    public QcloudImImpl(QcloudImProperties qcloudImProperties) {
        this.accountService = new AccountService(qcloudImProperties);
        this.msgService = new MsgService(qcloudImProperties);
    }

    @Override
    public AccountService getAccountService() {
        return accountService;
    }

    @Override
    public MsgService getMsgService() {
        return msgService;
    }
}
