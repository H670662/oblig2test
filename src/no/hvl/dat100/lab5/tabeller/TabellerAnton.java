package no.hvl.dat100.lab5.tabeller;

import static java.lang.System.*;

public class TabellerAnton {

public static void main(String[] args) {
		
		int[] tabell = {7,8,9,1,4};
		
		skrivUt(tabell);
		
		out.println(tilStreng(tabell));
		
		out.println(summer(tabell));
		
		out.println(finnesTall(tabell, 7));
		
		out.println(posisjonTall(tabell, 5));
		
		int[] revers = reverser(tabell);
		
		for (int i = 0; i < revers.length; i++) {
			out.print(revers[i]);
		}
		
		out.println("");
		
		out.println(erSortert(tabell));
		
		int[] sammen = settSammen(tabell, tabell);
		
		for (int i = 0; i < sammen.length; i++) {
			out.print(sammen[i]);
			if (i != sammen.length - 1) {
				out.print(",");
			}
		}
	}
	
	// a
	public static void skrivUt (int[] tabell) {
		
		/*
		
		for(int verdi: tabell) {
			System.out.println(verdi);
		}    
		
		*/
		
		int len = 0;
		
		try { 
			while (true) {
				int temp = tabell[len];
				len++;
			}
		}
		catch (Exception ex) {
			len = len;
		}
		
		for (int i = 0; i < len; i++) {
			
			System.out.println(tabell[i]);
		}
	}
	
	// b
	public static String tilStreng(int[] tabell) {
		
		char[] tekst = new char[tabell.length + 2];
		
		
		tekst[0] = '[';
		
		for(int i = 0; i < tabell.length; i++) {
	
			char temp = (char)(tabell[i] + '0');
			tekst[i + 1] = temp;
		}
	
		tekst[tekst.length - 1] = ']';
		
		String result = new String(tekst);
		
		return result;
		
		}

	
	// c
	public static int summer (int[] tabell) {
		
		int sum = 0;
		
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		
		return sum;
	}
	
	
	//d
	public static boolean finnesTall(int[] tabell, int tall) {
		for(int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return true;
			}
		}
		return false;
	}
	
	
	//e
	public static int posisjonTall (int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return i;
			}
		}
		return -1;
	}
	
	
	//f
	public static int[] reverser(int[] tabell) {
		int[] result = new int[tabell.length];
		
		for (int i = tabell.length - 1; i >= 0; i--) {
			result[i] = tabell[tabell.length - 1 - i];
		}
		
		return result;
	}
	
	
	//g
	public static boolean erSortert (int[] tabell) {
		for(int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	
	//h
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int len1 = tabell1.length;
		int len2 = tabell2.length;
		
		int[] tabell = new int[len1 + len2];
		
		for (int i = 0; i < len1; i++) {
			tabell[i] = tabell1[i];
		}
		
		for (int i = len1; i < tabell.length; i++) {
			tabell[i] = tabell2[i - len1];
		}
		
		return tabell;
	}
}
