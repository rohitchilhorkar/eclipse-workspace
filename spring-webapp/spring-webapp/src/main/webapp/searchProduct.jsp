<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results</title>
<style>
p, h1, h3{
	width:40%;
	margin:auto;
	color: gold;
}
</style>
</head>

<body>
	
	<form action="search-product-by-id">
		Enter Id : <input type="number" name="id" />
		<button type="submit">Fetch all data Using ID</button>	
	</form>
							<h1>OR</h1>
							
	<form action="search-product-by-name">
		Enter Product Name : <input type="text" name="productName" />
		<button type="submit">Fetch all data using Name</button>	
	</form>
	
	<form action="fetch-all-products"><button>Fetch All Products</button></form>
	
	<c:choose>
			<c:when test="${ p != null }">
			<h1>------Search Result-----</h1>	
			<h3>Product Id: ${ p.id }</h3><br/>
			<h3>Product Name: ${ p.productName }</h3><br/>
			<h3>Product Quantity: ${ p.quantity }</h3><br/>
			<h3>Product Color: ${ p.color }</h3><br/>
			</c:when>
			<c:otherwise>
					Enter Valid input..!
			</c:otherwise>	
	</c:choose>
	
	<c:forEach items="${ allProducts }" var="p">
		<p>
			Product Id: ${ p.id } <br/>
			Product Name: ${ p.productName } <br/>
			Product Color: ${ p.color } <br/>
			Product Quantity: ${ p.quantity } <br/><br/>
		</p>	
	
	</c:forEach>
	
	
</body>
</html>
















