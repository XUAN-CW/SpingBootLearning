package com.example.demo.example.D_AtRequestBody.controller;

import com.example.demo.example.D_AtRequestBody.domain.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XUAN
 * @date 2021/6/29 - 12:46
 */
@RestController
public class AtRequestBodyController {

    @PostMapping("atRequestBody")
    public String atRequestBody(@RequestBody Student student){
        return "receive:"+student.toString();
    }
}
