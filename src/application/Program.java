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
		linha();

		double[][] adjunta = Matriz.matrizAdjunta(a);
		System.out.println("Adjunta da Matriz A");
		Matriz.escrevaMatriz(adjunta);
		linha();

		double[][] verificaIdentidade = Matriz.produtoMatrizes(a, adjunta);
		double det = Matriz.determinante(Matriz.escalona(a));
		System.out.printf("DET(A) = %.5f\n", det);
		System.out.println(
				"Verificando se o produto da matriz A pela sua Adjunta resulta no determinante de A * identidade ");
		Matriz.escrevaMatriz(verificaIdentidade);
	}

	public static void linha() {
		System.out.println("----------------------------------------------\n");
	}

}
