package com.github.zhangquanli.qcloud.im.module.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractResponse;

/**
 * SendMsgResponse
 *
 * @author zhangquanli
 */
public class SendMsgResponse extends AbstractResponse {

    /**
     * 描述：消息时间戳，UNIX 时间戳
     */
    @JsonProperty("MsgTime")
    private Integer msgTime;
    /**
     * 描述：消息唯一标识，用于撤回。长度不超过50个字符
     */
    @JsonProperty("MsgKey")
    private String msgKey;

    public Integer getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Integer msgTime) {
        this.msgTime = msgTime;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }
}
