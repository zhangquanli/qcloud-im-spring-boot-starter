package com.github.zhangquanli.qcloud.im.module.msg;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractRequest;
import com.github.zhangquanli.qcloud.im.module.msg.element.AbstractMsgElement;

import java.util.List;
import java.util.Random;

/**
 * SendMsgRequest
 *
 * @author zhangquanli
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendMsgRequest extends AbstractRequest {

    /**
     * 描述：
     * 1：把消息同步到 From_Account 在线终端和漫游上；
     * 2：消息不同步至 From_Account；
     * 若不填写默认情况下会将消息存 From_Account 漫游
     * <p>
     * 示例：1
     * 是否必填：否
     */
    private Integer syncOtherMachine;
    /**
     * 描述：消息发送方 Identifier（用于指定发送消息方帐号）
     * 示例：lumotuwe1
     * 是否必填：否
     */
    private String fromAccount;
    /**
     * 描述：消息接收方 Identifier
     * 示例：lumotuwe2
     * 是否必填：是
     */
    private String toAccount;
    /**
     * 描述：消息离线保存时长（单位：秒），最长为7天（604800秒）。若消息只发在线用户，不想保存离线，则该字段填0。若不填，则默认保存7天
     * 示例：604800
     * 是否必填：否
     */
    private Integer msgLifeTime;
    /**
     * 描述：消息随机数，由随机函数产生（标记该条消息，用于后台定位问题）
     * 示例：1287657
     * 是否必填：是
     */
    private Integer msgRandom;
    /**
     * 描述：消息时间戳，UNIX 时间戳（单位：秒）
     * 示例：1557387418
     * 是否必填：否
     */
    private Integer msgTimeStamp;
    /**
     * 描述：消息内容，具体格式请参考 消息格式描述（注意，一条消息可包括多种消息元素，MsgBody 为 Array 类型）
     * 是否必填：是
     */
    private List<AbstractMsgElement> msgBody;

    private SendMsgRequest(Integer syncOtherMachine, String fromAccount, String toAccount, Integer msgLifeTime, List<AbstractMsgElement> msgBody) {
        this.syncOtherMachine = syncOtherMachine;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgLifeTime = msgLifeTime;
        this.msgRandom = new Random(System.currentTimeMillis() / 1000).nextInt(900000) + 100000;
        this.msgTimeStamp = (int) System.currentTimeMillis() / 1000;
        this.msgBody = msgBody;
    }

    @JsonProperty("SyncOtherMachine")
    public Integer getSyncOtherMachine() {
        return syncOtherMachine;
    }

    @JsonProperty("From_Account")
    public String getFromAccount() {
        return fromAccount;
    }

    @JsonProperty("To_Account")
    public String getToAccount() {
        return toAccount;
    }

    @JsonProperty("MsgLifeTime")
    public Integer getMsgLifeTime() {
        return msgLifeTime;
    }

    @JsonProperty("MsgRandom")
    public Integer getMsgRandom() {
        return msgRandom;
    }

    @JsonProperty("MsgTimeStamp")
    public Integer getMsgTimeStamp() {
        return msgTimeStamp;
    }

    @JsonProperty("MsgBody")
    public List<AbstractMsgElement> getMsgBody() {
        return msgBody;
    }

    public static SendMsgRequestBuilder builder() {
        return new SendMsgRequestBuilder();
    }

    public static class SendMsgRequestBuilder {

        private Integer syncOtherMachine;
        private String fromAccount;
        private String toAccount;
        private Integer msgLifeTime;
        private List<AbstractMsgElement> msgBody;

        private SendMsgRequestBuilder() {
        }

        public SendMsgRequestBuilder syncOtherMachine(Integer syncOtherMachine) {
            this.syncOtherMachine = syncOtherMachine;
            return this;
        }

        public SendMsgRequestBuilder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public SendMsgRequestBuilder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public SendMsgRequestBuilder msgLifeTime(Integer msgLifeTime) {
            this.msgLifeTime = msgLifeTime;
            return this;
        }

        public SendMsgRequestBuilder msgBody(List<AbstractMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }

        public SendMsgRequest build() {
            return new SendMsgRequest(syncOtherMachine, fromAccount, toAccount, msgLifeTime, msgBody);
        }
    }
}
