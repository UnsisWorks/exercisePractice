
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 26 del pdf      *
 ******************************************/

package ventanas;
import javax.swing.*;

public class Exercise_26 {

    public static void main(String[] args) {

        char char1 = JOptionPane.showInputDialog("Ingrese el primer carácter: ").charAt(0);
        char char2 = JOptionPane.showInputDialog("Ingrese el segundo carácter: ").charAt(0);

        if(char1 == char2){
            JOptionPane.showMessageDialog(null, "Los caracteres son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "Los caracteres son diferentes");
        }
    }
}
