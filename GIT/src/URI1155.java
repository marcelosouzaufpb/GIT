import java.util.Locale;
import java.util.Scanner;

public class URI1155 {

	public static void main(String[] args) {
		double s = 0;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 100; i++) {
			s += 1.0 / i;
		}
		System.out.printf("%.2f\n", s);
		scan.close();

	}

}
