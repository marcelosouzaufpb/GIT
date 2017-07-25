import java.util.Locale;
import java.util.Scanner;

public class URI1435 {

	public static void main(String[] args) {
		int n;
		int m[][];
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		while (true) {
			n = scan.nextInt();
			int cont1 = 0, cont2 = n - 1, cont3 = 1;
			m = new int[n][n];

			if (n == 0) {
				break;

			} else if (n == 1) {
				System.out.printf(" %2d\n\n", 1);
			} else {
				for (int i = 0; i < n - 1; i++) {
					for (int j = cont1; j <= cont2; j++) {
						m[cont1][j] = cont3;
						m[cont2][j] = cont3;
						m[j][cont1] = cont3;
						m[j][cont2] = cont3;
					}
					cont3++;
					cont1++;
					cont2--;
				}

				for (int g = 0; g < n; g++) {
					for (int h = 0; h < n; h++) {
						if (h == 0) {
							System.out.printf("%3d", m[g][h]);
						} else {
							System.out.printf(" %3d", m[g][h]);
						}
					}
					System.out.printf("\n");
				}
				System.out.printf("\n");
			}
		}
		scan.close();
	}
}
