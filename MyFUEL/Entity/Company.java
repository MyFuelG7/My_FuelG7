package Entity;
/**
 * 
 * @author Group 7
 *
 */
public class Company {
    /** the id of the company*/
	private String CompanyID;
	/**name of the company*/
	private String CompanyName;
	
	public void company(String CompanyName, String CompanyID) {
	//	throw new UnsupportedOperationException();
		this.CompanyID = CompanyID;
		this.CompanyName = CompanyName;
	}

	public String getCompanyID() {
	//	throw new UnsupportedOperationException();
		return CompanyID;
	}

	public void setCompanyID(String CompanyID) {
	//	throw new UnsupportedOperationException();
		this.CompanyID = CompanyID;	}

	public String getCompanyName() {
	//	throw new UnsupportedOperationException();
		return CompanyName;
	}

	public void setCompanyName(String CompanyName) {
	//	throw new UnsupportedOperationException();
		this.CompanyName = CompanyName;
	}

}