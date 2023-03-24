/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 49 del pdf      *
 ******************************************/

 import java.util.Scanner;

 public class Exercise_49 {
     
     public static void main(String[] args) {
         Scanner ent = new Scanner(System.in);
      
         float millas;
        
        System.out.print("Inserte las millas: ");
        millas = ent.nextInt();
        System.out.print( millas + " millas, equivalen a: " + (millas*1.60934) + " Kilómetros");
         
         ent.close();
     }
 }
