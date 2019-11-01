package com.github.zhangquanli.qcloud.im.module.msg;

import com.github.zhangquanli.qcloud.im.QcloudImProperties;
import com.github.zhangquanli.qcloud.im.constants.QcloudImConstants;
import com.github.zhangquanli.qcloud.im.module.AbstractCommonService;
import com.github.zhangquanli.qcloud.im.module.msg.element.TextMsgContent;
import com.github.zhangquanli.qcloud.im.module.msg.element.TextMsgElement;

/**
 * MsgService
 *
 * @author zhangquanli
 */
public class MsgService extends AbstractCommonService {

    public MsgService(QcloudImProperties qcloudImProperties) {
        super(qcloudImProperties);
    }

    /**
     * 单发单聊消息
     * <p>
     * 管理员向帐号发消息，接收方看到消息发送者是管理员。
     * 管理员指定某一帐号向其他帐号发消息，接收方看到发送者不是管理员，而是管理员指定的帐号。
     * 该接口不会检查发送者和接收者的好友关系（包括黑名单），同时不会检查接收者是否被禁言。
     * <p>
     * 使用服务端集成 REST API 发送单聊消息时，存在是否将消息同步至发送方（管理员帐号或者由管理员指定的某帐号）问题，
     * 同步方式包括在线终端和漫游，REST API 提供 SyncOtherMachine 参数用于说明是否进行同步。
     *
     * @param sendMsgRequest 请求参数
     * @return SendMsgResponse
     */
    public SendMsgResponse sendMsg(SendMsgRequest sendMsgRequest) {
        String url = buildUrl(QcloudImConstants.SEND_MSG_URL);
        String responseJson = postParamsJson(url, sendMsgRequest);
        return convert(responseJson, SendMsgResponse.class);
    }

    /**
     * 批量发单聊消息
     * <p>
     * 支持一次对最多500个用户进行单发消息。
     * 与单发消息相比，该接口更适用于营销类消息、系统通知 tips 等时效性较强的消息。
     * 管理员指定某一帐号向目标帐号批量发消息，接收方看到发送者不是管理员，而是管理员指定的帐号。
     * 该接口不触发回调请求。
     * 该接口不会检查发送者和接收者的好友关系（包括黑名单），同时不会检查接收者是否被禁言
     * <p>
     * 当使用服务端集成 REST API 发送批量消息时，存在是否将消息同步至发送方（管理员帐号或者由管理员指定的某帐号）问题，
     * 同步方式包括在线终端和漫游，REST API 提供 SyncOtherMachine 参数用于说明是否进行同步。
     *
     * @param batchSendMsgRequest 请求参数
     * @return BatchSendMsgResponse
     */
    public BatchSendMsgResponse batchSendMsg(BatchSendMsgRequest batchSendMsgRequest) {
        String url = buildUrl(QcloudImConstants.BATCH_SEND_MSG_URL);
        String responseJson = postParamsJson(url, batchSendMsgRequest);
        return convert(responseJson, BatchSendMsgResponse.class);
    }

    {
        TextMsgElement build = TextMsgElement.builder()
                .msgContent(TextMsgContent.builder().text("123123").build())
                .build();
    }

    /**
     * 导入单聊消息
     * <p>
     * 导入历史单聊消息到即时通信 IM。
     * 平滑过渡期间，将原有即时通信实时单聊消息导入到即时通信 IM。
     * 该接口不会触发回调。
     *
     * @param importMsgRequest 请求参数
     * @return ImportMsgResponse
     */
    public ImportMsgResponse importMsg(ImportMsgRequest importMsgRequest) {
        String url = buildUrl(QcloudImConstants.IMPORT_MSG_URL);
        String responseJson = postParamsJson(url, importMsgRequest);
        return convert(responseJson, ImportMsgResponse.class);
    }
}
