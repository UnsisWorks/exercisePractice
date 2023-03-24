
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

import java.util.Scanner;

public class Exercise_51 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int cont = 0;
        int n;
        int num;

        System.out.print("Inserte el número de digitos a valorar: ");
        n = ent.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Inserte el número a valorar: ");
            num = ent.nextInt();
            if (num > 0) {
                cont++;
            }
        }

        System.out.print("Cantidad de números positivos: " + cont);

        ent.close();
    }
}