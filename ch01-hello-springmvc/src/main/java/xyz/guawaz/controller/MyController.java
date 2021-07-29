package xyz.guawaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*创建处理器对象，放在SpringMVC中*/
@Controller
public class MyController {
    /*处理用户提交的请求，springmvc中是用方法来处理的
    * 方法是自定义的，可以有多种返回值，多种参数，方法名称自定义*/

    /*我们准备使用dosome方法来处理some.do请求
    *使用@RequestMapping注解把一个请求地址和一个方法绑定在一起
    *
    *   属性：value  是一个String 表示请求的uri地址(some.do)
    *        value的值必须是唯一的，不能重复，在使用时推荐地址以"/"开头
    *   位置：方法上面(推荐)或者类的上面
    *   说明：使用@RequestMapping修饰的方法叫做处理器方法或者控制器方法
    *        使用@RequestMapping修饰的方法是可以处理请求的，类似于Servlet中的doGet() doPost()方法
    *   返回值：ModelAndView 表示本次请求的处理结果
    *           Model：数据，请求处理完成后要显示给用户的数据
    *           View：视图，比如jsp
    *
    * */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        //在这里面调用service来处理请求
        //假设现在service调用完成了
        /*
        * 创建ModelAndView对象，
        * addObject()添加数据，框架会自动把数据放入request作用域（request.setAttribute(x,x))
        * setViewName()指定视图，框架对视图执行forward操作：request.getRequestDipatcher("/show.jsp").forward(...)
        * */
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","hello SpringMVC");
        mv.addObject("func","执行的是doSome方法");
        /*mv.setViewName("/show.jsp");
        * 我们要把静态页面啥的放在WEB-INF里防止被用户直接访问，所以应该这么写：
        * mv.setViewName("/WEB-INF/view/show.jsp");
        * 配置了视图解析器之后只需要这么写：
        * mv.setViewName("show");
        * */
        mv.setViewName("show");

        return mv;

    }
    @RequestMapping(value ={"/other.do","/second.do"})
    public ModelAndView doOther(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","hello SpringMVC");
        mv.addObject("func","执行的是doOther方法");
        mv.setViewName("other");
        return mv;
    }
}
