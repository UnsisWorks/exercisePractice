
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;


import java.util.Scanner;

public class Exercise_31 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
     
        float dividendo;
        float divisor = 0;
        
        System.out.print("Inserte el dividendo: ");
        dividendo = ent.nextInt();
        while(divisor == 0){
            System.out.print("Inserte el divisor: ");
            divisor = ent.nextInt();
        }
        System.out.println("El resultado de la división es: " + dividendo/divisor); 
        
        ent.close();
    }
}