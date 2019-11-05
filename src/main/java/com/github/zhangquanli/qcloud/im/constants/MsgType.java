package com.github.zhangquanli.qcloud.im.constants;

/**
 * MsgType
 *
 * @author zhangquanli
 */
public enum MsgType {
    /**
     * 文本消息元素
     */
    TIM_TEXT_ELEM("TIMTextElem"),
    /**
     * 地理位置消息元素
     */
    TIM_LOCATION_ELEM("TIMLocationElem"),
    /**
     * 表情消息元素
     */
    TIM_FACE_ELEM("TIMFaceElem"),
    /**
     * 自定义消息元素
     */
    TIM_CUSTOM_ELEM("TIMCustomElem"),
    ;

    private final String value;

    MsgType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
