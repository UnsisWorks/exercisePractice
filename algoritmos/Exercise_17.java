
import java.util.Scanner;

public class Exercise_17 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
     
        int num;
		
		System.out.print("Inserte un número entero: ");
		num = ent.nextInt();
		if (num % 2 == 0){
		    System.out.println("El número es par");
		}else{
		    System.out.println("El número es impar");   
		}
        
        ent.close();
    }
}
