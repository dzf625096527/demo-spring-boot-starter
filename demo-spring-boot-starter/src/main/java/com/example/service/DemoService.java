package com.example.service;

/**
 * @author dengzhifu
 * @Description TODO
 * @Date 2021/11/29 2:44 下午
 */
public class DemoService {
    /**
     * 前缀
     */
    private final String prefix;
    /**
     * 后缀
     */
    private final String suffix;

    public DemoService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }
    public String wrap(String word) {
        return prefix + word + suffix;
    }
}
