
import java.util.Scanner;
public class Exercise_15 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int ncifras;
		int vari;
		
		System.out.print("Inserte un número con mínimo 3 cifras: ");
		vari = ent.nextInt();
		String cadena = Integer.toString(vari);
		System.out.print("Cuantas cifrasdesea eliminar? ");
		ncifras = ent.nextInt();
		System.out.print("El número sin las " + ncifras + " cifras es: ");
		
		for (int i = 0;i < (cadena.length())-ncifras ; i++){
		    System.out.print(cadena.charAt(i));
        }
        
        ent.close();
    }
}
