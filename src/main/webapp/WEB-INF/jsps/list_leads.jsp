<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details</h2>
<table border=1 >
<tr>
<th>FirstName</th>
<th>Salary</th>
<th>Department</th>

</tr>


<c:forEach var="l" items="${lead}">

<tr>
<td>${l.firstName}</td>
<td>${l.salary}</td>
<td>${l.department}</td>
</tr>
</c:forEach>

<c:forEach var="l" items="${lead}">

<table border=1 >

<tr>

<th>FirstName</th>
<td>${l.firstName}</td>

</tr>


<tr>
<th>Salary</th>
<td>${l.salary}</td>
</tr>

<tr>
<th>Department</th>
<td>${l.department}</td>
</tr>

</table>
</c:forEach>
</table>

</body>
</html>