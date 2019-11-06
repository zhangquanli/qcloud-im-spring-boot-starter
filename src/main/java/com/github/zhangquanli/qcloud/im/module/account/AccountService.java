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
     * 帐号校验
     * <p>
     * 支持批量帐号校验，用于校验自有帐号是否已导入即时通信 IM。
     *
     * @param accountCheckRequest 请求参数
     * @return AccountCheckResponse
     */
    AccountCheckResponse accountCheck(AccountCheckRequest accountCheckRequest);

    /**
     * 帐号登录态失效
     * <p>
     * 本接口适用于将 App 用户帐号的登录态（如 UserSig）失效。
     * 例如，开发者判断一个用户为恶意帐号后，可以调用本接口将该用户当前的登录态失效，这样用户使用历史 UserSig 登录即时通信 IM 会失败。
     *
     * @param kickRequest 请求参数
     * @return KickResponse
     */
    KickResponse kick(KickRequest kickRequest);
}
