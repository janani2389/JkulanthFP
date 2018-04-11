<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	 <script type="text/javascript" src="js/validationScript.js">

</script> 

  </head>

  <body>
  
    <div class="container">
     <div id=header>
			<h2>E-READER MANAGEMENT SYSTEM</h2>
		</div><br>
		<h3><b>Edit E-READER</b></h3>
      <form role="form" method="post" name="myForm">
        <div class="form-group">
          <label for="eid">E-READER ID:</label>
          <input type="text" class="form-control" value="${user.userName }" name="userName" placeholder="Enter E-READER ID">
        </div>
        <div class="form-group">
          <label for="firstName">FIRST NAME:</label>
          <input type="text" class="form-control" value="${user.firstName }" name="firstName" placeholder="Enter First Name">
        </div>
        <div class="form-group">
          <label for="lastName">LAST NAME:</label>
          <input type="text" class="form-control" value="${user.lastName }" name="lastName" placeholder="Enter Last Name">
        </div>
		<div class="form-group">
          <label for="email">EMAIL ID:</label>
          <input type="email" class="form-control" value="${user.email }" name="email" placeholder="Enter Email id">
        </div>
		<div class="form-group">
          <label for="no">CONTACT NUMBER:</label>
          <input type="text" class="form-control" value="${user.contactNo }" name="contactNo" placeholder="Enter Contact Number">
        </div>
		<div class="form-group">
          <label for="address">ADDRESS:</label>
          <input type="text" class="form-control"  value="${user.address }" name="address" placeholder="Enter Contact Address">
        </div>
		<div class="form-group">
		 <label for="dob">DATE OF BIRTH:</label>
		<input type="date" name="dateOfBirth" >
		<label>${user.dateOfBirth }</label>
		</div>
		<div class="form-group">
		 <label for="doj">DATE OF JOINING:</label>
		<input type="date" name="dateOfJoining" >
		<label>${user.dateOfBirth }</label>
		</div>
		<div class="form-group">
		 <label for="customerType">CUSTOMER TYPE:</label>
		<select name="membershipId">			
			<option value="1">SILVER</option>
			<option value="2">GOLD</option>
			<option value="3">PLATINUM</option>
		</select>
		</div>
        <input type="button" value="save" onClick="javascript:validateForm(this.form);" class="btn btn-default">
		<input type="reset" value="reset" class="btn btn-default">
      </form>
	  <div align ="right">
	  <a href="home.htm"><b>Back to home</a>	
	  </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  </body>
</html>