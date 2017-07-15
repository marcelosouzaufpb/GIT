import java.util.Locale;
import java.util.Scanner;

public class URI1183 {

	public static void main(String[] args) {
		float matriz[][] = new float[12][12];
		char p;
		float soma = 0;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		p = scan.nextLine().charAt(0);

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				matriz[i][j] = scan.nextFloat();
				if (j > i) {
					soma += matriz[i][j];
				}
			}
		}

		if (p == 'M') {
			soma /= 66;
		}
		System.out.printf("%.1Lf\n", soma);
		scan.close();
	}
}