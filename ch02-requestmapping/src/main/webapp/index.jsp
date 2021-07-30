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
    <p>第一个springmvc项目</p>
    <p><a href="user/some.do">发起some.do请求</a> </p>
    <br>
<%--    <p><a href="user/other.do">发起other.do请求</a> </p>--%>
    <form action="user/other.do" method="post">
        <input type="submit" value="post请求other.do"/>
    </form>

</body>
</html>
