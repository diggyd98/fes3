package cc.multivision.ehrms.fes.service.interfaces;

import java.util.List;

import cc.multivision.ehrms.fes.dbbeans.VendorItems;

import com.multivision.ehrms.business.FilterConditions;

public interface IVendorItemsDataService {
	
	public Object insertVendorItem( VendorItems item ) throws Exception;
	public Object updateVendorItem( VendorItems item ) throws Exception;
	public void deleteVendorItem( VendorItems item ) throws Exception;
	public Object retrieveVendorItem( VendorItems item, String str ) throws Exception;
	public List retrieveAllVendorItems( VendorItems item ) throws Exception;
	public List searchVendorItems( List<FilterConditions> criteriaList ) throws Exception;

}
