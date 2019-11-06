package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractResponse;

import java.util.List;

/**
 * AccountCheckResponse
 *
 * @author zhangquanli
 */
public class AccountCheckResponse extends AbstractResponse {

    /**
     * 描述：单个帐号的结果对象数组
     */
    private List<AccountResultItem> resultItems;

    public List<AccountResultItem> getResultItems() {
        return resultItems;
    }

    @JsonProperty("ResultItem")
    public void setResultItems(List<AccountResultItem> resultItems) {
        this.resultItems = resultItems;
    }
}
