
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 24 del pdf      *
 ******************************************/

package ventanas;

import javax.swing.*;

public class Exercise_24 {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero: "));

        if(numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "El número es múltiplo de 2");
        }

        if(numero % 3 == 0){
            JOptionPane.showMessageDialog(null, "El número es múltiplo de 3");
        }
    }
}
