package cc.multivision.ehrms.fes.service.interfaces;

import java.util.List;

import cc.multivision.ehrms.fes.dbbeans.Customer;
import cc.multivision.ehrms.fes.dbbeans.Item;

import com.multivision.ehrms.business.FilterConditions;

public interface IItemDataService {
	public Object insertItem( Item item ) throws Exception;
	public Object updateItem( Item item ) throws Exception;
	public void deleteItem( Item item ) throws Exception;
	public Object retrieveItem( Item item, String str ) throws Exception;
	public List retrieveAllItems( Item item ) throws Exception;
	public List searchItem( List<FilterConditions> criteriaList ) throws Exception;
	public List searchItemOrdered( List<FilterConditions> criteriaList, String str, boolean ord ) throws Exception;
}
