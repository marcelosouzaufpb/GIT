import java.util.Locale;
import java.util.Scanner;

public class URI1078 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + N + " = " + (i * N));

		}
		scan.close();

	}

}
