<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="shortcut icon" href="images/logo.png">
<title>Bagiswori College</title>

<!-- BOOTSTRAP STYLES-->
<link href="<c:url value='/resources/assets/css/bootstrap.css'/>" rel="stylesheet" />
<!-- FONTAWESOME STYLES-->
<link href="<c:url value='/resources/assets/css/font-awesome.css'/>" rel="stylesheet" />
<!-- MORRIS CHART STYLES-->
<link href="<c:url value='/resources/assets/js/morris/morris-0.4.3.min.css'/>" rel="stylesheet" />
<!-- CUSTOM STYLES-->
<link href="<c:url value='/resources/assets/css/custom.css'/>" rel="stylesheet" />
<link href="<c:url value='/resources/assets/css/hover.css'/>" rel="stylesheet" />



<link href="<c:url value='/resources/assets/css/style.css'/>" rel="stylesheet" />
<!-- <script src='https://www.google.com/recaptcha/api.js'></script> -->

<!-- GOOGLE FONTS-->
<link href="<c:url value='http://fonts.googleapis.com/css?family=Open+Sans' />"	rel='stylesheet' type='text/css' />


<script src="<c:url value='/resources/assets/js/jquery-1.10.2.js'/>" type="text/javascript"></script>

<script src="<c:url value='/resources/assets/js/jquery-scrolltofixed-min.js'/>" 	type="text/javascript"></script>
<script type="text/javascript" 	src="<c:url value='https://cdn.ckeditor.com/4.7.0/standard/ckeditor.js'/>"></script>


<!-- start-smooth-scrolling -->
<script>
	$(document).ready(function() {

		// Dock the header to the top of the window when scrolled past the banner.
		// This is the default behavior.

		$('.navbar').scrollToFixed();

	});
</script>




<!-- start-smooth-scrolling -->
<script type="text/javascript" src="<c:url value='/resources/assets/js/move-top.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resources/assets/js/easing.js'/>"></script>

<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate({
				scrollTop : $(this.hash).offset().top
			}, 1000);
		});
	});
</script>
<!-- //end-smooth-scrolling -->

<!-- smooth-scrolling-of-move-up -->
<script type="text/javascript">
	$(document).ready(function() {

		var defaults = {
			containerID : 'toTop', // fading element id
			containerHoverID : 'toTopHover', // fading element hover id
			scrollSpeed : 1200,
			easingType : 'linear'
		};

		$().UItoTop({
			easingType : 'easeOutQuart'
		});

	});
</script>
<!-- //smooth-scrolling-of-move-up -->

