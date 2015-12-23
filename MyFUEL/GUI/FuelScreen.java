package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JList;

import Controllers.ClientController;
import Controllers.FuelController;
import Controllers.LoginController;
import Controllers.UserController;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.DropMode;

public class FuelScreen extends JFrame implements ActionListener{
	
	private UserController ctrl;
	private ClientController clientctr;
	private FuelController FuelCrtl;
	private JLabel lblSelectFuelType;
	private JButton button_95;
	private JButton btnMotorcycleFule;
	private JButton btnDiesel;
	private JButton btnBack;
	private JTextField txtEnterQuntity;
	
	public FuelScreen(UserController userController) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setBackground(Color.CYAN);
		getContentPane().setLayout(null);
		
		lblSelectFuelType = new JLabel("Select fuel type ");
		lblSelectFuelType.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
		lblSelectFuelType.setBounds(69, 74, 297, 46);
		getContentPane().add(lblSelectFuelType);
		
		button_95 = new JButton("95");
		button_95.setBounds(12, 144, 97, 25);
		getContentPane().add(button_95);
		button_95.addActionListener(this);
		
		btnMotorcycleFule = new JButton("Motorcycle fule");
		btnMotorcycleFule.setBounds(289, 142, 131, 28);
		getContentPane().add(btnMotorcycleFule);
		btnMotorcycleFule.addActionListener(this);
		
		btnDiesel = new JButton("Diesel");
		btnDiesel.setBounds(139, 144, 119, 25);
		getContentPane().add(btnDiesel);
		btnDiesel.addActionListener(this);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(12, 13, 97, 25);
		getContentPane().add(btnBack);
		
		txtEnterQuntity = new JTextField();
		txtEnterQuntity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEnterQuntity.setBounds(157, 200, 116, 22);
		getContentPane().add(txtEnterQuntity);
		txtEnterQuntity.setColumns(10);
		
		JLabel lblEnterQuntity = new JLabel("Enter quntity:");
		lblEnterQuntity.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblEnterQuntity.setBounds(12, 201, 133, 20);
		getContentPane().add(lblEnterQuntity);
		btnBack.addActionListener(this);
		
		this.setVisible(true);
	}

	public void setCtrl(UserController ctrl) {
		this.ctrl =  ctrl;
	}
	public double getQuntity()
	{
		return Double.parseDouble(txtEnterQuntity.getText());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			if (e.getSource() == button_95){
				//if (ctrl != null){ 
					//UserGui usersceen = new UserGui(); function from meital
					//clientctr =new ClientController();
					//clientctr.connect();
					FuelCrtl = new FuelController(this);
					//ctrl.login();
				}
			else if (e.getSource() == btnBack){
				this.dispose();
				UserGui u = new UserGui();
			}
				
		}
		catch (IOException ex) {
				ex.printStackTrace();
		}
	}
}
