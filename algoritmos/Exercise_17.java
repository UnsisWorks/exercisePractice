
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;


import java.util.Scanner;

public class Exercise_17 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
     
        int num;
		
		System.out.print("Inserte un número entero: ");
		num = ent.nextInt();
		if (num % 2 == 0){
		    System.out.println("El número es par");
		}else{
		    System.out.println("El número es impar");   
		}
        
        ent.close();
    }
}
