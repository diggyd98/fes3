package cc.multivision.ehrms.fes.service.data;

import java.util.List;
import com.multivision.ehrms.business.FilterConditions;
import cc.multivision.ehrms.fes.dbbeans.Customer;
import cc.multivision.ehrms.fes.dbbeans.Order;
import cc.multivision.ehrms.fes.service.interfaces.ICustomerDataService;
import cc.multivision.ehrms.fes.service.interfaces.IOrderDataService;

import com.multivision.ehrms.service.data.BaseDataService;

public class OrderDataService extends BaseDataService implements
		IOrderDataService {

	@Override
	public Object insertOrder(Order ord) throws Exception {
		return getDataModifier().insertRecord( ord );
	}

	@Override
	public Object updateOrder(Order ord) throws Exception {
		return getDataModifier().updateRecord( ord );
	}

	@Override
	public void deleteOrder(Order ord) throws Exception {
		getDataModifier().deleteRecord( ord );
	}

	@Override
	public Object retrieveOrder(Order ord, String str) throws Exception {
		return getDataRetriever().retrieveByKey( ord, str);
	}

	@Override
	public List retrieveAllOrders(Order ord) throws Exception {
		return getDataRetriever().retrieveAllRecords( ord );
	}

	@Override
	public List searchOrder(List<FilterConditions> criteriaList)
			throws Exception {
		return getDataRetriever().retrieveByCriteria( criteriaList );
	}

	@Override
	public List searchOrderOrdered(List<FilterConditions> criteriaList,
			String orderByColumn, boolean ord) throws Exception {
		return getDataRetriever().retrieveByCriteria(criteriaList, orderByColumn, ord);
	}
}
