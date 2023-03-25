
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 43 del pdf      *
 ******************************************/

package algoritmos;

import java.util.Scanner;

public class Exercise_43 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numero = 1;
        int lim;

        System.out.print("Inserte el limite: ");
        lim = ent.nextInt();

        for (int i = 1; i <= lim; i++) {
            if (numero <= lim - 1) {
                System.out.print(numero + ", ");
            } else {
                System.out.print(numero);
            }
            numero++;
        }
        numero = 1;
        System.out.println("");
        System.out.println("");

        while (numero <= lim) {
            if (numero <= lim - 1) {
                System.out.print(numero + ", ");
            } else {
                System.out.print(numero);
            }
            numero++;
        }
        numero = 1;
        System.out.println("");
        System.out.println("");

        do {
            if (numero <= lim - 1) {
                System.out.print(numero + ", ");
            } else {
                System.out.print(numero);
            }
            numero++;
        } while (numero <= lim);
        System.out.println("");

        ent.close();
    }
}