package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractCommonRequest;
import lombok.*;

import java.util.List;

/**
 * AccountDeleteRequest
 *
 * @author zhangquanli
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDeleteRequest extends AbstractCommonRequest {

    /**
     * 描述：请求删除的帐号对象数组，单次请求最多支持100个帐号
     * 示例：[{"UserID":"UserID_1"}, {"UserID":"UserID_2"}]
     * 是否必填：是
     */
    @JsonProperty("DeleteItem")
    private List<AccountItem> items;
}
