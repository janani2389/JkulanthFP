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
	<link rel="stylesheet" type="text/css" href="css/style.css">
	 <script type="text/javascript" src="js/validationScript.js"></script>
	
  </head>

  <body>
  
    <div class="container">
     <div id=header>
			<h2>E-READER MANAGEMENT SYSTEM</h2>
		</div><br>
		<h3><b>Create E-READER</b></h3>
      <form role="form" name="myForm" method="POST">
        <div class="form-group">
          <label for="eid">E-READER USER NAME:</label>
          <input type="text" class="form-control" id="eid" name="userName" placeholder="Enter E-READER ID">
        </div>
        <div class="form-group">
          <label for="password">PASSWORD:</label>
          <input type="text" class="form-control" id="password" name="password" placeholder="Enter Password for new E-READER">
        </div>
        <div class="form-group">
          <label for="firstName">FIRST NAME:</label>
          <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter First Name">
        </div>
        <div class="form-group">
          <label for="lastName">LAST NAME:</label>
          <input type="text" class="form-control" id="lastName" name= "lastName" placeholder="Enter Last Name">
        </div>
		<div class="form-group">
          <label for="email">EMAIL ID:</label>
          <input type="email" class="form-control" id="emailId" name ="email" placeholder="Enter Email id">
        </div>
		<div class="form-group">
          <label for="no">CONTACT NUMBER:</label>
          <input type="text" class="form-control" id="no" name="contactNo"placeholder="Enter Contact Number">
        </div>
		<div class="form-group">
          <label for="address">ADDRESS:</label>
          <input type="text" class="form-control" id="address" name ="address" placeholder="Enter Contact Address">
        </div>
		<div class="form-group">
		 <label for="dob">DATE OF BIRTH:</label>
		<input type="date" name="dateOfBirth">
		</div>
		<div class="form-group">
		 <label for="doj">DATE OF JOINING:</label>
		<input type="date" name="dateOfJoining">
		</div>
		<div class="form-group">
		 <label for="customerType">CUSTOMER TYPE:</label>
		<select name="membershipId">
			<option value="1">SILVER</option>
			<option value="2">GOLD</option>
			<option value="3">PLATINUM</option>
		</select>
		</div>
        <input type="button" onClick="javascript:validateForm(this.form);" value ="Save" class="btn btn-default"></input>
		<input type="reset" value="Reset" class="btn btn-default">
      </form>
	  <div align ="right">
	  <a href="home.htm"><b>Back to home</b></a>	
	  </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  </body>
</html>