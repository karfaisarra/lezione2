package lezione2;

import java.util.Scanner;

public class SommaProdotto {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero");
		int x = scanner.nextInt();
		
		System.out.println("Inserisci il secondo numero");
		int y = scanner.nextInt();
		int s, p;
		if (x>0 && y>0) {
			s = x + y;
			System.out.println("La somma di "+ x + " + " + y + " = " + s );
		}
		else {
			p = x * y;
			System.out.println("Il prodotto di "+ x + " * " + y + " = " + p );
		}
		scanner.close();
	}
}
