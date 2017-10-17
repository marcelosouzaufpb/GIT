import java.util.Locale;
import java.util.Scanner;

public class URI1866 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		a = scan.nextInt();
		for (b = 1; b <= a; b++) {
			c = scan.nextInt();
			if (c % 2 == 0) {
				System.out.printf("0\n");
			} else {
				System.out.printf("1\n");
			}
		}
		scan.close();
	}
}
