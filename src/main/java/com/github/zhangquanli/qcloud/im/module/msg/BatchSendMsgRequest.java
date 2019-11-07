package com.github.zhangquanli.qcloud.im.module.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractRequest;
import com.github.zhangquanli.qcloud.im.module.msg.element.AbstractMsgElement;

import java.util.List;
import java.util.Random;

/**
 * BatchSendMsgRequest
 *
 * @author zhangquanli
 */
public class BatchSendMsgRequest extends AbstractRequest {

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
     * 示例： ["bonnie", "rong"]
     * 是否必填：是
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;
    /**
     * 描述：消息随机数，由随机函数产生（标记该条消息，用于后台定位问题）
     * 示例：1287657
     * 是否必填：是
     */
    @JsonProperty("MsgRandom")
    private Integer msgRandom;
    /**
     * 描述：消息内容，具体格式请参考 消息格式描述（注意，一条消息可包括多种消息元素，MsgBody 为 Array 类型）
     * 是否必填：是
     */
    @JsonProperty("MsgBody")
    private List<AbstractMsgElement> msgBody;

    private BatchSendMsgRequest(Integer syncOtherMachine, String fromAccount, List<String> toAccount, List<AbstractMsgElement> msgBody) {
        this.syncOtherMachine = syncOtherMachine;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgRandom = new Random(System.currentTimeMillis() / 1000).nextInt(900000) + 100000;
        this.msgBody = msgBody;
    }

    public Integer getSyncOtherMachine() {
        return syncOtherMachine;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public List<AbstractMsgElement> getMsgBody() {
        return msgBody;
    }

    public static BatchSendMsgRequestBuilder builder() {
        return new BatchSendMsgRequestBuilder();
    }

    public static class BatchSendMsgRequestBuilder {

        private Integer syncOtherMachine;
        private String fromAccount;
        private List<String> toAccount;
        private List<AbstractMsgElement> msgBody;

        private BatchSendMsgRequestBuilder() {
        }

        public BatchSendMsgRequestBuilder syncOtherMachine(Integer syncOtherMachine) {
            this.syncOtherMachine = syncOtherMachine;
            return this;
        }

        public BatchSendMsgRequestBuilder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public BatchSendMsgRequestBuilder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public BatchSendMsgRequestBuilder msgBody(List<AbstractMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }

        public BatchSendMsgRequest build() {
            return new BatchSendMsgRequest(syncOtherMachine, fromAccount, toAccount, msgBody);
        }
    }
}
