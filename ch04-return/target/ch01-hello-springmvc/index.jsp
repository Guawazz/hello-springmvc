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
    <p>处理器方法返回String表示视图名称</p>
    <form action="user/returnString-view.do" method="post">
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数"/>
    </form>


<%--使用postman模拟ajax请求进行测试
    <p>处理器方法返回void 响应AJAX请求</p>
    <form action="user/returnVoid-ajax.do" method="post">
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数"/>
    </form>
--%>

</body>
</html>
