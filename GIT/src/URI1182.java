import java.util.Locale;
import java.util.Scanner;

public class URI1182 {

	public static void main(String[] args) {
		int coluna;

		float resultado = 0;
		float matriz[][] = new float[12][12];
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		String option;
		coluna = scan.nextInt();
		option = scan.next();

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				matriz[i][j] = scan.nextFloat();
			}
		}

		for (int j = 0; j < 12; j++) {
			resultado += matriz[j][coluna];
		}

		if (option.equals("M")) {
			resultado /= 12;
		}
		System.out.printf("%.1f\n", resultado);

		scan.close();

	}

}