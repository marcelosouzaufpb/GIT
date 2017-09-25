import java.util.Locale;
import java.util.Scanner;

public class URI1557 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n, i, j;
		int[][] matriz = new int[15][15];

		while (true) {
			n = scan.nextInt();
			if (n == 0) {
				break;
			}
			for (i = 0; i < 15; i++) {
				for (j = 0; j < 15; j++) {
					matriz[i][j] = 0;
				}
			}
			int linha = 1, coluna = 1;
			for (i = 0; i < n; i++) {
				coluna = 1;
				for (j = 0; j < n; j++) {
					matriz[i][j] = linha * coluna;
					coluna *= 2;
				}
				linha *= 2;
			}
			int numeroMaior = matriz[n - 1][n - 1], contagem = 0;
			while (numeroMaior > 0) {
				numeroMaior /= 10;
				contagem++;
			}
			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					int atual = matriz[i][j], cont = 0, k;
					while (atual > 0) {
						atual /= 10;
						cont++;
					}
					if (j > 0) {
						for (k = 0; k < contagem + 1 - cont; k++) {
							System.out.printf(" ");
						}
					} else {
						for (k = 0; k < contagem - cont; k++) {
							System.out.printf(" ");
						}
					}
					System.out.printf("%d", matriz[i][j]);
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
		scan.close();
	}
}