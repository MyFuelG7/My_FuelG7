package Controllers;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

import com.sun.security.ntlm.Client;

import commen.Com;
import ennam.ObjectType;
import ennam.OperationType;
import Client.SingletonClient;
import GUI.ILogin;
import GUI.LoginGUI;
import Entity.Login;
import Entity.User;;


public class LoginController implements Observer{

	private SingletonClient client = new SingletonClient("localhost", 3306);
	private long requestNumber;
	private HashMap<Long, Method> handlerMap;
	private User user;
	private LoginGUI loginDialog;
	

	public LoginController(LoginGUI loginGUI) throws IOException {
		// TODO Auto-generated constructor stub
		login(loginGUI);
	}
	
	public void login(LoginGUI loginGUI) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("in login");
		int userId = loginGUI.getUserId();
		String pass = loginGUI.getPassword();
		System.out.println(userId+" , "+pass);
		Entity.Login login = new Entity.Login();
		login.setUserID(userId);
		login.setPassword(pass);
		
		Com cmd = new Com();
		cmd.setType(ObjectType.LOGIN);
		cmd.setOperation(OperationType.LOAD);
		cmd.setObject(login);
		requestNumber = cmd.getRequestNumber();
		
		/*try {
			handlerMap.put(requestNumber, this.getClass().getDeclaredMethod("refreshUserInfoPanel", new Class[] {User.class}));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}*/
		System.out.println("befor send to server");
		client.sendToServer(cmd);
		System.out.println("after send to server");
		
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
