package com.example.demo.controller.A_simple;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XUAN
 * @date 2021/6/28 - 1:13
 * @description
 */

@RestController
@ConfigurationProperties(prefix = "simple.reference")
public class SimpleAtConfigurationPropertiesController {

    String name;
    String description;

    @RequestMapping("SimpleAtConfigurationProperties_reference")
    public String reference(){
        return name+"的描述："+description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
