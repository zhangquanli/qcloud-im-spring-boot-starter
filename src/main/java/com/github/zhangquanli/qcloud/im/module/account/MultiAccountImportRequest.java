package com.github.zhangquanli.qcloud.im.module.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.qcloud.im.module.AbstractCommonRequest;
import lombok.*;

import java.util.List;

/**
 * MultiAccountImportRequest
 *
 * @author zhangquanli
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiAccountImportRequest extends AbstractCommonRequest {

    /**
     * 描述：用户名，单个用户名长度不超过32字节，单次最多导入100个用户名
     * 示例：["test1","test2","test3","test4","test5"]
     * 是否必填：是
     */
    @JsonProperty("Accounts")
    private List<String> accounts;
}
