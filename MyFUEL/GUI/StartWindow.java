package GUI;


import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Controllers.LoginController;
import Controllers.MyFuelMain;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow extends JFrame implements ActionListener{
	
	
	 private static final long serialVersionUID = 2251981981884732945L;
		
		
		
       private IStartWindow screen;
        
		private final JButton btnRegisterUser = new JButton("Register User");
		private final JButton btnUnregisterUser = new JButton("Un-register User");
		private MyFuelMain ctrl;
		private LoginController ctrl1;
		
		public StartWindow()
		{
			initialize();
		}
		
		
		public void initialize()
		{
			this.setResizable(false);
			this.setTitle("My fuel");
			this.setBounds(100, 100, 400, 300);
			this.setLocationRelativeTo(null);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setForeground(new Color(0, 0, 0));
			getContentPane().setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
			getContentPane().setBackground(new Color(0, 204, 255));
			getContentPane().setLayout(null);
			btnRegisterUser.setFont(new Font("Segoe UI Semilight", Font.BOLD, 11));
			btnRegisterUser.setForeground(new Color(0, 0, 204));
			btnRegisterUser.setBackground(Color.WHITE);
			btnRegisterUser.setBounds(56, 140, 111, 31);
			getContentPane().add(btnRegisterUser);
			btnRegisterUser.addActionListener(this);
			
			btnUnregisterUser.setToolTipText("");
			btnUnregisterUser.setFont(new Font("Segoe UI Symbol", Font.BOLD, 11));
			btnUnregisterUser.setForeground(new Color(0, 0, 204));
			btnUnregisterUser.setBackground(Color.WHITE);
			btnUnregisterUser.setBounds(212, 140, 149, 31);
			getContentPane().add(btnUnregisterUser);
			btnUnregisterUser.addActionListener(this);
			
			JLabel label = new JLabel("Choose uesr type please");
			label.setFont(new Font("Segoe UI Symbol", Font.BOLD, 13));
			label.setForeground(new Color(0, 0, 204));
			label.setBounds(120, 79, 185, 50);
			getContentPane().add(label);
			
			JLabel lblWelcomToMy = new JLabel("Welcom To My Fuel");
			lblWelcomToMy.setFont(new Font("Wide Latin", Font.BOLD, 17));
			lblWelcomToMy.setForeground(new Color(0, 0, 153));
			lblWelcomToMy.setBackground(new Color(0, 0, 153));
			lblWelcomToMy.setBounds(56, 18, 342, 50);
			getContentPane().add(lblWelcomToMy);
			
			this.setVisible(true);
		}

		public void setCtrl(MyFuelMain myFuelMain) {
			this.ctrl = myFuelMain;
		}
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnRegisterUser ){
			  ScreenRegisterUser();
				}
	    	if(e.getSource() == btnUnregisterUser ){
			  ScreenUnRegisterUser();
				}
	
			}
		
		
		 public void ScreenRegisterUser()
		 {
			 LoginGUI login;
			 if(this.ctrl !=null)
				 login = new LoginGUI(this);
		//	 login.setCtrl(ctrl1);
		 }


		 public void ScreenUnRegisterUser(){
			 

}


}
