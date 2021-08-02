package xyz.guawaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("user")
@Controller
public class MyController {

    @RequestMapping(value = "dosome")
    public ModelAndView dosome(String name,Integer age)  {
        System.out.println("执行MyController中的dosome方法");
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);

        mv.setViewName("show");

        return mv;
    }
}
