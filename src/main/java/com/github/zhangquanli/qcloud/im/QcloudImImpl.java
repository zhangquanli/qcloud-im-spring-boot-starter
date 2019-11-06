package com.github.zhangquanli.qcloud.im;

import com.github.zhangquanli.qcloud.im.module.account.AccountService;
import com.github.zhangquanli.qcloud.im.module.account.AccountServiceImpl;
import com.github.zhangquanli.qcloud.im.module.msg.MsgService;
import com.github.zhangquanli.qcloud.im.module.msg.MsgServiceImpl;

/**
 * QcloudImImpl
 *
 * @author zhangquanli
 */
public class QcloudImImpl implements QcloudIm {

    private AccountService accountService;
    private MsgService msgService;

    public QcloudImImpl(QcloudImProperties qcloudImProperties) {
        this.accountService = new AccountServiceImpl(qcloudImProperties);
        this.msgService = new MsgServiceImpl(qcloudImProperties);
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
