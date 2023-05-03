package lezione2;

import java.util.Scanner;

public class TriangoloQuadrato {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scegli tra triangolo o quadrato") ;
		String x = scanner.next();
		
		float base, altezza, lato, area;
		
		if(x.equalsIgnoreCase("triangolo")) {
			System.out.println("Inserisci la base") ;
			base = scanner.nextFloat();
			
			System.out.println("Inserisci l'altezza: ") ;
			altezza = scanner.nextFloat();
			
			area = (base*altezza)/2;
			System.out.println("l'area è: " + area) ;
		}
		else if(x.equalsIgnoreCase("quadrato")) {
			System.out.println("Inserisci la misura del lato: ") ;
			lato = scanner.nextFloat();
			
			area = lato*lato;
			System.out.println("l'area è: " + area) ;
		}
		else {
			area = 0;
			System.out.println("Selezione non valida");
		}
		scanner.close();
	}
}
