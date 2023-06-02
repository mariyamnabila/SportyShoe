<%@page import="com.example.demo.*"%>
<%@page import="com.example.demo.cartrepositry"%>
<%@page import="com.example.demo.product"%>
<%@page import="com.example.demo.mainController"%>
<%@page import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@page import="org.springframework.security.core.Authentication"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@ page import="com.example.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cart</title>
</head>
<body bgcolor="lightsalmon">

		<%
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    	String username = auth.getName();
	    	
	    	List<cart> list=(List<cart>)request.getAttribute("list");
	    	
	    	double totalprice =0;
	    	
		%>
		
		<div align="center">
		
		<h1>SportyShoes</h1>
	
		<h3 align="right"><a href='userHome.jsp' style="text-decoration: none">Home</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='logout' style="text-decoration: none">Logout</a></h3>
		<h3 align="left">Hi <%=username %>.</h3>
		<div style="color:green;"><h1 align="center">Your Cart</h1></div>
		  
	<table cellpadding ="5" cellspacing ="5"   style=font-size:20px >
	<tr><th>Product Id</th><th>Product Name</th><th>Select Size</th><th>Product price</th></tr>
	<%for(cart c:list){ %>
	<tr style="text-align: center"><td><%=c.getProductid() %></td><td><%=c.getProductname() %></td>
	<td><select  name="size">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                        <option value="11">11</option>
                        <option value="12">12</option>
                       
                    </select></td>
    <td><%=c.getProductprice()%></td>
    <td><form action = "removefromcart"><input type="hidden" id="cartid" name="cartid" value=<%=c.getCartid() %>><input type="submit" value="Remove from Cart" ></form></td></tr>
    <%totalprice+=Double.parseDouble(c.getProductprice()); %>
    
    <%}%>

    
	 </table><br>
	<h3>Total Price = <%=totalprice %></h3>
	<% if(totalprice>0) {%>
		
			 <form action="payment.jsp"><input type="hidden" id="totalprice" name="totalprice" value=<%=totalprice %>><input style=font-size:20px type="submit" name ="add" value="    Buy    " ></form><br><br><br>
		
		<% } %>
           
	
</body>
</html>