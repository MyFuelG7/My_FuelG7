package Entity;

public class Sale {

	private int SaleNumber;
	private Double FuleCount;
	private String Date;
	private Double Price;
	private ItemType itemID;
	private String StationID;
	private String CarID;

	public int getSaleNumber() {
		return SaleNumber;
	}

	public void setSaleNumber(int SaleNumber) {
		this.SaleNumber = SaleNumber;
	}

	public Double getFuleCount() {
		return FuleCount;
	}

	public void setFuleCount(Double FuleCount) {
		this.FuleCount = FuleCount;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String Date) {
		this.Date = Date;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double Price) {
		this.Price = Price;
	}

	public ItemType getItemID() {
		return itemID;
	}

	public void setItemID(ItemType itemID) {
		this.itemID = itemID;
	}

	public String getStationID() {
		return StationID;
	}

	public void setStationID(String StationID) {
		this.StationID = StationID;
	}

	public String getCarID() {
		return CarID;
	}

	public void setCarID(String CarID) {
		this.CarID = CarID;
	}

	public Sale() {

	}

}