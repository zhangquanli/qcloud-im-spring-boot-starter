package com.github.zhangquanli.qcloud.im;

import com.github.zhangquanli.qcloud.im.module.account.AccountService;

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
}
