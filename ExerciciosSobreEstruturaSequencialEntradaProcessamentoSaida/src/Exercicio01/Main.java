package Exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite dois valores inteiros");

		System.out.print("Digite o primeiro valor: ");
		int firstNumber = scanner.nextInt();

		System.out.print("Digite o segundo valor: ");
		int secondNumber = scanner.nextInt();

		int sumResult = firstNumber + secondNumber;

		System.out.printf("A soma de %d e %d é: %d%n", firstNumber, secondNumber, sumResult);

		scanner.close();
	}

}
