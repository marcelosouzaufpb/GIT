import java.util.Locale;
import java.util.Scanner;

public class URI1133 {

	public static void main(String[] args) {
		int x, y;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();

		if (x > y) {

			for (int i = y + 1; i < x; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.print(i + "\n");
				}
			}
		} else if (y > x) {
			for (int i = x + 1; i < y; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.print(i + "\n");
				}
			}
		}
		scan.close();
	}
}
