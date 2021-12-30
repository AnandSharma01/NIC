<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
    <%@ page import= "java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${name}</title>
</head>
<body>
<% 
String s = (String)request.getAttribute("name"); 
Integer id= (Integer)request.getAttribute("id");

 List<String> aaa= (List<String>)request.getAttribute("f"); 
 
String a= (String)request.getAttribute("name");

%>

<h1> Name is <%=s %> 
Id is <%=id %>
</h1>

<% for(String string:aaa){
	
	//out.println(string);

%>

<h1><%= string %></h1>
<% } %>


</body>
</html>