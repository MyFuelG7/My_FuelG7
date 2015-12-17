package Client;

import java.io.IOException;

import ocsf.client.*;

/*public class SingletonClient {

	public void handleMessageFromController() {
		throw new UnsupportedOperationException();
	}

}*/
public class SingletonClient extends ObservableClient {
	// Instance variables **********************************************

	private static SingletonClient instance;

	// Constructors ****************************************************

	/**
	 * Constructs an instance of the client.
	 * 
	 * @param host
	 *            The server to connect to.
	 * @param port
	 *            The port number to connect on.
	 * @param clientUI
	 *            The interface type variable.
	 */

	public SingletonClient(String host, int port) throws IOException {
		super(host, port); // Call the superclass constructor
	
	}

	/**
	 * The static method returns instance of SingletonClient
	 * 
	 * @param host
	 *            The server to connect to.
	 * @param port
	 *            The port number to connect on.
	 * @return SingletonClient instance
	 * @throws IOException
	 */
	public static SingletonClient getInstance() throws IOException {
		if (instance == null) {
			instance = new SingletonClient("", 0);
		}
		return instance;
	}

	// Instance methods ************************************************

	/**
	 * This method handles all data that comes in from the server.
	 * 
	 * @param msg
	 *            The message from the server.
	 */

	public void handleMessageFromController(Object msg) {
		setChanged(); //Marks this Observable object as having been changed
		notifyObservers(msg); //notify about the change
	}

	/**
	 * This method handles all data coming from the UI
	 * 
	 * @param message
	 *            The message from the UI.
	 */
	

	/**
	 * This method terminates the client.
	 */
	public void quit() {
		try {
			closeConnection();
		} catch (IOException e) {
		}
		System.exit(0);
	}
	
	@Override
	protected void connectionException(Exception exception) 
	{
		System.out.println("Client => connectionException");
		exception.getMessage();
		exception.printStackTrace();
	}

}
// End of SingletonClient class
