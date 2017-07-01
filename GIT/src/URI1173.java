import java.util.Locale;
import java.util.Scanner;

public class URI1173 {

	public static void main(String[] args) {
		int n;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int x[] = new int[10];
		n = scan.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.println("N[" + i + "] = " + n);
			n *= 2;
		}
		scan.close();
	}
}
