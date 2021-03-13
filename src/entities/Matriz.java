package entities;

import java.util.Scanner;

public class Matriz {
	private int linhas;
	private int colunas;
	private double[][] m;

	public Matriz(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		m = new double[linhas][colunas];
	}
	
	public Matriz(int linhas, int colunas, double[][] m) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.m = m;
	}

	public int getLinhas() {
		return linhas;
	}

	
	public int getColunas() {
		return colunas;
	}

	public double[][] getM() {
		return m;
	}


	public void leia_matriz() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os elementos da matriz");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				m[i][j] = sc.nextDouble();
			}
		}
		sc.close();
	}

}
