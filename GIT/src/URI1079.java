import java.util.Locale;
import java.util.Scanner;

public class URI1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			double d = (a * 2 + b * 3 + c * 5) / 10;
			System.out.printf("%.1f\n", d);
		}
		scan.close();

	}

}
