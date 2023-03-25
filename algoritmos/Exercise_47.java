/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 47 del pdf      *
 ******************************************/

package algoritmos;

import java.util.Scanner;

 public class Exercise_47 {
     
     public static void main(String[] args) {
         Scanner ent = new Scanner(System.in);
      
         int inic;
        int lim;
        int aux;
        
        System.out.print("Inserte un número para calcular sus múltiplos: ");
        inic = ent.nextInt();
        System.out.print("Inserte un limite para calcular sus múltiplos: ");
        lim = ent.nextInt();
        aux = inic;
        
        while(inic < lim){
            System.out.print(inic + " ");
            inic += aux;
        } 
         
         ent.close();
     }
 }