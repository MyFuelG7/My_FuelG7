package Controllers;


import java.io.IOException;

import Client.SingletonClient;
import GUI.LoginGUI;

/**
 * This Class is responsible to perform all the functions of Client 
 * 
 * @ Group 7
 *
 */
public class ClientController {

	SingletonClient client;
	//ClientConnectionDialog clientConnectionDialog;
	LoginGUI logingui;
	
	public ClientController(/*LoginController loginCrtl*/) throws IOException{
	//	this.logingui = loginCrtl;
		client = SingletonClient.getInstance();
		
		//this.clientConnectionDialog = new ClientConnectionDialog(icmMain.getMainWindow());
		//clientConnectionDialog.setCtrl(this);
	}
	

	
	/*public void showConnectionDialog() {
		clientConnectionDialog.setVisible(true);
	}*/
	
	public void connect() throws IOException{
		
		String ip = "localhost";
		int port = 3306;
		
		client.setHost(ip);
		client.setPort(port);
		client.openConnection();
		System.out.println("ClientCtrl => Connection Opened");
	}
	
	
	public void disconnect() throws IOException{
		client.closeConnection();
	}


		
	
}
