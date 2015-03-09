package cc.multivision.ehrms.fes.dbbeans;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class LineItemID implements Serializable{
	
	private Order order;
	private Item item;

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

	@Override
	public boolean equals(Object arg0) {
		if( arg0 == null ) return false;
		if( !( arg0 instanceof LineItemID ) ) return false;
		
		LineItemID arg1 = (LineItemID) arg0;
		
		return (this.order.getInvoiceNumber() == arg1.getOrder().getInvoiceNumber() ) && 
			( this.item.getItemID() == arg1.getItem().getItemID() ); 
	}
	
	@Override
	public int hashCode() {
		int hsCode;
		hsCode = order.hashCode();
		hsCode = 19 * hsCode + item.hashCode();
		return hsCode;
	}
}

