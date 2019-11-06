package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.github.zhangquanli.qcloud.im.constants.MsgType;

/**
 * 自定义消息元素
 *
 * @author zhangquanli
 */
public class CustomMsgElement extends AbstractMsgElement<CustomMsgContent> {

    private CustomMsgElement(CustomMsgContent msgContent) {
        super(MsgType.TIM_CUSTOM_ELEM.getValue(), msgContent);
    }

    public static CustomMsgElementBuilder builder() {
        return new CustomMsgElementBuilder();
    }

    public static class CustomMsgElementBuilder {

        private String data;
        private String desc;
        private String ext;
        private String sound;

        private CustomMsgElementBuilder() {
        }

        public CustomMsgElementBuilder data(String data) {
            this.data = data;
            return this;
        }

        public CustomMsgElementBuilder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public CustomMsgElementBuilder ext(String ext) {
            this.ext = ext;
            return this;
        }

        public CustomMsgElementBuilder sound(String sound) {
            this.sound = sound;
            return this;
        }

        public CustomMsgElement build() {
            CustomMsgContent msgContent = CustomMsgContent.builder()
                    .data(data).desc(desc).ext(ext).sound(sound)
                    .build();
            return new CustomMsgElement(msgContent);
        }
    }
}
