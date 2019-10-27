<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/mystyle.css">
<meta charset="ISO-8859-1">
<h4>Calculator</h4>
</head>
<body>
<c:if test="${errors != null}">

	<p id="errors">
		Error(s)!
	<ul>
		<c:forEach var="error" items="${errors}">
			<li>${error}</li>
		</c:forEach>
	</ul>


</c:if>
	<form action="/MVC2SingleServlet5_war_exploded/calc" method="post">

		<input name="add1" type=number  class="textBox"  value="${form.add1}" />+
		<input name="add2" type="number" class="textBox" value="${form.add2}" />=
		<input name="sum" type="number" class="textBox" value="${form.name}" />
		<br> 
		<input name="mult1" type="number" class="textBox" value="${form.mult1}" />*
		<input name="mult2" type="number" class="textBox" value="${form.mult2}" />=
		<input name="product" type="text" class="textBox" />
		<br>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>
