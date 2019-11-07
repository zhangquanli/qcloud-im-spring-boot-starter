package com.github.zhangquanli.qcloud.im.module.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractRequest;

/**
 * WithdrawMsgRequest
 *
 * @author zhangquanli
 */
public class WithdrawMsgRequest extends AbstractRequest {

    /**
     * 描述：消息发送方 Identifier（用于指定发送消息方帐号）
     * 示例：vinson
     * 是否必填：否
     */
    @JsonProperty("From_Account")
    private String fromAccount;
    /**
     * 描述：消息接收方 Identifier
     * 示例：dramon
     * 是否必填：是
     */
    @JsonProperty("To_Account")
    private String toAccount;
    /**
     * 描述：待撤回消息的唯一标识。该字段由 REST API 接口 单发单聊消息 和 批量发单聊消息 返回。
     * 示例：31906_833502_1572869830
     * 是否必填：是
     */
    @JsonProperty("MsgKey")
    private String msgKey;

    private WithdrawMsgRequest(String fromAccount, String toAccount, String msgKey) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgKey = msgKey;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public static WithdrawMsgRequestBuilder builder() {
        return new WithdrawMsgRequestBuilder();
    }

    public static class WithdrawMsgRequestBuilder {

        private String fromAccount;
        private String toAccount;
        private String msgKey;

        private WithdrawMsgRequestBuilder() {
        }

        public WithdrawMsgRequestBuilder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public WithdrawMsgRequestBuilder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public WithdrawMsgRequestBuilder msgKey(String msgKey) {
            this.msgKey = msgKey;
            return this;
        }

        public WithdrawMsgRequest build() {
            return new WithdrawMsgRequest(fromAccount, toAccount, msgKey);
        }
    }
}
