package lezione2;

import java.util.Scanner;

public class PositivoNegativo {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("inserisci un numero");
		
		int x = scanner.nextInt();
		
		if(x > 0) {
			System.out.println("Il numero "+ x +" è positivo");
		}
		else if(x < 0) {
			System.out.println("Il numero "+ x +" è negativo");
		}
		else {
			System.out.println("Il numero "+ x +" è nullo");
		}
		scanner.close();
	}
}
