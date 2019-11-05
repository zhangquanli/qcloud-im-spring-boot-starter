package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * 自定义消息正文
 *
 * @author zhangquanli
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomMsgContent extends AbstractMsgContent {

    /**
     * 描述：自定义消息数据。 不作为 APNs 的 payload 字段下发，故从 payload 中无法获取 Data 字段。
     * 示例：message
     */
    @JsonProperty("Data")
    private String data;
    /**
     * 描述：自定义消息描述信息；当接收方为 iOS 或 Android 后台在线时，做离线推送文本展示。
     * 示例：notification
     */
    @JsonProperty("Desc")
    private String desc;
    /**
     * 描述：扩展字段；当接收方为 iOS 系统且应用处在后台时，此字段作为 APNs 请求包 Payloads 中的 Ext 键值下发，Ext 的协议格式由业务方确定，APNs 只做透传。
     * 示例：url
     */
    @JsonProperty("Ext")
    private String ext;
    /**
     * 描述：自定义 APNs 推送铃音。
     * 示例：dingdong.aiff
     */
    @JsonProperty("Sound")
    private String sound;
}
