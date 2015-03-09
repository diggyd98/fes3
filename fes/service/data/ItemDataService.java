package cc.multivision.ehrms.fes.service.data;

import java.util.List;
import com.multivision.ehrms.business.FilterConditions;
import cc.multivision.ehrms.fes.dbbeans.Customer;
import cc.multivision.ehrms.fes.dbbeans.Item;
import cc.multivision.ehrms.fes.service.interfaces.ICustomerDataService;
import cc.multivision.ehrms.fes.service.interfaces.IItemDataService;

import com.multivision.ehrms.service.data.BaseDataService;

public class ItemDataService extends BaseDataService implements
		IItemDataService {

	@Override
	public Object insertItem(Item item) throws Exception {
		return getDataModifier().insertRecord( item );
	}

	@Override
	public Object updateItem(Item item) throws Exception {
		return getDataModifier().updateRecord( item );
	}

	@Override
	public void deleteItem(Item item) throws Exception {
		getDataModifier().deleteRecord( item );
	}

	@Override
	public Object retrieveItem(Item item, String str) throws Exception {
		return getDataRetriever().retrieveByKey( item, str);
	}

	@Override
	public List retrieveAllItems(Item item) throws Exception {
		return getDataRetriever().retrieveAllRecords( item );
	}

	@Override
	public List searchItem(List<FilterConditions> criteriaList)
			throws Exception {
		return getDataRetriever().retrieveByCriteria( criteriaList );
	}

	@Override
	public List searchItemOrdered(List<FilterConditions> criteriaList,
			String orderByColumn, boolean ord) throws Exception {
		return getDataRetriever().retrieveByCriteria(criteriaList, orderByColumn, ord);
	}
}
