<%--
  Created by IntelliJ IDEA.
  User: thoma
  Date: 03/10/2019
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Here all planned travel
<%=request.getSession().getAttribute("username")%><br>
<a href="${pageContext.request.contextPath}/passenger/travels/search">Look for a new travel</a>
</body>
</html>
