package no.hvl.dat100.lab5.tabeller;

public class tabellerVillhelm {

	public static void main(String[] args) {
		int[] tab1 = {1, 2, 3, 4};
		int[] tab2 = {1};
		int[] tab3 = new int[0];
		
		System.out.println("tabeller:");
		skrivUt(tab1);
		skrivUt(tab2);
		skrivUt(tab3);
		
		String str1 = tilStreng(tab1);
		String str2 = tilStreng(tab2);
		String str3 = tilStreng(tab3);
		
		System.out.println("\nStrings i en print:");
		System.out.println(str1 + str2 + str3);
		
		System.out.println("\nSum tab1:");
		int sum1 = summer(tab1);
		System.out.println(sum1);
		
		boolean finnes3 = finnesTall(tab1, 3);
		boolean finnes5 = finnesTall(tab1, 5);
		System.out.println("\ner 3 en del av tab1? : "+finnes3);
		System.out.println("er 5 en del av tab1? : "+finnes5);
		
		int posfor3 = posisjonTall(tab1, 3);
		System.out.println("\n"+3+" er i posisjon "+posfor3);
		
		int[] revTab1 = reverser(tab1);
		System.out.println("\n reverse av tab1: ");
		skrivUt(revTab1);
		
		System.out.print("\nEr tab1 sortert: ");
		System.out.println(erSortert(tab1));
		System.out.print("\nEr revTab1 sortert: ");
		System.out.println(erSortert(revTab1));
		
		System.out.println("\nEr tab1 sortert="+erSortert(tab1));
		System.out.println("Er tab2 sortert="+erSortert(tab2));
		System.out.println("Er tab3 sortert="+erSortert(tab3));
		System.out.println("Er revTab3 sortert="+erSortert(revTab1));
		
		int[] sammenTab = settSammen(tab1, tab2);
		skrivUt(sammenTab);
    }

    public static void skrivUt(int[] tabell) {
        for(int i = 0; i < tabell.length; i++) {
            if(i == 0) {
                System.out.print("[");
            }
            System.out.print(tabell[i]);

            if(i < tabell.length - 1) {
                System.out.print(", ");
            }

            if(i == tabell.length - 1) {
                System.out.print("]\n");
            }

        }
    }

    public static String tilStreng (int[] tabell) {
    	if(tabell == null || tabell.length == 0) {
			//System.out.println("[]");
			return "[]";
    	}

        String formatertStreng = "";

        for(int i = 0; i < tabell.length; i++) {
            if(i == 0) {
                //System.out.print("\n\nOppgave b):\n\nSkriv formatert tabell metode (tilStreng):");
                formatertStreng = formatertStreng + "\n[";
            }
            formatertStreng = formatertStreng + tabell[i];

            if(i < tabell.length - 1) {
                formatertStreng = formatertStreng + ", ";                
            }

            if(i == tabell.length - 1) {
                formatertStreng = formatertStreng + "]";
            }
        }
        //System.out.println(formatertStreng);
        return formatertStreng;
    }

    public static int summer(int[] tabell) {
        //System.out.println("\nOppgave c):\n\nTall i tabell summert vha. for-løkke: ");
        int total = 0;
        for(int i = 0; i < tabell.length; i++) {
            total += tabell[i];
        }
        //System.out.println(total);
        total = 0;
        //System.out.println("\nTall i tabell summert vha. while-løkke:");
        int i = 0;
        while(i < tabell.length) {
            total += tabell[i];
            i++;
        }
        //System.out.println(total);
        //System.out.println("\nTall i tabell summert vha. utvided for-løkke:");
        total = 0;
        for(int tall : tabell) {
            
            total += tall;
        }
        return total;
    }

    public static boolean finnesTall(int[] tabell, int tall) {
        //System.out.println("\nOppgave d):\n\nTall i tabell?");
        for(int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
    }

    public static int posisjonTall (int[] tabell, int tall) {
        //System.out.println("\n\nOppgave e):\n\n");
        for(int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                //System.out.println("Nummeret " + tall + " funnet tidligst på index[" + i + "]\n");
                return i;
            }
        }
        return -1; // har altså da brukt -1 for å vise at tallet ikke ble funnet
    }

    public static int[] reverser(int[] tabell) {

        int[] nyTabell = new int[tabell.length];
        int tabellPos = 0;

        for(int i = tabell.length -1; i >= 0; i--) {
            nyTabell[tabellPos] = tabell[i];
            tabellPos += 1;
        }
        
        return(nyTabell); 
    }
    
    public static boolean erSortert(int[] tabell) {
        //System.out.println("\n\nOppgave g):\n\n");
    
        for (int i = 0; i < tabell.length - 1; i++) {     
            if (tabell[i] >= tabell[i + 1]) {
                //System.out.println("Tabellen er ikke sortert");
                return false;  
            }
        }
        //System.out.println("Tabellen er sortert");
        return true;
    }

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
        /*System.out.println("\n\nOppgave h):\n\nTabell 1:");
        skrivUt(tabell1);
        System.out.println("\nTabell 2:");
        skrivUt(tabell2);
        System.out.println("\nSammenslått:");*/
        formatedTabell += "[";
        for(int num : sammensattTabell) {
            formatedTabell += (num + ", ");
        }
        formatedTabell = formatedTabell.substring(0, formatedTabell.length() - 2) + "]"; // Fjerner siste ", " fra enden av strengen
        //System.out.println(formatedTabell);
        return sammensattTabell;
    }
}