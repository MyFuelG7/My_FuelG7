package Entity;

public class Private extends Customer {
	
	public Private()  {
		//throw new UnsupportedOperationException();
		this.customerType = CustomerType.PrivateCustomer;
	}
}