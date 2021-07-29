# 用户在页面发起一个请求，请求交给springMVC的控制器对象，并显示请求的处理结果
## 实现步骤：
### 1.新建web maven工程
### 2.加入依赖
- spring-webmvc依赖（间接的把spring的依赖都加入到项目中了）
- jsp的依赖
- servlet依赖
### 3.「重点」在web.xml中注册springmvc框架的核心对象DispatcherServlet
- DispatcherServlet叫做中央调度器，是一个servlet，它继承HttpServlet
- DispatcherServlet负责接收用户提交的请求，调用其他的控制器对象，并把请求的处理结果返回给用户
### 4.创建一个发起请求的页面index.jsp
### 5.创建控制器类
- 在类的上面加入@Controller注解，创建对象，并放入到springMVC容器中
- 在类中的方法上面加入@RequestMapping注解
### 6.创建一个作为结果的jsp，显示请求的处理结果
### 7.创建springMVC的配置文件(与spring的一样)
- 声明组件扫描器，指定@Controller注解所在的包名
- 声明视图解析器，帮助处理视图的。


