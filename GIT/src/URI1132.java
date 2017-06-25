import java.util.Locale;
import java.util.Scanner;

public class URI1132 {

	public static void main(String[] args) {
		int x, y;
		int z = 0, w = 0;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		if (x > y) {
			for (int i = y; i <= x; i++) {
				if (i % 13 != 0) {
					z += i;
				}
			}
			System.out.print(z + "\n");
		} else if (x < y) {
			for (int i = x; i <= y; i++) {
				if (i % 13 != 0) {
					w += i;
				}
			}
			System.out.print(w + "\n");
		}
		scan.close();
	}
}
