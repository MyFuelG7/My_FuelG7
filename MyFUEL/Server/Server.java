package Server;
//g7
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ServerController.DBController;
import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;
import commen.Com;

public class Server extends AbstractServer {
	// Class variables ***************************************************

	/**
	 * The default port to listen on.
	 */
	// final public static int DEFAULT_PORT = 5555;
	private static Connection conn;
	private DBController controller;

	// Constructors ****************************************************

	/**
	 * Constructs an instance of the echo server.
	 * 
	 * @param port
	 *            The port number to connect on.
	 */
	public Server(int port) {
		super(port);
	}

	// Instance methods ************************************************

	/**
	 * This method handles any messages received from the client.
	 * 
	 * @param msg
	 *            The message received from the client.
	 * @param client
	 *            The connection from which the message originated.
	 */
	public void handleMessageFromClient(Object msg, ConnectionToClient client) {

		try {
			Object result = controller.execute((Com) msg);
     		client.sendToClient(result);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method overrides the one in the superclass. Called when the server
	 * starts listening for connections.
	 */
	protected void serverStarted() {
		System.out.println("Server listening for connections on port "
				+ getPort());
	}

	/**
	 * This method overrides the one in the superclass. Called when the server
	 * stops listening for connections.
	 */
	protected void serverStopped() {
		System.out.println("Server has stopped listening for connections.");
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public DBController getController() {
		return controller;
	}

	public void setController(DBController controller) {
		this.controller = controller;
	}

	@Override
	protected synchronized void clientException(ConnectionToClient client,
			Throwable exception) {
		System.out.println("Server => clientException");
		exception.printStackTrace();
	}
	  /**
	   * This method is responsible for the creation of 
	   * the server instance (there is no UI in this phase).
	   *
	   * @param args[0] The port number to listen on.  Defaults to 5555 
	   *          if no argument is entered.
	   */
	  public static void main(String[] args) 
	  {
		  int port = 0; //Port to listen on
		  String user = "root";
		  String password = "Braude";
		  

		  try
		  {
			  user = args[0];			//user
			  password = args[1];		//password
			  System.out.println("Credentials are: " + args[0] + " " + args[1]);
		  }
		  
		  catch(ArrayIndexOutOfBoundsException e)
		  {
			  user = "root";			//user
			  password = "1234";		//password
		  }
		    
		  try 
		  {
			  Class.forName("com.mysql.jdbc.Driver").newInstance();
		  } catch (Exception ex) {/* handle the error*/}
	    
		  try 
		  {
			  conn = DriverManager.getConnection("jdbc:mysql://localhost/test", user, password);
			  System.out.println("SQL connection succeed");
		  } catch (SQLException ex) 
		  {/* handle any errors*/
			  System.out.println("SQLException: " + ex.getMessage());
			  System.out.println("SQLState: " + ex.getSQLState());
			  System.out.println("VendorError: " + ex.getErrorCode());
		  }
		  catch (ArrayIndexOutOfBoundsException ex){
			  System.out.println("Command line parametres: [listening port] [DB user] [DB password]");
			  System.exit(1);
		  }

		  try
		  {
			  port = Integer.parseInt(args[0]); //Get port from command line
		  }
		  catch(Throwable t)
		  {
			  port = 3306; //Set port to 3306
		  }
		
		  Server sv = new Server(port);
	    
		  try 
		  {
			  sv.listen(); //Start listening for connections
		  } 
		  catch (Exception ex) 
		  {
			  System.out.println("ERROR - Could not listen for clients!");
		  }
	  }

}


