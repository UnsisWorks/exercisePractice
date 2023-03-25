/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 39 del pdf      *
 ******************************************/

package algoritmos;

import java.util.Scanner;

public class Exercise_39 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
     
        int consecutivo = 1;
        
        for (int i = 1; i <= 100; i++) {
            if(consecutivo <= 99){
                System.out.print(consecutivo + ", ");
            }else{
                System.out.print(consecutivo);
            }
            consecutivo++;
        } 
        
        ent.close();
    }
}