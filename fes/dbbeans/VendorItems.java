package cc.multivision.ehrms.fes.dbbeans;
import javax.persistence.*;

@Entity
@Table(name = "VendorItems")
@IdClass(VendorItemID.class)
public class VendorItems {

	@Id
	@ManyToOne
	@JoinColumn(name="Item_ID")
	Item item;
	
	@Id
	@ManyToOne
	@JoinColumn(name="Vendor_ID")
	Vendor vendor;
	
	@Column(name="Quantity")
	int quantity;
	
	@Column(name="WholeSaleCost")
	float wholeSaleCost;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getWholeSaleCost() {
		return wholeSaleCost;
	}

	public void setWholeSaleCost(float wholeSaleCost) {
		this.wholeSaleCost = wholeSaleCost;
	}
	
	@Override
	public boolean equals( Object arg0 ) {
		if( arg0 == null ) return false;
		if(!( arg0 instanceof Order ) ) return false;
		
		VendorItems arg1 = (VendorItems)arg0;
		return ( this.vendor == arg1.getVendor()) && (this.item == arg1.getItem()); 
	}
}
