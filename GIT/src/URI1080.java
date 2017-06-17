import java.util.Locale;
import java.util.Scanner;

public class URI1080 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;

		for (int i = 1; i <= 100; i++) {
			int n = scan.nextInt();
			if (a < n) {
				a = n;
				b = i;
			}
		}
		System.out.println(a);
		System.out.println(b);
		scan.close();

	}

}
