package no.hvl.dat100.lab6.matriser;

import static java.lang.System.*;

public class MatriserAnton {

public static void main(String[] args) {
		
		int[][] matrise = {{1,2,3,4,5,6,8,9}, {4,5,6}, {7,8,9}};
		int[][] matrise2 = {{1,2,3,4,5,6,8,10}, {4,5,6}, {7,8,9}};
		
		skrivUtv1(matrise);
		
		String myString = tilStreng(matrise);
		out.println(myString);
		
		out.println("");
		
		skrivUtv1(skaler(3, matrise));
		
		out.println(erLik(matrise, matrise2));
	}
	
	// a
	public static void skrivUtv1(int[][] matrise){
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				out.print(matrise[i][j]);
				out.print(",");
			}
			out.println("");
		}
		
		out.println("");
	}
	
	
	// b
	public static String tilStreng(int[][] matrise) {
		
		int len = 0;
		int columns = 0;
				
		for (int i = 0; i < matrise.length; i++) {
			columns++;
			for (int j = 0; j < matrise[i].length; j++) {
				len++;
			}
		}
		
		
		char[] myChars = new char[(len + columns + 2) * 2];
		
		myChars[0] = '{';
		
		int count = 1;
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				myChars[count] = (char)(matrise[i][j] + '0');
				count++;
				if (j != matrise[i].length-1) {
					myChars[count] = ',';
					count++;
				}
			}
			if (i != matrise.length - 1) {
				myChars[count] = ',';
				count++;
			}
		}
		
		myChars[myChars.length-1] = '}';
		
		String myString = new String(myChars);
		
		return myString;
	}
	
	
	//c 
	public static int[][] skaler(int tall, int[][] matrise){
		
		int[][] result = new int[matrise.length][];
		

		for (int i = 0; i < matrise.length; i++) {
			int len = matrise[i].length;
			result[i] = new int[len];
		}
	
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				result[i][j] = matrise[i][j] * tall;
			}
		}
		
		return result;
		
	}
	
	//d
	public static boolean erLik(int[][] mat1, int [][] mat2) {
		
		for(int i = 0; i < mat1.length; i++) {
			for(int j = 0; j < mat1[i].length; j++) {
				if (mat1[i][j] != mat2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	//e
	
	
}