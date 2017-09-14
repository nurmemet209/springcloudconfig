package com.cn.nur;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nurmemet on 9/12/2017.
 */
@RestController
public class MyController {

    @Value("${message}")
    String msg;

    @RequestMapping("hello")
    public String hello(){
        return "hello "+ msg;
    }





}
