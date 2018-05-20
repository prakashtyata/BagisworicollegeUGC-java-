<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>test of event</title>

<script type='text/javascript'>
function preview_image(event) 
{
 var reader = new FileReader();
 reader.onload = function()
 {
  var output = document.getElementById('output_image');
  output.src = reader.result;
 }
 reader.readAsDataURL(event.target.files[0]);
}
</script>


</head>

<body>
	<form:form modelAttribute="event"  action="${pageContext.request.contextPath}/admin/webservice/event/add" method="POST">
	
	
  start time:<br>
		<form:input type="time" path="startTime"/>
		<br>
  start date:<br>
		<form:input type="date" path="startDate" />
		<br>
		<br>
	Image:<br>
		<input type="file"  onchange="preview_image(event)" path="eventImg">
 <img id="output_image"/>
		
		

		
		
		<br>
		
		
  Content <br>
		<form:input	path="eventContent" />
		<input type="submit" name="Submit" >
	</form:form>
	
	<table width="90%">
                               <tr style="background-color: gray;">
                               			<th>ID</th>
                                         <th>Time</th>
                                         <th>Date</th>
                                          <th>Content</th>
                                          
                                        </tr>
                                        <c:forEach items="${events}" var="event">
                                                <tr style="background-color: silver;" id="${event.id}" onclick="setUpdateForm('${event.id}');">
                                                        <td><c:out value="${event.id}"/></td>
                                                        <td><c:out value="${event.startTime}"/></td>
                                                        <td><c:out value="${event.startDate}"/></td>
                                                        <td><c:out value="${event.eventContent}"/></td>
                                                </tr>
                                        </c:forEach>
                                </table>
	
	
	
	

</body>
</html>