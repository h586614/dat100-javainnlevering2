package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String melding = "[";
		if (tabell.length == 1) {
			melding += tabell[0];
		} else if (tabell.length > 1) {
			melding += tabell[0];
			for (int i = 1; i < tabell.length; i++) {
				melding += "," + tabell[i];
			}

		}

		return melding + "]";
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
//		for (int i=0; i<tabell.length; i++) { brukt for-løkke
//			sum+=tabell[i];
//		}

//		for (int verdi : tabell) {
//			sum+=verdi;
//		}	
		int i = 0;
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return i;
			}
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] tab = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			tab[i] = tabell[tab.length - i - 1];
		}
		return tab;

	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean erSortert=true;
		for (int i = 0; i<tabell.length-1; i++) {
			if (tabell[i]>tabell[i+1]) 
				erSortert = false;
	} return erSortert; 

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[]tabell3 = new int[tabell1.length+tabell2.length];
		for (int i = 0; i<tabell1.length; i++) {
			tabell3[i] = tabell1[i];
		}
		for (int i = 0; i<tabell2.length; i++) {
			tabell3[i+tabell1.length] =tabell2[i];
		} return tabell3;
	} 
}
