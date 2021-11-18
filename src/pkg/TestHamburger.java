package pkg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class TestHamburger {

	private JFrame frame;
	private JTextField totalTF;
	
	double cost = 0;
	String size, bun, sauce, cheese;
	ArrayList<String> extras = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestHamburger window = new TestHamburger();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestHamburger() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 722, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel firstLabel = new JLabel("Pizza Order");
		firstLabel.setBounds(32, 11, 78, 22);
		frame.getContentPane().add(firstLabel);
		
		JLabel sizeLabel = new JLabel("Size:");
		sizeLabel.setBounds(64, 54, 46, 14);
		frame.getContentPane().add(sizeLabel);
		
		JComboBox comboBoxSize = new JComboBox();
		comboBoxSize.setModel(new DefaultComboBoxModel(new String[] {"Kid Size", "Small", "Medium", "Large"}));
		comboBoxSize.setBounds(160, 50, 265, 22);
		frame.getContentPane().add(comboBoxSize);
		
		JLabel bunLabel = new JLabel("Buns:");
		bunLabel.setBounds(64, 104, 46, 14);
		frame.getContentPane().add(bunLabel);
		
		JComboBox comboBoxBun = new JComboBox();
		comboBoxBun.setModel(new DefaultComboBoxModel(new String[] {"Classic Buns", "Sesame Seed Buns", "Ciabatta"}));
		comboBoxBun.setBounds(160, 100, 265, 22);
		frame.getContentPane().add(comboBoxBun);
		
		JLabel sauceLabel = new JLabel("Sauce:");
		sauceLabel.setBounds(64, 154, 46, 14);
		frame.getContentPane().add(sauceLabel);
		
		JComboBox comboBoxSauce = new JComboBox();
		comboBoxSauce.setModel(new DefaultComboBoxModel(new String[] {"Ketchup", "Mayonnaise", "BBQ Sauce"}));
		comboBoxSauce.setBounds(160, 150, 265, 22);
		frame.getContentPane().add(comboBoxSauce);
		
		JLabel cheeseLabel = new JLabel("Cheese:");
		cheeseLabel.setBounds(64, 204, 80, 14);
		frame.getContentPane().add(cheeseLabel);
		
		JComboBox comboBoxCheese = new JComboBox();
		comboBoxCheese.setModel(new DefaultComboBoxModel(new String[] {"Regular Cheddar", "Reduced Fat Cheddar"}));
		comboBoxCheese.setBounds(160, 200, 265, 22);
		frame.getContentPane().add(comboBoxCheese);
		
		JLabel extrasLabel = new JLabel("Extras:");
		extrasLabel.setBounds(64, 266, 80, 14);
		frame.getContentPane().add(extrasLabel);
		
		JCheckBox chckbxMushrooms = new JCheckBox("Mushrooms");
		chckbxMushrooms.setBounds(160, 250, 97, 23);
		frame.getContentPane().add(chckbxMushrooms);
		
		JCheckBox chckbxPickles = new JCheckBox("Pickles");
		chckbxPickles.setBounds(290, 250, 110, 23);
		frame.getContentPane().add(chckbxPickles);
		
		JCheckBox chckbxLettuce = new JCheckBox("Lettuce");
		chckbxLettuce.setBounds(420, 250, 97, 23);
		frame.getContentPane().add(chckbxLettuce);
		
		JCheckBox chckbxTomato = new JCheckBox("Tomato");
		chckbxTomato.setBounds(550, 250, 97, 23);
		frame.getContentPane().add(chckbxTomato);
		
		JCheckBox chckbxOnions = new JCheckBox("Onions");
		chckbxOnions.setBounds(160, 280, 97, 23);
		frame.getContentPane().add(chckbxOnions);
		
		JCheckBox chckbxFries = new JCheckBox("Fries");
		chckbxFries.setBounds(290, 280, 97, 23);
		frame.getContentPane().add(chckbxFries);
		
		JCheckBox chckbxMeat = new JCheckBox("Extra meat");
		chckbxMeat.setBounds(420, 280, 97, 23);
		frame.getContentPane().add(chckbxMeat);
		
		JCheckBox chckbxSauce = new JCheckBox("Extra sauce");
		chckbxSauce.setBounds(550, 280, 97, 23);
		frame.getContentPane().add(chckbxSauce);
		
		JLabel totalLabel = new JLabel("Total");
		totalLabel.setBounds(64, 335, 46, 14);
		frame.getContentPane().add(totalLabel);
		
		totalTF = new JTextField();
		totalTF.setBounds(150, 332, 86, 20);
		frame.getContentPane().add(totalTF);
		totalTF.setColumns(10);
		
		JButton calculateButton = new JButton("Calculate Cost");
		calculateButton.setBounds(250, 331, 124, 23);
		frame.getContentPane().add(calculateButton);
		
		JButton clearButton = new JButton("Clear");
		clearButton.setBounds(410, 310, 89, 23);
		frame.getContentPane().add(clearButton);
		
		JButton orderButton = new JButton("Order");
		orderButton.setBounds(410, 346, 89, 23);
		frame.getContentPane().add(orderButton);
		
		JLabel orderedLabel = new JLabel("");
		orderedLabel.setForeground(Color.RED);
		orderedLabel.setBounds(540, 335, 140, 14);
		frame.getContentPane().add(orderedLabel);
		
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = comboBoxSize.getSelectedItem().toString();
				bun = comboBoxBun.getSelectedItem().toString();
				sauce = comboBoxSauce.getSelectedItem().toString();
				cheese = comboBoxCheese.getSelectedItem().toString();
				if(chckbxMushrooms.isSelected()) {
					extras.add(chckbxMushrooms.getText());
				}
				if(chckbxPickles.isSelected()) {
					extras.add(chckbxPickles.getText());
				}
				if(chckbxLettuce.isSelected()) {
					extras.add(chckbxLettuce.getText());
				}
				if(chckbxTomato.isSelected()) {	
					extras.add(chckbxTomato.getText());
				}
				if(chckbxOnions.isSelected()) {	
					extras.add(chckbxOnions.getText());
				}
				if(chckbxFries.isSelected()) {	
					extras.add(chckbxFries.getText());
				}
				if(chckbxMeat.isSelected()) {	
					extras.add(chckbxMeat.getText());
				}
				if(chckbxSauce.isSelected()) {	
					extras.add(chckbxSauce.getText());
				}
				
				Hamburger customHamburger = new HamburgerExtra(extras, new HamburgerCheese(cheese, new HamburgerSauce(sauce, new HamburgerBun(bun, new HamburgerSize(size, new Hamburger(0))))));
				cost = customHamburger.getCost();
				totalTF.setText(""+ cost);
			}
		});
		
		orderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderedLabel.setText("Ordered Succesfully");
			}
		});
	
		
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxSize.setSelectedIndex(0);
				comboBoxBun.setSelectedIndex(0);
				comboBoxSauce.setSelectedIndex(0);
				comboBoxCheese.setSelectedIndex(0);
				chckbxMushrooms.setSelected(false);
				chckbxPickles.setSelected(false);
				chckbxLettuce.setSelected(false);
				chckbxTomato.setSelected(false);
				chckbxOnions.setSelected(false);
				chckbxFries.setSelected(false);
				chckbxMeat.setSelected(false);
				chckbxSauce.setSelected(false);
				extras.clear();
				Hamburger customHamburger = new HamburgerExtra(extras, new HamburgerCheese("Regular Cheddar", new HamburgerSauce("Ketchup", new HamburgerBun("Classic Buns", new HamburgerSize("Kid Size", new Hamburger(0))))));
				cost = customHamburger.getCost();
				totalTF.setText("");
				orderedLabel.setText("");
			}
		});
		
	}
}
