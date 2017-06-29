import java.util.Locale;
import java.util.Scanner;

public class URI1159 {

	public static void main(String[] args) {
		int x, y;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		while (true) {
			x = scan.nextInt();
			if (x == 0) {
				break;
			}
			if (x % 2 == 0) {
				y = (x) + (x + 2) + (x + 4) + (x + 6) + (x + 8);
				System.out.println(y);
			} else {
				y = (x + 1) + (x + 3) + (x + 5) + (x + 7) + (x + 9);
				System.out.println(y);
			}
		}
		scan.close();
	}

}
