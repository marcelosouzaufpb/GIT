import java.util.Locale;
import java.util.Scanner;

public class URI1070 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = n;
		for (int i = 0; i < 12; i++) {
			a++;
			if (a % 2 != 0) {
				System.out.println(a);
			}
		}
		scan.close();

	}

}
