package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * AccountCheckItem
 *
 * @author zhangquanli
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountCheckItem {

    /**
     * 描述：请求校验的帐号的 UserID
     * 示例：UserID_1
     * 是否必填：是
     */
    @JsonProperty("UserID")
    private String userId;
}
