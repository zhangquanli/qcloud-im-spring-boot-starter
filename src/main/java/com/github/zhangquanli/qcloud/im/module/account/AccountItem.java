package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * AccountItem
 *
 * @author zhangquanli
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AccountItem {

    /**
     * 描述：请求帐号
     * 示例：UserID_1
     * 是否必填：是
     */
    @JsonProperty("UserID")
    private String userId;
}
