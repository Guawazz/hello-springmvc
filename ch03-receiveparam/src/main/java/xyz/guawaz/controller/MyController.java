package xyz.guawaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import xyz.guawaz.vo.Student;

/*
* @RequestMapping: 放在类的上面
* value: 所有请求地址的公共部分，叫做模块名称
* */
@RequestMapping("user")
@Controller
public class MyController {

    /*##
    逐个接收请求参数
        要求处理器（控制器）方法的形参名和请求中参数名必须一致

        接收请求参数的过程：
        1.框架使用request对象接收请求参数
            String strName = request.getParameter("name")
            String strAge = request.getParameter("age")
        2.springMVC框架通过DispatcherServlet调用MyController的doSome()方法
            调用方法时按名称对应赋值给控制器方法的形参,而且框架会提供类型转换等功能
            把String转换为int long float double等类型
            doReceiveparam(strName,Integer.valueof(strAge))

            如果用户在输入年龄时，输入成字符了，此时框架在进行类型转化时就会出错
            客户端那边就会报400：The request sent by client was syntactically incorrect

        -处理器（控制器）方法的形参类型int和Integer的区别： Integer可以接收空
        -提交请求参数时，参数是汉字的话，get没有乱码，post是乱码，
                使用过滤器CharacterEncodingFilter来处理
    */
    @RequestMapping(value = "/receiveparam.do",method = RequestMethod.POST )
    public ModelAndView doReceiveparam(String name,Integer age){

        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");

        return mv;

    }


    /*解决逐个接收请求中的参数名和处理器方法的形参名不一样
    * 使用@ResuestParam
    *       属性：1.value 请求中的参数名称
    *            2.required 布尔值 表示请求中是否必须包含该参数 默认true
    *       位置：在处理器的形参前面
    *
    * */
    @RequestMapping(value = "/receiveparam1.do",method = RequestMethod.POST )
    public ModelAndView doReceiveparam1(@RequestParam(value = "name1",required = false) String name,
                                        @RequestParam(value = "age1",required = false) Integer age){

        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }

    /**
     * 使用java对象接收请求参数
     * 形参是java对象，这个对象的属性名和请求中的参数名一致
     * 框架会创建形参的Java对象，调用对象的set方法为属性赋值
     *
     * 形参中可以有多个对象
     */
    @RequestMapping(value = "/receiveobject.do",method = RequestMethod.POST )
    public ModelAndView doReceiveparam1(Student student){

        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",student.getName());
        mv.addObject("myage",student.getAge());
        mv.addObject("mystudent",student);
        mv.setViewName("show");
        return mv;
    }
}
