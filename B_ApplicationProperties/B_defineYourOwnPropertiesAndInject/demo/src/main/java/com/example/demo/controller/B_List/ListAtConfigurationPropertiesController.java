package com.example.demo.controller.B_List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author XUAN
 * @date 2021/6/27 - 13:37
 */
@RestController
@ConfigurationProperties(prefix = "list")
public class ListAtConfigurationPropertiesController {

    private List<Integer> list2;

    @RequestMapping("ListAtConfigurationProperties_list2")
    public String author() {
        return "list2:"+list2.toString();
    }

    public void setList2(List<Integer> list2) {
        this.list2 = list2;
    }
}
