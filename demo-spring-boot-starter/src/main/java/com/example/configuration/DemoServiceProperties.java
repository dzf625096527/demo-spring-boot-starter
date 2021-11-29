package com.example.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author dengzhifu
 * @Description 加载Properties
 * @Date 2021/11/29 2:46 下午
 */
@ConfigurationProperties(prefix = "demo.service")
public class DemoServiceProperties {
    /**
     * 前缀
     */
    private String prefix;
    /**
     * 后缀
     */
    private String suffix;


    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
