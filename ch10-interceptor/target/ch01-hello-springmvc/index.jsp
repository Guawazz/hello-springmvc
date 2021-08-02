<%--
  Created by IntelliJ IDEA.
  User: guawazhu
  Date: 2021/7/29
  Time: 2:27 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一个拦截器</title>
    <base href="http://localhost:8080/ch10_interceptor/"/>
</head>
<body>

    <form action="user/dosome" method="post">
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数"/>
    </form>


</body>
</html>
