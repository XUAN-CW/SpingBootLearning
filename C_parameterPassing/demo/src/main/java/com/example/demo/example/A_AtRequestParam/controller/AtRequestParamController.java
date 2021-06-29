package com.example.demo.example.A_AtRequestParam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XUAN
 * @date 2021/6/29 - 13:06
 */
@RestController
public class AtRequestParamController {

    @RequestMapping("atRequestParam_default")
    public String atRequestParam(String name){
        return "receive:"+name;
    }

    @RequestMapping("atRequestParam_annotation")
    public String atRequestParam2(@RequestParam("age") Integer age){
        return "receive:"+age;
    }
}
