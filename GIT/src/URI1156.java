import java.util.Locale;
import java.util.Scanner;

public class URI1156 {

	public static void main(String[] args) {
		double s = 1, x = 2;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		for (int i = 3; i <= 39; i += 2) {
			s += i / x;
			x *= 2;
		}
		System.out.printf("%.2f\n", s);
		scan.close();

	}

}