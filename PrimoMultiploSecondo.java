package lezione2;

import java.util.Scanner;

public class PrimoMultiploSecondo {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il primo valore");
		int x = scanner.nextInt();
		
		System.out.println("Inserisci il secondo valore");
		int y = scanner.nextInt();
		
		if(x%y==0) {
			System.out.println("Il numero "+ x + " è multiplo di " + y);
		}
		else {
			System.out.println("Il numero "+ x + " non è multiplo di " + y);
		}
		scanner.close();
	}
}
