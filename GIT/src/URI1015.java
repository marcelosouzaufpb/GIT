import java.util.Locale;
import java.util.Scanner;

public class URI1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();

		double t = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.printf("%.4f\n", t);

		scan.close();

	}

}
