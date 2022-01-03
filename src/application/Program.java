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

		double[][] cofatores = Matriz.matrizCofatores(a);
		System.out.println("Cofatores da Matriz A");
		Matriz.escrevaMatriz(cofatores);
	}

	public static void linha() {
		System.out.println("----------------------------------------------\n");
	}

}
