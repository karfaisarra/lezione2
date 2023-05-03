package lezione2;

import java.util.Scanner;

public class ProdottiScontati {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		float prezzo, prezzoFinale;
		int quantita;
		System.out.println("Inserisci  prezzo: ");
		prezzo = scanner.nextFloat();
		
		System.out.println("Inserisci  quantità: ");
		quantita = scanner.nextInt();
		
		if(quantita > 20) {
			prezzoFinale = prezzo - prezzo*0.2f;
		}
		else if(quantita>10) {
			prezzoFinale = prezzo - prezzo*0.15f;
		}
		else if (quantita>5) {
			prezzoFinale = prezzo - prezzo*0.1f;
		} 
		else {
			prezzoFinale = prezzo;
		}
		System.out.println("Prezzo finale: " + prezzoFinale);
		scanner.close();
	}
}
