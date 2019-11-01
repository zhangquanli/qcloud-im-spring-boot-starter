package com.github.zhangquanli.qcloud.im.module.msg.element;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * 文本消息正文
 *
 * @author zhangquanli
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TextMsgContent implements MsgContent {

    /**
     * 描述：消息内容。
     * 示例：hello world
     * 是否必填：是
     */
    @JsonProperty("Text")
    private String text;
}
