---
title: 约定大于配置
date: 2021-06-26 21:45:03
tags: 
categories: 
id: 1624715103924175700
---

# 引言

## Convention Over Configuration

spring boot 采用  [约定大于配置 (Convention Over Configuration)](assets\references\Convention Over Configuration.html) 思想 ，针对我们常用的开发场景提供了一系列自动化配置来减少原本复杂而又几乎很少改动的模板化配置内容，给使用者提供了大量的默认配置：

> ###### [Introducing spring boot](assets\references\Getting Started.html)  
>
> We take an opinionated view of the Spring platform and third-party libraries, so that you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration.

这些默认配置的具体情况可见于 [Application Properties](assets\references\Common Application properties.html) 

## properties specified

spring boot 的默认配置满足了我们大部分的需求，但我们的一些定制化需求仍无法满足，我们还是需要去了解如何在 spring boot 中修改这些自动化的配置内容，以应对一些特殊的场景需求。比如：我们在同一台主机上需要启动多个基于 spring boot 的 web 应用，若我们不为每个应用指定特别的端口号，那么默认的 8080 端口必将导致冲突。那么，这些配置在哪里修改呢？spring boot 给出了答案：

> ######  [Common Application properties](assets\references\Common Application properties.html) 
>
> Various properties can be specified inside your `application.properties` file, inside your
> `application.yml` file.

你在 `application.properties` 或 `application.yml` 指定了 **properties** ，那么 spring boot 中相应的默认配置就会被你的配置覆盖。比如：你指定 pring boot 启动端口 `server.port` 为 `8081` ，那么 spring boot 启动端口就是你指定的 `8081` ，而不是默认的 `8080` 

# 概述

修改配置文件 `application.properties` 或 `application.yml` 覆盖默认配置，满足定制化需求。这里以修改默认启动端口 `8080` 为例

# [demo](demo) 

此项目基于前面的 HelloWorld 项目， [pom.xml](demo\pom.xml) 、 [DemoApplication.java](demo\src\main\java\com\example\demo\DemoApplication.java) 、 [HelloWorldController.java](demo\src\main\java\com\example\demo\controller\HelloWorldController.java) 不再赘述，直接从关键的配置文件说起

##  [application.properties](demo\src\main\resources\application.properties) 

### 语法

**.properties** 的语法就是简单的 `key=value` ：

```properties
#map 第一种方式
data.person.name=zhangsan
data.person.sex=man
#map 第二种方式
data.person[name]=zhangsan
data.person[sex]=man

#list 第一种方式
data.list[0]=apple0
data.list[1]=apple1
data.list[2]=apple2
#list 第二种方式
data.list=apple0,apple1,apple2
```

值得注意的是，**=** 两边不能有空格！！！如果你的配置一直不能达到预期的效果，请仔细检查每一个字符，尤其是 **=** 两边。如果你想逐字符检查文件，你可以使用 [wxMEdit](assets\references\wxMEdit.html) 来查看，如果你的操作系统是 Linux ，你可以使用命令  [od](assets\references\鸟哥的 Linux 私房菜 -- 文件与目录管理.html) 来逐字符查看文件，比如 `od -c application.properties` 

### 配置

在  [Server properties](assets/references/Server properties.html) 中，可见 Key `server.port`  Default Value 为 `8080.0`，这就是 spring boot 的默认启动端口。现在，我们在 [application.properties](demo\src\main\resources\application.properties) 中将其修改为 `8081` ：

```properties
server.port=8081
```

### 测试

1. 到 [DemoApplication.java](demo\src\main\java\com\example\demo\DemoApplication.java) 中启动 spring boot 项目
2. 访问 http://localhost:8080/HelloWorld 
3. 访问 http://localhost:8081/HelloWorld 

测试结果显示： http://localhost:8080/HelloWorld 访问失败，而 http://localhost:8081/HelloWorld 则在页面显示了 **HelloWorld** 。以上结果说明 spring boot 默认启动端口已被修改

##  [application.yml](demo\src\main\resources\application.yml) 

### 语法

 [YAML 入门教程 _ 菜鸟教程.html](assets\references\YAML 入门教程 _ 菜鸟教程.html) 

### 配置

在  [application.yml](demo\src\main\resources\application.yml)  中将启动端口修改为 `8082` ：

```yaml
server:
  port: 8082
```

### 测试

测试前记得删除或注释  [application.properties](demo\src\main\resources\application.properties) 中的 `server.port` ，因为 [application.properties](demo\src\main\resources\application.properties) 的优先级比  [application.yml](demo\src\main\resources\application.yml) 高， [application.properties](demo\src\main\resources\application.properties) 中已有的 properties 会覆盖 [application.yml](demo\src\main\resources\application.yml) 中的 properties 

1. 到 [DemoApplication.java](demo\src\main\java\com\example\demo\DemoApplication.java) 中启动 spring boot 项目
2. 访问 http://localhost:8082/HelloWorld 

测试结果显示： http://localhost:8080/HelloWorld 访问失败，而 http://localhost:8082/HelloWorld 则在页面显示了 **HelloWorld** 。以上结果说明 spring boot 默认启动端口已被修改










