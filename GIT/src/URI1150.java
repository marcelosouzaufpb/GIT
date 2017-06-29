import java.util.Locale;
import java.util.Scanner;

public class URI1150 {

	public static void main(String[] args) {
		int x, z, y, w, v = 0;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		do {
			z = scan.nextInt();
		} while (x >= z);
		for (y = x, w = 0; w < z; y++) {
			w += y;
			v++;
		}
		System.out.printf("%d\n", v);
		scan.close();

	}
}
