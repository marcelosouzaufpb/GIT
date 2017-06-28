import java.util.Locale;
import java.util.Scanner;

public class URI1134 {

	public static void main(String[] args) {
		int a = 0, g = 0, d = 0;

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		boolean inicio;
		inicio = false;
		while (!inicio) {
			int e = scan.nextInt();

			if (e == 1) {
				a++;
				inicio = false;
			} else if (e == 2) {
				g++;
				inicio = false;
			} else if (e == 3) {
				d++;
				inicio = false;
			} else if (e == 4) {
				inicio = true;
			} else {
				inicio = false;
			}
			
		}
		System.out.printf("MUITO OBRIGADO\n");
		System.out.printf("Alcool: %d\n", a);
		System.out.printf("Gasolina: %d\n", g);
		System.out.printf("Diesel: %d\n", d);
		scan.close();

	}

}
