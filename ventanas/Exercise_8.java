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

public class Exercise_8 extends JFrame implements ActionListener {
		// Create components 
		private JPanel panel;
		private JButton exit;
		private JLabel label;
		private JLabel labResponse;
		private MainMenu menu;
		private JButton btnCalc;
		private JTextField txtRadio;
		
		public Exercise_8(MainMenu menu) {
			// Set properties to window
			initComponents();
			this.setTitle("Ejercicio 8 - Volumen de una esfera");
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

			txtRadio = CreateComponent.createTextField(100, 50, 210, 30);
			btnCalc = CreateComponent.createButton(150, 100, 100, 25, "Continuar");
			btnCalc.addActionListener(this);
			exit = CreateComponent.createButton(150, 150, 100, 25, "salir");
			exit.addActionListener(this);
			label = CreateComponent.createLabel(150, 20, 210, 35, "Volumen de una esfera", 23);

			labResponse = CreateComponent.createLabel(1, 1, 100, 30, "", 18, Font.ITALIC);
			
			panel.add(label);
			panel.add(txtRadio);
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
				String radio = txtRadio.getText().trim();

				double fltRadio = 0;
				double fltVol = 0;
					
				// radio void
				 if(!radio.equals("")) {
					
					try {
						// Calculate volume and show
						fltRadio = Double.parseDouble(radio);
						System.out.println(radio + " -- " + fltRadio);
						fltVol *= (4 * 3.1416 * Math.pow(fltRadio, 3) / 3);
						System.out.println(fltVol);
						labResponse.setText("Volumen: " + String.valueOf(fltVol));
						
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
