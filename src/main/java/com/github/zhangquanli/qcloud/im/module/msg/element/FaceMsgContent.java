package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * 表情消息正文
 *
 * @author zhangquanli
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
