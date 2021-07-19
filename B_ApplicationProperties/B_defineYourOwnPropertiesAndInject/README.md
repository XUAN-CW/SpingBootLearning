---
title: 自定义properties并注入
date: 2021-06-27 12:08:49
tags: 
categories: 
id: 1624766929401199800
---

# 引言

spring boot 不仅给了使用者大量默认的 properties ，而且还支持使用者自定义 properties ：

> #####  [Common Application properties](assets\references\Common Application properties.html) 
>
> you can define your own properties.

# 概述

spring boot 支持使用者在 `application.properties` 、`application.yml` 自定义 properties ，并使用  [@Value](assets\references\Value (Spring Framework 5.2.8.RELEASE API).html) 单个注入或 [@ConfigurationProperties](assets\references\ConfigurationProperties (Spring Boot 2.3.2.RELEASE API).html) 批量注入。本章重点是自定义属性及其注入

# demo

这里只讲简单参数的自定义与注入，其他的都是一样的套路，也不用记，用到的时候复制粘贴就好。

我准备了 `application.properties` 、`application.yml` 两种格式的配置，结构都是一样的， [application.properties](demo\src\main\resources\application.properties)  已注释，解开注释即可用

##  [@Value](assets\references\Value (Spring Framework 5.2.8.RELEASE API).html) 

在配置文件中定义 properties 并使用 [@Value](assets\references\Value (Spring Framework 5.2.8.RELEASE API).html) 单个注入

### 自定义

 [application.yml](demo\src\main\resources\application.yml) 

```yaml
simple:
  # A1.简单参数
  simplest: yaml
```

### 注入

 [SimpleAtValueController.java](demo\src\main\java\com\example\demo\controller\A_simple\SimpleAtValueController.java) 

```java
    @Value("${simple.simplest}")
    String simplest;
    
    @RequestMapping("SimpleAtValue_simplest")
    public String simplest(){
        return simplest;
    }
```

### 默认值

```java
    //这个地方是读取不到的，但以下面这种语法，会给它一个默认值
    @Value("${inexistence:true}")
    Boolean inexistence;
```

##  [@ConfigurationProperties](assets\references\ConfigurationProperties (Spring Boot 2.3.2.RELEASE API).html) 

在配置文件中定义 properties 并使用  [@ConfigurationProperties](assets\references\ConfigurationProperties (Spring Boot 2.3.2.RELEASE API).html) 批量注入

### 自定义

 [application.yml](demo\src\main\resources\application.yml) 

```yaml
simple:
  # A2.简单参数 - 参数引用
  reference:
    name: yaml
    description: ${simple.reference.name} is good
```

### 注入

 [SimpleAtConfigurationPropertiesController.java](demo\src\main\java\com\example\demo\controller\A_simple\SimpleAtConfigurationPropertiesController.java) 

```java
@RestController
@ConfigurationProperties(prefix = "simple.reference")
public class SimpleAtConfigurationPropertiesController {

    String name;
    String description;

    @RequestMapping("SimpleAtConfigurationProperties_reference")
    public String reference(){
        return name+"的描述："+description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
```

- `@ConfigurationProperties(prefix = "simple.reference")` 通过前缀匹配
- setter 是必须的，`@ConfigurationProperties` 通过setter 注入，你可以通过修改 setter 验证这一点

# 测试

启动工程后访问下面的链接，可见注入结果：

- http://localhost:8080/SimpleAtValue_simplest
- http://localhost:8080/SimpleAtValue_reference
- http://localhost:8080/SimpleAtValue_random
- http://localhost:8080/SimpleAtConfigurationProperties_reference
- http://localhost:8080/ListAtValue_list1
- http://localhost:8080/ListAtConfigurationProperties_list2
- http://localhost:8080/MapAtValue_map1
- http://localhost:8080/MapAtConfigurationProperties_Map2





