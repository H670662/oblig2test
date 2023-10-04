package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
    public static void main(String[] args) {
        
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int testTall = 3;

        System.out.println("a) skrivUt:");
        Tabeller.skrivUt(array1);

        System.out.println("b) tilStreng:");
        Tabeller.tilStreng(array1);

        System.out.println("c) summer:");
        Tabeller.summer(array1);

        System.out.println("d) finnesTall:");
        System.out.println(Tabeller.finnesTall(array1, testTall));

        System.out.println("e) posisjonTall:");
        Tabeller.posisjonTall(array1, testTall);

        System.out.println("f) reverser:");
        Tabeller.reverser(array1);

        System.out.println("\ng) erSortert:");
        System.out.println(Tabeller.erSortert(array1));

        Tabeller.settSammen(array1, array2);
    }
	

	// a)
	
	public static void skrivUt(int[] tabell) {
		String utskriftTabell = "";
		
        for(int i = 0; i < tabell.length; i++) {
            if(i == 0) {
                utskriftTabell += ("[");
            }
            utskriftTabell +=(tabell[i]);

            if(i < tabell.length - 1) {
            	utskriftTabell += (", ");
            }

            if(i == tabell.length - 1) {
            	utskriftTabell +=("]\n");
            }

        }
		System.out.println(utskriftTabell);
	}

	// b)
	public static String tilStreng(int[] tabell) {
	    if (tabell.length == 0) {
	        return "[]";
	    }

	    String formatertStreng = "[";

	    for (int i = 0; i < tabell.length; i++) {
	        formatertStreng += tabell[i];

	        if (i < tabell.length - 1) {
	            formatertStreng += ",";
	        }
	    }

	    formatertStreng += "]";
	    System.out.println(formatertStreng);
	    return formatertStreng;    
	}


	// c)
	public static int summer(int[] tabell) {
		System.out.println("\nTall i tabell summert vha. for-løkke");
        int total = 0;
        for(int i = 0; i < tabell.length; i++) {
            total += tabell[i];
        }
        System.out.println(total);
        total = 0;
        System.out.println("\nTall i tabell summert vha. while-løkke:");
        int i = 0;
        while(i < tabell.length) {
        	total += tabell[i];
            i++;
        }
        System.out.println(total); 
        System.out.println("\nTall i tabell summert vha. utvided for-løkke:");
        total = 0;
        for(int num : tabell) {
        	total += num;
        }
        System.out.println(total);
        return total;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
        for(int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
        for(int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                System.out.println("Nummeret " + tall + " funnet tidligst på index[" + i + "]\n");
                return i;
            }
        }
        return -1; // har altså da brukt -1 for å vise at tallet ikke ble funnet
	}

	// f)
	public static int[] reverser(int[] tabell) {
        for(int num : tabell) {
            System.out.print(num);
        }

        int[] nyTabell = new int[tabell.length];
        int tabellPos = 0;

        for(int i = tabell.length -1; i >= 0; i--) {
            nyTabell[tabellPos] = tabell[i];
            tabellPos += 1;
        }
        System.out.println();
        for(int num : nyTabell) {
            System.out.print(num);
        }
        System.out.println();
        return(nyTabell); 

	}

	// g)
	public static boolean erSortert(int[] tabell) {
        for (int i = 0; i < tabell.length - 1; i++) {     
            if (tabell[i] >= tabell[i + 1]) {
                return false;  
            }
        }
        return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int [] sammensattTabell = new int[tabell1.length + tabell2.length];
        int sammensattTabellIndex = 0;
        for(int i = 0; i < tabell1.length; i ++) {
            sammensattTabell[i] = tabell1[i];
            sammensattTabellIndex += 1;
        }

        for(int i = 0; i < tabell2.length; i ++) {
            sammensattTabell[sammensattTabellIndex] = tabell2[i];
            sammensattTabellIndex += 1;
        }


        String formatedTabell = "";
        System.out.println("\n\nOppgave h):\n\nTabell 1:");
        skrivUt(tabell1);
        System.out.println("\nTabell 2:");
        skrivUt(tabell2);
        System.out.println("\nSammenslått:");
        formatedTabell += "[";
        for(int num : sammensattTabell) {
            formatedTabell += (num + ", ");
        }
        formatedTabell = formatedTabell.substring(0, formatedTabell.length() - 2) + "]"; // Fjerner siste ", " fra enden av strengen
        System.out.println(formatedTabell);
        return sammensattTabell;
	}
}