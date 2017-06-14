import java.util.Locale;
import java.util.Scanner;

public class URI1074 {

	public static void main(String[] args) {
		int n, a;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			a = scan.nextInt();
			if (a == 0) {

				System.out.print("NULL\n");

			} else if (a % 2 != 0 && a < 0) {
				System.out.print("ODD NEGATIVE\n");

			} else if (a % 2 != 0 && a > 0) {
				System.out.print("ODD POSITIVE\n");
			} else if (a % 2 == 0 && a > 0) {
				System.out.print("EVEN POSITIVE\n");
			} else {
				System.out.print("EVEN NEGATIVE\n");
			}
		}
		scan.close();
	}
}
