package com.github.zhangquanli.qcloud.im.module.account;

import com.github.zhangquanli.qcloud.im.QcloudImProperties;
import com.github.zhangquanli.qcloud.im.constants.QcloudImConstants;
import com.github.zhangquanli.qcloud.im.module.AbstractCommonService;

/**
 * AccountService
 *
 * @author zhangquanli
 */
public class AccountService extends AbstractCommonService {

    public AccountService(QcloudImProperties qcloudImProperties) {
        super(qcloudImProperties);
    }

    /**
     * 单个帐号导入
     *
     * @param accountImportRequest 请求参数
     * @return AccountImportResponse
     */
    public AccountImportResponse accountImport(AccountImportRequest accountImportRequest) {
        String url = buildUrl(QcloudImConstants.ACCOUNT_IMPORT_URL);
        String responseJson = postParamsJson(url, accountImportRequest);
        return convert(responseJson, AccountImportResponse.class);
    }

    /**
     * 批量帐号导入
     *
     * @param multiAccountImportRequest 请求参数
     * @return MultiAccountImportResponse
     */
    public MultiAccountImportResponse multiAccountImport(MultiAccountImportRequest multiAccountImportRequest) {
        String url = buildUrl(QcloudImConstants.MULTI_ACCOUNT_IMPORT_URL);
        String responseJson = postParamsJson(url, multiAccountImportRequest);
        return convert(responseJson, MultiAccountImportResponse.class);
    }

    /**
     * 帐号校验
     *
     * @param kickRequest 请求参数
     * @return KickResponse
     */
    public KickResponse kick(KickRequest kickRequest) {
        String url = buildUrl(QcloudImConstants.KICK_URL);
        String responseJson = postParamsJson(url, kickRequest);
        return convert(responseJson, KickResponse.class);
    }

    /**
     * 帐号登录态失效
     *
     * @param accountCheckRequest 请求参数
     * @return AccountCheckResponse
     */
    public AccountCheckResponse accountCheck(AccountCheckRequest accountCheckRequest) {
        String url = buildUrl(QcloudImConstants.ACCOUNT_CHECK_URL);
        String responseJson = postParamsJson(url, accountCheckRequest);
        return convert(responseJson, AccountCheckResponse.class);
    }
}
