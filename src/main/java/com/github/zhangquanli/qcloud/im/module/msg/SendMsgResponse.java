package com.github.zhangquanli.qcloud.im.module.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractCommonResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * SendMsgResponse
 *
 * @author zhangquanli
 */
@Getter
@Setter
public class SendMsgResponse extends AbstractCommonResponse {

    /**
     * 描述：消息时间戳，UNIX 时间戳
     */
    @JsonProperty("MsgTime")
    private Integer msgTime;
}
