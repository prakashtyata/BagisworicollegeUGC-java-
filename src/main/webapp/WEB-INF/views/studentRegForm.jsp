<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/resources/images/icons/logo.png">
<title>Registration Form: Bagiswori College</title>

<!-- BOOTSTRAP STYLES-->
<link
	href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.css"
	rel="stylesheet" />
<!-- FONTAWESOME STYLES-->
<link
	href="${pageContext.request.contextPath}/resources/assets/css/font-awesome.css"
	rel="stylesheet" />
<!-- MORRIS CHART STYLES-->
<link
	href="${pageContext.request.contextPath}/resources/assets/js/morris/morris-0.4.3.min.css"
	rel="stylesheet" />
<!-- CUSTOM STYLES-->
<link
	href="${pageContext.request.contextPath}/resources/assets/css/custom.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/assets/css/hover.css"
	rel="stylesheet" />

<link
	href="${pageContext.request.contextPath}/resources/assets/css/style.css"
	rel="stylesheet" />


<!-- GOOGLE FONTS-->
<!-- <link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' /> -->


<script
	src="${pageContext.request.contextPath}/resources/assets/js/jquery-1.10.2.js"
	type="text/javascript"></script>

<script
	src="${pageContext.request.contextPath}/resources/assets/js/jquery-scrolltofixed-min.js"
	type="text/javascript"></script>


<!-- start-smooth-scrolling -->
<script>
	$(document).ready(function() {

		// Dock the header to the top of the window when scrolled past the banner.
		// This is the default behavior.

		$('.navbar').scrollToFixed();
	});
</script>



