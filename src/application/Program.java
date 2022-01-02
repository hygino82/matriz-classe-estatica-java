package application;

import java.util.Locale;

import model.Matriz;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 2 } };
		double[][] b = { { 7, 5, 8 }, { 2, 4, 6 }, { 1, 9, 2 } };
		System.out.println("Matriz A");
		Matriz.escrevaMatriz(a);
		System.out.println("Matriz B");
		Matriz.escrevaMatriz(b);
		System.out.println("Matriz A+B");
		double[][] soma = Matriz.somaMatrizes(a, b);
		Matriz.escrevaMatriz(soma);

		double[][] mi = Matriz.matrizIdentidade(3);
		System.out.println("Matriz identidade");
		Matriz.escrevaMatriz(mi);

		double[][] c = { { 1, 2 }, { 0, 3 } };
		double[][] d = { { 3, -1 }, { 1, 4 } };
		linha();
		System.out.println("Matriz C");
		Matriz.escrevaMatriz(c);
		System.out.println("Matriz D");
		Matriz.escrevaMatriz(d);
		double[][] prod = Matriz.produtoMatrizes(c, d);
		System.out.println("Matriz C * D");
		Matriz.escrevaMatriz(prod);

	}

	public static void linha() {
		System.out.println("----------------------------------------------\n");
	}

}
