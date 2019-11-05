package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.github.zhangquanli.qcloud.im.constants.MsgType;

/**
 * 自定义消息元素
 *
 * @author zhangquanli
 */
public class CustomMsgElement extends AbstractMsgElement<CustomMsgContent> {

    public CustomMsgElement(CustomMsgContent msgContent) {
        super(MsgType.TIM_CUSTOM_ELEM.getValue(), msgContent);
    }
}
