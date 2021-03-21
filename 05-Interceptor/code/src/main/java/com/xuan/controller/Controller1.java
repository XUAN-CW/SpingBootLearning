package com.xuan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XUAN
 * @date 2021/3/21 - 15:49
 * @references
 * @purpose
 * @errors
 */
@RestController
public class Controller1 {

    //http://127.0.0.1:8080/1/Controller1
    @GetMapping("/1/Controller1")
    public String c1(){
        return "1";
    }

}
