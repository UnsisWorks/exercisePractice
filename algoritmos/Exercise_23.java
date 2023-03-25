
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;


import java.util.Scanner;

public class Exercise_23 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
     
        int numerito;
		
		System.out.print("Inserte un número entero: ");
		numerito = ent.nextInt();
		if (numerito % 3 == 0){
		    System.out.println("El número es múltiplo de 3");
		}else{
		    System.out.println("El número no es múltiplo de 3");   
		}
		
		if (numerito % 5 == 0){
		    System.out.println("El número es múltiplo de 5");
		}else{
		    System.out.println("El número no es múltiplo de 5");   
		}
        
        ent.close();
    }
}