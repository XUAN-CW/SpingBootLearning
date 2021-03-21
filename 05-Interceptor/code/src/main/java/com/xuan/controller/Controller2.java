package com.xuan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XUAN
 * @date 2021/3/21 - 15:50
 * @references
 * @purpose
 * @errors
 */
@RestController
public class Controller2 {

    //http://127.0.0.1:8080/2/Controller2
    @GetMapping("/2/Controller2")
    public String c1(){
        return "2";
    }
}
