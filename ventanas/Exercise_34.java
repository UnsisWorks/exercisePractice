
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 34 del pdf      *
 ******************************************/

package ventanas;
import javax.swing.JOptionPane;

public class Exercise_34 {
    public static void main(String[] args) {
        
        // Pedir al usuario que ingrese los números
        String hora = JOptionPane.showInputDialog(null, "Ingrese la hora:");
        String minutos = JOptionPane.showInputDialog(null, "Ingrese los minutos:");
        String segundos = JOptionPane.showInputDialog(null, "Ingrese los segundos:");
        
        // Convertir los números ingresados a enteros
        int h = Integer.parseInt(hora);
        int m = Integer.parseInt(minutos);
        int s = Integer.parseInt(segundos);
        
        // Comprobar si la hora es válida
        if(h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            JOptionPane.showMessageDialog(null, "La hora es válida.");
        } else {
            JOptionPane.showMessageDialog(null, "La hora no es válida.");
        }
    }
}
