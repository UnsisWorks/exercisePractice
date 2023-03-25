
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;

import java.util.Scanner;

public class Exercise_5 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float radio;
		
		System.out.print("Inserte el valor del radio: ");
		radio = ent.nextFloat();
		
		System.out.println("La longitud de la circunferencia es: " + (2*3.1416*radio) + ", y el valor del area es: " + (3.1416*(Math.pow(radio,2))));
		

        ent.close();
    }
}
