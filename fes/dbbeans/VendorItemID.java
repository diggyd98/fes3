package cc.multivision.ehrms.fes.dbbeans;

import java.io.Serializable;

public class VendorItemID implements Serializable{
	
	Vendor vendor;
	Item item;
	
	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public int hashCode() {
		int hsCode;
		hsCode = vendor.hashCode();
		hsCode = 19 * hsCode + item.hashCode();
		return hsCode;
	}

	@Override
	public boolean equals(Object arg0) {
		if( arg0 == null ) return false;
		if( !( arg0 instanceof VendorItemID ) ) return false;
		
		VendorItemID arg1 = (VendorItemID) arg0;
		
		return (this.vendor.getVendorID() == arg1.getVendor().getVendorID() ) && 
			( this.item.getItemID() == arg1.getItem().getItemID() ); 
	}
}
