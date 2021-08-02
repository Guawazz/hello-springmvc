package xyz.guawaz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import xyz.guawaz.domain.Student;
import xyz.guawaz.service.StudentService;

import java.util.List;


@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/addsStudent")
    public ModelAndView addStudent(Student student){
        System.out.println("?????????????????执行了吗?????????????????");

        ModelAndView mv = new ModelAndView();
        String tips = "注册失败";
        //调用service处理student
        int nums = service.addStudent(student);
        if (nums > 0){
            tips = "学生【" + student.getName() + "】注册成功";
        }
        mv.addObject("tips" ,tips);
        mv.setViewName("result");
        return mv;
    }
    @ResponseBody
    @RequestMapping(value = "queryStudent")
    public List<Student> QueryStudent(){
        List<Student> students = service.findStudents();
        return students;
    }

}
