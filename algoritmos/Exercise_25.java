
import java.util.Scanner;

public class Exercise_25 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Scanner cad = new Scanner(System.in);
     
        String carac;
		
		System.out.print("Inserte una letra: ");
		carac = cad.nextLine();
		if(carac.equals(carac.toUpperCase())){
		    System.out.println("El caracter es mayúscula");
		}else{
		    System.out.println("El caracter no es mayúscula");
		}
        
        cad.close();
        ent.close();
    }
}