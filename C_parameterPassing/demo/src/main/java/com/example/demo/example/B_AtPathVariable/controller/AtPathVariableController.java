package com.example.demo.example.B_AtPathVariable.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XUAN
 * @date 2021/6/28 - 22:27
 */
@RestController
public class AtPathVariableController {

    /**
     * 测试 {@code @PathVariable}.
     * <p>
     * 注意：在本例中，{@code @GetMapping("half/{number}")} 中的 {@code number}
     * 需要和 {@code @PathVariable("number")} 中的 {@code number} 保持一致，
     * {@code @GetMapping} 与 {@code @PathVariable} 根据名字映射，名字不对，访问失败.
     *
     * @param number
     * @return java.lang.Integer
     */
    @RequestMapping("atPathVariable/{number}")
    public String atPathVariable(@PathVariable("number")Integer number){
        return "receive:"+number;
    }

    /**
     *
     * @param number1 被除数
     * @param number2 除数
     * @return 商
     */
    @RequestMapping("atPathVariable_multiParameter/{number1}/{number2}")
    public String AtPathVariable(@PathVariable("number1")Integer number1,@PathVariable("number2")Integer number2){
        return "receive:"+number1+"、"+number2;
    }

}
