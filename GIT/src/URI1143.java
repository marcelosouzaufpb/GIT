import java.util.Locale;
import java.util.Scanner;

public class URI1143 {

	public static void main(String[] args) {
		int N;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.print(i + " ");
			System.out.print(i * i + " ");
			System.out.println(i * i * i);
		}
		scan.close();
	}
}
