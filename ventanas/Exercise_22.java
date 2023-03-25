
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 22 del pdf      *
 ******************************************/

package ventanas;
import javax.swing.*;

public class Exercise_22 {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));

        if(num1 % 10 == num2 % 10){
            JOptionPane.showMessageDialog(null, "Los números terminan con la misma cifra");
        } else {
            JOptionPane.showMessageDialog(null, "Los números no terminan con la misma cifra");
        }
    }
}
