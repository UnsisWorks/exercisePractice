package ventanas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import algoritmos.CreateComponent;

public class Exercise_4 extends JFrame implements ActionListener {

	// Create components 
	private JPanel panel;
	private JButton exit;
	private JLabel label;
	private MainMenu menu;
	private JButton comvert;
	private JTextField txtCenti;
	private JTextField txtFahre;
	
	public Exercise_4(MainMenu menu) {
		// Set properties to window
		initComponents();
		this.setTitle("Ejercicio 2");
		this.setSize(300, 400);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.menu = menu;
	}
	
	// Init components and add to window 
	public void initComponents() {
		panel = new JPanel(new FlowLayout(MAXIMIZED_VERT, 30, 10));

		txtCenti = CreateComponent.createTextField(100, 50, 210, 30);
		txtFahre = CreateComponent.createTextField(100, 50, 210, 30);
		comvert = CreateComponent.createButton(150, 100, 100, 25, "Continuar");
		comvert.addActionListener(this);
		exit = CreateComponent.createButton(150, 150, 100, 25, "salir");
		exit.addActionListener(this);
		label = CreateComponent.createLabel(150, 20, 210, 35, "Centigrados - Fahrenheit");

		panel.add(label);
		panel.add(txtCenti);
		panel.add(txtFahre);
		panel.add(comvert);
		panel.add(exit);
		
		this.add(panel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == comvert) {

			String centi = txtCenti.getText().trim();
			String fahre = txtCenti.getText().trim();
			
		} else if(e.getSource() == exit) {
			this.dispose();
			menu.setVisible(true);
		}
	}

}
