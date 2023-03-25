
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

public class Exercise_16 extends JFrame implements ActionListener {

	// Create components 
	private JPanel panel;
	private JButton exit;
	private JLabel label;
	private JLabel labK;
	private JLabel labC;
	private JLabel labR;
	private MainMenu menu;
	private JButton comvert;
	private JTextField txtCenti;
	private JTextField txtKelvin;
	private JTextField txtReamur;
	
	public Exercise_16(MainMenu menu) {
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
		txtKelvin = CreateComponent.createTextField(100, 50, 210, 30);
		txtKelvin.setEditable(false);
		txtReamur = CreateComponent.createTextField(100, 50, 210, 30);
		txtReamur.setEditable(false);
		comvert = CreateComponent.createButton(150, 100, 100, 25, "Continuar");
		comvert.addActionListener(this);
		exit = CreateComponent.createButton(150, 150, 100, 25, "salir");
		exit.addActionListener(this);
		label = CreateComponent.createLabel(150, 20, 210, 35, "Centigrados - kelvinnheit", 20);

		labC = CreateComponent.createLabel(1, 1, 100, 30, "Centigrados", 22);
		labK = CreateComponent.createLabel(1, 1, 100, 30, "Kelvin", 22);
		labR = CreateComponent.createLabel(1, 1, 100, 30, "Reamur", 22);
		
		panel.add(label);
		panel.add(labC);
		panel.add(txtCenti);
		panel.add(labK);
		panel.add(txtKelvin);
		panel.add(labR);
		panel.add(txtReamur);
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
			String kelvin = txtKelvin.getText().trim();
			String reamur = txtReamur.getText().trim();
			
			float intCenti = 0;
			float intkelvin = 0;
			float intReaumur = 0;
			// String voids
			if(!centi.equals("") && kelvin.equals("") && reamur.equals("")) {
				try {
					intCenti = Float.parseFloat(centi);
					intkelvin = (float) (intCenti + 273.15);
					intReaumur = (float) (intCenti * 0.8);

					txtKelvin.setText(String.valueOf(intkelvin));
					txtReamur.setText(String.valueOf(intReaumur));
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Solo debe ingresar numeros");
				}
			// centi void
			} else {
				JOptionPane.showMessageDialog(null, "Solo debe llenar un campo");
			}
			
		} else if(e.getSource() == exit) {
			this.dispose();
			menu.setVisible(true);
		}
	}

}

