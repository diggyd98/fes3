package cc.multivision.ehrms.fes.service.data;

import java.util.List;

import com.multivision.ehrms.business.FilterConditions;
import com.multivision.ehrms.service.data.BaseDataService;
import cc.multivision.ehrms.fes.dbbeans.Vendor;
import cc.multivision.ehrms.fes.service.interfaces.IVendorDataService;

public class VendorDataService extends BaseDataService implements
		IVendorDataService{
	
	@Override
	public Object insertVendor(Vendor vendor) throws Exception {
		return getDataModifier().insertRecord( vendor );
	}

	@Override
	public Object updateVendor(Vendor vendor) throws Exception {
		return getDataModifier().updateRecord( vendor );
	}

	@Override
	public void deleteVendor(Vendor vendor) throws Exception {
		getDataModifier().deleteRecord( vendor );
	}

	@Override
	public Object retrieveVendor(Vendor vendor, String str) throws Exception {
		return getDataRetriever().retrieveByKey( vendor, str);
	}

	@Override
	public List retrieveAllVendors(Vendor vendor) throws Exception {
		List<Vendor> ven = null;
		
		ven = getDataRetriever().retrieveAllRecords( vendor );
		//System.out.println("Number of records: " + lst.size());
		//for(Vendor vend : ven )
		//	System.out.println( "Vendor: " + vend );
		//	return ven;
		return getDataRetriever().retrieveAllRecords( vendor );
	}

	@Override
	public List searchVendor(List<FilterConditions> criteriaList)
			throws Exception {
		return getDataRetriever().retrieveByCriteria( criteriaList );
	}

}
