package model;

public class Matriz {
	public static void escrevaMatriz(double[][] m) {
		int linhas = m.length;
		int colunas = m[0].length;

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.printf("%.5f  ", m[i][j]);
			}
			System.out.println();
		}
	}

	public static void escrevaMatriz(double[] m) {
		int colunas = m.length;

		for (int j = 0; j < colunas; j++) {
			System.out.printf("%.5f  ", m[j]);
		}
		System.out.println();
	}

	public static double[][] escalona(double[][] m) {

		double[][] t = matrizBackup(m);// fazer cópia da matriz para não modificar a original
		int n = t.length;
		int x, y, p;
		double cte;// constante obtida usando o pivô na linha

		for (p = 0; p < n; p++) {
			if (t[p][p] == 0)
				for (x = p + 1; x < n; x++)
					if (t[x][p] != 0)
						for (y = 0; y < n; y++)
							t[p][y] = t[p][y] + t[x][y];
			if (t[p][p] != 0) {
				for (x = p + 1; x < n; x++) {
					cte = t[x][p] / t[p][p];
					for (y = 0; y < n; y++)
						t[x][y] = t[x][y] - cte * t[p][y];
				}
			}
		}
		return t;
	}

	public static double[][] matrizBackup(double[][] m) {

		double[][] matriz = new double[m.length][m[0].length];
		for (int x = 0; x < m.length; x++) {
			for (int y = 0; y < m[0].length; y++) {
				matriz[x][y] = m[x][y];
			}
		}
		return matriz;
	}

	public static double determinante(double[][] t) {

		int n = t.length;
		double det = 1; // elemento neutro em um produto
		for (int z = 0; z < n; z++) {
			det = det * t[z][z];
		}
		return det;
	}

//	public static void escrevaMatriz(Double[][] m) {
//		int linhas = m.length;
//		int colunas = m[0].length;
//
//		for (int i = 0; i < linhas; i++) {
//			for (int j = 0; j < colunas; j++) {
//				System.out.printf("%.5f  ", m[i][j]);
//			}
//			System.out.println();
//		}
//		
//	}

}
