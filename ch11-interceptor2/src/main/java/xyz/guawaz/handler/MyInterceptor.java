package xyz.guawaz.handler;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//拦截器类 拦截用户的请求
public class MyInterceptor implements HandlerInterceptor {

    /*
    * preHandle：预处理方法
    * 参数：Object handler：被拦截的控制器对象
    * 返回值：boolean
    * 特点：1.用户的请求首先到达此方法，在控制器方法之前执行
    *      2.在这个方法中可以获得请求的信息，验证用户是否有权限访问某个地址，起到放行和截断请求的作用
    *
    * */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("拦截器的preHandle方法");

        //在这里进行计算和判断返回true还是false


        //给浏览器一个返回结果：
        /*request.getRequestDispatcher("/note.jsp").forward(request,response);
        return false;*/



        return true;
    }
    /*
    * postHandle：后处理方法
    * 参数：Object handler：被拦截的控制器对象
    *      ModelAndView modelAndView：控制器方法的返回值
    * 特点：1.在控制器方法之后执行
    *      2.能获取并修改控制器方法的返回值modelAndView，影响最后的结果
    *      3.作用主要是对原来的执行结果进行修正
    *
    * */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("拦截器的postHandle方法");
    }


    /*
    * afterCompletion：最后执行的方法
    * 参数：Object handler：被拦截的控制器对象
    *      Exception ex：程序中发生的异常
    * 特点：1.在请求处理完成之后执行，（框架中规定当视图处理完成后，执行了forward，就认为请求处理完成）
    *      2.一般做资源回收工作
    *      3.preHandle返回true才会执行
    *
    *
    * */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);

        System.out.println("拦截器的afterCompletion方法");
    }
}
