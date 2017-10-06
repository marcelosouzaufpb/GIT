import java.util.Locale;
import java.util.Scanner;

public class URI1789 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n, l, v;
		while (scan.hasNext()) {
			n = scan.nextInt();
			v = 0;
			for (int k = 0; k < n; k++) {
				l = scan.nextInt();
				if (l >= v) {
					v = l;
				}
			}
			if (v < 10) {
				System.out.println(1);
			}
			if (v > 10 && v < 20) {
				System.out.println(2);
			}
			if (v >= 20) {
				System.out.println(3);
			}
		}
		scan.close();

	}
}
