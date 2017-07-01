import java.util.Locale;
import java.util.Scanner;

public class URI1176 {

	public static void main(String[] args) {
		long[] fib = new long[61];
		int n, f;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		fib[0] = 0;
		fib[1] = 1;
		for (int j = 2; j <= 60; j++) {
			fib[j] = fib[j - 2] + fib[j - 1];
		}
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			f = scan.nextInt();
			System.out.println("Fib(" + f + ") = " + fib[f]);
		}
		scan.close();
	}
}
