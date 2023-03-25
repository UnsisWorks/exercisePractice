
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 36 del pdf      *
 ******************************************/

package ventanas;
import javax.swing.JOptionPane;

public class Exercise_36 {
  public static void main(String[] args) {
    int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificación numérica:"));

    String calificacion;

    if (nota >= 90) {
      calificacion = "A";
    } else if (nota >= 80) {
      calificacion = "B";
    } else if (nota >= 70) {
      calificacion = "C";
    } else if (nota >= 60) {
      calificacion = "D";
    } else {
      calificacion = "F";
    }

    JOptionPane.showMessageDialog(null, "La calificación numérica " + nota + " es equivalente a la calificación alfabética " + calificacion + ".");
  }
}
