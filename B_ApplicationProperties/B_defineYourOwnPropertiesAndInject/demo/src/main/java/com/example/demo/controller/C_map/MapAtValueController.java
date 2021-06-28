package com.example.demo.controller.C_map;

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
public class MapAtValueController {

    //map
    @Value("#{${map.map1}}")
    private Map<String, String> map1;

    @RequestMapping("MapAtValue_map1")
    public Map<String, String> map() {
        return map1;
    }


}
