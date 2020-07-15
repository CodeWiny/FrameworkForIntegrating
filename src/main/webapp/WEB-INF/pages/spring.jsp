<%--
  Created by IntelliJ IDEA.
  User: 14738
  Date: 2020/7/15
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="a" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>查询</title>
</head>
<body>
<h3>查询所有账户</h3>

<c:forEach items="${account}" var="account">
    姓名:${account.name}<br/>
</c:forEach>
</body>
</html>
