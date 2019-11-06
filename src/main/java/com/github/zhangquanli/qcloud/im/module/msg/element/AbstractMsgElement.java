package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 消息元素
 *
 * @author zhangquanli
 */
public abstract class AbstractMsgElement<T extends AbstractMsgContent> {

    /**
     * 描述：消息元素类别
     */
    private String msgType;
    /**
     * 描述：消息元素的内容
     */
    private T msgContent;

    protected AbstractMsgElement(String msgType, T msgContent) {
        this.msgType = msgType;
        this.msgContent = msgContent;
    }

    @JsonProperty("MsgType")
    public String getMsgType() {
        return msgType;
    }

    @JsonProperty("MsgContent")
    public T getMsgContent() {
        return msgContent;
    }
}
