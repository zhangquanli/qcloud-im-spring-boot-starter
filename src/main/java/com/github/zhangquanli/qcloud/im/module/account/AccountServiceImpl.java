package com.github.zhangquanli.qcloud.im.module.account;

import com.github.zhangquanli.qcloud.im.QcloudImProperties;
import com.github.zhangquanli.qcloud.im.constants.QcloudImConstants;
import com.github.zhangquanli.qcloud.im.module.AbstractHttpClient;

/**
 * AccountServiceImpl
 *
 * @author zhangquanli
 */
public class AccountServiceImpl extends AbstractHttpClient implements AccountService {

    public AccountServiceImpl(QcloudImProperties qcloudImProperties) {
        super(qcloudImProperties);
    }

    public AccountImportResponse accountImport(AccountImportRequest accountImportRequest) {
        String url = buildUrl(QcloudImConstants.ACCOUNT_IMPORT_URL);
        String responseJson = postParamsJson(url, accountImportRequest);
        return convert(responseJson, AccountImportResponse.class);
    }

    public MultiAccountImportResponse multiAccountImport(MultiAccountImportRequest multiAccountImportRequest) {
        String url = buildUrl(QcloudImConstants.MULTI_ACCOUNT_IMPORT_URL);
        String responseJson = postParamsJson(url, multiAccountImportRequest);
        return convert(responseJson, MultiAccountImportResponse.class);
    }

    public KickResponse kick(KickRequest kickRequest) {
        String url = buildUrl(QcloudImConstants.KICK_URL);
        String responseJson = postParamsJson(url, kickRequest);
        return convert(responseJson, KickResponse.class);
    }

    public AccountDeleteResponse accountDelete(AccountDeleteRequest accountDeleteRequest) {
        String url = buildUrl(QcloudImConstants.ACCOUNT_DELETE_URL);
        String responseJson = postParamsJson(url, accountDeleteRequest);
        return convert(responseJson, AccountDeleteResponse.class);
    }

    public AccountCheckResponse accountCheck(AccountCheckRequest accountCheckRequest) {
        String url = buildUrl(QcloudImConstants.ACCOUNT_CHECK_URL);
        String responseJson = postParamsJson(url, accountCheckRequest);
        return convert(responseJson, AccountCheckResponse.class);
    }
}
