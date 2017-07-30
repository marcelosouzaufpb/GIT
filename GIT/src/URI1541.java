import java.util.Locale;
import java.util.Scanner;

public class URI1541 {

	public static void main(String[] args) {
		int a, b, c;
		float d;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		while (true) {
			a = scan.nextInt();
			if (a == 0) {
				break;
			}
			b = scan.nextInt();
			c = scan.nextInt();
			d = (float)Math.sqrt((a * b * 100) / c);
			System.out.printf("%.0f\n", d);
		}
		scan.close();
	}
}
