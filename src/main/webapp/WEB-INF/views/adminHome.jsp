<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin | Home</title>
</head>
<body>
	<h1>
		Welcome <b>${user}</b> ! To Home Page
	</h1>

	<br />
	
	<a href="<%=request.getContextPath()%>/admin/webservice/event"> event </a>

	<form action="<%=request.getContextPath()%>/logout" method="POST">
		<input type="submit" value="Logout" /> <input type="hidden"
			name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>

</body>
</html>