---
title: 参数传递
date: 2021-06-28 21:47:44
tags: 
categories: 
id: 1624888064424781600
---



# 引言

在 spring boot web 开发中，参数的传递无疑是开发的关键。参数传递有很多方法：

- 注解：@PathVariable、@RequestHeader、@ModelAttribute、@RequestParam、@MatrixVariable、@CookieValue、@RequestBody
- Servlet API：WebRequest、ServletRequest、MultipartRequest、 HttpSession、javax.servlet.http.PushBuilder、Principal、InputStream、Reader、HttpMethod、Locale、TimeZone、ZoneId
- Model

方法太多，一一介绍实无必要，在此介绍在 spring boot 中 [@RequestParam](assets\references\RequestParam (Spring Framework 5.2.8.RELEASE API).html)  [@PathVariable](assets\references\PathVariable (Spring Framework 5.2.8.RELEASE API).html)  [@RequestHeader](assets\references\RequestHeader (Spring Framework 5.2.8.RELEASE API).html)  [@RequestBody](assets\references\RequestBody (Spring Framework 5.2.8.RELEASE API).html) 四个传递参数的方法。就目前而言，这四个方法解决了我 100% 的参数传递问题（可能是我太菜，没遇到这四个方法无法解决的参数传递问题）

# 概述

1. 在 spring boot 中使用  [@RequestParam](assets\references\RequestParam (Spring Framework 5.2.8.RELEASE API).html)  [@PathVariable](assets\references\PathVariable (Spring Framework 5.2.8.RELEASE API).html)  [@RequestHeader](assets\references\RequestHeader (Spring Framework 5.2.8.RELEASE API).html)  [@RequestBody](assets\references\RequestBody (Spring Framework 5.2.8.RELEASE API).html) 传递参数
2. 使用 swagger2 进行测试

# [demo](demo) 

1.  [AtRequestParamController.java](demo\src\main\java\com\example\demo\example\A_AtRequestParam\controller\AtRequestParamController.java) 
2.  [AtPathVariableController.java](demo\src\main\java\com\example\demo\example\B_AtPathVariable\controller\AtPathVariableController.java) 
3.  [AtRequestHeaderController.java](demo\src\main\java\com\example\demo\example\C_AtRequestHeader\AtRequestHeaderController.java) 
4.  [AtRequestBodyController.java](demo\src\main\java\com\example\demo\example\D_AtRequestBody\controller\AtRequestBodyController.java) 

# 测试

[demo](demo) 中整合了 swagger2，启动后访问 http://localhost:8080/swagger-ui.html 可见各个测试

























































