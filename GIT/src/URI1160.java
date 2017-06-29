import java.util.Locale;
import java.util.Scanner;

public class URI1160 {

	public static void main(String[] args) {
		int n, x, y, z;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double a, b;
		n = scan.nextInt();

		while (n > 0) {
			x = 0;
			y = scan.nextInt();
			z = scan.nextInt();
			a = scan.nextDouble();
			b = scan.nextDouble();
			while (y <= z) {
				y *= (a / 100.0) + 1.0;
				z *= (b / 100.0) + 1.0;
				x++;
				if (x > 100) {
					System.out.println("Mais de 1 seculo.");
					break;
				}
			}
			if (x <= 100) {
				System.out.println(x + " anos.");
			}
			n--;
		}
		scan.close();
	}
}
