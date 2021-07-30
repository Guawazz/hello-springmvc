# ch04 处理器方法的返回值表示请求的处理结果
## 1. ModelAndView
    有数据和视图，对视图执行forward
## 2. String
    表示视图，可以使逻辑名称也可以是完整视图路径
## 3. void
    不能表示数据 也不能表示视图
    在处理ajax的时候可以使用void返回值。通过HttpServletResponse输出数据，相应ajax请求
    ajax请求 服务器返回的就是数据 和视图无关
## 4. Object
    对象有属性，属性就是数据，所以返回对象表示数据，和视图无关
    可以使用对象表示的数据响应ajax请求
    现在做ajax主要使用的是json的数据格式。实现步骤：
    1.加入json的工具库的依赖，springmvc默认使用的是jackson
    2.将java对象转为json，只需在springmvc配置文件中加入<mvc:annotation-driven>
        这一步干的事这个事： json  = om.writeValueAsString(student);
        底层用的HttpMessageConverter这个接口和其众多实现类，可以将Java对象转为各种数据格式
        
       在 <mvc:annotation-driven>标签加入配置文件后，springmvc会创建其7个实现类对象，
        其中包括：
        StringHttpMessageConverter  
        MappingJackson2HttpMessageConverter  java对象-->json




    3.响应ajax请求，在处理器方法上面加@ResponseBody注解
        这一步干的是这个事：
        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.write(json);
        pw.flush();
        pw.close();

    


