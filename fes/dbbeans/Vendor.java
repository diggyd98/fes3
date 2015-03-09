package cc.multivision.ehrms.fes.dbbeans;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Vendor")
public class Vendor {
	@Id
	@Column(name="Vendor_ID")
	Integer vendorID;
	
	@Column(name="VendorName") 
	String vendorName;
	
	@Column(name="VendorAddress")
	String vendorAddress;
	
	@Column(name="VendorPhone")
	String vendorPhone;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "vendor")
	private Set<VendorItems> vendorItems = new HashSet<VendorItems>(  );
	

	public Set<VendorItems> getVendorItems() {
		return vendorItems;
	}

	public void setVendorItems(Set<VendorItems> vendorItems) {
		this.vendorItems = vendorItems;
	}

	public void setVendorID(Integer vendorID) {
		this.vendorID = vendorID;
	}

	public int getVendorID() {
		return vendorID;
	}

	public void setVendorID(int vendorID) {
		this.vendorID = vendorID;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorPhone() {
		return vendorPhone;
	}

	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}
	
	@Override
	public boolean equals( Object arg0 ) {
		if( arg0 == null ) return false;
		if(!( arg0 instanceof Order ) ) return false;
		
		Vendor arg1 = (Vendor)arg0;
		return ( this.vendorID == arg1.getVendorID() ); 
	}
	
	@Override
	public int hashCode() {
		return 13 * vendorID.hashCode();
	}
}
