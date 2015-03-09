package cc.multivision.ehrms.fes.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;

public class AddUpdateCustomerForm extends ValidatorForm 
{
	String customerID;
	String customerName;
	String customerAddress;
	String customerPhone;
	int custIDnum;
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public int getCustIDnum() {
		return custIDnum;
	}
	public void setCustIDnum(int custIDnum) {
		this.custIDnum = custIDnum;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	@Override
	public ActionErrors validate(ActionMapping arg0, HttpServletRequest arg1) {
		ActionErrors errors = new ActionErrors();
		
		/*try {
			custIDnum = Integer.parseInt( customerID );
		} catch( NumberFormatException nfe ) {
			System.out.println("**********************Number Format Exception Caught!*****************");
			errors.add("numFormat", new ActionMessage( "errors.illegal.number.format" ) );
		}*/
		
		return errors;
	}
}