<!-- start-smooth-scrolling -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/move-top.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/easing.js"></script>

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
	<div id="wrapper">
		<%@include file="/resources/assets/common/adminHeader.jsp"%>
		<!-- page-wrapper for content panel -->
		<div id="page-wrapper">
			<!-- page-inner for content panel -->
			<div id="page-inner">

				<div class="panel-heading">
					<h2>Student Registration Form</h2>
				</div>
				<hr>
				<form:form
					action="${pageContext.request.contextPath}/admin/student/create"
					method="post" modelAttribute="student">
					<div class="row">
						<div class="col-md-4 col-sm-4">
							<div class="form-group">
								<label for="registration">Registration No.:</label> <form:input
									type="text" name="registration" placeholder="Registration no."
									class="form-control" required="" path="registrationNo"/>
							</div>
						</div>
						<div class="col-md-4 col-sm-4">
							<div class="form-group">
								<label for="rollno">College Roll No.:</label> <form:input type="text"
									name="collegeRoll" placeholder="roll no." class="form-control"
									required="" path="collegeRollNo"/>
							</div>
						</div>
						<div class="col-md-4 col-sm-4">
							<div class="form-group">
								<label for="image">Photo :</label> <input type="file"
									name="image" class="form-control">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4 col-sm-4">
							<div class="form-group">
								<label for="fname">First Name:</label> <form:input type="text"
									name="firstName" placeholder="First name" class="form-control"
									required="" path="firstName"/>
							</div>
						</div>
						<div class="col-md-4 col-sm-4">
							<div class="form-group">
								<label for="fname">Middle Name:</label> <form:input type="text"
									name="middleName" placeholder="middle name"
									class="form-control" path="middleName" />
							</div>
						</div>
						<div class="col-md-4 col-sm-4">
							<div class="form-group">
								<label for="fname">Last Name:</label> <form:input type="text"
									name="lastName" placeholder="last name" class="form-control"
									required="" path="lastName"/>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-3 col-sm-3">
							<div class="form-group">
								<label for="gender">Gender:</label> <select name="gender"
									class="form-control">
									<option value="male">Male</option>
									<option value="female">Female</option>
									<option value="other">other</option>
								</select>
							</div>
						</div>
						<div class="col-md-3 col-sm-3">
							<div class="form-group">
								<label for="dob">Date of Birth:</label> <form:input type="Date"
									name="dateOfBirth" class="form-control" required="" path="dateOfBirth"/>
							</div>
						</div>
						<div class="col-md-3 col-sm-3">
							<div class="form-group">
								<label for="nationality">Nationality:</label> <form:input type="text"
									name="nationality" class="form-control"
									placeholder="nationality" path="nationality"/>
							</div>
						</div>
						<div class="col-md-3 col-sm-3">
							<div class="form-group">
								<label for="religion">Religion:</label> <form:input type="text"
									name="religion" class="form-control" placeholder="religion" path="religion"/>
							</div>
						</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-md-4 col-sm-4">
							<div class="form-group">
								<label for="parentsName">Parent's Name:</label> <input
									type="text" name="parentsName" class="form-control"
									placeholder="parent's name" required="">
							</div>
						</div>
						<div class="col-md-4 col-sm-4">
							<div class="form-group">
								<label for="ethinicgroup">Ethnic group:</label> <select
									class="form-control" name="ethnicsGroup">
									<option value="madhesi">Madhesi</option>
									<option value="janajati">Janajati</option>
									<option value="bahun">Bahun</option>
									<option value="chetry">Chetry</option>
									<option value="other">Other</option>
								</select>
							</div>
						</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-md-12 col-sm-12">
							<table class="table table-bordered">
								<h3>Educational Background</h3>
								<thead>
									<tr>
										<th>Year</th>
										<th>Board</th>
										<th>Symbol No.</th>
										<th>Division/Grade</th>
										<th>Institute</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td><input type="text" name="eduyear1" required=""></td>
										<td><input type="text" name="eduboard1" required=""
											placeholder="SEE"></td>
										<td><input type="text" name="edusym1"></td>
										<td><input type="text" name="edugrade1"></td>
										<td><input type="text" name="eduinstitute1" required=""></td>
									</tr>
									<tr>
										<td><input type="text" name="eduyear2" required=""></td>
										<td><input type="text" name="eduboard2" required=""
											placeholder="HSEB"></td>
										<td><input type="text" name="edusym2"></td>
										<td><input type="text" name="edugrade2"></td>
										<td><input type="text" name="eduinstitute2" required=""></td>
									</tr>
									<tr>
										<td><input type="text" name="eduyear3" required=""></td>
										<td><input type="text" name="eduboard3" required=""
											placeholder="Bachelor"></td>
										<td><input type="text" name="edusym3"></td>
										<td><input type="text" name="edugrade3"></td>
										<td><input type="text" name="eduinstitute3" required=""></td>
									</tr>
									<tr>
										<td><input type="text" name="eduyear4" required=""></td>
										<td><input type="text" name="eduboard4" required=""
											placeholder="Master"></td>
										<td><input type="text" name="edusym4"></td>
										<td><input type="text" name="edugrade4"></td>
										<td><input type="text" name="eduinstitute4" required=""></td>
									</tr>

									<tr>
										<td>2012</td>
										<td>SLC</td>
										<td>0299176A</td>
										<td>A</td>
										<td>Devi Higher Secondary School</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-md-12">
							<h3>Address</h3>
						</div>
						<div class="col-md-6 col-sm-6">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th colspan="2"><h4>Permanent address</h4></th>

									</tr>

								</thead>
								<tbody>
									<tr>
										<th>Country</th>
										<td><input type="text" name="pcountry"
											style="width: 100%;" required=""></td>
									</tr>
									<tr>
										<th>State</th>
										<td><input type="text" name="pstate"></td>
									</tr>
									<tr>
										<th>Zone</th>
										<td><input type="text" name="pzone"></td>
									</tr>
									<tr>
										<th>District</th>
										<td><input type="text" name="pdistrict" required=""></td>
									</tr>
									<tr>
										<th>Muncipality/VDC</th>
										<td><input type="text" name="pmunorvdc" required=""></td>
									</tr>
									<tr>
										<th>Ward No.</th>
										<td><input type="number" name="pwardno" required=""></td>
									</tr>
								</tbody>
							</table>
						</div>
						<div class="col-md-6 col-sm-6">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th colspan="2"><h4>Temporary address</h4></th>

									</tr>

								</thead>
								<tbody>
									<tr>
										<th>Country</th>
										<td><input type="text" name="tcountry"
											style="width: 100%;"></td>
									</tr>
									<tr>
										<th>State</th>
										<td><input type="text" name="tstate"></td>
									</tr>
									<tr>
										<th>Zone</th>
										<td><input type="text" name="tzone"></td>
									</tr>
									<tr>
										<th>District</th>
										<td><input type="text" name="tdistrict"></td>
									</tr>
									<tr>
										<th>Muncipality/VDC</th>
										<td><input type="text" name="tmunorvdc"></td>
									</tr>
									<tr>
										<th>Ward No.</th>
										<td><input type="number" name="twardno"></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-md-12">
							<h3>Contact Nos</h3>
						</div>
						<div class="col-md-3 col-sm-3">
							<div class="form-group">
								<label for="moileno">Mobile No.:</label> <input type="text"
									name="mobileNo" class="form-control" required="">
							</div>
						</div>
						<div class="col-md-3 col-sm-3">
							<div class="form-group">
								<label for="phoneno">Phone No.:</label> <input type="text"
									name="phoneNo" class="form-control">
							</div>
						</div>
						<div class="col-md-3 col-sm-3">
							<div class="form-group">
								<label for="parentno">Parent's No.:</label> <input type="text"
									name="parentsNo" class="form-control">
							</div>
						</div>
						<div class="col-md-3 col-sm-3">
							<div class="form-group">
								<label for="emailid">Email Id:</label> <input type="text"
									name="emailId" class="form-control">
							</div>
						</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-md-3 col-sm-3">
							<div class="form-group">
								<label for="addmissionyear">Admission Year:</label> <input
									type="text" name="addmissionYear" class="form-control"
									required="">
							</div>
						</div>
						<div class="col-md-3 col-sm-3">
							<div class="form-group">
								<label for="faculty">Faculty:</label> <select
									class="form-control" name="faculty">
									<option value="BA">BA</option>
									<option value="BBS">BBS</option>
									<option value="MA">MA</option>
									<option value="MBS">MBS</option>
								</select>
							</div>
						</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-md-2 col-sm-2">
							<button type="submit" class="btn btn-primary">Submit</button>
							<button type="reset" class="btn btn-danger">Reset</button>
						</div>
						<div class="col-md-10 col-sm-10">
							<small>* Required field</small>
						</div>
					</div>

				</form:form>

			</div>
			<!-- // page-inner for content panel -->
		</div>
		<!-- // page-wrapper for content panel -->
		<!-- /. PAGE WRAPPER  -->
		<!-- /. WRAPPER  -->


		<div class="clearfix"></div>

		<%@include file="/resources/assets/common/adminFooter.jsp"%>


		<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->

		<!-- BOOTSTRAP SCRIPTS -->
		<script
			src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"></script>
		<!-- METISMENU SCRIPTS -->
		<script
			src="${pageContext.request.contextPath}/resources/assets/js/jquery.metisMenu.js"></script>
		<!-- MORRIS CHART SCRIPTS -->
		<script
			src="${pageContext.request.contextPath}/resources/assets/js/morris/raphael-2.1.0.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/resources/assets/js/morris/morris.js"></script>
		<!-- CUSTOM SCRIPTS -->
		<script
			src="${pageContext.request.contextPath}/resources/assets/js/custom.js"></script>
</body>
</html>
