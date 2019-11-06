package com.github.zhangquanli.qcloud.im;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * QcloudImAutoConfiguration
 *
 * @author zhangquanli
 */
@Configuration
@EnableConfigurationProperties(QcloudImProperties.class)
@ConditionalOnProperty(prefix = "qcloud.im", name = {"sdk-app-id", "private-key-path", "admin-identifier", "tls-sig"})
public class QcloudImAutoConfiguration {

    private QcloudImProperties qcloudImProperties;

    public QcloudImAutoConfiguration(QcloudImProperties qcloudImProperties) {
        this.qcloudImProperties = qcloudImProperties;
    }

    @Bean
    public QcloudIm qcloudIm() {
        return new QcloudImImpl(qcloudImProperties);
    }
}
