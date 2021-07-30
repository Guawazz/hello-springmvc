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
    <title>Title</title>
</head>
<body>
    <p>请求参数名和处理器方法的形参名一致</p>
    <form action="user/receiveparam.do" method="post">
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数"/>
        </form>
    <p>请求参数名和处理器方法的形参名不一致</p>
    <form action="user/receiveparam1.do" method="post">
        姓名：<input type="text" name="name1"> <br/>
        年龄：<input type="text" name="age1"> <br/>
        <input type="submit" value="提交参数"/>
    </form>
    <p>使用java对象接收请求参数</p>
    <form action="user/receiveobject.do" method="post">
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数"/>
    </form>
</body>
</html>
