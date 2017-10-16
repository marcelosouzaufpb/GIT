import java.util.Locale;
import java.util.Scanner;

public class URI1837 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		int q = a / b;
		int r = a % b;
		if (a < 0 && b < 0) {
			if (r < 0 && q <= 0) {
				q++;
				r = -(b * q) + a;
			} else if (r < 0 && q > 0) {
				q++;
				r = -(b * q) + a;
			}
		} else {
			if (r < 0 && q <= 0) {
				q--;
				r = -(b * q) + a;
			} else if (r < 0 && q > 0) {
				q++;
				r = -(b * q) + a;
			}
		}
		System.out.println(q + " " + r);
		scan.close();
	}
}