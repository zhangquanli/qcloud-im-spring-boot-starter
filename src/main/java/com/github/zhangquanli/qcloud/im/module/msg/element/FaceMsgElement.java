package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.github.zhangquanli.qcloud.im.constants.MsgType;

/**
 * 表情消息元素
 *
 * @author zhangquanli
 */
public class FaceMsgElement extends AbstractMsgElement<FaceMsgContent> {

    public FaceMsgElement(FaceMsgContent msgContent) {
        super(MsgType.TIM_FACE_ELEM.getValue(), msgContent);
    }
}
