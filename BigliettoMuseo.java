package lezione2;

import java.util.Scanner;

public class BigliettoMuseo {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero compreso tra 1 e 4");
		int prezzo, x = scanner.nextInt();
		
		if(x==1) {
			prezzo = 0;
			System.out.println("Ingresso gratuito per i bambini!");
		}else if(x==2) {
			prezzo = 8;
			System.out.println("Biglietto per studenti dovresti pagare: " + prezzo + " €");
		}else if(x==3) {
			prezzo = 10;
			System.out.println("Biglietto per pensionati dovresti pagare: " + prezzo + " €");
		}else if(x==4) {
			prezzo = 15;
			System.out.println("Biglietto per altri dovresti pagare: " + prezzo + " €");
		}else {
			System.out.println("Non hai inserito un numero valido, riprova!");
		}
		scanner.close();
		
	}
}
