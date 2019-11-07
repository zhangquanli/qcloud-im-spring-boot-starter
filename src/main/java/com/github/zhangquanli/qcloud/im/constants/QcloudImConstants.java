package com.github.zhangquanli.qcloud.im.constants;

/**
 * QcloudImConstants
 *
 * @author zhangquanli
 */
public interface QcloudImConstants {

    /**
     * 调用接口域名
     */
    String DOMAIN = "https://console.tim.qq.com";

    /**
     * 单个帐号导入接口
     */
    String ACCOUNT_IMPORT_URL = "/v4/im_open_login_svc/account_import";
    /**
     * 批量帐号导入接口
     */
    String MULTI_ACCOUNT_IMPORT_URL = "/v4/im_open_login_svc/multiaccount_import";
    /**
     * 帐号删除接口
     */
    String ACCOUNT_DELETE_URL = "/v4/im_open_login_svc/account_delete";
    /**
     * 帐号校验接口
     */
    String ACCOUNT_CHECK_URL = "/v4/im_open_login_svc/account_check";
    /**
     * 帐号登录态失效接口
     */
    String KICK_URL = "/v4/im_open_login_svc/kick";

    /**
     * 单发单聊消息
     */
    String SEND_MSG_URL = "/v4/openim/sendmsg";
    /**
     * 批量发单聊消息
     */
    String BATCH_SEND_MSG_URL = "/v4/openim/batchsendmsg";
    /**
     * 导入单聊消息
     */
    String IMPORT_MSG_URL = "/v4/openim/importmsg";
    /**
     * 撤回单聊消息
     */
    String WITHDRAW_MSG_URL = "/v4/openim/admin_msgwithdraw";

    /**
     * 获取用户在线状态
     */
    String QUERY_STATE_URL = "/v4/openim/querystate";

    /**
     * 拉取资料
     */
    String PORTRAIT_GET_URL = "/v4/profile/portrait_get";
    /**
     * 设置资料
     */
    String PORTRAIT_SET_URL = "/v4/profile/portrait_set";

    /**
     * 添加好友
     */
    String FRIEND_ADD_URL = "/v4/sns/friend_add";
    /**
     * 导入好友
     */
    String FRIEND_IMPORT_URL = "/v4/sns/friend_import";
    /**
     * 更新好友
     */
    String FRIEND_UPDATE_URL = "/v4/sns/friend_update";
    /**
     * 删除好友
     */
    String FRIEND_DELETE_URL = "/v4/sns/friend_delete";
    /**
     * 删除所有好友
     */
    String FRIEND_DELETE_ALL_URL = "/v4/sns/friend_delete_all";
    /**
     * 校验好友
     */
    String FRIEND_CHECK_URL = "/v4/sns/friend_check";
    /**
     * 拉取好友
     */
    String FRIEND_GET_ALL_URL = "/v4/sns/friend_get_all";
    /**
     * 拉取指定好友
     */
    String FRIEND_GET_LIST_URL = "/v4/sns/friend_get_list";

    /**
     * 添加黑名单
     */
    String BLACK_LIST_ADD_URL = "/v4/sns/black_list_add";
    /**
     * 删除黑名单
     */
    String BLACK_LIST_DELETE_URL = "/v4/sns/black_list_delete";
    /**
     * 拉取黑名单
     */
    String BLACK_LIST_GET_URL = "/v4/sns/black_list_get";
    /**
     * 校验黑名单
     */
    String BLACK_LIST_CHECK_URL = "/v4/sns/black_list_check";

    /**
     * 添加分组
     */
    String GROUP_ADD_URL = "/v4/sns/group_add";
    /**
     * 删除分组
     */
    String GROUP_DELETE_URL = "/v4/sns/group_delete";

