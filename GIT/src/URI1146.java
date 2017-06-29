import java.util.Locale;
import java.util.Scanner;

public class URI1146 {

	public static void main(String[] args) {
		int x;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		while (true) {
			x = scan.nextInt();
			if (x == 0) {
				break;

			} else {
				for (int i = 1; i < x; i++) {
					System.out.printf("%d ", i);
				}
				System.out.printf("%d\n", x);
			}
		}
		scan.close();
	}
}