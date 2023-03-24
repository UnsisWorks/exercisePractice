
import java.util.Scanner;

public class Exercise_35 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
     
        int mes = 0;
		
		while(mes < 1 || mes > 12){
            System.out.print("Inserte un mes: ");
            mes = ent.nextInt();
        }
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            System.out.println("El mes contiene 31 días");
        }else{
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                System.out.println("El mes contiene 30 días");    
            }else{
                System.out.println("El mes contiene 28 días");
            }
        } 

        ent.close();
    }
}