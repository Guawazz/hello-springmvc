package xyz.guawaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*
* @RequestMapping: 放在类的上面
* value: 所有请求地址的公共部分，叫做模块名称
*
* */
@RequestMapping("user")
@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","hello SpringMVC");
        mv.addObject("func","执行的是doSome方法");
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
