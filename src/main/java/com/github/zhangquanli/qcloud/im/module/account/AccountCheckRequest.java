package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractRequest;

import java.util.List;
import java.util.stream.Collectors;

/**
 * AccountCheckRequest
 *
 * @author zhangquanli
 */
public class AccountCheckRequest extends AbstractRequest {

    /**
     * 描述：请求校验的帐号对象数组，单次请求最多支持100个帐号
     * 示例：[{"UserID":"UserID_1"}, {"UserID":"UserID_2"}]
     * 是否必填：是
     */
    @JsonProperty("CheckItem")
    private List<AccountItem> items;

    private AccountCheckRequest(List<AccountItem> items) {
        this.items = items;
    }

    public List<AccountItem> getItems() {
        return items;
    }

    public static AccountCheckRequestBuilder builder() {
        return new AccountCheckRequestBuilder();
    }

    public static class AccountCheckRequestBuilder {

        private List<String> items;

        private AccountCheckRequestBuilder() {
        }

        public AccountCheckRequestBuilder items(List<String> items) {
            this.items = items;
            return this;
        }

        public AccountCheckRequest build() {
            List<AccountItem> accountItems = items.stream()
                    .map(userId -> AccountItem.builder().userId(userId).build())
                    .collect(Collectors.toList());
            return new AccountCheckRequest(accountItems);
        }
    }
}
