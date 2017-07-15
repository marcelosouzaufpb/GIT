import java.util.Locale;
import java.util.Scanner;

public class URI1185 {

	public static void main(String[] args) {
		double[][] matriz = new double[12][12];
		double soma = 0;
		int p = 10;
		char c;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		c = scan.nextLine().charAt(0);
		for (int i = 0; i <= 11; i++) {
			for (int j = 0; j <= 11; j++) {
				matriz[i][j] = scan.nextDouble();

			}
		}

		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= p; j++) {
				soma += matriz[i][j];
			}
			p--;
		}

		if ('M' == c) {
			soma /= 66;
		}
		System.out.printf("%.1f\n", soma);
		scan.close();
	}
}
