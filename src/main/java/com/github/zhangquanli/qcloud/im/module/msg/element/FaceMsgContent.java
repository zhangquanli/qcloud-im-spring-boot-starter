package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 表情消息正文
 *
 * @author zhangquanli
 */
public class FaceMsgContent extends AbstractMsgContent {

    /**
     * 描述：表情索引，用户自定义。
     * 示例：1
     * 是否必填：是
     */
    @JsonProperty("Index")
    private Integer index;
    /**
     * 描述：额外数据。
     * 示例：content
     * 是否必填：是
     */
    @JsonProperty("Data")
    private String data;

    private FaceMsgContent(Integer index, String data) {
        this.index = index;
        this.data = data;
    }

    public Integer getIndex() {
        return index;
    }

    public String getData() {
        return data;
    }

    public static FaceMsgContentBuilder builder() {
        return new FaceMsgContentBuilder();
    }

    public static class FaceMsgContentBuilder {

        private Integer index;
        private String data;

        private FaceMsgContentBuilder() {
        }

        public FaceMsgContentBuilder index(Integer index) {
            this.index = index;
            return this;
        }

        public FaceMsgContentBuilder data(String data) {
            this.data = data;
            return this;
        }

        public FaceMsgContent build() {
            return new FaceMsgContent(index, data);
        }
    }
}