    /**
     * 获取App中的所有群组
     */
    String GET_APPID_GROUP_LIST = "/v4/group_open_http_svc/get_appid_group_list";
    /**
     * 创建群组
     */
    String CREATE_GROUP = "/v4/group_open_http_svc/create_group";
    /**
     * 获取群组详细资料
     */
    String GET_GROUP_INFO = "/v4/group_open_http_svc/get_group_info";
    /**
     * 获取群组成员详细资料
     */
    String GET_GROUP_MEMBER_INFO = "/v4/group_open_http_svc/get_group_member_info";
    /**
     * 修改群组基础资料
     */
    String MODIFY_GROUP_BASE_INFO = "/v4/group_open_http_svc/modify_group_base_info";
    /**
     * 增加群组成员
     */
    String ADD_GROUP_MEMBER = "/v4/group_open_http_svc/add_group_member";
    /**
     * 删除群组成员
     */
    String DELETE_GROUP_MEMBER = "/v4/group_open_http_svc/delete_group_member";
    /**
     * 修改群成员资料
     */
    String MODIFY_GROUP_MEMBER_INFO = "/v4/group_open_http_svc/modify_group_member_info";
    /**
     * 解散群组
     */
    String DESTROY_GROUP = "/v4/group_open_http_svc/destroy_group";
    /**
     * 获取用户所加入的群组
     */
    String GET_JOINED_GROUP_LIST = "/v4/group_open_http_svc/get_joined_group_list";
    /**
     * 查询用户在群组中的身份
     */
    String GET_ROLE_IN_GROUP = "/v4/group_open_http_svc/get_role_in_group";
    /**
     * 批量禁言和取消禁言
     */
    String FORBID_SEND_MSG = "/v4/group_open_http_svc/forbid_send_msg";
    /**
     * 获取群组被禁言用户列表
     */
    String GET_GROUP_SHUTTED_UIN = "/v4/group_open_http_svc/get_group_shutted_uin";
    /**
     * 在群组中发送普通消息
     */
    String SEND_GROUP_MSG = "/v4/group_open_http_svc/send_group_msg";
    /**
     * 在群组中发送系统通知
     */
    String SEND_GROUP_SYSTEM_NOTIFICATION = "/v4/group_open_http_svc/send_group_system_notification";
    /**
     * 群组消息撤回
     */
    String GROUP_MSG_RECALL = "/v4/group_open_http_svc/group_msg_recall";
    /**
     * 转让群组
     */
    String CHANGE_GROUP_OWNER = "/v4/group_open_http_svc/change_group_owner";
    /**
     * 导入群基础资料
     */
    String IMPORT_GROUP = "/v4/group_open_http_svc/import_group";
    /**
     * 导入群消息
     */
    String IMPORT_GROUP_MSG = "/v4/group_open_http_svc/import_group_msg";
    /**
     * 导入群成员
     */
    String IMPORT_GROUP_MEMBER = "/v4/group_open_http_svc/import_group_member";
    /**
     * 设置成员未读消息计数
     */
    String SET_UNREAD_MSG_NUM = "/v4/group_open_http_svc/set_unread_msg_num";
    /**
     * 删除指定用户发送的消息
     */
    String DELETE_GROUP_MSG_BY_SENDER = "/v4/group_open_http_svc/delete_group_msg_by_sender";
    /**
     * 拉取群漫游消息
     */
    String GROUP_MSG_GET_SIMPLE = "/v4/group_open_http_svc/group_msg_get_simple";

    /**
     * 查询 App 自定义脏字
     */
    String GET_DIRTY_WORDS = "/v4/openim_dirty_words/get";
    /**
     * 添加 App 自定义脏字
     */
    String ADD_DIRTY_WORDS = "/v4/openim_dirty_words/add";
    /**
     * 删除 App 自定义脏字
     */
    String DELETE_DIRTY_WORDS = "/v4/openim_dirty_words/delete";

    /**
     * 设置全局禁言
     */
    String SET_NO_SPEAKING = "/v4/openconfigsvr/setnospeaking";
    /**
     * 查询全局禁言
     */
    String GET_NO_SPEAKING = "/v4/openconfigsvr/getnospeaking";

    /**
     * 拉取运营数据
     */
    String GET_APP_INFO = "/v4/openconfigsvr/getappinfo";
    /**
     * 下载消息记录
     */
    String GET_HISTORY = "/v4/open_msg_svc/get_history";
}