</head>
<body>

	<!-- <div class="g-recaptcha" data-sitekey="6LfHJSYUAAAAAM9wIEmo7CFUksQ_HSnbIau-rw5f"></div> -->




	<div id="wrapper">

		<!-- Header start-->
		<header>
			<div class="header-above">
				<div class="container">
					<div class="row">
						<div class="col-md-2 col-sm-3 col-xs-3 logo-img">
							<img src="images/logo.png">
						</div>
						<div class="col-md-10 col-sm-9 col-xs-9 head-text">
							<h1>BAGISWORI COLLEGE</h1>
							<p>Tumacho,Kamalbinayak, Bhaktapur-1</p>
						</div>
					</div>
				</div>
			</div>
		</header>

		<!-- Header end-->


		<!-- Task bar nav bar start -->
		<nav class="navbar navbar-default navbar-cls-top" data-top="0"
			data-scroll="200" role="navigation" style="margin-bottom: 0">

			<!-- class navbar-header target the class sidebar-collapse-->
			<div class="navbar-header">
				<a class="navbar-brand" href="index.html">Admin Name</a>
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".sidebar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

			</div>

			<div class="header-right">

				<div class="profile_details_left">
					<!--notifications of menu start -->
					<ul class="nofitications-dropdown">
						<li class="dropdown head-dpdn"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown"
							aria-expanded="false"><i class="fa fa-envelope fa-2x"></i><span
								class="badge">3</span></a>
							<ul class="dropdown-menu">
								<li>
									<div class="notification_header">
										<h3>You have 3 new messages</h3>
									</div>
								</li>
								<li><a href="#">
										<div class="user_img">
											<img src="images/p4.png" alt="">
										</div>
										<div class="notification_desc">
											<p>Lorem ipsum dolor</p>
											<p>
												<span>1 hour ago</span>
											</p>
										</div>
										<div class="clearfix"></div>
								</a></li>
								<li class="odd"><a href="#">
										<div class="user_img">
											<img src="images/p2.png" alt="">
										</div>
										<div class="notification_desc">
											<p>Lorem ipsum dolor</p>
											<p>
												<span>1 hour ago</span>
											</p>
										</div>
										<div class="clearfix"></div>
								</a></li>
								<li><a href="#">
										<div class="user_img">
											<img src="images/p3.png" alt="">
										</div>
										<div class="notification_desc">
											<p>Lorem ipsum dolor</p>
											<p>
												<span>1 hour ago</span>
											</p>
										</div>
										<div class="clearfix"></div>
								</a></li>
								<li>
									<div class="notification_bottom">
										<a href="#">See all messages</a>
									</div>
								</li>
							</ul></li>
						<li class="dropdown head-dpdn"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown"
							aria-expanded="false"><i class="fa fa-bell fa-2x"></i><span
								class="badge blue">3</span></a>
							<ul class="dropdown-menu">
								<li>
									<div class="notification_header">
										<h3>You have 3 new notification</h3>
									</div>
								</li>
								<li><a href="#">
										<div class="user_img">
											<img src="images/p5.png" alt="">
										</div>
										<div class="notification_desc">
											<p>Lorem ipsum dolor</p>
											<p>
												<span>1 hour ago</span>
											</p>
										</div>
										<div class="clearfix"></div>
								</a></li>
								<li class="odd"><a href="#">
										<div class="user_img">
											<img src="images/p6.png" alt="">
										</div>
										<div class="notification_desc">
											<p>Lorem ipsum dolor</p>
											<p>
												<span>1 hour ago</span>
											</p>
										</div>
										<div class="clearfix"></div>
								</a></li>
								<li><a href="#">
										<div class="user_img">
											<img src="images/p7.png" alt="">
										</div>
										<div class="notification_desc">
											<p>Lorem ipsum dolor</p>
											<p>
												<span>1 hour ago</span>
											</p>
										</div>
										<div class="clearfix"></div>
								</a></li>
								<li>
									<div class="notification_bottom">
										<a href="#">See all notifications</a>
									</div>
								</li>
							</ul></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<!--notification menu end -->
				<div class="profile_details">
					<ul>
						<li class="dropdown profile_details_drop"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown"
							aria-expanded="false">
								<div class="profile_img">
									<span class="prfil-img"><img height=40 width=40
										src="assets/img/principal.jpg" alt="profile picture"
										class="img-circle"> </span>
									<div class="user-name">
										<p>Rajaram Pakur</p>

									</div>
									<i class="fa fa-angle-down lnr"></i> <i
										class="fa fa-angle-up lnr"></i>
									<div class="clearfix"></div>
								</div>
						</a>
							<ul class="dropdown-menu drp-mnu">
								<li><a href="#"><i class="fa fa-cog"></i> Settings</a></li>
								<li><a href="#"><i class="fa fa-user"></i> Profile</a></li>
								<li><a href="#"><i class="fa fa-sign-out"></i> Logout</a></li>
							</ul></li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</nav>
		<!-- // Task bar nav bar end-->

		<!-- side bar nav menu start admin-->
		<nav class="navbar-default navbar-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav" id="main-menu">
					<li class="text-center"><img src="assets/img/principal.jpg"
						class="user-image img-responsive" /></li>
					<li><a href="admin.html"><i class="fa fa-dashboard fa-2x"></i>
							Dashboard</a></li>
					<li><a href="websiteManagement.html"><i
							class="fa fa-desktop fa-2x"></i> Website Management</a></li>
					<li><a class="active-menu" href="#"><i
							class="fa fa-pencil fa-2x"></i> News Portal Management</a></li>
					<li><a href="#"><i class="fa fa-user fa-2x"></i> Student
							Management<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="#">Student Registration</a></li>
							<li><a href="#">List of Students</a></li>
							<li><a href="#">Students Evaluation</a></li>
						</ul></li>
					<li><a href="#"><i class="fa fa-group fa-2x"></i> Staff
							Management<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="#">Staff Registration</a></li>
							<li><a href="#">List of Staffs</a></li>
						</ul></li>
					<li><a href="#"><i class="fa fa-book fa-2x"></i> Course
							Management<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="#">Course Registration</a></li>
							<li><a href="#">List of Courses</a></li>
						</ul></li>
					<li><a href="#"><i class="fa fa-graduation-cap fa-2x"></i>
							Result Management</a></li>
					<li><a href="#"><i class="fa fa-calendar fa-2x"></i> Event
							& Notice</a></li>
					<li><a href="#"><i class="fa fa-edit fa-2x"></i> Exam
							Management <span class="fa arrow"></a>
						<ul class="nav nav-second-level">
							<li><a href="#">Exam Scheduling</a></li>
						</ul></li>
					<li><a href="#"><i class="fa fa-cogs fa-2x"></i>
							Administration</a></li>
				</ul>

			</div>

		</nav>
		<!-- // side bar nav menu start admin-->













		<form:form modelAttribute="event"
			action="${pageContext.request.contextPath}/admin/webservice/event/add"
			method="POST">






			<div id="page-wrapper">
				<!-- page-inner for content panel -->
				<div id="page-inner">

					<!-- website services  -->
					<div class="row">
						<div class="col-md-9 col-sm-9 col-xs-9">

							<div class="panel panel-default">
								<div class="panel-heading">
									<h2>Event</h2>
								</div>
								<br>

								<!-- after change into unicode -->

								<div class="form-group">
									<form:input class="form-control" name="title" type="text"
										placeholder="Title?" path="eventSlug"/>
								</div>
								<div class="form-group">
									<form:textarea name="description" path="eventContent"></form:textarea>

									<script type="text/javascript">
										CKEDITOR.replace('description');
									</script>





								</div>

								<div class="form-group">
									<div class="row">
										<div class="col-md-3">
											<label>Images</label> <input class="form-control"
												name="image" type="file">
										</div>
										<div class="col-md-3">
											<label>Starting Date</label>
											<div class="form-group">
												<form:input id="date" type="date" path="startDate"></form:input>
											</div>
										</div>


										<div class="col-md-3">
											<label>Ending Date</label>
											<div class="form-group">
												<form:input id="date" type="text" path="endDate"></form:input>
											</div>
										</div>
									</div>


									<div class="row">
										<div class="col-md-3">
											<label>Time</label>
											<div class="form-group">
												<form:input id="time" type="time" path="startTime"></form:input>
											</div>
										</div>


										<div class="col-md-3">
											<label>Duration</label>
											<div class="form-group">
												<form:input id="textduration" type="text" path="duration"></form:input>
											</div>
										</div>



										<div class="col-md-3">
											<label>Location</label>
											<div class="form-group">
												<form:input id="text" type="text" path="location"></form:input>
											</div>
										</div>
									</div>

								</div>

								<div class="row">
									<div class="col-md-9">
										<label>Tags</label>
										<div class="form-group">
											<form:input class="form-control" name="title" type="text"
												path="eventTags"
												placeholder="Enter news keywords like : education, politician, sociology, economics etc."></form:input>
										</div>
									</div>
								</div>
								<!-- //after change into unicode -->

							</div>
							
							<input type="submit" value="Upload New" />
							
							<div class="panel-footer">
								<a class="btn btn-success"> Upload </a> <a
									class="btn btn-danger"> Reset </a>
							</div>


						</div>









						<div class="panel-heading">
							<h2>Recent Event</h2>
						</div>
						<div class="row">
						
						<% int count=0;
							
						
						%>
							<c:forEach items="${events}" var="event" >
								<a href="#">
									<div class="col-md-3 col-sm-3 col-xs-3">
										<p>${event.eventSlug}</p>
										<span class="text-muted">Posted On : ${event.createdAt}
										</span><a href="#" class="hvr-icon-forward"> More</a>
										
									</div>
								</a>
							</c:forEach>
						</div>







					</div>
		</form:form>


















		<!-- page-wrapper for content panel -->


		<!-- // website services -->


		<!-- other web desk contents row -->



		<!-- //other web desk contents row -->

		<div class="row">
			<div class="col-md-12 col-sm-12">
				<div class="panel panel-info">
					<div class="panel-heading">List of Old News</div>
					<div class="panel-body">
						<p>Regarding the rapidly transforming global academic
							environment, and increasing value of education, the college has
							developed the following as its objectives:
						<ul>
							<li>Develop Bagiswori College as one of the most reputed and
								preferred learning centres with academic excellence in the
								nation.</li>
							<li>Make this college accessible and affordable to all who
								wish to develop their career with standard academic
								qualification.</li>
							<li>Promote a culture of treating everyone with dignity,
								respect and impartiality.</li>
							<li>Sustain excellence in teaching, research and public
								engagement.</li>
						</ul>
						</p>
					</div>
					<div class="panel-footer">
						<div class="news-index-footer">
							<span><a href="#" class="hvr-icon-forward"> More news</a></span>
						</div>
					</div>
				</div>
			</div>
		</div>





	</div>
	<!-- // page-inner for content panel -->
	</div>
	<!-- // page-wrapper for content panel -->
	<!-- /. PAGE WRAPPER  -->
	</div>
	<!-- /. WRAPPER  -->


	<div class="clearfix"></div>


	<!-- Footer -->


	<footer class="text-center">

		<div class="footer-below">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<p>
							© 2017 Bagiswori College. All Rights Reserved | Design by <a
								href="#" target="_blank">RPS</a>
						</p>
					</div>
				</div>
			</div>

		</div>
	</footer>

	<!-- // footer -->


	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->

	<!-- BOOTSTRAP SCRIPTS -->
	<script src="<c:url value='assets/js/bootstrap.min.js'/>"></script>
	<!-- METISMENU SCRIPTS -->
	<script src="<c:url value='assets/js/jquery.metisMenu.js'/>"></script>
	<!-- MORRIS CHART SCRIPTS -->
	<script src="<c:url value='assets/js/morris/raphael-2.1.0.min.js'/>"></script>
	<script src="<c:url value='assets/js/morris/morris.js'/>"></script>
	<!-- CUSTOM SCRIPTS -->
	<script src="<c:url value='assets/js/custom.js'/>"></script>




</body>
</html>
