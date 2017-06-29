import java.util.Locale;
import java.util.Scanner;

public class URI1151 {

	public static void main(String[] args) {
		int x, y, z, w;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		if (x == 0) {
			System.out.printf("0\n");
		}
		y = 1;
		z = 1;
		System.out.printf("0");
		for (int i = 1; i < x; i++) {
			System.out.printf(" %d", y);
			w = y;
			y = z;
			z = z + w;
		}
		System.out.printf("\n");
		scan.close();
	}
}
