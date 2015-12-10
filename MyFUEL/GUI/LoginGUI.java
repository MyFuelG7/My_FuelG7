package GUI;

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

	private ILogin ctrl;
	private JTextField passwordField;

	/**
	 * Create the dialog.
	 */
	public LoginGUI(JFrame mainWindow) {
		super(mainWindow, true);
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 238, 434, 23);
			buttonPane.setLayout(new GridLayout(0, 2, 0, 0));
			getContentPane().add(buttonPane);
			{
				loginButton = new JButton("Log In");
				loginButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
				loginButton.setActionCommand("Login");
				loginButton.addActionListener(this);
				buttonPane.add(loginButton);
				getRootPane().setDefaultButton(loginButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
				cancelButton.setActionCommand("Cancel");
				cancelButton.addActionListener(this);
				buttonPane.add(cancelButton);
			}
		}
		{
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			panel.setBounds(0, 0, 434, 238);
			getContentPane().add(panel);
			{
				lblUserId = new JLabel("User ID");
				lblUserId.setHorizontalAlignment(SwingConstants.RIGHT);
				lblUserId.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblUserId.setBounds(48, 47, 93, 28);
				panel.add(lblUserId);
			}
			{
				lblPassword = new JLabel("Password");
				lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
				lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblPassword.setBounds(48, 110, 93, 28);
				panel.add(lblPassword);
			}
			{
				userId = new JTextField();
				userId.setFont(new Font("Tahoma", Font.PLAIN, 16));
				userId.setText("24");
				userId.setColumns(10);
				userId.setBounds(197, 47, 137, 28);
				panel.add(userId);
			}

			passwordField = new JTextField();
			passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
			passwordField.setText("1");
			passwordField.setBounds(197, 110, 137, 28);
			panel.add(passwordField);
			passwordField.setColumns(10);
		}
		
		
	}

	//getters and setters
	public int getUserId() {
		return Integer.parseInt(userId.getText());
	}

	public String getPassword() {
		return passwordField.getText();
	}

	public void setCtrl(ILogin ctrl) {
		this.ctrl = ctrl;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try{
		switch (e.getActionCommand()) {
		case "Login":
			if (ctrl != null){
				ctrl.login();
			}
			break;
			
	/*	case "Logout":
			if (ctrl != null)
				ctrl.logout();
			break;
		*/	
		case "Cancel":
			this.dispose();
			break;

		}
		}catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}