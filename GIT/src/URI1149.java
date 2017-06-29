import java.util.Locale;
import java.util.Scanner;

public class URI1149 {

	public static void main(String[] args) {
		int a, b, j = 0;

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		while (b < 0 || b == 0) {
			b = scan.nextInt();
		}
		for (int i = 0; i < b; i++) {
			j = j + a + i;
		}

		System.out.printf("%d\n", j);
		scan.close();
	}
}