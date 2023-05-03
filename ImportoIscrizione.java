package lezione2;

import java.util.Scanner;

public class ImportoIscrizione {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci la media: ");
		int media = scanner.nextInt(); 
		
		System.out.println("Inserisci il reddito familiare: ");
		float reddito = scanner.nextFloat();
		
		float importo, importoFinale, quotaFissa = 18f;
		if(media<7) {
			importo = quotaFissa + 25f;
		}
		else if (media <= 8) {
			importo = quotaFissa + 17.50f;
		}
		else {
			importo = quotaFissa;
		}
		
		if(reddito<16000.00f) {
			importoFinale = importo - importo*0.4f;
		}
		else {
			importoFinale = importo; 
		}
		System.out.println("Importo da pagare è: " + importoFinale);
		scanner.close();
	}
}
