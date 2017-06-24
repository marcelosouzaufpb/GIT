import java.util.Locale;
import java.util.Scanner;

public class URI1117 {

	public static void main(String[] args) {
		float n1, n2 = 0, n3 = 0, cont = 0;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		while (cont != 2) {
			n1 = scan.nextFloat();
			if (n1 >= 0.0 && n1 <= 10.0) {
				n3 += n1;
				cont += 1;
			} else {
				System.out.print("nota invalida\n");
			}
		}
		n2 = (float) n3 / 2;
		System.out.printf("media = %.2f\n", n2);
		scan.close();
	}
}
