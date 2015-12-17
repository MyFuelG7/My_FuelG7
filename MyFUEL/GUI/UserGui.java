package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class UserGui extends JFrame implements ActionListener{
	private final JButton btnFuel = new JButton("Fuel");
	private final JButton btnFuelForHome = new JButton("Fuel for home");
	private final JLabel lblSelectYourChoose = new JLabel("Select your choose");
	public UserGui() {
		getContentPane().setBackground(Color.CYAN);
		getContentPane().setLayout(null);
		
		
		btnFuel.setForeground(Color.RED);
		btnFuel.setBackground(Color.RED);
		btnFuel.setBounds(73, 149, 99, 46);
		getContentPane().add(btnFuel);
		
		
		btnFuelForHome.setBackground(Color.GREEN);
		btnFuelForHome.setForeground(Color.GREEN);
		btnFuelForHome.setBounds(234, 149, 113, 46);
		getContentPane().add(btnFuelForHome);
		
		
		lblSelectYourChoose.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblSelectYourChoose.setBounds(53, 53, 289, 61);
		getContentPane().add(lblSelectYourChoose);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setBackground(Color.RED);
		btnLogout.setBounds(12, 13, 104, 32);
		getContentPane().add(btnLogout);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnFuel){
			OpenFuelScreen();
		}
		else if (e.getSource() == btnFuelForHome){
			OpenFuelForHomeScreen();
		}
		else {
			OpenLogInScreen();
		}
	}


		
}
