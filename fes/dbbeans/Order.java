package cc.multivision.ehrms.fes.dbbeans;

import java.util.*;

import javax.annotation.Generated;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Orders")
public class Order {
	 
	@Id
	@GenericGenerator(name="sq" , strategy="increment")
	@GeneratedValue(generator="sq")
	@Column(name="InvoiceNumber")
	Integer invoiceNumber;
	
	@ManyToOne
    @JoinColumn(name="InvoiceCustomerID")
	Customer customer;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "order")
	Set<LineItem> lineItems = new HashSet<LineItem>();

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Set<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(Set<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public void setInvoiceNumber(Integer invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	@Override
	public boolean equals( Object arg0 ) {
		if( arg0 == null ) return false;
		if(!( arg0 instanceof Order ) ) return false;
		
		Order arg1 = (Order)arg0;
		return ( this.invoiceNumber == arg1.getInvoiceNumber() ); 
	}
	
	@Override
	public int hashCode() {
		return 13 * invoiceNumber.hashCode();
	}
}
