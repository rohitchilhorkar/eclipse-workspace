<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Entry</title>
</head>
<body>
<form action="add-product">
<!-- name is to specify where to save i in table -->
	<div>
	<label>Product Name:</label>
	<input type="text" placeholder="Enter Product Name.." name="productName"/><br/>
	</div>
	<div>
	<label>Product Quantity:</label>
	<input type="text" placeholder="Enter Quantity .." name="quantity" /><br/>
	</div>
	<div>
	<label>Product Color:</label>
	<input type="text" placeholder="Enter Color of the Product.." name="color"/><br/>
	</div>
	<button type="submit">Add Product</button>
</form>

</body>
</html>