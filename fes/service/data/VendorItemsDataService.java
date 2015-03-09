package cc.multivision.ehrms.fes.service.data;

import java.util.List;

import cc.multivision.ehrms.fes.dbbeans.Vendor;
import cc.multivision.ehrms.fes.dbbeans.VendorItems;
import cc.multivision.ehrms.fes.service.interfaces.IVendorDataService;
import cc.multivision.ehrms.fes.service.interfaces.IVendorItemsDataService;

import com.multivision.ehrms.business.FilterConditions;
import com.multivision.ehrms.service.data.BaseDataService;

public class VendorItemsDataService extends BaseDataService implements
		IVendorItemsDataService{
	
	@Override
	public Object insertVendorItem(VendorItems vendor) throws Exception {
		return getDataModifier().insertRecord( vendor );
	}

	@Override
	public Object updateVendorItem(VendorItems vendor) throws Exception {
		return getDataModifier().updateRecord( vendor );
	}

	@Override
	public void deleteVendorItem(VendorItems vendor) throws Exception {
		getDataModifier().deleteRecord( vendor );
	}

	@Override
	public Object retrieveVendorItem(VendorItems vendor, String str) throws Exception {
		return getDataRetriever().retrieveByKey( vendor, str);
	}

	@Override
	public List retrieveAllVendorItems(VendorItems vendor) throws Exception {
		List<Vendor> ven = null;
		
		ven = getDataRetriever().retrieveAllRecords( vendor );
		return getDataRetriever().retrieveAllRecords( vendor );
	}

	@Override
	public List searchVendorItems(List<FilterConditions> criteriaList)
			throws Exception {
		return getDataRetriever().retrieveByCriteria( criteriaList );
	}

}
