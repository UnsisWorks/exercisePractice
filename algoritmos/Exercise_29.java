
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;


import java.util.Scanner;

public class Exercise_29 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
     
        int anio;
        
        System.out.print("Inserte el año en el que se encuentra: ");
        anio = ent.nextInt();
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
	        System.out.println("El año es bisiesto");
        }
        else{
	        System.out.println("El año no es bisiesto");
        }

        ent.close();
    }
}