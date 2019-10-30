package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractCommonRequest;
import lombok.*;

/**
 * KickRequest
 *
 * @author zhangquanli
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KickRequest extends AbstractCommonRequest {

    /**
     * 描述：用户名
     * 示例：test
     * 是否必填：是
     */
    @JsonProperty("Identifier")
    private String identifier;
}
