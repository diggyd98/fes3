FES3 Front End System for
Online Order Entry
Dexter Boyd

Contents

Purpose…………………………………………………………………………………...3

Description of the Requirement………………………………………………………….3

High Level Class Diagram for Front End Online Order Entry System………………….4

Use Case Diagram for Front End Online Order Entry System…………………………..5

Data Flow………………………………………………………………………………...6

Database Design…………………………………………………………………………17

Document Reference…………………………………………………………………….18



Purpose
The technical design specification forms the basis for technical design, development, workflows, and procedures for using the system/product/service and all testing plans. They describe the business requirements of the Front End System for Online Order Entry module to translate into the system and application components.

Description of the Requirement
Multivision Inc. wants to automate the Front End System for Online Order Entry through a secure based system. This system would have the following features addressed under the Front End Order Entry System.

1.	Portal to receive/view orders for various online products.
2.	CSR can add, update, remove, and view customer information in the database.
3.	CSR can create new orders, update and remove.
4.	CSR can view vendor items, their costs and availability.
5.	Management can view reports specified by date, as well as view items and orders.


FES 3 Use Case:

Page Layout


Login Data Flow


Add Customer Data Flow


Remove Customer Data Flow


View Customer Data Flow


Update Customer Info Data Flow


Create Order Data Flow


View Order Data Flow


Update Order Data Flow


Remove Order Data Flow


View Item Data Flow


View Reports Data Flow




Database Design
LOGIN
EMP_ID <PK>	INTEGER – NOT NULL
USERNAME	VARCHAR – NOT NULL
PASSWORD	VARCHAR – NOT NULL
ROLE	VARCHAR – NOT NULL

ITEM
ITEM_ID <PK>	INTEGER – NOT NULL
ITEM_NAME	VARCHAR – NOT NULL
ITEM_RETAIL_COST	DOUBLE  - NOT NULL
ITEM_DESC	VARCHAR 
ITEM_CATEGORY	VARCHAR – NOT NULL

CUSTOMER
CUSTOMER_ID <PK>	INTEGER – NOT NULL
CUSTOMER_NAME	VARCHAR – NOT NULL
CUSTOMER_ADDRESS	VARCHAR – NOT NULL
CUSTOMER_PHONE	VARCHAR – NOT NULL

VENDOR
VENDOR_ID <PK>	INTEGER – NOT NULL
VENDOR_NAME	VARCHAR – NOT NULL
VENDOR_ADDRESS	VARCHAR – NOT NULL
VENDOR_PHONE	VARCHAR – NOT NULL

ORDER
INVOICE_NUMBER<PK>	INTEGER – NOT NULL
INVOICE_CUSTOMER_ID<FK(CUSTOMER)>	INTEGER – NOT NULL

LINE_ITEMS
INVOICE_NUMBER<PK><FK(ORDER)>	INTEGER - NOT NULL
ITEM_ID<PK><FK(ITEM)>	INTEGER – NOT NULL
ITEM_QUANTITY	INTEGER – NOT NULL
ITEM_CUSTOMER_COST	DOUBLE-NOT NULL

VENDOR_ITEMS
VENDOR_ID<PK><FK(VENDOR)>	INTEGER - NOT NULL
ITEM_ID<PK><FK(ITEM)>	INTEGER – NOT NULL
QUANTITY	INTEGER – NOT NULL
WHOLESALE_COST	DOUBLE – NOT NULL



Entity Relationships




Document Reference

1.	eHRMS Software Requirement Specification
2.	eHRMS System Design Specification


Document Version


Version #	
Date	
Revised By	
Reason for Change


			


			


			

Document Approval


Approver Name	
Project Role	
Signature/Electronic Approval	
Date

			

			

			

