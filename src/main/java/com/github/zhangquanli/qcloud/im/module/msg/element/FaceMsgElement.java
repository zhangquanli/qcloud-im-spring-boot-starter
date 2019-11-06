package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.github.zhangquanli.qcloud.im.constants.MsgType;

/**
 * 表情消息元素
 *
 * @author zhangquanli
 */
public class FaceMsgElement extends AbstractMsgElement<FaceMsgContent> {

    private FaceMsgElement(FaceMsgContent msgContent) {
        super(MsgType.TIM_FACE_ELEM.getValue(), msgContent);
    }

    public static FaceMsgElementBuilder builder() {
        return new FaceMsgElementBuilder();
    }

    public static class FaceMsgElementBuilder {

        private Integer index;
        private String data;

        private FaceMsgElementBuilder() {
        }

        public FaceMsgElementBuilder index(Integer index) {
            this.index = index;
            return this;
        }

        public FaceMsgElementBuilder data(String data) {
            this.data = data;
            return this;
        }

        public FaceMsgElement build() {
            FaceMsgContent msgContent = FaceMsgContent.builder().index(index).data(data).build();
            return new FaceMsgElement(msgContent);
        }
    }
}
