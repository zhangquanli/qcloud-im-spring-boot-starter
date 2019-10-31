package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractCommonResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * AccountDeleteResponse
 *
 * @author zhangquanli
 */
@Getter
@Setter
public class AccountDeleteResponse extends AbstractCommonResponse {

    /***
     * 描述：单个帐号的结果对象数组
     */
    @JsonProperty("ResultItem")
    private List<AccountResultItem> resultItems;
}
