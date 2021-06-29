package com.example.demo.example.C_AtRequestHeader;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XUAN
 * @date 2021/6/29 - 12:25
 */
@RestController
public class AtRequestHeaderController {

    //http://localhost:8080/atRequestHeader
    @RequestMapping("atRequestHeader")
    public String atRequestHeader(@RequestHeader("User-Agent")String agent){
        return "你的User-Agent是："+agent;
    }
}
