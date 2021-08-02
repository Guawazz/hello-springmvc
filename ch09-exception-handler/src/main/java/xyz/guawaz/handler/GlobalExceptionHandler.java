package xyz.guawaz.handler;

import xyz.guawaz.exception.AgeException;
import xyz.guawaz.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/*
* @ControllerAdvice
* 控制器增强：给控制器增加异常处理功能！
* 特点：必须让框架知道这个注解所在的包名，需要在springmvc配置文件中声明组件扫描器
* 指定@ControllerAdvice所在的包名
*
* */
@ControllerAdvice
public class GlobalExceptionHandler {
//    定义方法，处理发生的异常
    /*
    * 控制器方法时怎么定义的，这里的异常处理的方法就可以怎么定义
    *
    * @ExceptionHandler(异常的类型)
    *
    * 形参：Exception ex 表示Controller中抛出的异常对象，通过它可以获取发生的异常信息
    *
    * */

    @ExceptionHandler(value=NameException.class)
    public ModelAndView doNameException(Exception exception){
//        处理NameException的异常
//        异常发生时需要做什么？
        /*
        * 1、把异常信息记录下来，包括异常发生的时间，哪个方法发生的，异常的内容
        *   记录到数据库、日志文件
        * 2、发送通知，把异常信息通过邮件、短信、微信等方式发送给相关人员
        * 3、给用户友好的提示
        * */
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","姓名必须是guawaz，其他用户不能访问");
        mv.addObject("ex",exception);
        mv.setViewName("nameError");
        return mv;
    }



    @ExceptionHandler(value=AgeException.class)
    public ModelAndView doAgeException(Exception exception){
//        处理AgeException的异常
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","你看看你都多大岁数了？！");
        mv.addObject("ex",exception);
        mv.setViewName("ageError");
        return mv;
    }
//处理其他  未知的异常
    @ExceptionHandler()
    public ModelAndView doOtherException(Exception exception){
//        处理AgeException的异常
        ModelAndView mv = new ModelAndView();

        mv.addObject("ex",exception);
        mv.setViewName("otherError");
        return mv;
    }
}

