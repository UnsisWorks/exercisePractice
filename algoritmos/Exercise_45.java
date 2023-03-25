/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 45 del pdf      *
 ******************************************/

package algoritmos;

import java.util.Scanner;

 public class Exercise_45 {
     
     public static void main(String[] args) {
         Scanner ent = new Scanner(System.in);
      
         int menor = 9999;
        int mayor = 0;
        int[] nums = new int[2];
        
        for (int i = 0; i < 2; i++){ 
            System.out.print("Inserte un valor para el número " + (i+1) +": ");
	    	nums[i] = ent.nextInt();
	    	if(nums[i] > mayor){
	    	    mayor = nums[i];
	    	}
        }
        
        for (int i = 0; i < 2; i++){
	    	if(nums[i] < menor){
	    	    menor = nums[i];
	    	}
        }
        
        for (int i = menor; i <= mayor; i++){
            if(i <= mayor-1){
                System.out.print(menor + ", ");
            }else{
                System.out.print(menor);
            }
            menor++;
        } 
         
         ent.close();
     }
 }