import java.util.Locale;
import java.util.Scanner;

public class URI1847 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		if (a > b && b <= c) {
			System.out.println(":)");
		} else if (a < b && b >= c) {
			System.out.println(":(");
		} else if (a < b && b < c && (c - b) < (b - a)) {
			System.out.println(":(");
		} else if (a < b && b < c && (c - b) >= (b - a)) {
			System.out.println(":)");
		} else if (a > b && b > c && (c - b) > (b - a)) {
			System.out.println(":)");
		} else if (a > b && b > c && (c - b) <= (b - a)) {
			System.out.println(":(");
		} else if (a == b && b < c) {
			System.out.println(":)");
		} else {
			System.out.println(":(");
		}
		scan.close();

	}

}
