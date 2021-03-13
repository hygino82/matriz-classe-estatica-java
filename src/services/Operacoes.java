package services;

import entities.Matriz;

public class Operacoes {
	public static void escrevaMatriz(Matriz matriz) {
		double[][] m = matriz.getM();
		int linhas = matriz.getLinhas();
		int colunas = matriz.getColunas();

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(String.format("%.5f", m[i][j]) + " ");
			}
			System.out.println();
		}
	}

	public static void somarMatrizes(Matriz m1, Matriz m2) {
		if (m1.getColunas() != m2.getColunas() && m1.getLinhas() != m2.getLinhas()) {
			// throw new MatrizException("As matrizes possuem dimenções diferentes");
			System.out.println("As matrizes possuem dimenções diferentes");

		} 
		else {
			
			double[][] mat2 = m2.getM();
			double[][] mat1 = m1.getM();
			int linhas = m1.getLinhas();
			int colunas = m2.getColunas();

			double[][] soma = new double[linhas][colunas];

			for (int i = 0; i < linhas; i++)
				for (int j = 0; j < colunas; j++)
					soma[i][j] = mat1[i][j] + mat2[i][j];

			// criando o objeto matriz
			Matriz matrizSoma = new Matriz(linhas, colunas, soma);
			System.out.println("Matriz obtida da soma entre as matrizes");
			escrevaMatriz(matrizSoma);
		}
	}
}
