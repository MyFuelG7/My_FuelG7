package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controllers.ClientController;
import Controllers.LoginController;
import Controllers.MyFuelMain;

public class LoginGUI extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2251981981884732945L;
	private JButton loginButton;
	private JButton cancelButton;
	private JPanel panel;
	private JLabel lblUserId;
	private JLabel lblPassword;
	private JTextField userId;
	private JLabel lblEnterDetailsPlase;
	private LoginController loginCrtl;
	private JPanel buttonPane;
	private JTextField passwordField;
	JFrame frame;
	private LoginController ctrl;
	private ClientController clientctr;
	/**
	 * Create the dialog.
	 */
	public LoginGUI(JFrame mainWindow) {
		
		super(mainWindow, true);
		mainWindow.dispose();
		frame= new JFrame();
 		frame.setTitle("My fuel - Login");
 		frame.setResizable(false);
 		frame.setBounds(100, 100, 400, 300);
 		frame.setLocationRelativeTo(null);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonPane = new JPanel();
		buttonPane.setBounds(0, 238, 434, 23);
		buttonPane.setLayout(new GridLayout(0, 2, 0, 0));
		frame.getContentPane().add(buttonPane);
		
		loginButton = new JButton("Log In");
		loginButton.setBackground(new Color(255, 255, 255));
		loginButton.setForeground(new Color(0, 0, 204));
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		loginButton.setActionCommand("Login");
		loginButton.addActionListener(this);
		buttonPane.add(loginButton);
		getRootPane().setDefaultButton(loginButton);
	
		cancelButton = new JButton("Cancel");
		cancelButton.setBackground(new Color(255, 255, 255));
		cancelButton.setForeground(new Color(0, 0, 204));
		cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cancelButton.setActionCommand("Cancel");
		cancelButton.addActionListener(this);
		buttonPane.add(cancelButton);
	
     	panel = new JPanel();
     	panel.setBackground(new Color(0, 204, 255));
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 434, 238);
		frame.getContentPane().add(panel);
		
		lblUserId = new JLabel("User ID :");
		lblUserId.setForeground(new Color(0, 0, 204));
		lblUserId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUserId.setBounds(48, 71, 93, 28);
		panel.add(lblUserId);

		lblPassword = new JLabel("Password :");
		lblPassword.setForeground(new Color(0, 0, 204));
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(48, 130, 93, 28);
		panel.add(lblPassword);

		userId = new JTextField();
		userId.setText("1");
		userId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		userId.setColumns(10);
		userId.setBounds(182, 71, 137, 28);
		panel.add(userId);
			
		passwordField = new JTextField();
		passwordField.setText("1");
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(182, 130, 137, 28);
		panel.add(passwordField);
		passwordField.setColumns(10);		
		
		lblEnterDetailsPlase = new JLabel("Enter details plase :");
		lblEnterDetailsPlase.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblEnterDetailsPlase.setForeground(new Color(0, 0, 153));
		lblEnterDetailsPlase.setBounds(96, 11, 200, 50);
		panel.add(lblEnterDetailsPlase);
		frame.setVisible(true);
		
		}
		

	//getters and setters
	public int getUserId() {
		return Integer.parseInt(userId.getText());
	}

	public String getPassword() {
		return passwordField.getText();
	}

	public void setCtrl(LoginController ctrl) {
		this.ctrl =  ctrl;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try
		{
			if (e.getSource() == loginButton)
			{
				//if (ctrl != null){ 
				//	System.out.println("login press");
					clientctr =new ClientController();
					//System.out.println("ClientController create");
					clientctr.connect();
					System.out.println("connect create");
					loginCrtl = new LoginController(this);
					//ctrl.login();
					int x;
				//}
			}
			if (e.getSource() == cancelButton)
			{
				System.out.println("cancel press");
				frame.dispose();
				MyFuelMain screen = new MyFuelMain();
			}
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}


	public void setUserID(String string) {
		// TODO Auto-generated method stub
		this.userId.setText(" ");
		
	}


	public void setUserPassword(String string) {
		// TODO Auto-generated method stub
		this.passwordField.setText(" ");
		
	}
}