package cc.multivision.ehrms.fes.service.interfaces;

import java.util.List;

import cc.multivision.ehrms.fes.dbbeans.LineItem;

import com.multivision.ehrms.business.FilterConditions;

public interface ILineItemDataService {
	public Object insertLineItem( LineItem cust ) throws Exception;
	public Object updateLineItem( LineItem cust ) throws Exception;
	public void deleteLineItem( LineItem cust ) throws Exception;
	public Object retrieveLineItem( LineItem cust, String str ) throws Exception;
	public List retrieveAllLineItems( LineItem cust ) throws Exception;
	public List searchLineItem( List<FilterConditions> criteriaList ) throws Exception;
	public List searchLineItemOrdered( List<FilterConditions> criteriaList, String str, boolean ord ) throws Exception;
}
