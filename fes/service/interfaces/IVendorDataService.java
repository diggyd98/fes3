package cc.multivision.ehrms.fes.service.interfaces;

import java.util.List;

import cc.multivision.ehrms.fes.dbbeans.Vendor;

import com.multivision.ehrms.business.FilterConditions;

public interface IVendorDataService {
	
	public Object insertVendor( Vendor vendor ) throws Exception;
	public Object updateVendor( Vendor vendor ) throws Exception;
	public void deleteVendor( Vendor vendor ) throws Exception;
	public Object retrieveVendor( Vendor vendor, String str ) throws Exception;
	public List retrieveAllVendors( Vendor vendor ) throws Exception;
	public List searchVendor( List<FilterConditions> criteriaList ) throws Exception;

}
