
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;

import java.util.Scanner;
public class Exercise_9 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float base;
		float altura;
		System.out.print("Dame el valor de la base: ");
		base = ent.nextFloat();
		System.out.print("Dame el valor de la altura: ");
		altura = ent.nextFloat();
		System.out.println("El área del triangulo es: " + (base * altura)/2);
        
        ent.close();
    }
}
