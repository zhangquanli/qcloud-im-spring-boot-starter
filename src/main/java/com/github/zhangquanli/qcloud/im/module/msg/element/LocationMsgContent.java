package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * 地理位置消息正文
 *
 * @author zhangquanli
 */
public class LocationMsgContent extends AbstractMsgContent {

    /**
     * 描述：地理位置描述信息。
     * 示例：someinfo
     * 是否必填：是
     */
    @JsonProperty("Desc")
    private String desc;
    /**
     * 描述：纬度。
     * 示例：29.340656774469956
     * 是否必填：是
     */
    @JsonProperty("Latitude")
    private BigDecimal latitude;
    /**
     * 描述：经度。
     * 示例：116.77497920478824
     * 是否必填：是
     */
    @JsonProperty("Longitude")
    private BigDecimal longitude;

    private LocationMsgContent(String desc, BigDecimal latitude, BigDecimal longitude) {
        this.desc = desc;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getDesc() {
        return desc;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public static LocationMsgContentBuilder builder() {
        return new LocationMsgContentBuilder();
    }

    public static class LocationMsgContentBuilder {

        private String desc;
        private BigDecimal latitude;
        private BigDecimal longitude;

        private LocationMsgContentBuilder() {
        }

        public LocationMsgContentBuilder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public LocationMsgContentBuilder latitude(BigDecimal latitude) {
            this.latitude = latitude;
            return this;
        }

        public LocationMsgContentBuilder longitude(BigDecimal longitude) {
            this.longitude = longitude;
            return this;
        }

        public LocationMsgContent build() {
            return new LocationMsgContent(desc, latitude, longitude);
        }
    }
}
