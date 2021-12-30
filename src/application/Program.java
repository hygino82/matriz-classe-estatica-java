package application;

import java.util.Locale;

import model.Matriz;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double[][] m = { { 1, 2, 3 }, { 4, 5, 6 } };

		Matriz.escrevaMatriz(m);
		
		double[] n= {1,2,3,4};
		Matriz.escrevaMatriz(n);

	}

}
