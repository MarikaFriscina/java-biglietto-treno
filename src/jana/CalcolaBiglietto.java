package jana;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		int eta;
		double kmpercorsi;
		double prezzobiglietto;
		double scontominorenni=0.2;
		double scontoover=0.4;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci l'età: ");
		eta= scan.nextInt();
		System.out.println("Inserisci i km da percorrere: ");
		
		kmpercorsi= scan.nextInt();
		
		prezzobiglietto=(kmpercorsi * 0.21);
		
		if(eta<18) {
			
			prezzobiglietto=prezzobiglietto-(prezzobiglietto*scontominorenni);
			
		} else if(eta>65) {
			
			prezzobiglietto=prezzobiglietto-(prezzobiglietto*scontoover);
		}
		
		System.out.println("Il prezzo del biglietto è: "+ prezzobiglietto + "€");
		
		scan.close();
	}

}
