package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AccountCheckResultItem
 *
 * @author zhangquanli
 */
public class AccountResultItem {

    /**
     * 描述：请求校验的帐号的 UserID
     */
    private String userId;
    /**
     * 描述：单个帐号的校验结果：0表示成功，非0表示失败
     */
    private Integer resultCode;
    /**
     * 描述：单个帐号校验失败时的错误描述信息
     */
    private String resultInfo;
    /**
     * 描述：单个帐号的导入状态：Imported 表示已导入，NotImported 表示未导入
     */
    private String accountStatus;

    public String getUserId() {
        return userId;
    }

    @JsonProperty("UserID")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    @JsonProperty("ResultCode")
    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    @JsonProperty("ResultInfo")
    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    @JsonProperty("AccountStatus")
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}
