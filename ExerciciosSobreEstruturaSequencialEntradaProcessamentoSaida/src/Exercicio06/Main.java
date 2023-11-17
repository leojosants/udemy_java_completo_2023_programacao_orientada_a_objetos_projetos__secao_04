package Exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nInforme três valores reais");

		System.out.print("\nDigite o primeiro valor para A [utilize ponto como separador]: ");
		double A = scanner.nextDouble();

		System.out.print("Digite o segundo valor para B [utilize ponto como separador]: ");
		double B = scanner.nextDouble();

		System.out.print("Digite o terceiro valor para C [utilize ponto como separador]: ");
		double C = scanner.nextDouble();

		double areaOfT​heRightTriangle = A * C / 2;
		double pi = 3.14159;
		double radiusCircleArea = pi * Math.pow(C, 2);
		double areaOfTheTrapezoid = ((A + B) * C) / 2;
		double areaOfTheSquare = Math.pow(B, 2);
		double areaOfTheRetangle = A * B;

		System.out.printf("\nTRIANGULO: %.3f%n", areaOfT​heRightTriangle);
		System.out.printf("CIRCULO:   %.3f%n", radiusCircleArea);
		System.out.printf("TRAPEZIO:  %.3f%n", areaOfTheTrapezoid);
		System.out.printf("QUADRADO:  %.3f%n", areaOfTheSquare);
		System.out.printf("RETANGULO: %.3f%n", areaOfTheRetangle);

		scanner.close();

	}

}
