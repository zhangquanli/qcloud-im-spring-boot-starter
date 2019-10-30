package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * AccountCheckResultItem
 *
 * @author zhangquanli
 */
@Getter
@Setter
public class AccountCheckResultItem {

    /**
     * 描述：请求校验的帐号的 UserID
     */
    @JsonProperty("UserID")
    private String userId;
    /**
     * 描述：单个帐号的校验结果：0表示成功，非0表示失败
     */
    @JsonProperty("ResultCode")
    private Integer resultCode;
    /**
     * 描述：单个帐号校验失败时的错误描述信息
     */
    @JsonProperty("ResultInfo")
    private String resultInfo;
    /**
     * 描述：单个帐号的导入状态：Imported 表示已导入，NotImported 表示未导入
     */
    @JsonProperty("AccountStatus")
    private String accountStatus;
}
