import java.util.Locale;
import java.util.Scanner;

public class URI1973 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		long[] inicio;
		long[] ovelha;
		long fazenda = 0, quantOvelha = 0;
		int n, i;

		n = scan.nextInt();
		inicio = new long[n];
		ovelha = new long[n];

		for (i = 0; i < n; i++) {

			ovelha[i] = scan.nextLong();
			inicio[i] = 0;
		}
		i = 0;
		while (true) {
			if (i == 0 && ovelha[i] % 2 == 0) {
				inicio[i] = 1;
				if (ovelha[i] > 0)
					ovelha[i]--;
				break;
			} else if (i == n - 1 && ovelha[i] % 2 == 1) {
				inicio[i] = 1;
				if (ovelha[i] > 0)
					ovelha[i]--;
				break;
			} else if (ovelha[i] % 2 == 1) {
				ovelha[i]--;
				inicio[i] = 1;
				i++;
			} else if (ovelha[i] % 2 == 0) {
				inicio[i] = 1;
				if (ovelha[i] > 0)
					ovelha[i]--;
				i--;
			}
		}
		for (i = 0; i < n; i++) {
			quantOvelha += ovelha[i];
			fazenda += inicio[i];
		}
		System.out.print(fazenda + " ");
		System.out.print(quantOvelha);
		scan.close();
	}
}