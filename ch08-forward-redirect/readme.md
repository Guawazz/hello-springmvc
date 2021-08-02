# 请求转发和重定向
## 请求转发
```
处理器方法返回ModelAndView时。在setViewName指定的视图前添加forward，
这样即可忽略视图解析器，启用请求转发，视图路径要求必须是相对于项目根的完整路径
```
## 请求重定向
```
处理器方法返回ModelAndView，实现重定向redirect
 语法：setViewName("redirect:视图文件完整路径")
      redirect特点：自动忽略视图解析器的作用
     
      框架会把Model中的简单类型的数据，转为String，转为第二次请求的参数
      在第二次请求的页面中可以用${param.myname}和${param.myage}来获取数据

```