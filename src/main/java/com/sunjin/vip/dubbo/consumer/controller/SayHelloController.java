package com.sunjin.vip.dubbo.consumer.controller;

import com.sunjin.vip.dubbo.service.HelloDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: bhh
 * @Mail: sunjin@sudiyi.cn
 * @Date: 2019/11/26
 */
@RestController
public class SayHelloController {

    @Autowired
    private HelloDubboService helloDubboService;


    @GetMapping("/say")
    public String sayHello(){
        System.out.println("dubbo hello");
        return helloDubboService.sayHelloWord("dubbo");
    }
}
