import java.util.Locale;
import java.util.Scanner;

public class URI1099 {

	public static void main(String[] args) {
		int n, x, y, aux, cont;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		while (true) {
			if (n == 0)
				break;
			x = scan.nextInt();
			y = scan.nextInt();

			if (x > y) {
				aux = x;
				x = y;
				y = aux;
			}
			cont = 0;
			for (int i = x + 1; i < y; i++) {
				if (i % 2 != 0)
					cont += i;
			}
			System.out.println(cont);
			n--;
		}
		scan.close();

	}
}