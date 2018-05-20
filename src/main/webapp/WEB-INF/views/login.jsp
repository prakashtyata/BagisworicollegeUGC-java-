<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Login : Bagiswori College</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- Custom Theme files -->
<link href="<c:url value='/resources/assets/css/stylel.css' />"
	rel="stylesheet" type="text/css" media="all" />

<!-- web font -->
<link
	href='//fonts.googleapis.com/css?family=Athiti:400,200,300,500,600,700'
	rel='stylesheet' type='text/css'>
<!-- //web font -->
</head>
<body>
	<!-- main -->
	<div class="main-agile">
		<div class="logo-img">
			<a href="index.html"><img src="/resources/images/icons/logo.png"
				class="img-responsive" width="80" height="80"></a>
		</div>
		<div class="head-text">
			<h2>
				<a href="index.html">BAGISWORI COLLEGE</a>
			</h2>
		</div>
		<div id="w3ls_form" class="signin-form">
			<!-- Sign In Form -->
			<c:url var="loginUrl" value="/login" />
			<form id="signin" action="${loginUrl}" method="post">
				<div class="ribbon">
					<a href="#" id="flipToRecover" class="flipLink"
						title="Click Here to SignUp">Sign Up</a>
				</div>
				<h2>Sign In</h2>
				<c:if test="${param.error != null}">
					<div class="alert alert-danger">
						<h5>Invalid username and password.</h5>
					</div>
				</c:if>
				<c:if test="${param.logout != null}">
					<div class="alert alert-success">
						<h5>You have been logged out successfully.</h5>
					</div>
				</c:if>

				<p>User Name</p>
				<input type="text" id="username" name="ssoId"
					placeholder="Enter username" required="" />
				<p>Password</p>
				<input type="password" id="password" name="password"
					placeholder="Enter password" required="" /> <input type="checkbox"
					id="brand" name="remember-me"> <label for="brand"><span></span>
					Remember me ?</label> <input type="submit" value="SIGN IN">
				<div class="signin-agileits-bottom">
					<p>
						<a href="#">Forgot password ?</a>
					</p>
				</div>
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>
			<!-- //Sign In Form -->
			<!-- Sign up Form-->
			<form id="signup" action="#" method="post">
				<div class="ribbon">
					<a href="#" id="flipToRecover1" class="flipLink"
						title="Click Here to signin">Sign In</a>
				</div>
				<h3>Sign Up Form</h3>
				<p>Full Name</p>
				<input type="text" name="username" placeholder="full name"
					required="" />
				<p>Faculty</p>
				<input type="text" name="faculty" placeholder="faculty" required="" />
				<p>Batch</p>
				<input type="text" name="batch" placeholder="year" required="" />
				<p>Your Email</p>
				<input type="email" name="Email" placeholder="example@gmail.com"
					required="" /> <br> <input type="submit" value="SIGN UP">
			</form>
			<!-- Sign up Form-->
		</div>
		<!-- copyright -->
		<div class="copyright">
			<p>
				© 2017 Bagiswori College. All Rights Reserved | Design by <a
					href="#" target="_blank">RPS</a>
			</p>
		</div>
		<!-- //copyright -->
	</div>
	<!-- //main -->

	<!-- jS -->
	<script src="/resources/assets/js/jquery.min.js"></script>
	<script src="/resources/assets/js/script.js"></script>
	<!-- //js -->
</body>
</html>