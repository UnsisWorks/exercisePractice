package ventanas;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import algoritmos.CreateComponent;

public class Exercise_12 extends JFrame implements ActionListener {
	// Create components 
	private JPanel panel;
	private JButton exit;
	private JLabel label;
	private JLabel labResponse;
	private MainMenu menu;
	private JButton btnCalc;
	private JTextField txtNumber;
	
	public Exercise_12(MainMenu menu) {
		// Set properties to window
		initComponents();
		this.setTitle("Ejercicio 12 - Voltear numero");
		this.setSize(300, 400);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.menu = menu;
	}
	
	// Init components and add to window 
	public void initComponents() {
		panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));

		txtNumber = CreateComponent.createTextField(100, 50, 210, 30);
		btnCalc = CreateComponent.createButton(150, 100, 100, 25, "Continuar");
		btnCalc.addActionListener(this);
		exit = CreateComponent.createButton(150, 150, 100, 25, "salir");
		exit.addActionListener(this);
		label = CreateComponent.createLabel(150, 20, 210, 35, "Separar y voltear un int", 20);

		labResponse = CreateComponent.createLabel(1, 1, 100, 30, "", 18, Font.ITALIC);
		
		panel.add(label);
		panel.add(txtNumber);
		panel.add(btnCalc);
		panel.add(exit);
		panel.add(labResponse);
		
		this.add(panel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnCalc) {

			// get inputs
			String number = txtNumber.getText().trim();

			int fltnumber = 0;
				
			// number void
			 if(!number.equals("")) {
				
				try {
					// Calculate volume and show
					fltnumber = Integer.parseInt(number);
					String cad = "";
					
					for (int i = number.length() - 1; i >= 0; i--) {
						if (i == 0) {
							cad += number.charAt(i);							
						} else {
							cad += number.charAt(i) + " - ";
						}
					}
					
					labResponse.setText("Volumen: " + String.valueOf(cad));
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Debe ingresar unicamente numeros");
				}
				
			// metros void
			} else {
				JOptionPane.showMessageDialog(null, "Debe llenar el campo");
			}
			
		} else if(e.getSource() == exit) {
			this.dispose();
			menu.setVisible(true);
		}
	}
}
