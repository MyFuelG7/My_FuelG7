package Server;

import java.io.IOException;
import java.sql.Connection;

//import ServerController.DBController;
import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;


import commen.Com;

public class Server {}
	
/*	public class server extends AbstractServer {
		// Class variables ***************************************************

		/**
		 * The default port to listen on.
		 */
		// final public static int DEFAULT_PORT = 5555;
/*		private Connection conn;
		private DBController controller;

		// Constructors ****************************************************

		/**
		 * Constructs an instance of the echo server.
		 * 
		 * @param port
		 *            The port number to connect on.
		 */
	/*	public server(int port) {
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
/*		public void handleMessageFromClient(Object msg, ConnectionToClient client) {

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
/*		protected void serverStarted() {
			System.out.println("Server listening for connections on port "
					+ getPort());
		}

		/**
		 * This method overrides the one in the superclass. Called when the server
		 * stops listening for connections.
		 */
/*		protected void serverStopped() {
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

	}

}*/

