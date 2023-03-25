
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;


import java.util.Scanner;

public class Exercise_21 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        int num1;
		int num2;
		
		System.out.print("Inserte un valor para el número 1: ");
		num1 = ent.nextInt();
		System.out.print("Inserte un valor para el número 2: ");
		num2 = ent.nextInt();
		if(num1 > num2){
		    System.out.println("El número 1 es mayor que el núero 2");
		}else{
		    System.out.println("El número 2 es mayor que el número 1");
		}
        
        ent.close();
    }
}