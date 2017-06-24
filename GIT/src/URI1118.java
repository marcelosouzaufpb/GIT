import java.util.Locale;
import java.util.Scanner;

public class URI1118 {

	public static void main(String[] args) {
		int n;
		double a, b, c;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		do {
			n = 0;
			b = 0;
			while (n < 2) {
				c = scan.nextDouble();
				if (c >= 0 && c <= 10) {
					b += c;
					n++;
				} else {
					System.out.println("nota invalida");
				}
			}
			System.out.printf("media = %.2f\n", b / 2f);
			do {
				System.out.println("novo calculo (1-sim 2-nao)");
				a = scan.nextDouble();
			} while (a != 1 && a != 2);
		} while (a != 2);
		scan.close();
	}

}
