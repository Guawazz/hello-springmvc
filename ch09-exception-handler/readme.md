# 异常处理
步骤
### 1.新建，maven web项目
### 2.加入依赖
### 3.新建一个自定义异常类 MyUserException，再定义它的子类NameException、AgeException
### 4.在controller中抛出NameException、AgeException
### 5.创建一个普通类，作为全局异常处理类
- 5.1在类的上面加入@ControllerAdvice
- 5.2在类中定义方法，在方法的上面加入@ExceptionHandler
### 6.创建处理异常的视图界面
### 7.创建springmvc的配置文件
- 7.1组件扫描器，扫描@Controller注解
- 7.2组件扫描器，扫描@ControllerAdvice所在的包名
- 7.3声明注解驱动

