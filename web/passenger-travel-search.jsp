<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/passenger/travels/search"><br>
        <label><input type="text" name="departure"/>Departure</label><br>
        <label><input type="text" name="destination"/>Destination</label><br>
        <label><input type="date" name="date"/>Date</label><br>
        <label><button type="submit">Search</button></label>
    </form>
</body>
</html>
