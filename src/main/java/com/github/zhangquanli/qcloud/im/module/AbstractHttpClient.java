package com.github.zhangquanli.qcloud.im.module;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.zhangquanli.qcloud.im.QcloudImProperties;
import com.github.zhangquanli.qcloud.im.constants.QcloudImConstants;
import com.github.zhangquanli.qcloud.im.constants.TlsSig;
import com.github.zhangquanli.qcloud.im.module.user_sig.TlsSigStrategy;
import com.github.zhangquanli.qcloud.im.module.user_sig.UserSig;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Random;

/**
 * AbstractHttpClient
 *
 * @author zhangquanli
 */
public abstract class AbstractHttpClient {
    private static final Logger log = LoggerFactory.getLogger(AbstractHttpClient.class);
    private Long sdkAppId;
    private String privateKey;
    private String adminIdentifier;
    private TlsSig tlsSig;
    private Long expire;
    private ObjectMapper objectMapper;
    private OkHttpClient okHttpClient;

    protected AbstractHttpClient(QcloudImProperties qcloudImProperties) {
        this.sdkAppId = qcloudImProperties.getSdkAppId();
        try {
            // 读取密钥文件
            String privateKeyPath = qcloudImProperties.getPrivateKeyPath();
            StringBuilder stringBuilder = new StringBuilder();
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(privateKeyPath);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                stringBuilder.append(temp).append(System.lineSeparator());
            }
            bufferedReader.close();
            // 获取密钥
            this.privateKey = stringBuilder.toString();
        } catch (IOException e) {
            String msg = "【腾讯云】>>>【即时通信】>>>读取密钥失败";
            log.error(msg, e);
            throw new RuntimeException(msg);
        }
        this.adminIdentifier = qcloudImProperties.getAdminIdentifier();
        this.tlsSig = qcloudImProperties.getTlsSig();
        this.expire = qcloudImProperties.getExpire();
        this.objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.okHttpClient = new OkHttpClient();
    }

    protected String buildUrl(String api) {
        return QcloudImConstants.DOMAIN + api +
                "?sdkappid=" + sdkAppId +
                "&identifier=" + adminIdentifier +
                "&usersig=" + generateUserSig(adminIdentifier) +
                "&random=" + random() +
                "&contenttype=" + contentType();
    }

    protected String postParamsJson(String url) {
        // 构建请求
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json;charset=utf-8"), "{}");
        Request request = new Request.Builder().url(url).post(requestBody).build();
        // 获取响应
        return post(request);
    }

    protected String postParamsJson(String url, AbstractRequest abstractRequest) {
        try {
            // 构建请求数据
            String requestJson = objectMapper.writeValueAsString(abstractRequest);
            RequestBody requestBody = RequestBody.create(MediaType.parse("application/json;charset=utf-8"), requestJson);
            Request request = new Request.Builder().url(url).post(requestBody).build();
            if (log.isDebugEnabled()) {
                log.debug("【腾讯云】>>>【即时通信】>>>请求地址：{}>>>请求数据：{}", url, requestJson);
            }
            // 获取响应数据
            return post(request);
        } catch (JsonProcessingException e) {
            String msg = "【腾讯云】>>>【即时通信】>>>请求数据异常";
            log.error(msg, e);
            throw new RuntimeException(msg);
        }
    }

    private String post(Request request) {
        try (Response response = okHttpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                String msg = "【腾讯云】>>>【即时通信】>>>响应状态异常";
                RuntimeException e = new RuntimeException(msg);
                log.error(msg, e);
                throw e;
            }
            ResponseBody responseBody = response.body();
            if (responseBody == null) {
                String msg = "【腾讯云】>>>【即时通信】>>>响应数据为空";
                RuntimeException e = new RuntimeException(msg);
                log.error(msg, e);
                throw e;
            }
            String responseJson = responseBody.string();
            if (log.isDebugEnabled()) {
                log.debug("【腾讯云】>>>【即时通信】>>>响应数据：{}", responseJson);
            }
            return responseJson;
        } catch (IOException e) {
            String msg = "【腾讯云】>>>【即时通信】>>>网络请求异常";
            log.error(msg, e);
            throw new RuntimeException(msg);
        }
    }

    protected <T extends AbstractResponse> T convert(String json, Class<T> targetClass) {
        try {
            return objectMapper.readValue(json, targetClass);
        } catch (JsonProcessingException e) {
            String msg = "【腾讯云】>>>【即时通信】>>>响应数据异常";
            log.error(msg, e);
            throw new RuntimeException(msg);
        }
    }

    protected String generateUserSig(String identifier) {
        try {
            TlsSigStrategy tlsSigStrategy = tlsSig.getStrategy().newInstance();
            UserSig userSig = new UserSig(tlsSigStrategy);
            return userSig.generate(sdkAppId, privateKey, expire, identifier);
        } catch (IllegalAccessException | InstantiationException e) {
            String msg = "【腾讯云】>>>【即时通信】>>>签名生成异常";
            log.error(msg, e);
            throw new RuntimeException(msg);
        }
    }

    private long random() {
        Random random = new Random(System.currentTimeMillis() / 1000);
        return random.nextInt(900000) + 100000;
    }

    private String contentType() {
        return "json";
    }
}
