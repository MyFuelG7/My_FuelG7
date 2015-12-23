package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class FuelForHomeScreen extends JFrame implements ActionListener{
	public FuelForHomeScreen() {
		getContentPane().setBackground(Color.CYAN);
		getContentPane().setForeground(Color.CYAN);
		setTitle("Fuel for home");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton(" New reservations");
		btnNewButton.setBounds(53, 148, 292, 25);
		getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnViewOld = new JButton("View old reservations ");
		btnViewOld.setBounds(83, 186, 235, 25);
		getContentPane().add(btnViewOld);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(UIManager.getColor("CheckBoxMenuItem.background"));
		btnBack.setBounds(22, 28, 97, 25);
		getContentPane().add(btnBack);
		
		JLabel lblReservationsFuelFor = new JLabel("Reservations fuel for home");
		lblReservationsFuelFor.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblReservationsFuelFor.setBounds(63, 76, 325, 46);
		getContentPane().add(lblReservationsFuelFor);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
