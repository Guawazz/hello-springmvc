<%--
  Created by IntelliJ IDEA.
  User: guawazhu
  Date: 2021/7/29
  Time: 5:07 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>重定向到/show2.jsp 不能从Request作用域获取数据，可以用$ {param.myname}和$ {param.myage}来获取数据</h3><br/>
    <h3> 姓名是：${param.myname} </h3><br/>
    <h3> 年龄是：${param.myage} </h3><br/>
    <h3> student是：${param.mystudent} </h3><br/>
</body>
</html>
