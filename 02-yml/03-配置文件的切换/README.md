# 文件命名规则

> application**-profileName**.yml

- 中间的减号一定不能少！
- `profileName` 是你配置文件的名字，要靠名字选择需要激活的配置文件

# 激活方式 

```yaml
spring:
  profiles:
    active: profileName
```

# 实例

## 新建 HelloWorld 项目

1. Spring Initializr 新建项目
2.  [pom.xml](code\pom.xml)   导入 `spring-boot-starter-web`
3. 编写 [HelloController.java](code\src\main\java\com\example\demo\contorller\HelloController.java) 

## 编写配置文件

这里我们简单地使用启动的端口不同来说明配置文件的切换

 [application-dev.yml](code\src\main\resources\application-dev.yml) 

```yaml
server:
  port: 1000
```

 [application-prod.yml](code\src\main\resources\application-prod.yml) 

```yaml
server:
  port: 2000
```

 [application-test.yml](code\src\main\resources\application-test.yml) 

```yaml
server:
  port: 3000
```

## 选择需要激活的配置文件

编辑  [application.yml](code\src\main\resources\application.yml) ，三选一选择需要激活的配置文件

1. 激活 [application-dev.yml](code\src\main\resources\application-dev.yml) 

   ```yaml
   spring:
     profiles:
       active: dev
   ```

2. 激活 [application-prod.yml](code\src\main\resources\application-prod.yml) 

   ```yaml
   spring:
     profiles:
       active: prod
   ```

3. 激活 [application-test.yml](code\src\main\resources\application-test.yml) 

   ```yaml
   spring:
     profiles:
       active: test
   ```

## 效果

切换不同的配置文件，spring boot 启动的端口也随之变化



