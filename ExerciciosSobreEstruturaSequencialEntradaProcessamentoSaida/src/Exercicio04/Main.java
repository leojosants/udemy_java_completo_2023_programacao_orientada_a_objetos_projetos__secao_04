package Exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nInforme os dados abaixo de um funcionário");

		System.out.print("Número: ");
		int number = scanner.nextInt();

		System.out.print("Número de horas trabalhadas: ");
		int numberOfHoursWorked = scanner.nextInt();

		System.out.print("Valor da hora trabalhada [utilize ponto como separador]: $ ");
		double valueOfTheHourWorked = scanner.nextDouble();

		double salary = numberOfHoursWorked * valueOfTheHourWorked;

		System.out.printf("\nNUMBER = %d%n", number);
		System.out.printf("SALARY = U$ %.2f%n", salary);

		scanner.close();
	}

}
