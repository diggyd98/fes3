<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Existing Customer Page</title>
</head>
<body>

<center>
<h1>FES3 CSR Portal</h1>
<logic:present name="Deleted"><h2><bean:write name="Deleted"></bean:write></h2> </logic:present>
<form action ="/eHRMS/exCustAction.do">
Customer ID: <input type="text" name="customerID">
<logic:present name="Error"><bean:write name="Error"></bean:write>
<%request.removeAttribute("Error");%></logic:present>
 
<br>
<br>
<br>
<input type="radio" name="selection" value="update">Update
<input type="radio" name="selection" value="delete">Delete
<input type="radio" name="selection" value="view">View
<input type="radio" name="selection" value="list">View All Customers
<br>
<br>
<input type="submit" value="Submit">
</form>
 
</center>

</body>
</html>