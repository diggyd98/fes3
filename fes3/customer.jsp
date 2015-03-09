<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib uri="taglib272.tld" prefix="s" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Page</title>
</head>
<body>

<div id="container" style="width:3000px">

<div id="header" style="background-color:#FFA500;">
<h1 style="margin-bottom:0;">FES3 CSR Portal</h1></div>

<div id="menu" style="background-color:#FFD700;height:200px;width:130px;float:left;">
<b>Main Menu</b>
<br>
<br>
<a href="csrtransition.do?method=newCustomer">New Customer</a>
<br>
<br>
<a href="csrtransition.do?method=existingCustomer">Existing Customer</a>
<br>
</div>

<div id="content" style="background-color:#EEEEEE;height:200px;width:400px;float:left;">

<logic:present name="SuccessAdd"><h2><bean:write name="SuccessAdd"></bean:write></h2></logic:present>
<logic:present name="SuccessUpdate"><h2><bean:write name="SuccessUpdate"></bean:write></h2></logic:present>

<logic:present name="Customer">
<s:ScrollDiv title="Click to scroll" style="width:400px;height:198px;border:1px solid blue;overflow:hidden"> 
<logic:iterate name="Customer" id="cust">
	<table border="1">
 	<tr>
 		<td>Customer ID:</td><td><bean:write name="cust" property="customerID"/></td>
	</tr>
 	<tr>
 		<td>Customer Name</td><td><bean:write name="cust" property="customerName"/></td>
 	</tr>
 	<tr>
 		<td>Customer Address</td><td><bean:write name="cust" property="customerAddress"/></td>
 	</tr>
 	<tr>
 		<td>Customer Phone</td><td><bean:write name="cust" property="customerPhone"/></td>
 	</tr>
 </table> 
 <br><br>
</logic:iterate>
<%request.removeAttribute("Customer"); %>
</s:ScrollDiv> 
</logic:present>
<h3><html:errors/></h3>
<logic:present name="Error"><h2><bean:write name="Error"></bean:write></h2> </logic:present>
	
<logic:present name="addCustomer">
	<h3 color="blue"> Please enter customer data:</h3>
	<html:form action="addCustomer.do?method=addCust">
		<table color="blue" border="1">
		 	<!-- <tr>
		 		<td>Customer ID:</td><td><html:text property="customerID" value=""></html:text></td><html:errors/>
			</tr> -->
		 	<tr>
		 		<td>Customer Name</td><td><html:text property="customerName" value=""></html:text></td>
		 	</tr>
		 	<tr>
		 		<td>Customer Address</td><td><html:text property="customerAddress" value=""></html:text></td>
		 	</tr>
		 	<tr>
		 		<td>Customer Phone</td><td><html:text property="customerPhone" value=""></html:text></td>
		 	</tr>
		 	<tr>
		 		<td></td><td><html:submit></html:submit></td>
		 	</tr>
	 	</table> 
	 </html:form>
	 <%request.removeAttribute("addCustomer"); %>
</logic:present>

<logic:present name="updateCustomer">
	<h3 color="blue"> Please update customer data:</h3>
	<html:form action="addCustomer.do?method=updateCust&custID=${requestScope.updateCustomer.customerID}">
		<table style="color:blue" border="1">
		 	<tr>
		 		<td>Customer ID:</td><td><html:text property="customerID" 
		 			value='${requestScope.updateCustomer.customerID}' disabled="true">
		 			</html:text></td><html:errors/>
			</tr>
		 	<tr>
		 		<td>Customer Name</td><td><html:text property="customerName"
		 			value='${requestScope.updateCustomer.customerName}'></html:text></td>
		 	</tr>
		 	<tr>
		 		<td>Customer Address</td><td><html:text property="customerAddress"
		 			value='${requestScope.updateCustomer.customerAddress}'></html:text></td>
		 	</tr>
		 	<tr>
		 		<td>Customer Phone</td><td><html:text property="customerPhone" 
		 			value='${requestScope.updateCustomer.customerPhone}'></html:text></td>
		 	</tr>
		 	<tr>
		 		<td></td><td><html:submit></html:submit></td>
		 	</tr>
	 	</table> 
	 </html:form>
	 <%request.removeAttribute("updateCustomer"); %>
</logic:present>

</div>
<div id="menu" style="background-color:#FFD700;height:200px;width:1000px;float:left;"></div>
<div id="footer" style="background-color:#FFA500;clear:both;text-align:center;">
Copyright © FE3Systems</div>

</div>
 
</body>
</html>