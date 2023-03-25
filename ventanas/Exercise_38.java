
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 38 del pdf      *
 ******************************************/

package ventanas;
import javax.swing.JOptionPane;

public class Exercise_38 {
  public static void main(String[] args) {
    int i = 1;

    do {
      JOptionPane.showMessageDialog(null, i);
      i++;
    } while (i <= 100);
  }
}
