package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu extends JFrame implements ActionListener {

	private JPanel panel;
	private JButton buttons[];

	public MainMenu() {
		initComponents();

		this.setVisible(true);
		this.setSize(900, 600);
		this.setResizable(false);
		this.setTitle("Ejercicios con interfaz grafica");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	private void initComponents() {

		GridLayout layout = new GridLayout(5, 4, 10, 10);

		panel = new JPanel();
		panel.setLayout(layout);

		buttons = new JButton[25];

		int aux = 2;

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Ejercicio " + aux);
			buttons[i].setForeground(new Color(200, 225, 195));
			buttons[i].setBackground(new Color(25, 60, 85));
			buttons[i].setFont(new Font("Areal", Font.ITALIC, 22));
			buttons[i].addActionListener(this);

			panel.add(buttons[i]);
			aux += 2;
		}

		this.add(panel);
	}

	public static void main(String[] args) {
		new MainMenu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int eve = 0;

		// Search source the event
		for (int i = 0; i < buttons.length; i++) {
			if (e.getSource() == buttons[i]) {
				eve = i * 2 + 2;
				break;
			}
		}

		switch (eve) {
		case 2:
			System.out.println("Ejercicio " + eve);
			this.dispose();
			new Exercise_2(this).setVisible(true);
			break;
			
		case 4:
			this.dispose();
			new Exercise_4(this);
			break;
			
		case 6:
			this.dispose();
			new Exercise_6(this);
			break;
			
		case 8:
			this.dispose();
			new Exercise_8(this);
			break;
			
		case 10:
			this.dispose();
			new Exercise_10(this);
			break;
			
		case 12:
			this.dispose();
			new Exercise_8(this);
			break;
			
		case 14:
			this.dispose();
			new Exercise_8(this);
			break;
			
		case 16:
			this.dispose();
			new Exercise_8(this);
			break;
			
		case 17:
			this.dispose();
			new Exercise_8(this);
			break;
		default:
//			throw new IllegalArgumentException("Unexpected value: " + eve);
			System.err.println("No iniciado");
		}

	}
}
