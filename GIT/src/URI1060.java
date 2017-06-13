import java.util.Locale;
import java.util.Scanner;

public class URI1060 {

	public static void main(String[] args) {
		double a;
		int cont, b;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		cont = 0;
		b = 0;
		while (b != 6) {
			b++;
			a = scan.nextDouble();
			if (a > 0) {
				cont++;
			}
		}
		System.out.println(cont + " valores positivos");
		scan.close();

	}

}
