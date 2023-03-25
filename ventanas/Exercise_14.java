
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

public class Exercise_14 extends JFrame implements ActionListener {

	// Create components 
	private JPanel panel;
	private JButton exit;
	private JLabel label;
	private JLabel labRespose;
	private JLabel labF;
	private JLabel labC;
	private MainMenu menu;
	private JButton btnCalc;
	private JTextField txtCompra;
	private JTextField txtPorce;
	
	public Exercise_14(MainMenu menu) {
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

		txtCompra = CreateComponent.createTextField(100, 50, 210, 30);
		txtPorce = CreateComponent.createTextField(100, 50, 210, 30);
		btnCalc = CreateComponent.createButton(150, 100, 100, 25, "Calcular");
		btnCalc.addActionListener(this);
		exit = CreateComponent.createButton(150, 150, 100, 25, "salir");
		exit.addActionListener(this);
		label = CreateComponent.createLabel(150, 20, 210, 35, "Precio final de un producto", 20);

		labC = CreateComponent.createLabel(1, 1, 100, 30, "Precio de compra", 20, Font.ITALIC);
		labF = CreateComponent.createLabel(1, 1, 100, 30, "Porcentaje de ganancia", 20, Font.ITALIC);
		labRespose = CreateComponent.createLabel(1, 1, 100, 30, "", 20, Font.ITALIC);
		
		panel.add(label);
		panel.add(labC);
		panel.add(txtCompra);
		panel.add(labF);
		panel.add(txtPorce);
		panel.add(btnCalc);
		panel.add(exit);
		panel.add(labRespose);
		
		this.add(panel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnCalc) {

			// get inputs
			String compra = txtCompra.getText().trim();
			String porcentaje = txtPorce.getText().trim();

			float intcompra = 0;
			float intporcentaje = 0;
			
			// String voids
			if(compra.equals("") || porcentaje.equals("")) {
				JOptionPane.showMessageDialog(null, "Debe llenar los dos campos");
				
			// compra void
			} else {
				
				try {
					intporcentaje = Float.parseFloat(porcentaje);					
					intcompra = Float.parseFloat(compra);
					labRespose.setText(String.valueOf(intcompra + (intcompra*intporcentaje)/100));
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Debe ingresar unicamente numeros");
				}
			}
			
		} else if(e.getSource() == exit) {
			this.dispose();
			menu.setVisible(true);
		}
	}

}

