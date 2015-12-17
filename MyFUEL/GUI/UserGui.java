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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("User window");
		setBounds(100, 100, 400, 300);
		getContentPane().setBackground(Color.CYAN);
		getContentPane().setLayout(null);
		
		
		btnFuel.setForeground(Color.BLACK);
		btnFuel.setBackground(Color.LIGHT_GRAY);
		btnFuel.setBounds(73, 161, 99, 33);
		getContentPane().add(btnFuel);
		btnFuel.addActionListener(this);
		
		btnFuelForHome.setBackground(Color.LIGHT_GRAY);
		btnFuelForHome.setForeground(Color.BLACK);
		btnFuelForHome.setBounds(209, 161, 113, 33);
		getContentPane().add(btnFuelForHome);
		btnFuelForHome.addActionListener(this);
		
		lblSelectYourChoose.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblSelectYourChoose.setBounds(53, 53, 289, 61);
		getContentPane().add(lblSelectYourChoose);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setBackground(Color.LIGHT_GRAY);
		btnLogout.setBounds(12, 13, 80, 25);
		getContentPane().add(btnLogout);
		btnLogout.addActionListener(this);
		
		this.setVisible(true);
	}
	public static void main(String[] args){
		UserGui u = new UserGui();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnFuel){
			this.dispose();
			FuelScreen f = new FuelScreen();
		}
		else if (e.getSource() == btnFuelForHome){
			this.dispose();
			FuelForHomeScreen f = new FuelForHomeScreen();
		}
		else {
			this.dispose();
			int a;
			int w;
			//LoginGUI f = new LoginGUI();
			
		}
	}


		
}
