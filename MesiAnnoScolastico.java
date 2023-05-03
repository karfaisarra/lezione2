package lezione2;

import java.util.Scanner;

public class MesiAnnoScolastico {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il numero del mese: ");
		int mese = scanner.nextInt();
		
		switch(mese) {
			case 1, 2, 3, 4, 5, 6:
				System.out.println("il mese " + mese + " appartiene al secondo semestre");
				break;
			case 7, 8:
				System.out.println("il mese " + mese + " appartiene alle vacanze estive");
				break;
			case 9, 10, 11, 12:
				System.out.println("il mese " + mese + " appartiene al primo semestre");
				break;
			default:
				System.out.println("Opzione errata!");
		        break;
		}
		scanner.close();
		
	}
}
