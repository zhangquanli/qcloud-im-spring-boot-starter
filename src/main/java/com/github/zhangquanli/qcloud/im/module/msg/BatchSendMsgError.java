package com.github.zhangquanli.qcloud.im.module.msg;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BatchSendMsgError
 *
 * @author zhangquanli
 */
public class BatchSendMsgError {

    /**
     * 描述：发送消息失败的帐号
     */
    private String toAccount;
    /**
     * 描述：发送失败的错误码
     */
    private Integer errorCode;

    public String getToAccount() {
        return toAccount;
    }

    @JsonProperty("To_Account")
    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    @JsonProperty("ErrorCode")
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
