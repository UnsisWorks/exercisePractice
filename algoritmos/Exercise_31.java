
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