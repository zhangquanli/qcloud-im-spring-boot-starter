package com.github.zhangquanli.qcloud.im.module.msg;

import com.github.zhangquanli.qcloud.im.QcloudImProperties;
import com.github.zhangquanli.qcloud.im.constants.QcloudImConstants;
import com.github.zhangquanli.qcloud.im.module.AbstractHttpClient;

/**
 * MsgServiceImpl
 *
 * @author zhangquanli
 */
public class MsgServiceImpl extends AbstractHttpClient implements MsgService {

    public MsgServiceImpl(QcloudImProperties qcloudImProperties) {
        super(qcloudImProperties);
    }

    @Override
    public SendMsgResponse sendMsg(SendMsgRequest sendMsgRequest) {
        String url = buildUrl(QcloudImConstants.SEND_MSG_URL);
        String responseJson = postParamsJson(url, sendMsgRequest);
        return convert(responseJson, SendMsgResponse.class);
    }

    @Override
    public BatchSendMsgResponse batchSendMsg(BatchSendMsgRequest batchSendMsgRequest) {
        String url = buildUrl(QcloudImConstants.BATCH_SEND_MSG_URL);
        String responseJson = postParamsJson(url, batchSendMsgRequest);
        return convert(responseJson, BatchSendMsgResponse.class);
    }

    @Override
    public ImportMsgResponse importMsg(ImportMsgRequest importMsgRequest) {
        String url = buildUrl(QcloudImConstants.IMPORT_MSG_URL);
        String responseJson = postParamsJson(url, importMsgRequest);
        return convert(responseJson, ImportMsgResponse.class);
    }
}
