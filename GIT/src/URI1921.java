import java.util.Locale;
import java.util.Scanner;

public class URI1921 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = (n - 3);
		for (int i = (n - 3); i > 0; i--) {
			x += i;
		}
		if (x < 0) {
			x = 0;
		}
		System.out.println(x);
		scan.close();

	}
}
