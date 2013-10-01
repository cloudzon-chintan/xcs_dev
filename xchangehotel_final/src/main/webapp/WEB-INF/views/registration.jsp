<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Employee Registration</title>
</head>
<body>
  
<form:form commandName="userMaster" action="registration" method="POST">
<center>  
	<h2>User Registration</h2>
    <table>
   <form:hidden path="userId"/>
    <tr>
        <td>User Name</td>
        <td><form:input path="userName"/></td>
        <td><form:errors path="userName"/>
    </tr>
    <tr>
        <td>Gender</td>
        <td><form:radiobutton path="gender" value="M"/>Male
			<form:radiobutton path="gender" value="F"/>Female        
        </td>
        <td><form:errors path="gender"/>
    </tr>
  	<tr>
        <td>First Name</td>
        <td><form:input path="firstName"/></td>
        <td><form:errors path="firstName"/>
    </tr>
    <tr>
        <td>Middle Name</td>
        <td><form:input path="middleName"/></td>
        <td><form:errors path="middleName"/>
    </tr>
    <tr>
        <td>Last Name</td>
        <td><form:input path="lastName"/></td>
        <td><form:errors path="lastName"/>
    </tr>
    <tr>
        <td>Date of Birth</td>
        <td><form:input path="dob" /></td>
        <td><form:errors path="dob"/>
    </tr>
    <tr>
        <td>Address</td>
        <td><form:textarea path="address"/></td>
        <td><form:errors path="address"/>
    </tr>
    <tr>
        <td>City</td>
        <td><form:input path="city"/></td>
        <td><form:errors path="city"/>
    </tr>
    <tr>
        <td>State</td>
        <td><form:input path="state"/></td>
        <td><form:errors path="state"/>
    </tr>
    <tr>
        <td>Country</td>
        <td><form:input path="country"/></td>
        <td><form:errors path="country"/>
    </tr>
    <tr>
        <td>Pincode</td>
        <td><form:input path="pincode"/></td>
        <td><form:errors path="pincode"/>
    </tr>
    <tr>
        <td>Phone Number</td>
        <td><form:input path="phoneNumber" /></td>
        <td><form:errors path="phoneNumber"/>
    </tr>
    <tr>
        <td>Fax Number</td>
        <td><form:input path="faxNumber"/></td>
        <td><form:errors path="faxNumber"/>
    </tr>
    <tr>
        <td>Mobile Number</td>
        <td><form:input path="mobileNumber"/></td>
        <td><form:errors path="mobileNumber"/>
    </tr>
    <tr>
        <td>Email</td>
        <td><form:input path="email" /></td>
        <td><form:errors path="email"/>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <input type="submit" value="Add" />
        </td>
    </tr>
    </table>
    </center>
    </form:form> 
  
</body>
</html>