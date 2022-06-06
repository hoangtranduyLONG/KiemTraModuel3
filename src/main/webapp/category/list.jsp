<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 04/06/2022
  Time: 5:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
List Product
<c:forEach items="${ds}" var="ca">
    <h1>${ca.id},${ca.name}</h1>
</c:forEach>
</body>
</html>
