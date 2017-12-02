import java.util.Locale;
import java.util.Scanner;

public class URI1963 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		float a, b;
		a = scan.nextFloat();
		b = scan.nextFloat();
		String fs = String.format("%.02f", (b - a) / a * 100);
		System.out.println(fs + "%");
		scan.close();

	}
}
