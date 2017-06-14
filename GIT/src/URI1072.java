import java.util.Locale;
import java.util.Scanner;

public class URI1072 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		int cont = 0;
		int in = 0;
		int out = 0;
		for (cont = 0; cont != numero; cont++) {
			int n = scan.nextInt();

			if (n >= 10 && n <= 20) {

				in++;

			} else
				out++;
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		scan.close();
	}
}