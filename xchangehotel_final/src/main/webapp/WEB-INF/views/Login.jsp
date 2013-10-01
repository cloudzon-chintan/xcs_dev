<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<center>
	<table>
		<form:form method="post" action="userLogin" commandName="userMaster">
			<tr>
				<c:if test="${not empty errorMessage}">
  			${errorMessage}
		</c:if>
			</tr>
			<tr>
				<td><form:label path="userName">
						<spring:message code="userMaster.userName" />
					</form:label></td>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<td><form:label path="password">
						<spring:message code="userMaster.password" />
					</form:label></td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value='<spring:message code="userMaster.login"/>' /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><a href="registration">Registration</a></td>
			</tr>


		</form:form>

		<tr>
			<td>
				<form action="<c:url value="/signin/facebook" />" method="POST">
					<button type="submit">
						<img src="<c:url value="/resources/images/facebook.png" />" />
					</button>
					<input type="hidden" name="scope" value="email,user_birthday" />
				</form>
			</td>
			<td>
				
				<form id="tw_signin" action="<c:url value="/signin/twitter"/>"
					method="POST">
					<button type="submit">
						<img src="<c:url value="/resources/images/twitter.png" />" />
					</button>
				</form>
			</td>
		</tr>
	</table>

</center>