package algoritmos;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CreateComponent {
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @return
	 */
	public static JTextField createTextField(int x, int y, int width, int height) {
		JTextField field = new JTextField();
		field.setPreferredSize(new Dimension(width, height));
		field.setFont(new Font("Areal", Font.ITALIC, 18));
		field.setHorizontalAlignment(JTextField.CENTER);
		field.setBounds(x, y, width, height);
		return field;
	}
	
	/**
	 * 
	 * @param x eje x
	 * @param y eje y
	 * @param width size for component
	 * @param height size for component
	 * @param txt text for label
	 * @return
	 */
	public static JLabel createLabel(int x, int y, int width, int height, String txt, int sizeLetter) {
		JLabel label = new JLabel(txt);
		label.setFont(new Font("Areal", Font.BOLD, sizeLetter));
		label.setBounds(x, y, width, height);
		
		return label;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param txt
	 * @param sizeLetter
	 * @param style
	 * @return
	 */
	public static JLabel createLabel(int x, int y, int width, int height, String txt, int sizeLetter, int style) {
		JLabel label = new JLabel(txt);
		label.setFont(new Font("Areal", style, sizeLetter));
		label.setBounds(x, y, width, height);
		
		return label;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param txt
	 * @return
	 */
	public static JButton createButton(int x, int y, int width, int height, String txt) {
		JButton button = new JButton(txt);
		button.setFont(new Font("Areal", Font.BOLD, 20));
		button.setBounds(x, y, width, height);
		
		return button;
	}
	
}










