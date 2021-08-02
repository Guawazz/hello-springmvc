package xyz.guawaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("user")
@Controller
public class MyController {
    /*
    *处理器方法返回ModelAndView，实现转发forward
    * 语法：setViewName("forward:视图文件完整路径")
    * forward特点：自动忽略视图解析器的作用
    * */
    @RequestMapping(value = "doForward")
    public ModelAndView doForward(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
/*        mv.setViewName("show");*/
//        不受视图解析器的限制，转发到其他目录下
        mv.setViewName("forward:/show1.jsp");

        return mv;
    }
    /*
     *处理器方法返回ModelAndView，实现重定向redirect
     * 语法：setViewName("redirect:视图文件完整路径")
     * redirect特点：自动忽略视图解析器的作用
     *
     * 框架会把Model中的简单类型的数据，转为String，转为第二次请求的参数
     * 在第二次请求的页面中可以用${param.myname}和${param.myage}来获取数据
     *
     *
     * */
    @RequestMapping(value = "doRedirect")
    public ModelAndView doRedirect(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        /*        mv.setViewName("show");*/
//        不受视图解析器的限制，转发到其他目录下
        mv.setViewName("redirect:/show2.jsp");

        return mv;
    }

}
