
public class Main {

	public static void main(String[] args) {

		// Exemplo 1
		int x_1, y_1;
		x_1 = 5;
		y_1 = 2 * x_1;

		System.out.println(x_1);
		System.out.println(y_1);

		// Exemplo 2
		int x_2;
		double y_2;

		x_2 = 5;
		y_2 = 2 * x_2;

		System.out.println(x_2);
		System.out.println(y_2);

		// Exemplo 3
		double b_3, B_3, h_3, area_3;

		b_3 = 6.0;
		B_3 = 8.0;
		h_3 = 5.0;

		area_3 = (b_3 + B_3) / 2.0 * h_3;
		System.out.printf("Área: %.2f%n", area_3);

		// Exemplo 4
		int a_4, b_4;
		double result_4;

		a_4 = 5;
		b_4 = 2;

		result_4 = (double) a_4 / b_4;
		System.out.println(result_4);

		// Exemplo 5
		double a_5;
		int b_5;

		a_5 = 5.0;
		b_5 = (int) a_5;
		
		System.out.println(b_5);
	}

}
