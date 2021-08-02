#SSM整合开发
SpringMVC+Spring+MyBatis

SpringMVC：视图层，界面层，负责接收请求，显示处理结果
Spring：业务层，管理service、dao、工具类对象
MyBatis：持久层 访问数据库

- SSM整合有俩容器，一个是SpringMVC容器，管理Controller控制器对象
另一个是Spring容器，管理Service、Dao、工具类对象

- 我们要做的是把使用的对象交给合适的容器创建个、管理

- 把Controller和Web开发相关的对象交给SpringMVC容器，写在SpringMVC的配置文件中

- Service Dao定义在Spring的配置文件中  让Spring管理这些对象

- SpringMVC容器是Spring容器的子容器，类似于java中的继承 子可以访问父的内容

- 在子容器中的Controller可以访问父容器中的Service对象，就可以实现Controller使用Service对象

## 实现步骤
1. 新建maven web项目
2. 加入依赖：springmvc、spring、mybatis、jackson、mysql、druid、jsp、servlet
3. 写web.xml
```
 （1）注册DispatcherServlet，
    目的：1.创建springmvc容器对象才能创建Controller对象
         2.创建的时Servlet才能接收用户请求
 （2）注册Spring的监听器：ContextLoaderListener
    目的：创建spring容器对象
 （3）注册字符集过滤器，解决post请求乱码的问题
```
4. 创建包：controller包、service、dao、实体类
5. 写springmvc、spring、mybatis、数据库属性配置文件
6. 写代码：dao接口和mapper文件，service和实现类、controller、实体类
7. 写jsp页面
   
