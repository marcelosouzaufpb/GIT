import java.util.Locale;
import java.util.Scanner;

public class URI1958 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
		String s = n + "";
		if (s.charAt(0) != '-') {
			System.out.printf("+");
		}
		System.out.printf("%.4E\n", n);
		scan.close();
	}
}
