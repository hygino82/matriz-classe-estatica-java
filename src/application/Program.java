package application;

import java.util.Scanner;

import entities.Matriz;
import services.Operacoes;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Matriz a = new Matriz(2, 3);
		//Matriz b = new Matriz(2, 3);
		a.leia_matriz();
		//sc.nextLine();
		//b.leia_matriz();
		System.out.println("\nMatriz resultante");
		Operacoes.somarMatrizes(a, a);
		sc.close();
	}

}
