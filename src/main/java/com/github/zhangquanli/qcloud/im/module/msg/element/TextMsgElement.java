package com.github.zhangquanli.qcloud.im.module.msg.element;

/**
 * 文本消息元素
 *
 * @author zhangquanli
 */
public class TextMsgElement extends MsgElement<TextMsgContent> {

    public TextMsgElement() {
        super();
    }

    public TextMsgElement(String msgType, TextMsgContent msgContent) {
        super(msgType, msgContent);
    }

    public static TextMsgElementBuilder builder() {
        return new TextMsgElementBuilder();
    }

    public static class TextMsgElementBuilder {
        private TextMsgContent msgContent;

        TextMsgElementBuilder() {
        }

        public TextMsgElement.TextMsgElementBuilder msgContent(TextMsgContent msgContent) {
            this.msgContent = msgContent;
            return this;
        }

        public TextMsgElement build() {
            return new TextMsgElement("TIMTextElem", this.msgContent);
        }
    }
}
