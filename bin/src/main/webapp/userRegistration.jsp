<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor="lightsalmon">
	<div align="center">
		
		<br><br>
		<h2>Enter User Details</h2>
		<form action="userRegistration"><br>
	
			<table>
			<tr>
			<td><b>Name</b></td>
			<td><input type ="text" name="name"  ></td>
			</tr>
			<tr>
			<td><b>Email</b></td>
			<td><input type ="email" name="useremail"  ></td>
			</tr>
			<tr>
			<td><b>Phone no</b></td>
			<td><input type ="number" name="contactno"  ></td>
			</tr>
			<tr>
			<td><b>Address</b></td>
			<td><input type ="text" name="adress"  ></td>
			</tr>
			<tr>
			<td><b>Pincode</b></td>
			<td><input type ="number" name="pincode"  ></td>
			</tr>
			<tr>
			<td><b>Username</b></td>
			<td><input type ="text" name="username"  ></td>
			</tr>
			<tr>
			<td><b>Password</b></td>
			<td><input type ="password" name="password"  ></td>
			</tr>
			
			</table>
			
			<br><input type ="submit"  value="Register">
		</form>
		
		
	</div>
		
		

</body>
</html>