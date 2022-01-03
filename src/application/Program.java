package application;

import java.util.Locale;

import model.Matriz;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 2 } };
		System.out.println("Matriz A");
		Matriz.escrevaMatriz(a);
		System.out.println("DET(A) = " + Matriz.determinante(a));
		linha();

		System.out.println("Dobro da Matriz A");
		double[][] escalar  = Matriz.multiplicaEscalar(a, 2.0);
		Matriz.escrevaMatriz(escalar);
		linha();
		
		System.out.println("Inversa da Matriz A");
		double[][] inversa = Matriz.matrizInversa(a);
		Matriz.escrevaMatriz(inversa);
	}

	public static void linha() {
		System.out.println("----------------------------------------------\n");
	}

}
