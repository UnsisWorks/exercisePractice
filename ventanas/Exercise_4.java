
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package ventanas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import algoritmos.CreateComponent;

public class Exercise_4 extends JFrame implements ActionListener {

	// Create components 
	private JPanel panel;
	private JButton exit;
	private JLabel label;
	private JLabel labF;
	private JLabel labC;
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
		label = CreateComponent.createLabel(150, 20, 210, 35, "Centigrados - Fahrenheit", 20);

		labC = CreateComponent.createLabel(1, 1, 100, 30, "Centigrados", 22);
		labF = CreateComponent.createLabel(1, 1, 100, 30, "Fahrenheit", 22);
		
		panel.add(label);
		panel.add(labC);
		panel.add(txtCenti);
		panel.add(labF);
		panel.add(txtFahre);
		panel.add(comvert);
		panel.add(exit);
		
		this.add(panel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == comvert) {

			// get inputs
			String centi = txtCenti.getText().trim();
			String fahre = txtFahre.getText().trim();

			float intCenti = 0;
			float intfahre = 0;
			
			// String voids
			if(centi.equals("") && fahre.equals("")) {
				JOptionPane.showMessageDialog(null, "Debe llenar un campo");
				
			// centi void
			} else if(centi.equals("")) {
				
				try {
					intfahre = Float.parseFloat(fahre);					
					intCenti = (float) ((intfahre - 32) / 1.8000);
					txtCenti.setText(String.valueOf(intCenti));
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Debe ingresar unicamente numeros");
				}
				
			// fahre void
			} else if(fahre.equals("")) {
				
				try {
					intCenti = Float.parseFloat(centi);
					// Convert and show request
					intfahre = (float) ((intCenti * 1.8000) + 32);
					txtFahre.setText(String.valueOf(intfahre));
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Debe ingresar unicamente numeros");
				}
			// Compare if the values equals
			} else {
				JOptionPane.showMessageDialog(null, "Solo debe llenar un campo");
			}
			
		} else if(e.getSource() == exit) {
			this.dispose();
			menu.setVisible(true);
		}
	}

}
