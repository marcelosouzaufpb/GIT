import java.util.Locale;
import java.util.Scanner;

public class URI1985 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n;
		double total = 0.00;
		int codigo, quantidade;
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			codigo = scan.nextInt();
			quantidade = scan.nextInt();
			if (codigo == 1001) {
				total += (double) quantidade * 1.50;
			} else if (codigo == 1002) {
				total += (double) quantidade * 2.50;
			} else if (codigo == 1003) {
				total += (double) quantidade * 3.50;
			} else if (codigo == 1004) {
				total += (double) quantidade * 4.50;
			} else if (codigo == 1005) {
				total += (double) quantidade * 5.50;
			}
		}
		System.out.printf("%.2f\n", total);
		scan.close();
	}
}
