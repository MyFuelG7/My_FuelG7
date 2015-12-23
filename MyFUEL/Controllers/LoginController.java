package Controllers;


import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.sun.security.ntlm.Client;

import commen.Com;
import ennam.ObjectType;
import ennam.OperationType;
import Client.SingletonClient;
import GUI.LoginGUI;
import GUI.UserGui;
import Entity.Login;
import Entity.User;;


public class LoginController implements Observer 
{
	private SingletonClient client ;
	private long requestNumber;
	private HashMap<Long, Method> handlerMap;
	public static User user;
	private LoginGUI loginDialog;
	

	public LoginController(LoginGUI loginGUI) throws IOException 
	{
		// TODO Auto-generated constructor stub
 
		this.loginDialog = loginGUI;
		client = SingletonClient.getInstance();
		client.addObserver(this);
		loginGUI.setCtrl(this);
		handlerMap = new HashMap<>();
		login(loginGUI);
	}
	

	private void refreshUserInfoPanel(User user)
	{
		if(user == null)
		{
			JOptionPane.showMessageDialog(loginDialog, "Wrong login information", "Warning!", JOptionPane.ERROR_MESSAGE);
			loginDialog.setUserID("");
			loginDialog.setUserPassword("");
		}
		else
		{
			//Check the password
			if ( (user.getPassword()) == (this.user.getPassword()) ) 
			{
				this.user = user;
				UserGui screen = new UserGui();
			}
			else
			{
				JOptionPane.showMessageDialog(loginDialog, "Wrong password", "Warning!", JOptionPane.ERROR_MESSAGE);
				loginDialog.setUserID("");
				loginDialog.setUserPassword("");
			}
		}
	}
	
	
	public void login(LoginGUI loginGUI) throws IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("in login");
		int userId = loginGUI.getUserId();
		String pass = loginGUI.getPassword();
		this.user.setCustomerID(userId);
		this.user.setPassword(pass);
		System.out.println("get "+userId+" , "+pass);
		/*Entity.*/Login login = new /*Entity.*/Login();
		login.setUserID(userId);
		login.setPassword(pass);
		System.out.println("set "+userId+" , "+pass);
		Com cmd = new Com();
		cmd.setType(ObjectType.LOGIN);
		cmd.setOperation(OperationType.LOAD);
		cmd.setObject(login);
		requestNumber = cmd.getRequestNumber();
		System.out.println("num "+requestNumber);
		try {
			handlerMap.put(requestNumber, this.getClass().getDeclaredMethod("refreshUserInfoPanel", new Class[] {User.class}));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		System.out.println("befor send to server");
		client.sendToServer(cmd);
		System.out.println("after send to server");
		
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
