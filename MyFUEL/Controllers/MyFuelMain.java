package Controllers;

import java.io.IOException;

import GUI.ILogin;
import GUI.StartWindow;

public class MyFuelMain implements ILogin{

	
	private StartWindow startwindow;
	
	
	public static void main(String[] args) {
		new MyFuelMain();

	}
	
	
	public MyFuelMain(){
		startwindow = new StartWindow();
		startwindow.setCtrl(this);
	}


	@Override
	public void login() throws IOException {
		// TODO Auto-generated method stub
		
	}


}