
/******************************************
 * Nombre: Galicia Cordova Elietzer Jared *
 * Creacion: 24/03/2023                   *
 * modificado: 24/03/2023                 *
 * Descripcion: Ejercicio 51 del pdf      *
 ******************************************/

package algoritmos;


import java.util.Scanner;

public class Exercise_27 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Scanner cad = new Scanner(System.in);
     
        String caracdoble;   
        String aux;  
        String aux2;                                                            
		                                                                           
		System.out.print("Inserte dos letras");                                    
		caracdoble = cad.nextLine();
		aux = String.valueOf(caracdoble.charAt(0));
		aux2 = String.valueOf(caracdoble.charAt(1));
		if(aux.equals(aux.toLowerCase())){
		    if(aux2.equals(aux2.toLowerCase())){
		        System.out.println("Los dos caracteres son minúsculas");
		    }else{
		        System.out.println("El primer caracter es minúscula");
		    }
		}else{
		    if(aux.equals(aux2.toLowerCase())){
		         System.out.println("El segundo caracter es minúscula");
		    }else{
		         System.out.println("Los dos caracteres son mayúsculas");
		    }
		}
        
        cad.close();
        ent.close();
    }
}