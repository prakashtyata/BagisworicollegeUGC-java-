<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/resources/images/icons/logo.png">
<title>${errorMsg}</title>
<!-- Custom Theme files -->
<link
	href="${pageContext.request.contextPath}/resources/assets/css/stylel.css"
	rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<!-- <link
	href='//fonts.googleapis.com/css?family=Athiti:400,200,300,500,600,700'
	rel='stylesheet' type='text/css'> -->
<!-- //web font -->
</head>
<body>

	<div class="logo-img">
		<img
			src="${pageContext.request.contextPath}/resources/images/icons/logo.png"
			class="img-responsive" width="80" height="80">
	</div>
	<div class="head-text">
		<h2>
			<a href="${pageContext.request.contextPath}/" style="color: #fff;">BAGISWORI
				COLLEGE</a>
		</h2>
	</div>
	<h1 style="color: #fff; text-align: center;">${errorMsg}</h1>

	<!-- copyright -->
	<div class="copyright">
		<p>
			© 2017 Bagiswori College. All Rights Reserved | Design by <a href="#"
				target="_blank">RPS</a>
		</p>
	</div>
	<!-- //copyright -->
</body>
</html>