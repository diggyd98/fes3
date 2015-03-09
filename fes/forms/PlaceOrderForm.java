package cc.multivision.ehrms.fes.forms;

import org.apache.struts.validator.ValidatorForm;

public class PlaceOrderForm extends ValidatorForm {
	String customerID;
	String itemID;
	String itemQuantity;
	String itemCustomerCost;
	String invoiceNumber;
	
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public String getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public String getItemCustomerCost() {
		return itemCustomerCost;
	}
	public void setItemCustomerCost(String itemCustomerCost) {
		this.itemCustomerCost = itemCustomerCost;
	}
}
