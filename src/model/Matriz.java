package model;

public class Matriz {
	public static void escrevaMatriz(double[][] m) {
		int linhas = m.length;
		int colunas = m[0].length;

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.printf("%.5f\t", m[i][j]);
			}
			System.out.println();
		}
	}

	public static void escrevaMatriz(double[] m) {
		int colunas = m.length;

		for (int j = 0; j < colunas; j++) {
			System.out.printf("%.5f\t", m[j]);
		}
		System.out.println();
	}

}
