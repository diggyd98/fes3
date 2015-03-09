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

<style>
	div.scroll
	{
		width:300px;
		height:198px;
		overflow:scroll;
	}
</style>

<body>

<div id="container" style="width:3000px">

<div id="header" style="background-color:#FFA500;">
<h1 style="margin-bottom:0;">Enter Items Page</h1></div>
<!-- <logic:present name="customerID"><h2><bean:write name="customerID"></bean:write></h2></logic:present> -->

<div id="menu" style="background-color:#FFD700;height:200px;width:130px;float:left;">
<b>Main Menu</b>
<br>
<br>
<a href="selectItem.do?method=list">Select Item</a>
</div>

<div id="content" style="background-color:#EEEEEE;height:200px;width:300px;float:left;">
<logic:present name="addItem">
	<h3> Select Item</h3>
	<html:form action="placeOrder.do?method=addItem">
		<table border="1">
		 	<tr>
	<logic:present name="itemID">		 	
		 		<td>Item ID:</td><td><html:text property="itemID" value="${requestScope.itemID}"/></td>
		 		<logic:present name="ErrorItem"><span style="color:red"><bean:write name="ErrorItem"/></logic:present></span>
	</logic:present>
	<logic:notPresent name="itemID">
				<td>Item ID:</td><td><html:text property="itemID" value=""/></td>
				<logic:present name="ErrorItem"><span style="color:red"><bean:write name="ErrorItem"/></logic:present></span>
	</logic:notPresent>		 		
			</tr>
			<tr>
		 		<td>Item Quantity:</td><td><html:text property="itemQuantity"/></td>
		 		<logic:present name="ErrorQuantity"><span style="color:red"><bean:write name="ErrorQuantity"/></logic:present></span> 
			</tr>
			<tr>
		 		<td></td><td><html:submit>Add Item</html:submit></td>
		 	</tr>
	 	</table> 
	 </html:form>
</logic:present>	 

<logic:present name="editLineItem">
	<html:form action="placeOrder.do?itemID=${sessionScope.editLineItem.item.itemID}">
		<table border="1">
			<tr>
				<td>Item ID</td>
				<td><html:text property="itemID" value="${sessionScope.editLineItem.item.itemID}" disabled="true"/></td>
			</tr>
			<tr>
				<td>Item Quantity</td><td><html:text property="itemQuantity" value=""/></td>
				<logic:present name="ErrorQuantity"><span style="color:red"><bean:write name="ErrorQuantity"/></logic:present></span> 
			</tr>
			<tr>
				<td><html:submit property="method" value="edit">Submit Change</html:submit></td>
				<td><html:submit property="method" value="delete">Remove Item</html:submit></td>	
		</table>
	</html:form>
</logic:present>	 
</div>

<div id="content" style="background-color:#EEEEEE;height:200px;width:300px;float:left;">
<div class="scroll">
	<h3> Invoice# ${sessionScope.order.invoiceNumber}: Select Line Item</h3>
		<table border="1">
<logic:iterate name="lineItems" id="li">
		 	<tr>
		 		<td>${li.item.itemID}</td>
		 		<td><a href="/eHRMS/placeOrder.do?method=${li.item.itemID}" style="color: #6600FF">
		 			${li.item.itemName}</a></td>
		 		<td>${li.itemQuantity}</td><td>${li.item.itemRetailCost}</td>
			</tr>
</logic:iterate>
	 	</table> 
</div><br><br>
	<html:form action="placeOrder.do?method=confirmOrder">
		<table><tr><td></td><html:submit>Submit Order</html:submit><td></table>
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