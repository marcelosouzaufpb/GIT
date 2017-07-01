import java.util.Locale;
import java.util.Scanner;

public class URI1164 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n, x, y;
		n = scan.nextInt();
		for (int j = 1; j <= n; j++) {
			y = 0;
			x = scan.nextInt();
			for (int i = 1; i <= x; i++) {
				if (x % i == 0) {
					y++;
				}
			}
			if (y <= 2) {
				System.out.println(x + " eh primo");
			} else {
				System.out.println(x + " nao eh primo");
			}
		}
		scan.close();
	}
}