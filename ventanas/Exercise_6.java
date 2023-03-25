
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

public class Exercise_6 extends JFrame implements ActionListener  {

	// Create components 
	private JPanel panel;
	private JButton exit;
	private JLabel label;
	private JLabel labKh;
	private JLabel labMs;
	private MainMenu menu;
	private JButton convert;
	private JTextField txtKh;
	private JTextField txtMs;
	
	public Exercise_6(MainMenu menu) {
		// Set properties to window
		initComponents();
		this.setTitle("Ejercicio 6");
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

		txtKh = CreateComponent.createTextField(100, 50, 210, 30);
		txtMs = CreateComponent.createTextField(100, 50, 210, 30);
		convert = CreateComponent.createButton(150, 100, 100, 25, "Continuar");
		convert.addActionListener(this);
		exit = CreateComponent.createButton(150, 150, 100, 25, "salir");
		exit.addActionListener(this);
		label = CreateComponent.createLabel(150, 20, 210, 35, "Km/h - M/s", 24);

		labKh = CreateComponent.createLabel(1, 1, 100, 30, "Kilometros/Hora", 18);
		labMs = CreateComponent.createLabel(1, 1, 100, 30, "Metros/Segundo", 18);
		
		panel.add(label);
		panel.add(labKh);
		panel.add(txtKh);
		panel.add(labMs);
		panel.add(txtMs);
		panel.add(convert);
		panel.add(exit);
		
		this.add(panel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == convert) {

			// get inputs
			String kilometro = txtKh.getText().trim();
			String metros = txtMs.getText().trim();

			float fltKilo = 0;
			float fltMetro = 0;
			
			// String voids
			if(kilometro.equals("") && metros.equals("")) {
				JOptionPane.showMessageDialog(null, "Debe llenar un campo");
				
			// kilometro void
			} else if(kilometro.equals("")) {
				
				try {
					fltMetro = Float.parseFloat(metros);					
					fltKilo = (float) (fltMetro * 3600)/1000;
					txtKh.setText(String.valueOf(fltKilo));
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Debe ingresar unicamente numeros");
				}
				
			// metros void
			} else if(metros.equals("")) {
				
				try {
					fltKilo = Float.parseFloat(kilometro);
					// Convert and show request
					fltMetro = (fltKilo * (5/18));
					System.out.println(fltKilo);
					System.out.println((fltKilo * (5/18)));
					txtMs.setText(String.valueOf(fltMetro));
					
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
