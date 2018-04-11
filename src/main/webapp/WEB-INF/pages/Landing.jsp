<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%
	if(session.getAttribute("currentUser") == null){
		response.sendRedirect("index.jsp");
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

 <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
	 <script type="text/javascript" src="js/validationScript.js"> </script>
  </head>
  <body>
    <div class="container">
		<div id=header>
			<h2>E-READER MANAGEMENT SYSTEM</h2>
		</div><br><br>	
        <h3><b>Welcome Admin!! <c:out value="${usernameFromCtr}"></c:out></b></h3> 
		<h4>  
		<script type="text/javascript">
			<!--	
			var currentTime = new Date()
			var month = currentTime.getMonth() + 1
			var day = currentTime.getDate()
			var year = currentTime.getFullYear()
			var time = currentTime
			//document.write(month + "/" + day + "/" + year)
			document.write(time)
			//-->
			
			
			function send(type){
				if(type == "addUser"){
					window.location = "addUsers.htm";
				}else if(type == "viewUser"){
					window.location = "viewUser.htm";
				}else if(type == "viewVendor"){
					window.location = "viewVendor.htm";
				}else if(type == "addVendor"){
					window.location = "createVendor.htm";
				}
				else if(type == "createOrder"){
					window.location = "createOrder.htm";
				}
				else if(type == "searchBook"){
					window.location = "searchBook.htm";
				}else if(type == "myBooks"){
					window.location = "myBooks.htm";
				}
			}
			
			</script>
		</h4>
		<div align="right">	  
		<a href="logout.htm">log out!</a>	 
		</div>
		<form action="landing.htm" method="get">	 
		<table class="table">
		
		
			<tr><td><input type="button" onclick="javascript:send('addUser');" value ="Add E-Reader"  class="btn btn-info btn-block"></input></td></tr>
			<tr><td><input type="button" onclick="javascript:send('viewUser');" value="View E-Reader"   class="btn btn-info btn-block"></input></td></tr>
			<tr><td><input type="button" onclick="javascript:send('addVendor');" value ="Add Vendor" class="btn btn-info btn-block"></input></td></tr>
			<tr><td><input type="button" onclick="javascript:send('viewVendor');" value="View Vendor"  class="btn btn-info btn-block"></input></td></tr>
			<tr><td><input type="button" onclick="javascript:send('createOrder');" value="Create New Book Order"  class="btn btn-info btn-block"></input></td></tr>			
			<tr><td><input type="button" onclick="javascript:send('searchBook');" value="Search Books"  class="btn btn-info btn-block"></input></td></tr>
			<tr><td><input type="button" onclick="javascript:send('myBooks');" value="My Books"  class="btn btn-info btn-block"></input></td></tr>
			
		</table>
		 </form>	
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  </body>

</html>
 