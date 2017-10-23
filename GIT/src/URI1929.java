import java.util.Locale;
import java.util.Scanner;

public class URI1929 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int a[] = new int[4];
		int b, c, e, f, g;
		for (b = 0; b < 4; b++) {
			a[b] = scan.nextInt();
		}
		for (b = 0; b < 4; b++) {
			for (c = b + 1; c < 4; c++) {
				if (a[c] < a[b]) {

					e = a[b];
					a[b] = a[c];
					a[c] = e;
				}
			}
		}
		g = a[1] + a[2];
		f = a[0] + a[1];
		if (a[3] < g || a[2] < f) {
			System.out.printf("S\n");
		} else {
			System.out.printf("N\n");

		}
		scan.close();
	}
}