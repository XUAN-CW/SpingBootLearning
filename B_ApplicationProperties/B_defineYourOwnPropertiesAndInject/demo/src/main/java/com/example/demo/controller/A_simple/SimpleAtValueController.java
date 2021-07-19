package com.example.demo.controller.A_simple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author XUAN
 * @date 2021/6/27 - 13:37
 * @description
 */
@RestController
public class SimpleAtValueController {

    @Value("${simple.simplest}")
    String simplest;
    @Value("${simple.reference.description}")
    String reference;
    @Value("${simple.random.value}")
    String random;

    //这个地方是读取不到的，但以下面这种语法，会给它一个默认值
    @Value("${inexistence:true}")
    Boolean inexistence;

    @RequestMapping("SimpleAtValue_simplest")
    public String simplest(){
        return simplest;
    }

    @RequestMapping("SimpleAtValue_reference")
    public String reference(){
        return reference;
    }

    @RequestMapping("SimpleAtValue_random")
    public String random(){
        return random;
    }

    //http://localhost:8080/inexistence
    @RequestMapping("inexistence")
    public Boolean defaultValue(){
        return inexistence;
    }

}
