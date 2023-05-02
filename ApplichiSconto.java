package lezione2;

import java.util.Scanner;

public class ApplichiSconto {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserici il prezzo");
		float prezzo = scanner.nextFloat();
		
		float prezzoFinale ;
		if(prezzo<30.00f) {
			prezzoFinale = prezzo-(prezzo*0.12f);
		}
		else {
			prezzoFinale = prezzo-(prezzo*0.25f);
		}
		System.out.println("Prezzo scontato è " + prezzoFinale);
		scanner.close();
	}
}
