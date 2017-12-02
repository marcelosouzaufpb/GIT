import java.util.Locale;
import java.util.Scanner;

public class URI1962 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n;
		int ano, t;
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			t = scan.nextInt();
			if (t < 2015) {
				ano = 2015 - t;
				System.out.printf("%d D.C.\n", ano);
			} else {
				ano = t - 2014;
				System.out.printf("%d A.C.\n", ano);
			}
		}
		scan.close();
	}
}
