package com.wakedata.wk.member.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * 统一配置中心数据
 *
 * @author liaofei
 * @date 2020/3/4
 */
@RefreshScope
@Component
@Getter
@Setter
public class MemberConfig {

    /**
     * 配置示例
     */
    @Value("${member.config.test:}")
    private String memberConfigTest;
}
