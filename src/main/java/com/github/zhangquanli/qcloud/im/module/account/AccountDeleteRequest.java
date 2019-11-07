package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractRequest;

import java.util.List;
import java.util.stream.Collectors;

/**
 * AccountDeleteRequest
 *
 * @author zhangquanli
 */
public class AccountDeleteRequest extends AbstractRequest {

    /**
     * 描述：请求删除的帐号对象数组，单次请求最多支持100个帐号
     * 示例：[{"UserID":"UserID_1"}, {"UserID":"UserID_2"}]
     * 是否必填：是
     */
    @JsonProperty("DeleteItem")
    private List<AccountItem> items;

    private AccountDeleteRequest(List<AccountItem> items) {
        this.items = items;
    }

    public List<AccountItem> getItems() {
        return items;
    }

    public static AccountDeleteRequestBuilder builder() {
        return new AccountDeleteRequestBuilder();
    }

    public static class AccountDeleteRequestBuilder {

        private List<String> items;

        private AccountDeleteRequestBuilder() {
        }

        public AccountDeleteRequestBuilder items(List<String> items) {
            this.items = items;
            return this;
        }

        public AccountDeleteRequest build() {
            List<AccountItem> accountItems = items.stream()
                    .map(userId -> AccountItem.builder().userId(userId).build())
                    .collect(Collectors.toList());
            return new AccountDeleteRequest(accountItems);
        }
    }
}
