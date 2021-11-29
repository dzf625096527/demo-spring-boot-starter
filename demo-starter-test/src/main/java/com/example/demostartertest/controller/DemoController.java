package com.example.demostartertest.controller;

import com.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dengzhifu
 * @Description TODO
 * @Date 2021/11/29 5:04 下午
 */
@RestController
public class DemoController {
    @Autowired
    DemoService demoService;

    @GetMapping("testStarter")
    public String testStarter(String str){
        String wrap = demoService.wrap(str);
        return wrap;
    }

}
