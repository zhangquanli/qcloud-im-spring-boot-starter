package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.github.zhangquanli.qcloud.im.constants.MsgType;

import java.math.BigDecimal;

/**
 * 地理位置消息元素
 *
 * @author zhangquanli
 */
public class LocationMsgElement extends AbstractMsgElement<LocationMsgContent> {

    private LocationMsgElement(LocationMsgContent msgContent) {
        super(MsgType.TIM_LOCATION_ELEM.getValue(), msgContent);
    }

    public static LocationMsgElementBuilder builder() {
        return new LocationMsgElementBuilder();
    }

    public static class LocationMsgElementBuilder {

        private String desc;
        private BigDecimal latitude;
        private BigDecimal longitude;

        private LocationMsgElementBuilder() {
        }

        public LocationMsgElementBuilder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public LocationMsgElementBuilder latitude(BigDecimal latitude) {
            this.latitude = latitude;
            return this;
        }

        public LocationMsgElementBuilder longitude(BigDecimal longitude) {
            this.longitude = longitude;
            return this;
        }

        public LocationMsgElement build() {
            LocationMsgContent msgContent = LocationMsgContent.builder()
                    .desc(desc).latitude(latitude).longitude(longitude)
                    .build();
            return new LocationMsgElement(msgContent);
        }
    }
}
