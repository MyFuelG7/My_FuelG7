package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class FuelScreen extends JFrame implements ActionListener{
	
	public FuelScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setBackground(Color.CYAN);
		getContentPane().setLayout(null);
		
		JLabel lblSelectFuelType = new JLabel("Select fuel type ");
		lblSelectFuelType.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
		lblSelectFuelType.setBounds(69, 74, 297, 46);
		getContentPane().add(lblSelectFuelType);
		
		JButton button = new JButton("95");
		button.setBounds(12, 175, 97, 25);
		getContentPane().add(button);
		
		JButton btnMotorcycleFule = new JButton("Motorcycle fule");
		btnMotorcycleFule.setBounds(289, 173, 131, 28);
		getContentPane().add(btnMotorcycleFule);
		
		JButton btnDiesel = new JButton("Diesel");
		btnDiesel.setBounds(144, 175, 119, 25);
		getContentPane().add(btnDiesel);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(12, 13, 97, 25);
		getContentPane().add(btnBack);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
