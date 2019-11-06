package com.github.zhangquanli.qcloud.im.module;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AbstractResponse
 *
 * @author zhangquanli
 */
public abstract class AbstractResponse {

    /**
     * 描述：请求处理的结果，OK 表示处理成功，FAIL 表示失败
     */
    private String actionStatus;
    /**
     * 描述：错误码，0表示成功，非0表示失败
     */
    private Integer errorCode;
    /**
     * 描述：错误信息
     */
    private String errorInfo;

    public String getActionStatus() {
        return actionStatus;
    }

    @JsonProperty("ActionStatus")
    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    @JsonProperty("ErrorCode")
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    @JsonProperty("ErrorInfo")
    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }
}
