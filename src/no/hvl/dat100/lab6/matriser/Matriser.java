package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	public static void main(String[] args) {

		int[][] matrise = { { 1, 2, 3, 4, 5 }, { 10, 20, 30, 40, 50 } };
		int[][] matrise2 = { { 1, 2, 3, 4, 5 }, { 10, 20, 30, 40, 50 } };

		int[] a0 = { 1, 2, 3 };
		int[] a1 = { 4, 5, 6 };
		int[] a2 = { 7, 8, 9 };

		int[][] a = new int[3][];

		a[0] = a0;
		a[1] = a1;
		a[2] = a2;

		int[] b0 = { 10, 11, 12 };
		int[] b1 = { 13, 14, 15 };
		int[] b2 = { 16, 17, 18 };

		int[][] b = new int[3][];

		b[0] = b0;
		b[1] = b1;
		b[2] = b2;

		System.out.print("\nskriv ut  a: \n");
		skrivUt(a);
		System.out.print("\nskriv ut  b: \n");
		skrivUt(b);
		System.out.print("\nskriv ut  matrise: \n");
		skrivUt(matrise);

		System.out.print("\nstreng a :\n");
		System.out.print(tilStreng(a));
		System.out.print("\nstreng b :\n");
		System.out.println(tilStreng(b));
		System.out.print("\nstreng matrie :\n");
		System.out.println(tilStreng(matrise));

		int[][] skalerta = skaler(2, a);
		System.out.print("skaler a med 2: \n");
		skrivUt(skalerta);
		System.out.print("\nskaler matrise med 2: \n");
		skrivUt(skaler(2, matrise));

		System.out.println("\ner a lik b? : " + erLik(a, b));
		System.out.println("er mat1 lik mat2? : " + erLik(matrise, matrise2));

		System.out.print("\na speilet :\n");
		skrivUt(speile(a));
		System.out.print("\na*b multiplisert :\n");
		skrivUt(multipliser(a, b));

	}

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] rad : matrise) {
			for (int tall : rad) {
				System.out.print(tall + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String stringMatrise = "";
		for (int[] rad : matrise) {
			for (int i = 0; i < rad.length; i++) {
				stringMatrise = stringMatrise + rad[i] + " ";
				if (i == rad.length - 1) {
					stringMatrise = stringMatrise + "\n";
				}
			}
		}
		return stringMatrise;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] skalertMatrise = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			skalertMatrise[i] = new int[matrise[i].length];

			for (int j = 0; j < matrise[i].length; j++) {
				skalertMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return skalertMatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] speil = new int[matrise[0].length][];

		for (int i = 0; i < speil.length; i++) {
			speil[i] = new int[matrise.length];
		}

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				speil[j][i] = matrise[i][j];
			}
		}
		return speil;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {		
		int[][] multiplisert = new int[a.length][a.length];
		
		for (int rad = 0; rad<a.length; rad++){
		
			for (int i = 0; i<a.length; i++) {
				int temp=0;			
				for (int j = 0; j<a.length; j++) {
					temp=temp + a[rad][j]*b[j][i];
				}
				multiplisert[rad][i]= temp;
			}
		}
		return multiplisert;
	}
}











