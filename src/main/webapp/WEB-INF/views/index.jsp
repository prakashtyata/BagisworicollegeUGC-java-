<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Index page</title>
</head>
<body>
	<h1>Welcome!</h1>
	Click
	<a href="<spring:url value='/login' />">Login</a> to see a login page
</body>
</html>