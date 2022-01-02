package application;

import java.util.Locale;

import model.Matriz;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 2 } };
		System.out.println("Matriz A");
		Matriz.escrevaMatriz(a);
		linha();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				double[][] mr = Matriz.matrizReduzida(a, i, j);
				System.out.printf("MR[%d,%d]\n", (i + 1), (j + 1));
				Matriz.escrevaMatriz(mr);
				linha();
			}
		}
	}

	public static void linha() {
		System.out.println("----------------------------------------------\n");
	}

}
