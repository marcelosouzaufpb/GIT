import java.util.Locale;
import java.util.Scanner;

public class URI1158 {

	public static void main(String[] args) {
		int x, y;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			if (x % 2 == 0) {
				x++;
			}
			System.out.println((x * y) + (y * (y - 1)));
		}
		scan.close();
	}
}