import java.util.Locale;
import java.util.Scanner;

public class URI1933 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();

		if (a > b) {
			System.out.print(a + "\n");
		} else {
			System.out.print(b + "\n");
		}
		scan.close();
	}

}
