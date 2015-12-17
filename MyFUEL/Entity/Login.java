package Entity;

import java.io.Serializable;

	/**
	 * This class is responsible for performing Login to the MyFuel System<br>
	 * By Login object data is transferred from client to server DB to client by
	 * ReportController for making User authorization
	 * 
	 * @author Group7
	 * 
	 */
	public class Login implements Serializable {

		private static final long serialVersionUID = 7925255824856923385L;
		/** Each user in the ICM has unique ID */
		private int userID;

		/** Password is need to authorize the User */
		private String password;

		public Login() {

		}

		public Login(int userID, String password) {
			this.userID = userID;
			this.password = password;
		}

		public int getUserID() {
			return userID;
		}

		public void setUserID(int userID) {
			this.userID = userID;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	}

