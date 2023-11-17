package Exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o raio de um círculo [utilize ponto como separador]: ");
		double circleRadius = scanner.nextDouble();

		double pi = 3.14159;
		double area = pi * (Math.pow(circleRadius, 2));

		System.out.printf("A= %.4f", area);

		scanner.close();
	}

}
