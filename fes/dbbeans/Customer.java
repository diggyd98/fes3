package cc.multivision.ehrms.fes.dbbeans;
import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Customer")
public class Customer implements Comparable<Customer>{

	@Id
	@GenericGenerator(name="sq", strategy="increment")
	@GeneratedValue(generator="sq")
	@Column(name="CustomerID")
	Integer customerID;
	
	@Column(name="CustomerName") 
	String customerName;
	
	@Column(name="CustomerAddress")
	String customerAddress;
	
	@Column(name="CustomerPhone")
	String customerPhone;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "customer")
	private Set<Order> customerOrders = new HashSet<Order>(  );

	public Set<Order> getCustomerOrders() {
		return customerOrders;
	}

	public void setCustomerOrders(Set<Order> customerOrders) {
		this.customerOrders = customerOrders;
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	@Override
	public boolean equals( Object arg0 ) {
		if( arg0 == null ) return false;
		if(!( arg0 instanceof Customer ) ) return false;
		
		Customer arg1 = (Customer)arg0;
		
		return ( this.customerID == arg1.getCustomerID() ); 
	}
	
	@Override
	public int hashCode() {
		return 17 * customerID.hashCode();
	}

	@Override
	public int compareTo(Customer o) {
		return customerID - o.getCustomerID();
	}
}



	

	
