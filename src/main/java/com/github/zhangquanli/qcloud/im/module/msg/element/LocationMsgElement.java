package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.github.zhangquanli.qcloud.im.constants.MsgType;

/**
 * 地理位置消息元素
 *
 * @author zhangquanli
 */
public class LocationMsgElement extends AbstractMsgElement<LocationMsgContent> {

    public LocationMsgElement(LocationMsgContent msgContent) {
        super(MsgType.TIM_LOCATION_ELEM.getValue(), msgContent);
    }
}
