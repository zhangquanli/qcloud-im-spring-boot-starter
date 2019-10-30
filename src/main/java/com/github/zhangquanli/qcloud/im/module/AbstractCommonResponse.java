package com.github.zhangquanli.qcloud.im.module;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * AbstractCommonResponse
 *
 * @author zhangquanli
 */
@Getter
@Setter
public abstract class AbstractCommonResponse {

    /**
     * 描述：请求处理的结果，OK 表示处理成功，FAIL 表示失败
     */
    @JsonProperty("ActionStatus")
    private String actionStatus;
    /**
     * 描述：错误码，0表示成功，非0表示失败
     */
    @JsonProperty("ErrorCode")
    private Integer errorCode;
    /**
     * 描述：错误信息
     */
    @JsonProperty("ErrorInfo")
    private String errorInfo;
}
