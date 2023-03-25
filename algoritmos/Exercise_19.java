
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;


import java.util.Scanner;

public class Exercise_19 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
     
        int numero;
		
		System.out.print("Inserte un número entero: ");
		numero = ent.nextInt();
		if (numero % 10 == 0){
		    System.out.println("El número es múltiplo de 10");
		}else{
		    System.out.println("El número no es múltiplo de 10");   
		}
        ent.close();
    }
}
