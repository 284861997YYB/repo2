<%--
  Created by IntelliJ IDEA.
  User: 284861997qq.com
  Date: 2019/5/30
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<a href="hello">点击入门</a>--%>


<%--<form method="post" action="Account/testAccount">
    账户姓名:<input type="text" name="name" >
    账户年龄:<input type="text" name="age" >
    用户姓名:<input type="text" name="user.uname" >
    用户年龄:<input type="text" name="user.age" >
           <input type="submit" value="提交">
</form>--%>


<form method="post" action="Account/testStringtoDateConverter">
    账户姓名:<input type="text" name="name" >
    账户年龄:<input type="text" name="age" >
    账号生日:<input type="text" name="user.date">
    <input type="submit" value="提交">
</form>


</body>
</html>
