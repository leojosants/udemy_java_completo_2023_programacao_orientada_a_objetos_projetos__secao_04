import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String produtc_1 = "Computer";
		String produtc_2 = "Office desk";

		int age = 30;
		int code = 5290;

		char gender = 'F';

		double price_1 = 2100.00;
		double price_2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products");
		System.out.printf("%s, wich price is $ %.2f%n", produtc_1, price_1);
		System.out.printf("%s, wich price is $ %.2f%n%n", produtc_2, price_2);

		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);

		System.out.printf("Measure with eigth decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);

		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}

}
