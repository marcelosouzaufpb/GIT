import java.util.Locale;
import java.util.Scanner;

public class URI1011 {

	public static void main(String[] args) {
		double R;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		R = scan.nextDouble();
		System.out.printf("VOLUME = %.3f\n", 4 / 3.0 * 3.14159 * R * R * R);
		scan.close();

	}

}
