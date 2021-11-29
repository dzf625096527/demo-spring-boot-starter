package com.example.configuration;

import com.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dengzhifu
 * @Description TODO
 * @Date 2021/11/29 2:52 下午
 */
@Configuration
@ConditionalOnClass(DemoService.class)
@EnableConfigurationProperties(DemoServiceProperties.class)
public class DemoAutoConfigure {
    private final DemoServiceProperties properties;

    @Autowired
    public DemoAutoConfigure(DemoServiceProperties properties) {
        this.properties = properties;
    }

    /**
     * demo.service.enable = true时开启配置
     * ;
     * @return DemoService
     */
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "demo.service", value = "enable", havingValue = "true")
    DemoService demoService(){
        return new DemoService(properties.getPrefix(), properties.getSuffix());
    }
}
