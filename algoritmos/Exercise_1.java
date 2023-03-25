
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;

import java.util.Scanner;

public class Exercise_1 {

public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);

    System.out.print("Deme el número 1: ");
    int n1 = ent.nextInt();
    System.out.print("Deme el número 2: ");
    int n2 = ent.nextInt();
    
    System.out.println("El número 1 es: " + n1);
    System.out.println("El número 2 es: " + n2);

    ent.close();
}
}