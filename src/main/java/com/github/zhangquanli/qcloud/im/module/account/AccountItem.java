package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AccountItem
 *
 * @author zhangquanli
 */
public class AccountItem {

    /**
     * 描述：请求帐号
     * 示例：UserID_1
     * 是否必填：是
     */
    @JsonProperty("UserID")
    private String userId;

    private AccountItem(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public static AccountItemBuilder builder() {
        return new AccountItemBuilder();
    }

    public static class AccountItemBuilder {

        private String userId;

        private AccountItemBuilder() {
        }

        public AccountItemBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AccountItem build() {
            return new AccountItem(userId);
        }
    }
}
