package Entity;

public class Car {

	private String CarID;
	private ItemType ItemID;
	private CustomerType CustomerType;
	
	public Car(String CarID, ItemType ItemID, CustomerType CustomerType) {
	//	throw new UnsupportedOperationException();
		this.CarID = CarID;
		this.ItemID = ItemID;
		this.CustomerType = CustomerType;
	}

	public String getCarID() {
		//throw new UnsupportedOperationException();
		return CarID;
	}

	public void setCarID(String CarID) {
		//throw new UnsupportedOperationException();
		this.CarID = CarID;
	}

	public ItemType getItemID() {
		//throw new UnsupportedOperationException();
		return ItemID;
	}

	public void setItemID(ItemType ItemID) {
		//throw new UnsupportedOperationException();
		this.ItemID = ItemID;
	}

	public Entity.CustomerType getCustomerType() {
	//	throw new UnsupportedOperationException();
		return CustomerType;
	}

	public void setCustomerType(Entity.CustomerType CustomerType) {
		//throw new UnsupportedOperationException();
		this.CustomerType = CustomerType;
	}



}