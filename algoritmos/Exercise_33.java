
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;


import java.util.Scanner;

public class Exercise_33 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
     
        int[] nums = new int[3];
        int mayor = 0;
        
        for (int i = 0; i < 3; i++){ 
            System.out.print("Inserte un valor para el número " + (i+1) +": ");
	    	nums[i] = ent.nextInt();
	    	if(nums[i] > mayor){
	    	    mayor = nums[i];
	    	}
        }
		
		System.out.println("El numero mayor es: " + mayor);  
        
        ent.close();
    }
}
