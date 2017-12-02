import java.util.Locale;
import java.util.Scanner;

public class URI2029 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double v, r, h, d, a;
		double PI = 3.14;
		while (scan.hasNext()) {
			v = scan.nextDouble();
			d = scan.nextDouble();
			r = d / 2;
			a = PI * r * r;
			h = v / a;
			System.out.printf("ALTURA = %.2f\n", h);
			System.out.printf("AREA = %.2f\n", a);
		}
		scan.close();

	}
}
