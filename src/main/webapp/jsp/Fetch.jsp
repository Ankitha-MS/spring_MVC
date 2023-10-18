<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetch records</title>
</head>
<body>
	<h1 style="color: green">${pass}</h1>
	<h1 style="color: green">${fail}</h1>
	<table border="1" >
	<tr>
	<th colspan="6">PERSONAL</th>
	<th colspan="5">ACADEMIC</th>
	<th colspan="2">ACTION</th>
	</tr>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>DOB</th>
			<th>Gender</th>
			<th>English</th>
			<th>Maths</th>
			<th>Science</th>
			<th>percentage</th>
			<th>Result</th>
			<th>Edit</th>
			<th>Delete</th>
			
		</tr>
	
	<c:forEach var="student" items="${list}">
		<tr>
		<td>${student.getId()}</td>
		<td>${student.getName()}</td>
		<td>${student.getEmail()}</td>
		<td>${student.getMobile()}</td>
		<td>${student.getDob()}</td>
		<td>${student.getGender()}</td>
		<td>${student.getEnglish()}</td>
		<td>${student.getMaths()}</td>
		<td>${student.getScience()}</td>
		<td>${student.getPercentage()}</td>
		<td>${student.getResult()}</td>
		<td><a href="edit?id=${student.getId() }"><button>EDIT</button></a></td>
		<td><a href="delete?id=${student.getId() }"><button>DELETE</button></a></td>	
		</tr>
	</c:forEach>
	</table>
	<a><button>AddTask</button></a>
	<a><button>Cancel</button></a>
</body>
</html>