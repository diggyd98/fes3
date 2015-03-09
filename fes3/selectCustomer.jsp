<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib uri="taglib272.tld" prefix="s" %> 
<%@ page import="cc.multivision.ehrms.fes.dbbeans.Customer" %>

<html>
<head>
<style>
	div.scroll
	{
		width:300px;
		height:198px;
		overflow:scroll;
	}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select Customer</title>
</head>
<body>

<div id="container" style="width:3000px"> 

<div id="header" style="background-color:#FFA500;">
<h1 style="margin-bottom:0;">FES3 CSR Portal</h1></div>

<div id="menu" style="background-color:#FFD700;height:200px;width:3000px;float:left;">
<logic:notPresent name="customerList">
<b>Main Menu</b>
<br>
<br>
</logic:notPresent>

<div id="menu" style="background-color:#FFD700;height:200px;width:130px;float:left;">
<a href="csrtransition.do?method=custorders">Order</a>
</div>

<div id="content" style="background-color:#EEEEEE;height:200px;width:300px;float:left;">
<!-- <logic:present name="Error"><bean:write name="SuccessUpdate"/></logic:present> -->

<logic:present name="customerList">
  	<div class="scroll">
		<table>
<logic:iterate name="customerList" id="cust">
	 		<tr>
	 			<td><a href="/eHRMS/selectCustomer.do?method=${pageScope.cust.customerID}" style="color: #6600FF">
	 				${pageScope.cust.customerName}</a>
	 			</td> 
	 			<td>${pageScope.cust.customerPhone}</td>
			</tr>
</logic:iterate>
		</table> 
 		<br>
 	</div>
	<%request.removeAttribute("customerList");%> 
</logic:present>
</div>
<br>
<br>
<br>
</div>

<!--   <div id="content" style="background-color:#EEEEEE;height:200px;width:400px;float:left;"> 
<h2 style="color:blue">Please make your selection:</h2></div> -->

<div id="footer" style="background-color:#FFA500;clear:both;text-align:center;">
Copyright © FE3Systems</div>

 </div> 
 
</body>
</html>