package lezione2;

import java.util.Scanner;

public class AiutareBambino {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Primo numero: ");
		float a = scanner.nextFloat();
		
		System.out.println("Secondo numero: ");
		float b = scanner.nextFloat();
		
		System.out.println("Operazione: ");
		String o = scanner.next();
		
		float risultato;
		
		if(o.equals("+") || o.equals("-") || o.equals("*") || o.equals("/")){
			if(o.equals("+")) {
				risultato = a + b;
			}
			else if(o.equals("-")) {
				risultato = a - b;
			}
			else if(o.equals("*")) {
				risultato = a * b;
			}
			else{
				
				if(b!=0) {
					risultato = a / b;
				}
				else {
					risultato = 0;
					System.out.println("Non si puo dividere per 0");
				}
				
			}
			System.out.println("Risultato: ");
			float r = scanner.nextFloat();
			
			if(risultato == r) {
				System.out.println("Corretto! Bravo");
			}
			else {
				System.out.println("Hai sbagliato! Il risultato corretto è: " + risultato);
			}
		}
		else {
			System.out.println("Operazione non supportata");
		}
		scanner.close();
		
	}
}
