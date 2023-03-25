
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

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

public class Exercise_20 extends JFrame implements ActionListener {

	// Create components 
	private JPanel panel;
	private JButton exit;
	private JLabel label;
	private JLabel labNumber;
	private JLabel labResult;
	private MainMenu menu;
	private JButton convert;
	private JTextField txtNumber1;
	private JTextField txtNumber2;
	
	public Exercise_20(MainMenu menu) {
		// Set properties to window
		initComponents();
		this.setTitle("Ejercicio 18");
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

		txtNumber1 = CreateComponent.createTextField(100, 50, 210, 30);
		txtNumber2 = CreateComponent.createTextField(100, 50, 210, 30);
		convert = CreateComponent.createButton(150, 100, 100, 25, "Comprobar");
		convert.addActionListener(this);
		exit = CreateComponent.createButton(150, 150, 100, 25, "salir");
		exit.addActionListener(this);
		label = CreateComponent.createLabel(150, 20, 210, 35, "Numeros iguales", 20);

		labResult = CreateComponent.createLabel(1, 1, 100, 30, "", 22);
		labNumber = CreateComponent.createLabel(1, 1, 100, 30, "Numeros", 18, Font.ITALIC);
		
		panel.add(label);
		panel.add(labResult);
		panel.add(labNumber);
		panel.add(txtNumber1);
		panel.add(txtNumber2);
		panel.add(convert);
		panel.add(exit);
		
		this.add(panel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == convert) {

			// get inputs
			String number1 = txtNumber1.getText().trim();
			String number2 = txtNumber2.getText().trim();

			// String voids
			if(!number1.equals("") && !number2.equals("")) {
				try {

					if (number1.equals(number2)) {
						labResult.setText("Son iguales");
					} else {
						labResult.setText("Son diferentes");
					}
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Solo debe ingresar numeros");
				}
			// number1 void
			} else {
				JOptionPane.showMessageDialog(null, "Solo debe llenar un campo");
			}
			
		} else if(e.getSource() == exit) {
			this.dispose();
			menu.setVisible(true);
		}
	}
}