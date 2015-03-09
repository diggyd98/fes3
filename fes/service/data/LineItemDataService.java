package cc.multivision.ehrms.fes.service.data;

import java.util.List;
import com.multivision.ehrms.business.FilterConditions;
import cc.multivision.ehrms.fes.dbbeans.Customer;
import cc.multivision.ehrms.fes.dbbeans.LineItem;
import cc.multivision.ehrms.fes.service.interfaces.ICustomerDataService;
import cc.multivision.ehrms.fes.service.interfaces.ILineItemDataService;
import com.multivision.ehrms.service.data.BaseDataService;

public class LineItemDataService extends BaseDataService implements
		ILineItemDataService {

	@Override
	public Object insertLineItem(LineItem li) throws Exception {
		return getDataModifier().insertRecord( li );
	}

	@Override
	public Object updateLineItem(LineItem li) throws Exception {
		return getDataModifier().updateRecord( li );
	}

	@Override
	public void deleteLineItem(LineItem li) throws Exception {
		getDataModifier().deleteRecord( li );
	}

	@Override
	public Object retrieveLineItem(LineItem li, String str) throws Exception {
		return getDataRetriever().retrieveByKey( li, str);
	}

	@Override
	public List retrieveAllLineItems(LineItem li) throws Exception {
		return getDataRetriever().retrieveAllRecords( li );
	}

	@Override
	public List searchLineItem(List<FilterConditions> criteriaList)
			throws Exception {
		return getDataRetriever().retrieveByCriteria( criteriaList );
	}

	@Override
	public List searchLineItemOrdered(List<FilterConditions> criteriaList,
			String orderByColumn, boolean ord) throws Exception {
		return getDataRetriever().retrieveByCriteria(criteriaList, orderByColumn, ord);
	}
}
