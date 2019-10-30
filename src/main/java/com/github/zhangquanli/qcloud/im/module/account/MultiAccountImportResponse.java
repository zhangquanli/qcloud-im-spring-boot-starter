package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractCommonResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * MultiAccountImportResponse
 *
 * @author zhangquanli
 */
@Getter
@Setter
public class MultiAccountImportResponse extends AbstractCommonResponse {

    /**
     * 描述：导入失败的帐号列表
     */
    @JsonProperty("FailAccounts")
    private List<String> failAccounts;
}
