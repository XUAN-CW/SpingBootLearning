---
title: 多环境配置
date: 2021-06-27 12:08:49
tags: 
categories: 
id: 1624766929401189800
---

# 引言

我们在开发任何应用的时候，通常同一套程序会被应用和安装到几个不同的环境，比如：开发、测试、生产等。其中每个环境的数据库地址、服务器端口等等配置都会不同，如果在为不同环境打包时都要频繁修改配置文件的话，那必将是个非常繁琐且容易发生错误的事。

对于多环境的配置，各种项目构建工具或是框架的基本思路是一致的，通过配置多份不同环境的配置文件，再通过打包命令指定需要打包的内容之后进行区分打包，Spring Boot 也不例外，或者说更加简单。

# 概述

1. 多环境配置文件名格式： `application-{profile}.properties` 
2. 激活方式：`spring.profiles.active={profile}` 

# demo

## [propertiesDemo](propertiesDemo) 

### 命名规则

在 Spring Boot 中多环境配置文件名需要满足`application-{profile}.properties`的格式，其中`{profile}`对应你的环境标识，比如：

- `application-dev.properties`：开发环境
- `application-test.properties`：测试环境
- `application-prod.properties`：生产环境

### 切换方式

至于哪个具体的配置文件会被加载，需要在`application.properties`文件中通过`spring.profiles.active`属性来设置，其值对应配置文件中的`{profile}`值。如：`spring.profiles.active=test`就会加载`application-test.properties`配置文件内容

### 测试

#### 配置

配置不同环境：

1. [application-dev.properties](propertiesDemo\src\main\resources\application-dev.properties) 

   ```properties
   server.port=8810
   ```

2. [application-prod.properties](propertiesDemo\src\main\resources\application-prod.properties) 

   ```properties
   server.port=8820
   ```

3. [application-test.properties](propertiesDemo\src\main\resources\application-test.properties) 

   ```properties
   server.port=8830
   ```


#### 激活

在 [application.properties](propertiesDemo\src\main\resources\application.properties) 激活测试环境：

```properties
spring.profiles.active=test
```

#### 启动程序

启动程序后可见启动端口为 `8830`

## [yamlDemo](yamlDemo) 

1. yaml 除了后缀名，其他与 properties 一毛一样，在此不过多赘述，看一下 [yamlDemo](yamlDemo) 即可
2. 单个 yml 中可以编写多个配置，但我个人不建议这么做，所以这里不写了，有兴趣的可以看看 [使用yaml文件实现多配置](assets\references\使用yaml文件实现多配置.html) 









