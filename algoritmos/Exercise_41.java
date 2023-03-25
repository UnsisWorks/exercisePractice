
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 41 del pdf      *
 ******************************************/

package algoritmos;

import java.util.Scanner;

public class Exercise_41 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num = 100;

        do {
            if (num >= 2) {
                System.out.print(num + ", ");
            } else {
                System.out.print(num);
            }
            num--;
        } while (num > 0);

        ent.close();
    }
}