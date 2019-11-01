package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

/**
 * 地理位置消息正文
 *
 * @author zhangquanli
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationMsgContent implements MsgContent {

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
}
