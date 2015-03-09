package cc.multivision.ehrms.fes.service.data;

import java.util.List;
import com.multivision.ehrms.business.FilterConditions;
import cc.multivision.ehrms.fes.dbbeans.Customer;
import cc.multivision.ehrms.fes.service.interfaces.ICustomerDataService;
import com.multivision.ehrms.service.data.BaseDataService;

public class CustomerDataService extends BaseDataService implements
		ICustomerDataService {

	@Override
	public Object insertCustomer(Customer cust) throws Exception {
		return getDataModifier().insertRecord( cust );
	}

	@Override
	public Object updateCustomer(Customer cust) throws Exception {
		return getDataModifier().updateRecord( cust );
	}

	@Override
	public void deleteCustomer(Customer cust) throws Exception {
		getDataModifier().deleteRecord( cust );
	}

	@Override
	public Object retrieveCustomer(Customer cust, String str) throws Exception {
		return getDataRetriever().retrieveByKey( cust, str);
	}

	@Override
	public List retrieveAllCustomers(Customer cust) throws Exception {
		List<Customer> lst = null;
		
		lst = getDataRetriever().retrieveAllRecords( cust );
		//System.out.println("Number of records: " + lst.size());
		//for( Customer custmr : lst )
		//	System.out.println( "Customer: " + custmr ); return lst;
		return getDataRetriever().retrieveAllRecords( cust );
	}

	@Override
	public List searchCustomer(List<FilterConditions> criteriaList)
			throws Exception {
		return getDataRetriever().retrieveByCriteria( criteriaList );
	}

	@Override
	public List searchCustomerOrdered(List<FilterConditions> criteriaList,
			String orderByColumn, boolean ord) throws Exception {
		return getDataRetriever().retrieveByCriteria(criteriaList, orderByColumn, ord);
	}
}
