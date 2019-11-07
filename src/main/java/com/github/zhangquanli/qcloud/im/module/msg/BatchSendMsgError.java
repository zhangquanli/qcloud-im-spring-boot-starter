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
    @JsonProperty("To_Account")
    private String toAccount;
    /**
     * 描述：发送失败的错误码
     */
    @JsonProperty("ErrorCode")
    private Integer errorCode;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
