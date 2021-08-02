package xyz.guawaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("user")
@Controller
public class MyController {
    /*
    * 处理器方法返回String 表示逻辑视图名称 需要配置视图解析器
    * 处理器方法返回String 表示完整视图路径 不能配置视图解析器！
    * */
    @RequestMapping(value = "some")
    public ModelAndView doReturnView(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");

        return mv;
    }



}
