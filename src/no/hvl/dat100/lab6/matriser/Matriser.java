package no.hvl.dat100.lab6.matriser;

public class Matriser {

    public static void main(String[] args) {
        
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        System.out.println("a) skrivUt:");
        skrivUt(matrix1);

        System.out.println("\nb) tilStreng:");
        System.out.println(tilStreng(matrix1));

        System.out.println("c) skaler:");
        skaler(2, matrix1);

        System.out.println("d) erLik:");
        System.out.println(erLik(matrix1, matrix2));

        System.out.println("e) speile:");
        int[][] speilet = speile(matrix1);
        for (int[] rad : speilet) {
            for (int elem : rad) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        System.out.println("\nf) multipliser:");
        int[][] resultat = multipliser(matrix1, matrix2);
        for (int[] rad : resultat) {
            for (int elem : rad) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }



    // a)
	public static void skrivUt(int[][] matrise) {
		for (int[] rad : matrise) {
			for (int tall : rad) {
				System.out.print(tall + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

    // b)
    public static String tilStreng(int[][] matrise) {
        String formatertMatrise = "";
        for(int r = 0; r < matrise.length; r++) {
            for(int num = 0; num < matrise[r].length; num++) {
                formatertMatrise += matrise[r][num] + " ";
            }
            formatertMatrise += "\n";
        }
        return formatertMatrise;        
    }

    // c)
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
		
        for (int[] rad : result) {
            for (int element : rad) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
		return result;
		
	}

    // d)
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
    
    // e)
    public static int[][] speile(int[][] matrise) {

        int[][] speiletMatrise = new int[matrise.length][matrise[0].length];
        for(int i = 0; i < matrise[0].length; i ++) {
            for(int j = 0; j < matrise[i].length; j++) {
                speiletMatrise[i][j] = matrise[j][i];
            }
        }
        return speiletMatrise;
    }
    

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {
        int[][] columnTotal = new int[a.length][b[0].length];
        for (int k = 0; k < a.length; k++) {  // Itererer gjennom radene i matrise a
            for (int i = 0; i < b[0].length; i++) {  // Itererer gjennom kolonnene i matrise b
                for (int j = 0; j < a[k].length; j++) {  // Itererer gjennom elementene for multiplikasjon
                    columnTotal[k][i] += a[k][j] * b[j][i];
                }
            }
        }
        


        return columnTotal;
    }
}
