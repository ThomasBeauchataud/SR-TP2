<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/driver/cars/creation"><br>
        <label><input type="text" name="registration"/>Registration</label><br>
        <label><input type="number" name="places"/>Places</label><br>
        <label><button type="submit">Create</button></label>
    </form>
</body>
</html>
