package xyz.guawaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*
* @RequestMapping: 放在类的上面
* value: 所有请求地址的公共部分，叫做模块名称
* */
@RequestMapping("user")
@Controller
public class MyController {
    //指定some.do是GET请求方式
    /*##
    @RequestMapping的属性：method
        - 指定此方法可以处理的请求的方式
        - GET： RequestMethod.GET
        - POST: RequestMethod.POST
        - 如果客户端用的不是指定的请求方式，会报405:Request method 'GET/POST' not supported
        - 如果未指定请求方式，那么默认该方法所有请求方式都可以处理*/
    @RequestMapping(value = "/some.do",method = RequestMethod.GET )
    public ModelAndView doSome(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","hello SpringMVC");
        mv.addObject("func","执行的是doSome方法");
        mv.setViewName("show");

        return mv;

    }
    //指定other.do是POST请求方式
    @RequestMapping(value ="/other.do", method = RequestMethod.POST)
    public ModelAndView doOther(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","hello SpringMVC");
        mv.addObject("func","执行的是doOther方法");
        mv.setViewName("other");
        return mv;
    }
    //不指定请求方式
    @RequestMapping(value ="/first.do")
    public ModelAndView doFirst(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","hello SpringMVC");
        mv.addObject("func","执行的是doFirst方法");
        mv.setViewName("other");
        return mv;
    }
}
