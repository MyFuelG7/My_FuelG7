
package GUI;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class LoginWindow extends JFrame {
	int x;
	private final JButton btnRegisterUser = new JButton("Register User");
	public LoginWindow() {
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		getContentPane().setBackground(new Color(0, 204, 255));
		getContentPane().setLayout(null);
		btnRegisterUser.setFont(new Font("Segoe UI Semilight", Font.BOLD, 11));
		btnRegisterUser.setForeground(new Color(0, 0, 204));
		btnRegisterUser.setBackground(new Color(0, 0, 204));
		btnRegisterUser.setBounds(69, 84, 111, 31);
		getContentPane().add(btnRegisterUser);
		
		JButton btnUnregisterUser = new JButton("Un-register User");
		btnUnregisterUser.setToolTipText("");
		btnUnregisterUser.setFont(new Font("Segoe UI Symbol", Font.BOLD, 11));
		btnUnregisterUser.setForeground(new Color(0, 0, 204));
		btnUnregisterUser.setBackground(new Color(0, 0, 204));
		btnUnregisterUser.setBounds(230, 84, 133, 31);
		getContentPane().add(btnUnregisterUser);
		
		JLabel label = new JLabel("Choose uesr type pless");
		label.setFont(new Font("Segoe UI Symbol", Font.BOLD, 13));
		label.setForeground(new Color(0, 0, 204));
		label.setBounds(130, 23, 185, 50);
		getContentPane().add(label);
	}
}
