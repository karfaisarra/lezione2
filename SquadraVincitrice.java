package lezione2;

import java.util.Scanner;

public class SquadraVincitrice {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Prima squadra: ");
		String squadra1 = scanner.next();
		System.out.println("Goal segnati: ");
		int g1 = scanner.nextInt();
		
		System.out.println("Seconda squadra: ");
		String squadra2 = scanner.next();
		System.out.println("Goal segnati: ");
		int g2 = scanner.nextInt();
		
		if(g1>g2) {
			System.out.println("La squadra " + squadra1 + " è la vincitrice");
		} 
		else if (g2>g1) {
			System.out.println("La squadra " + squadra2 + " è la vincitrice");
		}
		else {
			System.out.println("La partita è terminata in pareggio");
		}
		scanner.close();
	}
}
