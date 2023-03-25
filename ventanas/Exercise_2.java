
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

public class Exercise_2 extends JFrame implements ActionListener {

	private JPanel panel;
	private JTextField txtName;
	private JButton button;
	private JButton exit;
	private JLabel label;
	private MainMenu menu;
	
	public Exercise_2(MainMenu menu) {
		initComponents();
		this.setTitle("Ejercicio 2");
		this.setSize(300, 400);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.menu = menu;
	}
	
	public void initComponents() {
		panel = new JPanel(new FlowLayout(MAXIMIZED_VERT, 30, 10));
		
		txtName = CreateComponent.createTextField(100, 50, 210, 30);
		button = CreateComponent.createButton(150, 100, 100, 25, "Continuar");
		button.addActionListener(this);
		exit = CreateComponent.createButton(150, 150, 100, 25, "salir");
		exit.addActionListener(this);
		label = CreateComponent.createLabel(150, 20, 210, 35, "", 24);

		panel.add(txtName);
		panel.add(button);
		panel.add(exit);
		panel.add(label);
		
		this.add(panel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			if (!txtName.getText().trim().equals("")) {				
				label.setText("Buenos dias " + txtName.getText().trim());
			} else {
				JOptionPane.showMessageDialog(null, "Debe ingresar su nombr");
			}
		} else if(e.getSource() == exit) {
			this.dispose();
			menu.setVisible(true);
		}
	}

}
