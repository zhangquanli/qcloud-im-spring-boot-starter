package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.github.zhangquanli.qcloud.im.constants.MsgType;

/**
 * 文本消息元素
 *
 * @author zhangquanli
 */
public class TextMsgElement extends AbstractMsgElement<TextMsgContent> {

    public TextMsgElement(TextMsgContent msgContent) {
        super(MsgType.TIM_TEXT_ELEM.getValue(), msgContent);
    }
}
