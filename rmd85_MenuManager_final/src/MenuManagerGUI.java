import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MenuManagerGUI {

	private JFrame mainMenuWindow; 
	private JLabel lblEntree, lblDessert, lblSides, lblSalad; 
	private JButton btnCreate, btnRand, btnMinCal, btnMaxCal, btnDetails, btnDel, btnSave; 
	private JComboBox<String> cboEntree, cboDessert, cboSide, cboSalad; 
	private JTextArea textField, textField2, textField3;
	private MenuManager m = new MenuManager("data/dishes.txt"); 
	
	
	
	public MenuManagerGUI() {
		Menu menu = new Menu("dishes.txt");
		initializeWindow(); 
		mainMenuWindow.setVisible(true);
	}
	
	
	
	private void initializeWindow() {
		mainMenuWindow = new JFrame("Menu Manager");
		mainMenuWindow.setBounds(20, 20, 500, 500);
		mainMenuWindow.setLayout(null);
		
		// textField = new JTextField(); 
		//entreeText = new JTextField(); 
		
		
		lblEntree = new JLabel("Entree: ");
		lblEntree.setBounds(50, 50, 80, 30);
		mainMenuWindow.getContentPane().add(lblEntree);
		
		lblDessert = new JLabel("Dessert"); 
		lblDessert.setBounds(50, 90, 80, 30);
		mainMenuWindow.getContentPane().add(lblDessert);
		
		lblSides = new JLabel("Side"); 
		lblSides.setBounds(50, 130, 80, 30);
		mainMenuWindow.getContentPane().add(lblSides);
		
		lblSalad = new JLabel("Salad");
		lblSalad.setBounds(50, 170, 80, 30);
		mainMenuWindow.getContentPane().add(lblSalad);
		
		cboEntree = new JComboBox();
		cboEntree.setBounds(lblEntree.getX() + lblEntree.getWidth(), lblEntree.getY(), 150, 30);
		mainMenuWindow.getContentPane().add(cboEntree);
		for(Entree entree : m.getEntree()) {
			cboEntree.addItem(entree.getName());
		}
		
		
		cboDessert = new JComboBox();
		cboDessert.setBounds(lblDessert.getX() + lblDessert.getWidth(), lblDessert.getY(), 150, 30);
		mainMenuWindow.getContentPane().add(cboDessert);
		for(Dessert dessert : m.getDesserts()) {
			cboEntree.addItem(dessert.getName());
		}
		
		cboSide = new JComboBox();
		cboSide.setBounds(lblSides.getX() + lblSides.getWidth(), lblSides.getY(), 150, 30);
		mainMenuWindow.getContentPane().add(cboSide);
		for(Side side : m.getSide()) {
			cboEntree.addItem(side.getName());
		}
		
		cboSalad = new JComboBox();
		cboSalad.setBounds(lblSalad.getX() + lblSalad.getWidth(), lblSalad.getY(), 150, 30);
		mainMenuWindow.getContentPane().add(cboSalad);
		for(Salad salad : m.getSalad()) {
			cboEntree.addItem(salad.getName());
		}
		
		textField = new JTextArea("Build your own menu");
		textField.setBounds(10, 10, 300, 200); 
		mainMenuWindow.add(textField);
		
		
		btnCreate = new JButton("Create Menu with these dishes");
		btnCreate.setBounds(20, 210, 250, 30);
		btnCreate.addActionListener(new ButtonListener());
		mainMenuWindow.add(btnCreate); 

		
		btnRand = new JButton("Generate a Random Menu");
		btnRand.setBounds(20, 325, 250, 30);
		btnRand.addActionListener(new ButtonListener());
		mainMenuWindow.add(btnRand); 
		
		btnMinCal = new JButton("Generate a Minimum Calories Menu");
		btnMinCal.setBounds(20, 365, 250, 30);
		btnMinCal.addActionListener(new ButtonListener());
		mainMenuWindow.add(btnMinCal); 
		
		btnMaxCal = new JButton("Generate a Maximum Calories Menu");
		btnMaxCal.setBounds(20, 405, 250, 30);
		btnMinCal.addActionListener(new ButtonListener());
		mainMenuWindow.add(btnMaxCal); 
		
		textField2 = new JTextArea("Or generate a menu");
		textField2.setBounds(10, 300, 300, 200); 
		mainMenuWindow.add(textField2);
		
		btnDetails = new JButton("Details");
		btnDetails.setBounds(350, 450, 100, 30);
		btnDetails.addActionListener(new ButtonListener());
		mainMenuWindow.add(btnDetails); 
		
		btnDel = new JButton("Delete all");
		btnDel.setBounds(450, 450, 100, 30);
		btnDel.addActionListener(new ButtonListener());
		mainMenuWindow.add(btnDel);
		
		btnSave = new JButton("Save to file");
		btnSave.setBounds(550, 450, 100, 30);
		btnSave.addActionListener(new ButtonListener());
		mainMenuWindow.add(btnSave);
		
		textField3 = new JTextArea("Created Menus");
		textField3.setBounds(350, 10, 300, 400);
		mainMenuWindow.add(textField3);
		
	}
	
	



	public static void main(String[] args) {
		MenuManagerGUI mm = new MenuManagerGUI();

	}
	
	private ActionListener AL() {
		// TODO Auto-generated method stub
		return null;
	}
	
	class ButtonListener implements ActionListener{
		
		JFrame subframe; 
		Menu showMenu; 
		public JPanel getPanel(String type) {
			JPanel panel = new JPanel();
			JTextArea label; 
			JLabel title; 
			if(type.equals("Entree")) {
				title = new JLabel(type + '\t');
			}
			else if(type.equals("Dessert")) {
				title = new JLabel(type + '\t');
			}
			else if(type.equals("Side")) {
				title = new JLabel(type + '\t');
			}
			else if(type.equals("Salad")) {
				title = new JLabel(type + '\t');
			}
			return panel;
			
		}
		
	

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
