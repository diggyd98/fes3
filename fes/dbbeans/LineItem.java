package cc.multivision.ehrms.fes.dbbeans;

import javax.persistence.*;

@Entity
@Table(name="LineItem")
@IdClass(LineItemID.class)
public class LineItem {
	
	@Id
	@ManyToOne
	@JoinColumn(name="InvoiceNumber")
	Order order;
	
	@Id
	@ManyToOne
	@JoinColumn(name="ItemID")
	Item item;
	
	@Column(name="itemQuantity")
	int itemQuantity;
	
	@Column(name="itemCustomerCost")
	double itemCustomerCost;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getItemCustomerCost() {
		return itemCustomerCost;
	}

	public void setItemCustomerCost(double itemCustomerCost) {
		this.itemCustomerCost = itemCustomerCost;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if( arg0 == null ) return false;
		if( !( arg0 instanceof LineItem ) ) return false;
		
		LineItem arg1 = (LineItem)arg0;
		return ( this.item == arg1.getItem() ) && ( this.order == arg1.getOrder() ); 
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
        hash = hash * 31 + item.hashCode();
        return  hash * 13 + order.hashCode(); 
	}
}
