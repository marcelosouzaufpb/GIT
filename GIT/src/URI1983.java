import java.util.Locale;
import java.util.Scanner;

public class URI1983 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int n, x, s = 0;
		float f = 0, m = 0;
		n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			x = scan.nextInt();
			f = scan.nextFloat();
			if (m < f) {
				m = f;
				s = x;
			}
		}
		if (m >= 8.0)
			System.out.println(s);
		else
			System.out.println("Minimum note not reached");
		scan.close();
	}
}
