package Controllers;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

import commen.Com;
import ennam.ObjectType;
import ennam.OperationType;
import Client.SingletonClient;
import GUI.ILogin;
import GUI.LoginGUI;
import Entity.Login;
import Entity.User;;


public class LoginController implements ILogin ,Observer{

	private Client.SingletonClient client;
	private long requestNumber;
	private HashMap<Long, Method> handlerMap;
	private User user;
	private LoginGUI loginDialog;
	
	
	
	@Override
	public void login() throws IOException {
		// TODO Auto-generated method stub
		
		int userId = loginDialog.getUserId();
		String pass = loginDialog.getPassword();
		
		Entity.Login login = new Entity.Login();
		login.setUserID(userId);
		login.setPassword(pass);
		
		Com cmd = new Com();
		cmd.setType(ObjectType.LOGIN);
		cmd.setOperation(OperationType.LOAD);
		cmd.setObject(login);
		requestNumber = cmd.getRequestNumber();
		
		try {
			handlerMap.put(requestNumber, this.getClass().getDeclaredMethod("refreshUserInfoPanel", new Class[] {User.class}));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		client.sendToServer(cmd);

		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
