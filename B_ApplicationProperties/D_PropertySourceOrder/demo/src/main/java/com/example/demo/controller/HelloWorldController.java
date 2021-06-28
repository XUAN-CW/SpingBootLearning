package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XUAN
 * @date 2021/6/25 - 16:52
 */
@RestController
public class HelloWorldController {

    @RequestMapping("HelloWorld")
    public String helloWorld() {
        return "HelloWorld";
    }

}
