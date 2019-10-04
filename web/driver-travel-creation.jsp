<%@ page import="beans.Car" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>Travel Creation</title>
  </head>
  <body>
    <form method="post" action="${pageContext.request.contextPath}/travels/creation"><br>
      <% Car[] cars = (Car[])request.getAttribute("cars"); if(cars == null) { %>
        You must first create a car to create a Travel
      <% } else {%>
        <label><input type="date" name="date"/>Date</label><br>
        <label><input type="time" name="time"/>Time</label><br>
        <label><input type="text" name="departure"/>Departure</label><br>
        <label><input type="text" name="destination"/>Destination</label><br>
        <label>Select the car
          <select>
            <% for (Car car : cars) { %>
            <option value="<%=car.getRegistration()%>"><%=car.getRegistration()%></option>
            <% } %>
          </select>
        </label><br>
        <label><input type="number" name="places" min=1/>Free Places</label><br>
        <label><button type="submit">Create</button></label>
      <% } %>
    </form>
  </body>
</html>
