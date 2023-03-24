package ventanas;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import algoritmos.CreateComponent;

public class Exercise_10 extends JFrame implements ActionListener {
	private JPanel panel;
	private JTextField txtNumber;
	private JButton button;
	private JButton exit;
	private JLabel label;
	private MainMenu menu;
	
	public Exercise_10(MainMenu menu) {
		initComponents();
		this.setTitle("Ejercicio 10 - Separar un numero de 3 cifras");
		this.setSize(340, 400);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.menu = menu;
	}
	
	public void initComponents() {
		panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));

		// Create components for window
		txtNumber = CreateComponent.createTextField(100, 50, 210, 30);
		button = CreateComponent.createButton(150, 100, 100, 25, "Separar");
		button.addActionListener(this);
		exit = CreateComponent.createButton(150, 150, 100, 25, "salir");
		exit.addActionListener(this);
		label = CreateComponent.createLabel(150, 20, 210, 35, "", 28, Font.ITALIC);

		panel.add(txtNumber);
		panel.add(button);
		panel.add(exit);
		panel.add(label);
		
		this.add(panel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			String response = txtNumber.getText().trim();
			// Valid void values
			if (!response.equals("")) {
				
				try {
					
					int band = Integer.parseInt(response);
					String aux = "";
					
					for (int i = 0; i < response.length(); i++) {
						if (i == response.length() - 1) {
							aux += response.charAt(i);							
						} else {
							aux += response.charAt(i) + " - ";
						}
						label.setText(aux);
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Solo puede ingresar un nuemro");
					txtNumber.selectAll();
				}
				
			} else {
				JOptionPane.showMessageDialog(null, "Debe llenar el campo");
			}
		} else if(e.getSource() == exit) {
			this.dispose();
			menu.setVisible(true);
		}
	}

}
