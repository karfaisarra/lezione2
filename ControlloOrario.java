package lezione2;

import java.util.Scanner;

public class ControlloOrario {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci le ore");
		int h = scanner.nextInt();
		
		System.out.println("Inserisci i minuti");
		int m = scanner.nextInt();
		
		System.out.println("Inserisci i secondi");
		int s = scanner.nextInt();
		
		if(h<24 && h<0 && m<60 && m<0 && s<60 && s<0) {
			
			System.out.println("Orario corretto");
		}
		else {
			System.out.println("Orario sbagliato");
		}
		scanner.close();
	}
}
