import java.util.Locale;
import java.util.Scanner;

public class URI2028 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n, cnt = 0;
		while (scan.hasNext()) {
			n = scan.nextInt();
			int num = 1;
			cnt++;
			num += ((n * (n + 1)) / 2);
			if (n == 0) {
				System.out.printf("Caso %d: %d numero\n", cnt, num);
			} else {
				System.out.printf("Caso %d: %d numeros\n", cnt, num);
			}
			System.out.printf("0");
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++)
					System.out.printf(" %d", i);
			}
			System.out.printf("\n\n");
		}
		scan.close();
	}
}