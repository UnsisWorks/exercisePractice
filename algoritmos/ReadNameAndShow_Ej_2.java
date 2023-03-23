package algoritmos;

import java.util.Scanner;

public class ReadNameAndShow_Ej_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingresa tu nombre: ");
		String name = input.nextLine();
		System.out.println("\nBuenos dias " + name);
	}
}
