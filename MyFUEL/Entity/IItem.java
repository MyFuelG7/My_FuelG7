package Entity;

public interface IItem {

	void getDescription();

	void getItemID();

	/**
	 * 
	 * @param saleAction
	 */
	int getActualPrice(SaleAction saleAction);

	void getMinQuantity();

	void getActualQuantity();

	void setActualQuantity();

}