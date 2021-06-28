package com.example.demo.controller.C_map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author XUAN
 * @date 2021/6/27 - 13:37
 */
@RestController
@ConfigurationProperties(prefix = "map")
public class MapAtConfigurationPropertiesController {

    private Map<String, String> map2;

    @RequestMapping("MapAtConfigurationProperties_Map2")
    public String author() {
        return map2.toString();
    }

    public void setMap2(Map<String, String> map2) {
        this.map2 = map2;
    }
}
