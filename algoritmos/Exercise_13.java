
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;

import java.util.Scanner;
public class Exercise_13 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Scanner cad = new Scanner(System.in);
        int dia;
		String mes;
		int anio;
		int ale = (int)(Math.random()*100+1);
		
		System.out.print("Ins erte el día de su nacimiento: ");
		dia = ent.nextInt();
		System.out.print("Inserte su mes de nacimiento: ");
		mes = cad.nextLine();
		System.out.print("Inserte el año de su nacimiento: ");
		anio = ent.nextInt();
		System.out.println("Su número de la suerte a partir de su fecha de nacimiento " + dia + "/" + mes + "/" + anio + " es: " + ale);
		
        cad.close();
        ent.close();
    }
}
