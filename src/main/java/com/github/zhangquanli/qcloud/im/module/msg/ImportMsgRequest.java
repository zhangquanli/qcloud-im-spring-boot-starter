package com.github.zhangquanli.qcloud.im.module.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractRequest;
import com.github.zhangquanli.qcloud.im.module.msg.element.AbstractMsgElement;

import java.util.List;
import java.util.Random;

/**
 * ImportMsgRequest
 *
 * @author zhangquanli
 */
public class ImportMsgRequest extends AbstractRequest {

    /**
     * 描述：该字段只能填1或2，其他值是非法值
     * 1表示实时消息导入，消息加入未读计数
     * 2表示历史消息导入，消息不计入未读
     * <p>
     * 示例：1
     * 是否必填：是
     */
    @JsonProperty("SyncFromOldSystem")
    private Integer syncFromOldSystem;
    /**
     * 描述：消息发送方 Identifier，用于指定发送消息方
     * 示例：lumotuwe1
     * 是否必填：是
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
     * 描述：消息随机数，由随机函数产生，用于消息去重
     * 示例：1287657
     * 是否必填：是
     */
    @JsonProperty("MsgRandom")
    private Integer msgRandom;
    /**
     * 描述：消息时间戳，UNIX 时间戳，单位为秒
     * 示例：1556178721
     * 是否必填：是
     */
    @JsonProperty("MsgTimeStamp")
    private Integer msgTimeStamp;
    /**
     * 描述：消息内容
     * 是否必填：是
     */
    @JsonProperty("MsgBody")
    private List<AbstractMsgElement> msgBody;

    private ImportMsgRequest(Integer syncFromOldSystem, String fromAccount, String toAccount, List<AbstractMsgElement> msgBody) {
        this.syncFromOldSystem = syncFromOldSystem;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgRandom = new Random(System.currentTimeMillis() / 1000).nextInt(900000) + 100000;
        this.msgTimeStamp = (int) System.currentTimeMillis() / 1000;
        this.msgBody = msgBody;
    }

    public Integer getSyncFromOldSystem() {
        return syncFromOldSystem;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public Integer getMsgTimeStamp() {
        return msgTimeStamp;
    }

    public List<AbstractMsgElement> getMsgBody() {
        return msgBody;
    }

    public static ImportMsgRequestBuilder builder() {
        return new ImportMsgRequestBuilder();
    }

    public static class ImportMsgRequestBuilder {

        private Integer syncFromOldSystem;
        private String fromAccount;
        private String toAccount;
        private List<AbstractMsgElement> msgBody;

        private ImportMsgRequestBuilder() {
        }

        public ImportMsgRequestBuilder syncFromOldSystem(Integer syncFromOldSystem) {
            this.syncFromOldSystem = syncFromOldSystem;
            return this;
        }

        public ImportMsgRequestBuilder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public ImportMsgRequestBuilder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public ImportMsgRequestBuilder msgBody(List<AbstractMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }

        public ImportMsgRequest build() {
            return new ImportMsgRequest(syncFromOldSystem, fromAccount, toAccount, msgBody);
        }
    }
}
