package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 文本消息正文
 *
 * @author zhangquanli
 */
public class TextMsgContent extends AbstractMsgContent {

    /**
     * 描述：消息内容。
     * 示例：hello world
     * 是否必填：是
     */
    private String text;

    private TextMsgContent(String text) {
        this.text = text;
    }

    @JsonProperty("Text")
    public String getText() {
        return text;
    }

    static TextMsgContentBuilder builder() {
        return new TextMsgContentBuilder();
    }

    public static class TextMsgContentBuilder {

        private String text;

        private TextMsgContentBuilder() {
        }

        public TextMsgContentBuilder text(String text) {
            this.text = text;
            return this;
        }

        public TextMsgContent build() {
            return new TextMsgContent(text);
        }
    }
}
