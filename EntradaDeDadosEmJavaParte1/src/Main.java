import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String x_1 = scanner.next();

		System.out.print("Digite um número inteiro: ");
		int number_1 = scanner.nextInt();

		Locale.setDefault(Locale.US);
		System.out.print("Digite um número flutuante [use vírgula como separador]: ");
		double number_2 = scanner.nextDouble();

		System.out.print("Digite um caracter: ");
		char x_2 = scanner.next().charAt(0);

		scanner.nextLine(); // buffer

		System.out.print("Digite nome e sobrenome: ");
		String nameAndLastName = scanner.nextLine();

		System.out.printf("\nPalavra digitada: %s%n", x_1);
		System.out.printf("Número digitado: %d%n", number_1);
		System.out.printf("Número flutuante digitado: %.2f%n", number_2);
		System.out.printf("Caracter digitado: %s%n", x_2);
		System.out.printf("Nome e sobrenome: %s%n", nameAndLastName);

		scanner.close();
	}

}
