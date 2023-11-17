import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int y = 32;
		double x = 10.35784;
		String name = "Leonardo";
		int age = 31;
		double income = 4000.00;

		System.out.println(y);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.printf("%s tem %d anos e renda de R$%.2f%n", name, age, income);
	}

}
