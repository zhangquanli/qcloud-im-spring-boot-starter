package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 消息元素
 *
 * @author zhangquanli
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class MsgElement<T extends MsgContent> {

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
}
