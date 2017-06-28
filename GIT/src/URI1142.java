import java.util.Locale;
import java.util.Scanner;

public class URI1142 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int N;
		N = scan.nextInt();
		for (int i = 1; i <= (4 * N - 1); i += 4) {
			for (int j = i; j <= i + 2; j++) {
				System.out.print(j + " ");
			}
			System.out.print("PUM\n");
		}
		scan.close();
	}
}
