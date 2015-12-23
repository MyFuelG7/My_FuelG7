package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class MarketingManagerGUI  extends JFrame implements ActionListener,ICommonUI {
	public MarketingManagerGUI() {
		setTitle("Marketing Manager");
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		JButton btnUpdetPrice = new JButton("Updet Price");
		btnUpdetPrice.setForeground(new Color(255, 102, 0));
		btnUpdetPrice.setBounds(62, 109, 107, 37);
		getContentPane().add(btnUpdetPrice);
		btnUpdetPrice.addActionListener(this);
		
		JButton btnActiveSale = new JButton("Active Sale");
		btnActiveSale.setForeground(new Color(255, 102, 0));
		btnActiveSale.setBounds(240, 109, 107, 37);
		getContentPane().add(btnActiveSale);
		btnActiveSale.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("select your choose :");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblNewLabel.setBounds(124, 34, 179, 37);
		getContentPane().add(lblNewLabel);
	}

	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == "btnUpdetPrice"){
		
		}
		
		if (e.getSource() == "btnActiveSale"){
			
		}
		
	}
}