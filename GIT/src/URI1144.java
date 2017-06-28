import java.util.Locale;
import java.util.Scanner;

public class URI1144 {

	public static void main(String[] args) {
		int n;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			System.out.print(i * i + " ");
			System.out.println(i * i * i);
			System.out.print(i + " ");
			System.out.print(i * i + 1 + " ");
			System.out.println(i * i * i + 1);
		}
		scan.close();
	}

}
