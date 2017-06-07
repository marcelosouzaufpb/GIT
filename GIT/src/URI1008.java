import java.util.Locale;
import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
		int A, B;
		double C;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextDouble();
		System.out.println("NUMBER = " + A);
		System.out.printf("SALARY = U$ %.2f\n", B * C);
		scan.close();

	}

}
