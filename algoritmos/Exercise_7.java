
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;

import java.util.Scanner;
public class Exercise_7 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
    
        float cata;
		float cato;
		
		System.out.print("Dame el valor del cateto adyacente: ");
		cata = ent.nextFloat();
		System.out.print("Dame el valor del cateto opuesto: ");
		cato = ent.nextFloat();
		System.out.print("El valor de la hipotenusa es: " + Math.sqrt(Math.pow(cata,2)+Math.pow(cato,2)));
		
        ent.close();
    }
}
