import java.util.Locale;
import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		String A;
		Double B, C;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		A = scan.nextLine();
		B = scan.nextDouble();
		C = scan.nextDouble();
		System.out.printf("TOTAL = R$ %.2f\n", (15 * C) / 100 + B);
		scan.close();
	}

}
