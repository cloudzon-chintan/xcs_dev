<!--  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	${active.userid}
 	${active.userName}
 	${active.email}
 	
</body>
</html>
-->

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>User Confirmation</title>
</head>
<body>
  
<form:form  commandName="userMaster" action="activateUser" method="POST">
<center>  
	<h2>User Confirmation</h2>
    <table>
   <form:hidden path="userid"/>
   <form:hidden path="active"/>
   <tr>
   		<c:if test ="${not empty errorMessage}">
   			${errorMessage}
   		</c:if>
   </tr>
    <tr>
        <td>Password</td>
        <td><form:password path="password"/></td>
        <td><form:errors path="password"/>
    </tr>
   	<tr>
        <td>Retype Password</td>
        <td><form:password path="retypePassword"/></td>
        <td><form:errors path="retypePassword"/>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <input type="submit" value="Submit" />
        </td>
    </tr>
    </table>
    </center>
    </form:form> 
  
</body>
</html>