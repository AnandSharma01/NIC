<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.time.LocalDateTime" %>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${name}</title>
</head>
<body>
<h1>Anand</h1>

<% /*LocalDateTime time = (LocalDateTime)request.getAttribute("now"); */%>

<h2>Time is ${now} ${anand}</h2>


<c:forEach var="item" items="${marks}">
<h3>${item}</h3>
</c:forEach>
<h2>${user.fname}</h2>
<h2>${user.lname}</h2>
<h2>${user.email}</h2>
<h2>${user.password}</h2>
</body>
</html>