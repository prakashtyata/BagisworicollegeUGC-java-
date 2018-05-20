<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Student | Home</title>
</head>
<body>
	<h1>Welcome <b>${user}</b> ! To Home Page</h1>
	
	<h2>${student.firstName}</h2><br/>
	<h2>${student.user.ssoId}</h2>
	
	<br/>
	<form action="<%=request.getContextPath()%>/logout" method="POST">
		<input type="submit" value="Logout" /> <input type="hidden"
			name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
</body>
</html>