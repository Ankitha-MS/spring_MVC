<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert" method="post" >
		<fieldset>
			<table>
				<tr>
					<th>Name:</th>
					<th><input type="text" name="name" required="required"> </th>
				</tr>
				<tr>
					<th>Email:</th>
					<th><input type="email" name="email" required="required"></th>
				</tr>
				<tr>
					<th>Mobile</th>
					<th><input type="number" name="mobile" required="required"></th>
				</tr>
				<tr>
					<th>Date of Birth:</th>
					<th><input type="date" name="date" required="required"></th>
				</tr>
				<tr>
					<th>Gender:</th>
					<th>
						<input type="radio" name="gender" value="Male">Male
						<input type="radio" name="gender" value="Female">female
					</th>
				</tr>
				
				<tr>
					<th>Marks</th>
				</tr>
					<tr>
					<th>English</th>
					<th><input type="text" name="english" required="required"></th>
					</tr>
					<tr>
					<th>Maths</th>
					<th><input type="text" name="maths" required="required"></th>
					</tr>
					<tr>
					<th>Science</th>
					<th><input type="text" name="science" required="required"></th>
					</tr>
				<tr>
					<th><button>Save</button></th>
					<th><button type="reset">Cancel</button></th>
				</tr>
			</table>
		</fieldset>
	</form>


</body>
</html>