package cc.multivision.ehrms.fes.dbbeans;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="Item")
public class Item implements Comparable<Item>  {
	
	@Id
	@Column(name="item_ID")
	Integer itemID;
	
	@Column(name="itemName")
	String itemName;
	
	@Column(name="itemRetailCost")
	Double itemRetailCost;
	
	@Column(name="ItemDesc")
	String ItemDesc;
	
	@Column(name="itemCategory")
	String itemCategory;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "item")
	Set<LineItem> lineItems = new HashSet<LineItem>();
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "vendor")
	private Set<VendorItems> vendorItems = new HashSet<VendorItems>();
	
	public Set<VendorItems> getVendorItems() {
		return vendorItems;
	}

	public void setVendorItems(Set<VendorItems> vendorItems) {
		this.vendorItems = vendorItems;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getItemRetailCost() {
		return itemRetailCost;
	}

	public void setItemRetailCost(Double itemRetailCost) {
		this.itemRetailCost = itemRetailCost;
	}

	public String getItemDesc() {
		return ItemDesc;
	}

	public void setItemDesc(String itemDesc) {
		ItemDesc = itemDesc;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public Set<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(Set<LineItem> li) {
		this.lineItems = li;
	}

	@Override
	public boolean equals(Object arg0) {
		if( arg0 == null ) return false;
		if( !(arg0 instanceof Item) ) return false;
		
		Item arg1 = (Item)arg0;
		return ( this.itemID == arg1.getItemID() ); 
	}
	
	@Override
	public int hashCode() {
		return 19 * itemID.hashCode();
	}

	@Override
	public int compareTo(Item o) {
		return itemID - o.getItemID();
	}
}
