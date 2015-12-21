package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

import ServerController.DBController;


public class MyfuelServer {

	private Server server;
	//private static ServerGUI serverGUI;
	private static DBController controller;
	private static Connection conn;
//	private static ICMserver icmServer;
	
	private static void consoleWriter(){
	//1.	JTextPane console = serverGUI.getServerLog();
		try {
			PipedOutputStream pOut = new PipedOutputStream();
			System.setOut(new PrintStream(pOut));
			PipedInputStream pIn;
			pIn = new PipedInputStream(pOut);
			BufferedReader reader = new BufferedReader(new InputStreamReader(pIn));
			
			
		/*1.	while(true){
				String line = reader.readLine();
		        if(line != null)
		        	console.setText(console.getText()+"\n"+line);
			}*/
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static private void initDBConnection(String ip, int port, String dbName,
			String user, String password) throws  SQLException, Exception {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://" + ip + ":"
					+ port + "/" + dbName, user, password);
			System.out.println("SQL connection succeed");

	}

	public void connect() throws SQLException, Exception {
		try{
			
		/*	String serverPort = serverGUI.getSeverPort();
			 
			String ip = serverGUI.getDbHost();
			String port = serverGUI.getDbPort();
			String dbName = serverGUI.getDbName();
			String user = serverGUI.getUserName();
			String pass = serverGUI.getPassword();
			
			if(serverPort.isEmpty() || ip.isEmpty() || port.isEmpty() 
					|| dbName.isEmpty() || user.isEmpty() || pass.isEmpty()){
				JOptionPane.showMessageDialog(serverGUI, "All fealds must be filled!");
				
				}else{*/
			       String dbName = null;
			
					server = new Server(3306);
					server.listen(); //Start listening for connections
					initDBConnection("localhost", 3306, dbName, "root", "Braude");
					server.setConn(conn);
					
					controller = new DBController(conn);
					server.setController(controller);
					controller.setServer(server);
					
				/*	JButton button = serverGUI.getBtnConnect();
					button.setActionCommand("Disconnect");
					button.setText("Disconnect");
					
					BackgroundListener listener = new BackgroundListener(conn);
				 	(new Thread(listener)).start();*/
			// }
		}
		  catch (IOException ex) 
		  {
			  System.out.println("ERROR - Could not listen for clients!");
		  }
		  catch (ArrayIndexOutOfBoundsException ex){
			  System.out.println("Command line parametres: [Server Listening Port]" +
			  				"[DB ip] [DB Port] [DB name] [DB user] [DB password] ");
			  System.exit(1);
		  }

	}


	public void disconnect() throws SQLException, IOException {
		System.out.println("test");
		if(server != null)
			server.close();
		if(conn != null)
			conn.close();
		
	/*	JButton button = serverGUI.getBtnConnect();
		button.setActionCommand("Connect");
		button.setText("Connect");*/

	}

}


	

