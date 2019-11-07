package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractResponse;

import java.util.List;

/**
 * AccountDeleteResponse
 *
 * @author zhangquanli
 */
public class AccountDeleteResponse extends AbstractResponse {

    /***
     * 描述：单个帐号的结果对象数组
     */
    @JsonProperty("ResultItem")
    private List<AccountResultItem> resultItems;

    public List<AccountResultItem> getResultItems() {
        return resultItems;
    }

    public void setResultItems(List<AccountResultItem> resultItems) {
        this.resultItems = resultItems;
    }
}
