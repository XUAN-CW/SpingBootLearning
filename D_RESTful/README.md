---
title: RESTful
date: 2021-06-28 21:47:44
tags: 
categories: 
id: 1624888064424781600
---



# @Controller 与 Mapping

1. `@Controller`：修饰class，用来创建处理http请求的对象 
2. `@RestController`：Spring4之后加入的注解，原来在`@Controller`中返回json需要`@ResponseBody`来配合，如果直接用`@RestController`替代`@Controller`就不需要再配置`@ResponseBody`，默认返回json格式
3. `@RequestMapping`：配置url映射。现在更多的也会直接用以Http Method直接关联的映射注解来定义，比如：`GetMapping`、`PostMapping`、`DeleteMapping`、`PutMapping`等 

# RESTful API具体设计

## RESTful 风格

| 请求类型 | URL         | 功能             |
| -------- | ----------- | ---------------- |
| GET      | /users      | 查询用户         |
| POST     | /users      | 创建用户         |
| GET      | /users/{id} | 根据 id 查询用户 |
| PUT      | /users/{id} | 根据 id 更新用户 |
| DELETE   | /users/{id} | 根据 id 删除用户 |

## 一家之言


| 功能             | 传统 URL                 | RESTful URL |
| ---------------- | ------------------------ | ----------- |
| 查询用户         | /users/retrieve          | /users      |
| 创建用户         | /users/create            | /users      |
| 根据 id 查询用户 | /users/retrieveById/{id} | /users/{id} |
| 根据 id 更新用户 | /users/updateById/{id}   | /users/{id} |
| 根据 id 删除用户 | /users/deleteByid/{id}   | /users/{id} |

这个地方我也不太会说，可以看看这个： [RESTful 架构详解 _ 菜鸟教程.html](assets\references\RESTful 架构详解 _ 菜鸟教程.html) 

# [demo](demo) 

 [pom.xml](demo\pom.xml) 、 [DemoApplication.java](demo\src\main\java\com\example\demo\DemoApplication.java) 不讲，直接从关键之处开始

##  [User.java](demo\src\main\java\com\example\demo\domain\User.java) 

实体类  [User.java](demo\src\main\java\com\example\demo\domain\User.java) ，在这里也没什么特别作用，就是用来演示，换成其他实体类也可以

##  [UserController.java](demo\src\main\java\com\example\demo\controller\UserController.java) 

自己看代码吧，很简单的，不说了

# 测试

















