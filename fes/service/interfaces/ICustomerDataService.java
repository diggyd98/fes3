package cc.multivision.ehrms.fes.service.interfaces;

import java.util.List;

import com.multivision.ehrms.business.FilterConditions;

import cc.multivision.ehrms.fes.dbbeans.Customer;

public interface ICustomerDataService {
	public Object insertCustomer( Customer cust ) throws Exception;
	public Object updateCustomer( Customer cust ) throws Exception;
	public void deleteCustomer( Customer cust ) throws Exception;
	public Object retrieveCustomer( Customer cust, String str ) throws Exception;
	public List retrieveAllCustomers( Customer cust ) throws Exception;
	public List searchCustomer( List<FilterConditions> criteriaList ) throws Exception;
	public List searchCustomerOrdered( List<FilterConditions> criteriaList, String str, boolean ord ) throws Exception;
}
