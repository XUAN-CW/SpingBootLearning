package com.xuan.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author XUAN
 * @date 2021/3/21 - 12:30
 * @references
 * @purpose
 * @errors
 */
@Controller
@ConfigurationProperties(prefix = "person")
public class ConfigurationPropertiesController {


    private String name;
    private String addr;
    private Integer age;

    // http://127.0.0.1:8080/ConfigurationProperties
    @RequestMapping("/ConfigurationProperties")
    @ResponseBody
    public String ConfigurationProperties(){
        //获得配置文件的信息
        return "name:"+name+"<hr/>addr="+addr+"<hr/>age="+age;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAddr(String addr) {
        this.addr = addr;
    }


    public void setAge(Integer age) {
        this.age = age;
    }
}
