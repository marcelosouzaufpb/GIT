import java.util.Locale;
import java.util.Scanner;

public class URI1865 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		String s;
		int n = scan.nextInt(), x;

		for (int i = 0; i < n; i++) {
			s = scan.next();
			x = scan.nextInt();

			if (s.equals("Thor")) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
		scan.close();
	}
}