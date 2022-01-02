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

		double[][] t = matrizBackup(m);// fazer c�pia da matriz para n�o modificar a original
		int n = t.length;
		int x, y, p;
		double cte;// constante obtida usando o piv� na linha

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

	public static double[][] somaMatrizes(double[][] x, double[][] y) {

		double[][] matrizSoma;
		if (x.length != y.length && x[0].length != y[0].length) {
			throw new IllegalArgumentException("As matrizes devem ter as mesmas dimens�es.");
		} else {
			int linhas = x.length;
			int colunas = y[0].length;
			matrizSoma = new double[linhas][colunas];
			for (int i = 0; i < linhas; i++) {
				for (int j = 0; j < colunas; j++) {
					matrizSoma[i][j] = x[i][j] + y[i][j];
				}
			}
			return matrizSoma;
		}
	}

	public static double[][] produtoMatrizes(double[][] x, double[][] y) {

		double[][] matrizProduto;
		if (x[0].length != y.length) {
			throw new IllegalArgumentException(
					"Para ser poss�vel realizar o produto o n�mero de colunas da primeira deve ser igual ao n�mero de linhas da segunda.");
		} else {
			int linhas = x.length;
			int colunas = y[0].length;
			matrizProduto = new double[linhas][colunas];
			int i, j, k;
			for (i = 0; i < linhas; i++) {
				for (j = 0; j < colunas; j++) {
					matrizProduto[i][j] = 0;
					for (k = 0; k < x[0].length; k++) {
						matrizProduto[i][j] += (x[i][k] * y[k][j]);
					}
				}
			}
			return matrizProduto;
		}
	}

	public static double[][] matrizIdentidade(int n) {
		double[][] identidade = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					identidade[i][j] = 1;
				} else {
					identidade[i][j] = 0;
				}
			}
		}

		return identidade;
	}

}
