package Exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nInforme os dados abaixo referente à duas peças");
		System.out.println("\nDigite os dados da peça 1");

		System.out.print("Código: ");
		int partCode_1 = scanner.nextInt();

		System.out.print("Número de peças: ");
		int numberOfPiece_1 = scanner.nextInt();

		System.out.print("Valor unitário de cada peça [utilize ponto como separador]: ");
		double valueOfEachPiece_1 = scanner.nextDouble();

		System.out.println("\nDigite os dados da peça 2");

		System.out.print("Código: ");
		int partCode_2 = scanner.nextInt();

		System.out.print("Número de peças: ");
		int numberOfPiece_2 = scanner.nextInt();

		System.out.print("Valor unitário de cada peça [utilize ponto como separador]: ");
		double valueOfEachPiece_2 = scanner.nextDouble();

		double valueToBePaidForPart_1 = numberOfPiece_1 * valueOfEachPiece_1;
		double valueToBePaidForPart_2 = numberOfPiece_2 * valueOfEachPiece_2;
		double totalAmountPayable = valueToBePaidForPart_1 + valueToBePaidForPart_2;

		System.out.printf("\nVALOR A PAGAR: R$ %.2f%n", totalAmountPayable);

		scanner.close();
	}

}
