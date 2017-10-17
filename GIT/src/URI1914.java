import java.util.Locale;
import java.util.Scanner;

public class URI1914 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x, y;
		String nome01, nome02, escolhar01, escolhar02;

		for (int i = 0; i < n; i++) {
			nome01 = scan.next();
			escolhar01 = scan.next();
			nome02 = scan.next();
			escolhar02 = scan.next();
			x = scan.nextInt();
			y = scan.nextInt();

			if ((x + y) % 2 == 0) {
				if (escolhar01.equals("PAR"))
					System.out.println(nome01);
				else
					System.out.println(nome02);
			} else {
				if (escolhar01.equals("PAR")) {
					System.out.println(nome02);
				} else {
					System.out.println(nome01);
				}
			}
		}
		scan.close();
	}
}
