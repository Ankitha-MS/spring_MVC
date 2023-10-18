<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page import="dto.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update the Data</title>
</head>
<body>
<form action="update" method="post">*
<input type="text" name="id" value="${student.getId()}" hidden="hidden"></th>
		
			<table>
				<tr>
					<th>Name:</th>
					<th><input type="text" name="name" value="${student.getName()}" required="required"> </th>
				</tr>
				<tr>
					<th>Email:</th>
					<th><input type="email" name="email" value="${student.getEmail()}" required="required"></th>
				</tr>
				<tr>
					<th>Mobile</th>
					<th><input type="number" name="mobile" value="${student.getMobile()}" required="required"></th>
				</tr>
				<tr>
					<th>Date of Birth:</th>
					<th><input type="date" name="date" value="${student.getDob()}" required="required"></th>
				</tr>
				<tr>
					<th>Gender:</th>
					<th>
					<c:if
					 test="${student.getGender().equalsIgnoreCase(\"male\")}">
						<input type="radio" name="gender" value="Male"  checked="checked">Male
						<input type="radio" name="gender" value="Female">female
						</c:if>
					<c:if
					 test="${student.getGender().equalsIgnoreCase(\"female\")}">
						<input type="radio" name="gender" value="Male"  >Male
						<input type="radio" name="gender" value="Female" checked="checked">female
						</c:if>
					</th>
					
				</tr>
				
				<tr>
					<th>Marks</th>
				</tr>
					<tr>
					<th>English</th>
					<th><input type="text" name="english" value="${student.getEnglish()}"required="required"></th>
					</tr>
					<tr>
					<th>Maths</th>
					<th><input type="text" name="maths" value="${student.getMaths()}"required="required"></th>
					</tr>
					<tr>
					<th>Science</th>
					<th><input type="text" name="science" value="${student.getScience()}" required="required"></th>
					</tr>
				<tr>
					<th><button>Update</button></th>
					<th><button>Cancel</button></th>
				</tr>
			</table>
		
	</form>
</body>
</html>