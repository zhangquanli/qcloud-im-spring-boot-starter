package com.github.zhangquanli.qcloud.im;

import com.github.zhangquanli.qcloud.im.module.account.AccountService;

/**
 * QcloudImImpl
 *
 * @author zhangquanli
 */
public class QcloudImImpl implements QcloudIm {

    private AccountService accountService;

    public QcloudImImpl(QcloudImProperties qcloudImProperties) {
        this.accountService = new AccountService(qcloudImProperties);
    }

    @Override
    public AccountService getAccountService() {
        return accountService;
    }
}
