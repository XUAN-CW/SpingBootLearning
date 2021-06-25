package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XUAN
 * @date 2021/6/25 - 16:52
 * @references
 * @purpose
 * @errors
 */
@RestController
public class HelloWorldController {

    @RequestMapping("HelloWorld")
    public String helloWorld() {
        return "HelloWorld";
    }

}
