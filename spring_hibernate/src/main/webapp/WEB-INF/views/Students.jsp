<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<title>Spring MVC Hello World</title>
</head>

<body>
	<h2>All Students in System</h2>

	<table border="1">
		<tr>
			<th> Id</th>
			<th> Name</th>
			<th> Country</th>
			<th>  Mobile </th>
		</tr>
		<c:forEach items="${Students}" var="Students">
			<tr>
				<td>${Students.id}</td>
				<td>${Students.name}</td>
				<td>${Students.country}</td>
				<td>${Students.mobile}</td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>