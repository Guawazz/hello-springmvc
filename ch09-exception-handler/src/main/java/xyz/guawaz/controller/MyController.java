package xyz.guawaz.controller;

import xyz.guawaz.exception.AgeException;
import xyz.guawaz.exception.MyUserException;
import xyz.guawaz.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("user")
@Controller
public class MyController {

    @RequestMapping(value = "dosome")
    public ModelAndView doForward(String name,Integer age) throws MyUserException {
//        根据请求参数抛出异常，让框架统一处理异常
        if (!"guawaz".equals(name)){
            throw new NameException("不是真正的guawaz");
        }

        if (age==null || age < 25){
            throw new AgeException("你已不再年轻");
        }



        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
/*        mv.setViewName("show");*/
//        不受视图解析器的限制，转发到其他目录下
        mv.setViewName("show");

        return mv;
    }
}
