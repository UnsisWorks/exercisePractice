
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        int n3;
        Scanner ent = new Scanner(System.in);
		
		System.out.print("Inserte un número entero: ");
		n3 = ent.nextInt();
		
		System.out.println("El doble de " + n3 +" es:" + (n3*2));
		System.out.println("El triple de " + n3 +" es:" + (n3*3));
		ent.close();
    }
}
