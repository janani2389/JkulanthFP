<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	 <script type="text/javascript" src="js/validationScript.js"></script>
	<style>
 

    .border{
    	margin: 20px;
    }
	table.gridtable {
	font-family: verdana,arial,sans-serif;
	font-size:14px;
	color:#333333;
	border-width: 1px;
	border-color: #666666;
	border-collapse: collapse;
}
table.gridtable th {
	border-width: 4px;
	padding: 20px;
	border-style: solid;
	border-color: #666666;
	background-color: #dedede;
}
table.gridtable td {
	border-width: 4px;
	padding: 15px;
	border-style: solid;
	border-color: #666666;
	background-color: #ffffff;
}

</style>
  </head>

  <body>
   <div class="container">
     <div id=header>
			<h2>E-READER MANAGEMENT SYSTEM</h2>
		</div><br>
		<h3 align="center"><b>My Books</b></h3>
		</div>
		<table class="gridtable" align="center">
        <thead>
            <tr>
                <th>Book Title</th>
                <th>Book Author</th>
                <th>Start Date</th>
                <th>Return Date</th>
            </tr>
        </thead>
        <tbody>
              <c:forEach items="${myBooks}" var="my">
        	<tr>
                <td>${my.book.title}</td>
                <td>${my.book.author}</td>
                <td>${my.startDate}</td>
                <td>${my.returnDate}</td>
               
            </tr>
        </c:forEach>  
        </tbody>
    </table>
	</div>
	<div align ="center">
	  <a href="home.htm"><b>Back to home</a>	
	  </div>
  </body>
</html>