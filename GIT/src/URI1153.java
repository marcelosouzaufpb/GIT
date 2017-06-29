import java.util.Locale;
import java.util.Scanner;

public class URI1153 {

	public static void main(String[] args) {
		int n, x;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		x = 1;
		for (int i = 1; i <= n; i++) {
			x = x * i;
		}
		System.out.printf("%d\n", x);
		scan.close();
	}
}
