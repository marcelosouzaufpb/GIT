import java.util.Locale;
import java.util.Scanner;

public class URI1051 {

	public static void main(String[] args) {
		float a, b, c, d, e;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		a = scan.nextFloat();

		if (a <= 2000) {
			System.out.print("Isento\n");
		} else {
			if (a > 2000 && a <= 3000) {
				c = a - 2000;
				c = ((c * 8) / 100);
				b = c;
			} else if (a > 3000 && a <= 4500) {
				c = a - 2000;
				d = c - 1000;
				c -= d;
				c = ((c * 8) / 100);
				d = ((d * 18) / 100);
				b = d + c;
			} else {
				c = a - 2000;
				d = c - 1000;
				e = d - 1500;
				c -= d;
				d -= e;
				c = ((c * 8) / 100);
				d = ((d * 18) / 100);
				e = ((e * 28) / 100);
				b = e + d + c;
			}
			System.out.printf("R$ %.2f\n", b);
		}
		scan.close();

	}

}
