package com.example.demo.controller.B_List;

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
public class ListAtValueController {

    //数组
    @Value("#{'${list.list1}'.split(',')}")
    private List<Integer> list1;

    @RequestMapping("ListAtValue_list1")
    public List<Integer> list() {
        return list1;
    }



}
