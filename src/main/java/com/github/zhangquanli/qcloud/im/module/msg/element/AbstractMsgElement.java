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
    @JsonProperty("MsgType")
    private String msgType;
    /**
     * 描述：消息元素的内容
     */
    @JsonProperty("MsgContent")
    private T msgContent;

    protected AbstractMsgElement(String msgType, T msgContent) {
        this.msgType = msgType;
        this.msgContent = msgContent;
    }

    public String getMsgType() {
        return msgType;
    }

    public T getMsgContent() {
        return msgContent;
    }

    @Override
    public String toString() {
        return "AbstractMsgElement{" +
                "msgType='" + msgType + '\'' +
                ", msgContent=" + msgContent +
                '}';
    }
}
