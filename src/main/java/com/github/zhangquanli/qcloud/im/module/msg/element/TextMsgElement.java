package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.github.zhangquanli.qcloud.im.constants.MsgType;

/**
 * 文本消息元素
 *
 * @author zhangquanli
 */
public class TextMsgElement extends AbstractMsgElement<TextMsgContent> {

    private TextMsgElement(TextMsgContent msgContent) {
        super(MsgType.TIM_TEXT_ELEM.getValue(), msgContent);
    }

    public static TextMsgElementBuilder builder() {
        return new TextMsgElementBuilder();
    }

    public static class TextMsgElementBuilder {

        private String text;

        private TextMsgElementBuilder() {
        }

        public TextMsgElementBuilder text(String text) {
            this.text = text;
            return this;
        }

        public TextMsgElement build() {
            return new TextMsgElement(TextMsgContent.builder().text(text).build());
        }
    }
}
