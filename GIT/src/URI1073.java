import java.util.Locale;
import java.util.Scanner;

public class URI1073 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "^2"+ " = " + i * i);
			}
		}
		scan.close();
	}
}
