<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<title>Insert Customer to Database</title>
</head>
<body>
<form class="form-group" action="add-customer">
	<div class="form-group">
		Name: <input placeholder="Enter Name.." type="text" name = "name"/><br/>	
	</div>
	<div class="form-group">
		Email: <input placeholder="Enter Email.."  type="email" name = "email"/><br/>	
	</div>
	<div class="form-group">
		City: <input placeholder="Enter City.." type="text" name = "city"/><br/>	
	</div>
	<button type="submit" class="button btn-default">Add</button>
</form>
</body>
</html>