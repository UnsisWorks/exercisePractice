
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;


import java.util.Scanner;

public class Exercise_37 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
     
        int consec = 1;
        
        while(consec <= 100){
            if(consec <= 99){
                System.out.print(consec + ", ");
            }else{
                System.out.print(consec);
            }
            consec++;
        } 
        
        ent.close();
    }
}