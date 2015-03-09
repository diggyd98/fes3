package cc.multivision.ehrms.fes.service.interfaces;

import java.util.List;


import cc.multivision.ehrms.fes.dbbeans.Order;

import com.multivision.ehrms.business.FilterConditions;

public interface IOrderDataService {
	public Object insertOrder( Order cust ) throws Exception;
	public Object updateOrder( Order cust ) throws Exception;
	public void deleteOrder( Order cust ) throws Exception;
	public Object retrieveOrder( Order cust, String str ) throws Exception;
	public List retrieveAllOrders( Order cust ) throws Exception;
	public List searchOrder( List<FilterConditions> criteriaList ) throws Exception;
	public List searchOrderOrdered( List<FilterConditions> criteriaList, String str, boolean ord ) throws Exception;
}
