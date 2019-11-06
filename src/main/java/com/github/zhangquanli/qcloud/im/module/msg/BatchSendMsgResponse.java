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
    private List<BatchSendMsgError> errorList;

    public List<BatchSendMsgError> getErrorList() {
        return errorList;
    }

    @JsonProperty("ErrorList")
    public void setErrorList(List<BatchSendMsgError> errorList) {
        this.errorList = errorList;
    }
}
