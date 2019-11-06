package com.github.zhangquanli.qcloud.im.module.account;

/**
 * 账号管理
 *
 * @author zhangquanli
 */
public interface AccountService {

    /**
     * 单个帐号导入
     *
     * @param accountImportRequest 请求参数
     * @return AccountImportResponse
     */
    AccountImportResponse accountImport(AccountImportRequest accountImportRequest);

    /**
     * 批量帐号导入
     *
     * @param multiAccountImportRequest 请求参数
     * @return MultiAccountImportResponse
     */
    MultiAccountImportResponse multiAccountImport(MultiAccountImportRequest multiAccountImportRequest);

    /**
     * 帐号校验
     *
     * @param kickRequest 请求参数
     * @return KickResponse
     */
    KickResponse kick(KickRequest kickRequest);

    /**
     * 帐号删除
     * <p>
     * 仅支持删除体验版帐号。
     * 帐号删除时，该用户的关系链、资料等数据也会被删除。
     * 帐号删除后，该用户的数据将无法恢复，请谨慎使用该接口。
     *
     * @param accountDeleteRequest 请求参数
     * @return AccountDeleteResponse
     */
    AccountDeleteResponse accountDelete(AccountDeleteRequest accountDeleteRequest);

    /**
     * 帐号登录态失效
     *
     * @param accountCheckRequest 请求参数
     * @return AccountCheckResponse
     */
    AccountCheckResponse accountCheck(AccountCheckRequest accountCheckRequest);
}
