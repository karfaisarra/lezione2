package lezione2;

import java.util.Scanner;

public class ValoreMaggiore {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, max;
		System.out.println("Inserisci il primo numero");
		a = scanner.nextInt();
		
		System.out.println("Inserisci il secondo numero");
		b = scanner.nextInt();
		
		System.out.println("Inserisci il terzo numero");
		c = scanner.nextInt();
		
		if(a>=b && a>=c) {
			max = a;
		}
		else if (b>=a && b>=c) {
			max = b;
		}
		else {
			max = c;
		}
		System.out.println("Il numero maggiore è: " + max);
		scanner.close();
	}
}
