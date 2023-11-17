import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;

		System.out.print("Digite um número inteiro: ");
		x = scanner.nextInt();

		scanner.nextLine(); // buffer
		
		System.out.print("Digite a primeira palavra: ");
		s1 = scanner.nextLine();

		System.out.print("Digite a segunda palavra: ");
		s2 = scanner.nextLine();

		System.out.print("Digite a terceira palavra: ");
		s3 = scanner.nextLine();

		System.out.println("\nDADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		scanner.close();
	}

}
