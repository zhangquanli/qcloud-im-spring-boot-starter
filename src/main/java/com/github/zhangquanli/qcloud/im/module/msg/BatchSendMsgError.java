package com.github.zhangquanli.qcloud.im.module.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * BatchSendMsgError
 *
 * @author zhangquanli
 */
@Getter
@Setter
public class BatchSendMsgError {

    /**
     * 描述：发送消息失败的帐号
     */
    @JsonProperty("To_Account")
    private String toAccount;
    /**
     * 描述：发送失败的错误码
     */
    @JsonProperty("ErrorCode")
    private Integer errorCode;
}
