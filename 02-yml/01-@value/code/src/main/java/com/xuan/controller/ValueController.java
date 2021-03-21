package com.xuan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValueController {

    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;

    //http://127.0.0.1:8080/value
    @RequestMapping("/value")
    @ResponseBody
    public String value(){
        //获得配置文件的信息
        return "name:"+name+",addr="+addr;
    }

}
