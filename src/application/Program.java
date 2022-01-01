package application;

import java.util.Locale;

import model.Matriz;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 2 } };

		Matriz.escrevaMatriz(m);
		Matriz.escalona(m);
		linha();
		double[][] matrizEscalonada = Matriz.escalona(m);
		System.out.println("Matriz escalonada");
		Matriz.escrevaMatriz(matrizEscalonada);
		linha();
		System.out.println("Matriz original");
		Matriz.escrevaMatriz(m);

		linha();
		double[] n = { 1, 2, 3, 4 };
		Matriz.escrevaMatriz(n);

	}

	public static void linha() {
		System.out.println("----------------------------------------------\n");
	}

}
