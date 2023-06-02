<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
</head>
<body bgcolor="gold">
	<div align="center">
		<i><h1>SportyShoes</h1></i>


		 	<h3 align="right"><a href='adminHome.jsp' style="text-decoration: none">Home</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='logout' style="text-decoration: none">Logout</a></h3>
	
		<br><br>
		<form action="updatepassword" >
			
			<b>Enter New password  </b><input type ="Password" name="password" ><br><br>
			
			<input type="submit" name="update"  value="Change Password">
		</form>
		</div>
		

</body>
</html>