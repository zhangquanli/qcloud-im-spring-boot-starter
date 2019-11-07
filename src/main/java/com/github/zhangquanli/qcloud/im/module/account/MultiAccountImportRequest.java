package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractRequest;

import java.util.List;

/**
 * MultiAccountImportRequest
 *
 * @author zhangquanli
 */
public class MultiAccountImportRequest extends AbstractRequest {

    /**
     * 描述：用户名，单个用户名长度不超过32字节，单次最多导入100个用户名
     * 示例：["test1","test2","test3","test4","test5"]
     * 是否必填：是
     */
    @JsonProperty("Accounts")
    private List<String> accounts;

    private MultiAccountImportRequest(List<String> accounts) {
        this.accounts = accounts;
    }

    public List<String> getAccounts() {
        return accounts;
    }

    public static MultiAccountImportRequestBuilder builder() {
        return new MultiAccountImportRequestBuilder();
    }

    public static class MultiAccountImportRequestBuilder {

        private List<String> accounts;

        private MultiAccountImportRequestBuilder() {
        }

        public MultiAccountImportRequestBuilder accounts(List<String> accounts) {
            this.accounts = accounts;
            return this;
        }

        public MultiAccountImportRequest build() {
            return new MultiAccountImportRequest(accounts);
        }
    }
}
