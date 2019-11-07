package com.github.zhangquanli.qcloud.im.module.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractResponse;

import java.util.List;

/**
 * BatchSendMsgResponse
 *
 * @author zhangquanli
 */
public class BatchSendMsgResponse extends AbstractResponse {

    /**
     * 描述：发消息失败列表，在此列表中的目标帐号，消息发送失败。
     * <p>
     * 若消息全部发送成功，则 ErrorList 为空。
     * 因此判断回包中是否含 ErrorList ，来判断消息是否全部发送成功
     */
    @JsonProperty("ErrorList")
    private List<BatchSendMsgError> errorList;
    /**
     * 描述：消息唯一标识，用于撤回。长度不超过50个字符
     */
    @JsonProperty("MsgKey")
    private String msgKey;

    public List<BatchSendMsgError> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<BatchSendMsgError> errorList) {
        this.errorList = errorList;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }
}
