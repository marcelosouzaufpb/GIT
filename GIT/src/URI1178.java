import java.util.Locale;
import java.util.Scanner;

public class URI1178 {

	public static void main(String[] args) {
		double n;
		int i;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		n = scan.nextDouble();
		for (i = 0; i < 100; i++) {
			System.out.printf("N[%d] = %.4f\n", i, n);
			n = n / 2;
		}
		scan.close();

	}
}