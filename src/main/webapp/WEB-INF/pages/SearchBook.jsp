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
  </head>

  <body>
  
    <div class="container">
     <div id=header>
			<h2>E-READER MANAGEMENT SYSTEM</h2>
		</div><br>
		<h3><b>Search Book</b></h3>
      <form role="form" name="myForm" method="post">
        <div class="form-group" >
          <label for="bn">Book Title</label>
          <input type="text" class="form-control" id="eid" name="title" placeholder="Enter Book name / title">
        </div>		
        <input type="button" class="btn btn-default" onClick="javascript:validateForm(this.form);" value="Search">
      </form>
	  <div align ="right">
	  <a href="home.htm">Back to home</a>	
	  </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  </body>
</html>