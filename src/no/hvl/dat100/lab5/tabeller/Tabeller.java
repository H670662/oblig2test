package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void main (String[] args) {
		//int[] testtab = {1, 4, 6};
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
		System.out.print("[");
		for(int num:tabell) {
			System.out.print(num + ", ");
		}
		System.out.println("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		if(tabell == null || tabell.length == 0) {
			return "[]";
		}
		String result =  "["+tabell[0]; 
		for(int i =1; i<tabell.length; i++) {
			String temp = Integer.toString(tabell[i]);
			result = result+","+temp;
		}
		result= result +"]";
		return result;	
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for(int temp:tabell) {
			sum = sum+temp;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		int i = 0;
		while (i < tabell.length) {
			if(tabell[i] == tall) {
				return true;
			}
			else {
				i++;
			}
			
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int i = 0;
		while(i<tabell.length) {
			if (tabell[i] == tall) {
				return i;
			}
			else
				i++;
		}
		return -1;

		
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int temp = tabell.length;
		int[] nyTabell = new int[temp];
		for (int i = 0; i<temp; i++) {
			nyTabell[temp-i-1]=tabell[i];
		}
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		if (tabell.length == 0) {
			return true;
		} else {
			int tall = tabell[0];

			for (int i = 0; i < tabell.length - 1; i++) {
				if (tall > tabell[i + 1]) {
					return false;
				}
			}
		}
		return true;

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int lengde1 = tabell1.length;
		int lengde2 = tabell2.length;
		int[] nyTabell = new int[lengde1+lengde2];
		
	    for(int i = 0; i < lengde1; i++) {
	        nyTabell[i] = tabell1[i];
	    }
	    for(int i = 0; i < lengde2; i++) {
	        nyTabell[lengde1 + i] = tabell2[i];
	    }
	    
	    return nyTabell;

	}
}
