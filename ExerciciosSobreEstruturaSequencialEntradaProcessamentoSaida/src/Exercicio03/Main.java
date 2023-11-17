package Exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite quatro valores inteiros para A, B, C e D");

		System.out.print("Digite o valor de A: ");
		int A = scanner.nextInt();

		System.out.print("Digite o valor de B: ");
		int B = scanner.nextInt();

		System.out.print("Digite o valor de C: ");
		int C = scanner.nextInt();

		System.out.print("Digite o valor de D: ");
		int D = scanner.nextInt();

		int difference = (A * B - C * D);

		System.out.printf("Diferença: %d%n", difference);

		scanner.close();
	}

}
