<%--
  Created by IntelliJ IDEA.
  User: 14738
  Date: 2020/7/15
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h3>测试SpringMVC业务层</h3>
<a href="account/findAll">点击测试</a><br/>
<br/>
<h1>测试保存方法</h1>
<form action="account/save" method="post">
    用户名:<input type="text" name="name"/>
    金额:<input type="text" name="money"/>
    <input type="submit" value="保存"/>
</form>
</body>
</html>
