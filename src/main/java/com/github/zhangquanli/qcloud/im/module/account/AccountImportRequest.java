package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractCommonRequest;
import lombok.*;

/**
 * AccountImportRequest
 *
 * @author zhangquanli
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountImportRequest extends AbstractCommonRequest {

    /**
     * 描述：用户名，长度不超过32字节
     * 示例：test
     * 是否必填：是
     */
    @JsonProperty("Identifier")
    private String identifier;
    /**
     * 描述：用户昵称
     * 示例：test
     * 是否必填：否
     */
    @JsonProperty("Nick")
    private String nick;
    /**
     * 描述：用户头像URL
     * 示例：http://www.qq.com
     * 是否必填：否
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;
    /**
     * 描述：帐号类型，开发者默认无需填写，0表示普通帐号，1表示机器人帐号
     * 示例：0
     * 是否必填：否
     */
    @JsonProperty("Type")
    private Integer type;
}
