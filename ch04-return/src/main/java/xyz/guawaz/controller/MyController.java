package xyz.guawaz.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import xyz.guawaz.vo.Student;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


@RequestMapping("user")
@Controller
public class MyController {
    /*
    * 处理器方法返回String 表示逻辑视图名称 需要配置视图解析器
    * 处理器方法返回String 表示完整视图路径 不能配置视图解析器！
    * */
    @RequestMapping(value = "/returnString-view.do",method = RequestMethod.POST )
    public String doReturnView(String name,Integer age){

        return "show";
    }
    /*
    *处理器方法返回void,响应ajax请求
    * 手工实现ajax响应
    *
    * */
    @RequestMapping(value = "/returnVoid-ajax.do")
    public void  doReturnVoidAjax(HttpServletResponse response,String name, Integer age) throws IOException {

        //1.假设service处理完了，得到student对象
        Student student = new Student();
        student.setName("guawaz");
        student.setAge(25);

        //2.把student对象转成json格式的数据(用的jackson)
        String json = "";
        if (student != null){
            ObjectMapper om = new ObjectMapper();
           json  = om.writeValueAsString(student);
            System.out.println("student转化的json："+json);
        }

        //3.输出数据响应ajax的请求
        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.write(json);
        pw.flush();
        pw.close();

    }

    /************************************************************************************/
    /**
     * 处理器方法返回对象
     *
     */
    /*
     *处理器方法返回自定义对象 通过框架转为json 实现响应ajax
     *@ResponseBody的作用：
     *          把处理器方法返回对象转为json后，通过HttpServletResponse返回给浏览器
     * */
    @RequestMapping(value = "/returnStudentJson.do")
    @ResponseBody
    public Student doReturnStudentJson(String name, Integer age){

        //1.假设service处理完了，得到student对象
        Student student = new Student();
        student.setName("guawaz");
        student.setAge(25);

        return student;
    }

    /*
     *处理器方法返回List<Student>
     *响应的返回值是json数组
     * */
    @RequestMapping(value = "/returnStudentJsonArray.do")
    @ResponseBody
    public List<Student> doReturnStudentJsonArray(String name, Integer age){

        //1.假设service处理完了，得到student对象
        List<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setName("guawaz");
        student.setAge(25);
        list.add(student);

        student = new Student();
        student.setName("jiner");
        student.setAge(19);
        list.add(student);

        return list;
    }

    /**
     *
     * 处理器方法返回String对象 String表示数据，不是视图
     *
     *Content-Type默认是：text/plain;charset=ISO8859-1 这会导致客户端解析汉字乱码
     * 解决方法：添加属性produces
     */
    @RequestMapping(value ="/returnStringData.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doReturnStringData(String name,Integer age){
        return "Hello SpringMVC 返回对象 表示数据";
    }




}
