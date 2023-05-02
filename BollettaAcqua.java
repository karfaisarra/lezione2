package lezione2;

import java.util.Scanner;

public class BollettaAcqua {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il consumo in metri cubi");
		float consumo = scanner.nextFloat();
		if(consumo >= 0) {
			float prezzoDaPagare;
			if(consumo>100) {
				prezzoDaPagare = 100*2.50f + (consumo-100)*4.00f + 20f;
			}else {
				prezzoDaPagare = consumo*2.50f + 20f;
			}
			
			System.out.println("prezzo da pagare: " + prezzoDaPagare + " €");
		}else {
			System.out.println("Errore!! il consumo dovrebbe essere un valore positivo");
		}
		scanner.close();
	}
}
