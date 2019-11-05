package com.github.zhangquanli.qcloud.im.module.msg;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractCommonRequest;
import com.github.zhangquanli.qcloud.im.module.msg.element.AbstractMsgElement;
import lombok.*;

import java.util.List;

/**
 * SendMsgRequest
 *
 * @author zhangquanli
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendMsgRequest extends AbstractCommonRequest {

    /**
     * 描述：
     * 1：把消息同步到 From_Account 在线终端和漫游上；
     * 2：消息不同步至 From_Account；
     * 若不填写默认情况下会将消息存 From_Account 漫游
     * <p>
     * 示例：1
     * 是否必填：否
     */
    @JsonProperty("SyncOtherMachine")
    private Integer syncOtherMachine;
    /**
     * 描述：消息发送方 Identifier（用于指定发送消息方帐号）
     * 示例：lumotuwe1
     * 是否必填：否
     */
    @JsonProperty("From_Account")
    private String fromAccount;
    /**
     * 描述：消息接收方 Identifier
     * 示例：lumotuwe2
     * 是否必填：是
     */
    @JsonProperty("To_Account")
    private String toAccount;
    /**
     * 描述：消息离线保存时长（单位：秒），最长为7天（604800秒）。若消息只发在线用户，不想保存离线，则该字段填0。若不填，则默认保存7天
     * 示例：604800
     * 是否必填：否
     */
    @JsonProperty("MsgLifeTime")
    private Integer msgLifeTime;
    /**
     * 描述：消息随机数，由随机函数产生（标记该条消息，用于后台定位问题）
     * 示例：1287657
     * 是否必填：是
     */
    @JsonProperty("MsgRandom")
    private Integer msgRandom;
    /**
     * 描述：消息时间戳，UNIX 时间戳（单位：秒）
     * 示例：1557387418
     * 是否必填：否
     */
    @JsonProperty("MsgTimeStamp")
    private Integer msgTimeStamp;
    /**
     * 描述：消息内容，具体格式请参考 消息格式描述（注意，一条消息可包括多种消息元素，MsgBody 为 Array 类型）
     * 是否必填：是
     */
    @JsonProperty("MsgBody")
    private List<AbstractMsgElement> msgBody;
}
