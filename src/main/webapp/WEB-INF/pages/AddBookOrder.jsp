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
		<h3><b>Create Book Order</b></h3>
      <form role="form" name="myForm" method="post">
        <div class="form-group" >
          <label for="bn">BOOK Title</label>
          <input type="text" class="form-control" id="eid" name="title" placeholder="Enter Book name">
        </div>
		<div class="form-group">
          <label for="version">Version</label>
          <input type="text" class="form-control"  name="version"  placeholder="Enter version">
        </div>
        <div class="form-group">
          <label for="bkPublisher">BOOK PUBLISHER:</label>
          <input type="text" class="form-control" id="bkPublisher" name="publisher"  placeholder="Enter Publisher Name">
        </div>
        <div class="form-group">
          <label for="bkEdition">Category</label>
          <input type="text" class="form-control" id="bkEdition"  name="category" placeholder="Enter book edition">
        </div>
         <div class="form-group">
          <label for="bkEdition">Sub Category</label>
          <input type="text" class="form-control" id="bkEdition"  name="subCategory" placeholder="Enter book edition">
        </div>
        <div class="form-group">
          <label for="version">Author name</label>
          <input type="text" class="form-control"  name="author"  placeholder="Enter version">
        </div>
		<div class="form-group">
          <label for="qty">QUANTITY:</label>
          <input type="text" class="form-control" id="qty" name="quantity"  placeholder="Enter Email id">
        </div>
		<div class="form-group">
          <label for="vId">VENDOR ID:</label>
          <select name="vendorId">
          	<c:forEach items="${vendorList}" var="ven">
          		<option  value="${ven.vendorId }">${ven.vendorName }</option>
          	
          	</c:forEach>
          </select>
        </div>
        <input type="button" onClick="javascript:validateForm(this.form);" value="Place Order"class="btn btn-default">
		<input type="reset" value="reset" class="btn btn-default">
      </form>
	  <div align ="right">
	  <a href="home.htm">Back to home</a>	
	  </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  </body>
</html>