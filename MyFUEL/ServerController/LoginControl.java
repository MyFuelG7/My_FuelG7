package ServerController;


import Entity.Login;
import Entity.User;
import ServerController.UserController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * *This controller is responsible to check if username and password are exists in the database.<p>
 * The method loadObject returns User object of required user
 * @see icm.entity.User
 *  @author_Group_3
 *
 */
public class LoginControl extends ObjectManager
{
	
	//constructors
	/**
	 * Constructs an instance of LoginController
	 * 
	 * @param conn The connection to MySQL database
	 */
	public LoginControl(Connection conn) {
		super(conn);
	}

	


	/* (non-Javadoc)
	 * get Login object and return User object if userId and password are correct
	 * and null pointer if not
	 * @see icm.controller.ObjectManager#loadObject(java.lang.Object)
	 */
	@Override
	public Object loadObject(Object obj) {
		Login login = (Login)obj;
		PreparedStatement ps;
		
		String querryUser = "select * from user U where U.userID = ? and U.pass = ?";
		User user=null;
		
		
		try{
			ps = conn.prepareStatement(querryUser);
			ps.setInt(1, login.getUserID());
			ps.setString(2, login.getPassword());
			
			
			ResultSet rs = ps.executeQuery();
			if( rs.next())
				{
					
					rs.close();
					UserController userCtr = new UserController(conn);
					return (User) userCtr.loadObject(login.getUserID());	
				}

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
