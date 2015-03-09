<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Page</title>
</head>
<body>

<div id="container" style="width:3000px">

<div id="header" style="background-color:#FFA500;">
<logic:notPresent name="orderConfirmed"><h1 style="margin-bottom:0;">Customer Order Page</h1></logic:notPresent>
<logic:present name="orderConfirmed"><h1 style="margin-bottom:0;">
	Customer Order Page: <bean:write name="orderConfirmed"></bean:write></h1>
</logic:present>
</div>

<div id="menu" style="background-color:#FFD700;height:200px;width:130px;float:left;">
<b>Main Menu</b>
<br>
<br>
<a href="addCustomer.do?method=initial">New Customer</a>
<br>
<br>
<a href="selectCustomer.do?method=existing">Existing Customer</a>
</div>

<div id="content" style="background-color:#EEEEEE;height:200px;width:300px;float:left;">
	<h3> Please enter order data:</h3>
	<html:form action="placeOrder.do?method=createOrder">
		<table border="1">
		 	<tr>
		 		<td>Customer ID:</td><logic:present name="Error">
		 			<span style="color:red"><bean:write name="Error"/></logic:present></span>
<logic:present name="customerID">
				<td><html:text property="customerID" value="${requestScope.customerID}"></html:text></td>
</logic:present>
<logic:notPresent name="customerID">
				<td><html:text property="customerID" value=""></html:text></td><html:errors/>
</logic:notPresent>		 		
			</tr>
			<tr>
		 		<td></td><td><html:submit></html:submit></td>
		 	</tr>
	 	</table> 
	 </html:form>
</div>
<%request.removeAttribute("customerList"); request.removeAttribute("Error");%>

<div id="menu" style="background-color:#FFD700;height:200px;width:1000px;float:left;"></div>
<div id="footer" style="background-color:#FFA500;clear:both;text-align:center;">
Copyright © FE3Systems</div>

<div id="footer" style="background-color:#FFA500;clear:both;text-align:center;">
Copyright © FE3Systems</div>
 
</div>

</body>
</html>