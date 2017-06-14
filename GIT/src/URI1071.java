import java.util.Locale;
import java.util.Scanner;

public class URI1071 {

	public static void main(String[] args) {
		int x, y, z = 0;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();

		if (x > y) {
			for (int i = x - 1; i > y; i--) {
				if (i % 2 != 0) {
					z += i;
				}
			}
		} else {
			for (int i = y - 1; i > x; i--) {
				if (i % 2 != 0) {
					z += i;
				}
			}
		}
		System.out.print(z + "\n");
		scan.close();
	}
}
