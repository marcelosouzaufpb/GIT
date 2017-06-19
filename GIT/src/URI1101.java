import java.util.Locale;
import java.util.Scanner;

public class URI1101 {

	public static void main(String[] args) {
		int n, m;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		while (((n = scan.nextInt()) > 0) && ((m = scan.nextInt()) > 0)) {
			int sum = 0;
			if (n > m) {
				for (m = m; m <= n; m++) {
					sum += m;
					System.out.print(m + " ");
				}
				System.out.print("Sum=" + sum + "\n");
			} else {
				for (n = n; n <= m; n++) {
					sum += n;
					System.out.print(n + " ");
				}
				System.out.print("Sum=" + sum + "\n");
			}
		}
		scan.close();
	}
}
