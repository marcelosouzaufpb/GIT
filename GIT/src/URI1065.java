import java.util.Locale;
import java.util.Scanner;

public class URI1065 {

	public static void main(String[] args) {
		int n, cont;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		cont = 0;
		n = 0;
		while (cont != 5) {
			cont++;
			int a = scan.nextInt();
			if (a % 2 == 0) {
				n++;
			}
		}
		System.out.println(n + " valores pares");
		scan.close();
	}

}
