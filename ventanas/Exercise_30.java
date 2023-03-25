

/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 30 del pdf      *
 ******************************************/

package ventanas;
import javax.swing.JOptionPane;

public class Exercise_30 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduce un número de tres cifras:");
        int numero = Integer.parseInt(input);

        int centenas = numero / 100;
        int decenas = (numero % 100) / 10;
        int unidades = numero % 10;

        if (centenas == unidades) {
            JOptionPane.showMessageDialog(null, numero + " es capicúa.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es capicúa.");
        }
    }
}
