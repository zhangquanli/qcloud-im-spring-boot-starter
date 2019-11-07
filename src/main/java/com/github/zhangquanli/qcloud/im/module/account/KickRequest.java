package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractRequest;

/**
 * KickRequest
 *
 * @author zhangquanli
 */
public class KickRequest extends AbstractRequest {

    /**
     * 描述：用户名
     * 示例：test
     * 是否必填：是
     */
    @JsonProperty("Identifier")
    private String identifier;

    private KickRequest(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public static KickRequestBuilder builder() {
        return new KickRequestBuilder();
    }

    public static class KickRequestBuilder {

        private String identifier;

        private KickRequestBuilder() {
        }

        public KickRequestBuilder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        public KickRequest build() {
            return new KickRequest(identifier);
        }
    }
}
