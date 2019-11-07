package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractResponse;

import java.util.List;

/**
 * MultiAccountImportResponse
 *
 * @author zhangquanli
 */
public class MultiAccountImportResponse extends AbstractResponse {

    /**
     * 描述：导入失败的帐号列表
     */
    @JsonProperty("FailAccounts")
    private List<String> failAccounts;

    public List<String> getFailAccounts() {
        return failAccounts;
    }

    public void setFailAccounts(List<String> failAccounts) {
        this.failAccounts = failAccounts;
    }
}
