package ServerController;

import Entity.User;
import Entity.Worker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ennam.UserType;
/**
 * This controller is responsible to load information
 * about required User from database.<p>

 *  @author_Group_3
 *
 */
public class UserController extends ObjectManager
{
	
	//constructors
	/**
	 * Constructs an instance of UserController
	 * 
	 * @param conn The connection to MySQL database
	 */
	public UserController(Connection conn) {
		super(conn);
	}

	


	/* (non-Javadoc)
	 * get Login object and return User object if userId and password are correct
	 * and null pointer if not
	 * @see icm.controller.ObjectManager#loadObject(java.lang.Object)
	 */
	@Override
	public Object loadObject(Object obj) {
		int id = (int)obj;
		PreparedStatement ps;
		
		String querryUser = "select * from user U where U.userID = ?";
		String querryStationWorker = "select * from StationWorker W where W.userID = ?";
		String querryMarketingManager = "select * from MarketingManager I where I.userID = ?";
		String querryCompanyManager = "select * from CompanyManager I where I.userID = ?";
		String querryEnterprise = "select * from Enterprise I where I.userID = ?";
		String querryStationManager = "select * from StationManager I where I.userID = ?";
		
		User user = new User();
		Worker worker = new Worker();
		try{
			ps = conn.prepareStatement(querryUser);
			ps.setInt(1, id);			
			ResultSet rs = ps.executeQuery();
			if( rs.next()){
				user.setCustomerID();//rs.getInt("userID"));
				user.setName();//rs.getString("Name"));
				user.setLastName();rs.getString("lastName");
		//		user.getCustomerID(rs.getInt("ID"));
				user.setEmail();//rs.getString("email"));
				user.setPassword();
				user.setCreditNumber();
				user.setCustomerType();
				user.setPlenNumber();
				user.setStatus();
				user.setUserType();
			
				rs.close();
				
				ps = conn.prepareStatement(querryStationWorker);
				ps.setInt(1, id);
				rs = ps.executeQuery();
				
				if( rs.next()){
					worker.setWorkerNumber();
					worker.setRole();
					worker.setBelonging();
				}
				rs.close();
				
				ps = conn.prepareStatement(querryEngineer);
				ps.setInt(1, id);
				rs = ps.executeQuery();
				
				if( rs.next()){
					user.setPhone(rs.getString("phone"));	
					user.setRole(UserRole.ENGINEER);			/*##########################################*/
				}
				rs.close();
				
				ps = conn.prepareStatement(querryManager);		/*##########################################*/
				ps.setInt(1, id);				/*##########################################*/
				rs = ps.executeQuery();							/*##########################################*/
																
				if(rs.next()){									/*##########################################*/
					switch(rs.getString("System")){				/*##########################################*/
					
					case "SUPERVISOR": 							/*##########################################*/
						user.setRole(UserRole.SUPERVISOR);		/*##########################################*/
						break;									/*##########################################*/
					case "DIRECTOR":							/*##########################################*/
						user.setRole(UserRole.DIRECTOR);		/*##########################################*/
						break;									/*##########################################*/
					}											/*##########################################*/
				}												/*##########################################*/
				
				
				
			}
			else
				user = null;
			
			rs.close();
		}
		catch (SQLException ex){
			ex.printStackTrace();
		}
		
		return user;
	}

	@Override
	public void removeObject(Object obj) {
		// TODO Auto-generated method stub
		
	}
	
	/* (non-Javadoc)
	 * Not in use for this class
	 * @see icm.controller.ObjectManager#storeObject(java.lang.Object)
	 */
	@Override
	public Object storeObject(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
