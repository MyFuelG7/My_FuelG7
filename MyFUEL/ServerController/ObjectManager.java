package ServerController;

import java.sql.Connection;
/**
 * This class is implemented by each controller due to object type
 * @see ObjectType
 *  @author_Group_7
 *
 */
public abstract class ObjectManager
{
	//class fields

	protected Connection conn;
	
	//constructors
	public ObjectManager(){
		
	}
	
	/**
	 * Constructs an instance of ObjectManager
	 * 
	 * @param conn The connection to MySQL database
	 */
	public ObjectManager(Connection conn){
		this.conn = conn;
	}
	
	//getters and setters
	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	//methods
	/**This method saves the required object in required database due to controller type  */
	public abstract Object storeObject(Object obj);
	
	/**This method loads the required object from required database due to controller type  */
	public abstract Object loadObject(Object obj);
	
	/**This method removes the required object from required database due to controller type  */
	public abstract void removeObject(Object obj);


}
