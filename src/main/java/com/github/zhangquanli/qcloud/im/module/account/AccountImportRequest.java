package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractRequest;

/**
 * AccountImportRequest
 *
 * @author zhangquanli
 */
public class AccountImportRequest extends AbstractRequest {

    /**
     * 描述：用户名，长度不超过32字节
     * 示例：test
     * 是否必填：是
     */
    @JsonProperty("Identifier")
    private String identifier;
    /**
     * 描述：用户昵称
     * 示例：test
     * 是否必填：否
     */
    @JsonProperty("Nick")
    private String nick;
    /**
     * 描述：用户头像URL
     * 示例：http://www.qq.com
     * 是否必填：否
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;
    /**
     * 描述：帐号类型，开发者默认无需填写，0表示普通帐号，1表示机器人帐号
     * 示例：0
     * 是否必填：否
     */
    @JsonProperty("Type")
    private Integer type;

    private AccountImportRequest(String identifier, String nick, String faceUrl, Integer type) {
        this.identifier = identifier;
        this.nick = nick;
        this.faceUrl = faceUrl;
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getNick() {
        return nick;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public Integer getType() {
        return type;
    }

    public static AccountImportRequestBuilder builder() {
        return new AccountImportRequestBuilder();
    }

    public static class AccountImportRequestBuilder {

        private String identifier;
        private String nick;
        private String faceUrl;
        private Integer type;

        private AccountImportRequestBuilder() {
        }

        public AccountImportRequestBuilder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        public AccountImportRequestBuilder nick(String nick) {
            this.nick = nick;
            return this;
        }

        public AccountImportRequestBuilder faceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }

        public AccountImportRequestBuilder type(Integer type) {
            this.type = type;
            return this;
        }

        public AccountImportRequest build() {
            return new AccountImportRequest(identifier, nick, faceUrl, type);
        }
    }
}
