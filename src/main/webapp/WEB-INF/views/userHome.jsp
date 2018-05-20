<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>User | Home</title>
</head>
<body>
	<h1>Welcome ${user} ! To Home Page</h1>

	<br />

	<form:form method="POST" action="${pageContext.request.contextPath}/admin/student/create" modelAttribute="student">
		<input type="submit" value="Submit">
	</form:form>

	<form action="<%=request.getContextPath()%>/logout" method="POST">
		<input type="submit" value="Logout" /> <input type="hidden"
			name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>

</body>
</html>