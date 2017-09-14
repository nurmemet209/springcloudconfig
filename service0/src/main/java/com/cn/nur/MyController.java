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
@RefreshScope
public class MyController {

    @Value("${message}")
    String authorName;

    @RequestMapping("hello")
    public String hello(){
        return "hello "+authorName;
    }




    @Value("numrmrm")
    String port;

    @RequestMapping("tt")
    public String home(@RequestParam String name) {

        return "hi "+name+",i am from port:" +port;
    }
}
