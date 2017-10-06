import java.util.Locale;
import java.util.Scanner;

public class URI1828 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int n;
		String s, r;
		n = scan.nextInt();

		for (int i = 1; i <= n; ++i) {
			s = scan.next();
			r = scan.next();
			if (s.equals(r)) {
				System.out.printf("Caso #%d: De novo!\n", i);
			} else if (s.equals("tesoura") && r.equals("papel")) {
				System.out.printf("Caso #%d: Bazinga!\n", i);
			} else if (s.equals("papel") && r.equals("pedra")) {
				System.out.printf("Caso #%d: Bazinga!\n", i);
			} else if (s.equals("pedra") && r.equals("lagarto")) {
				System.out.printf("Caso #%d: Bazinga!\n", i);
			} else if (s.equals("lagarto") && r.equals("Spock")) {
				System.out.printf("Caso #%d: Bazinga!\n", i);
			} else if (s.equals("Spock") && r.equals("tesoura")) {
				System.out.printf("Caso #%d: Bazinga!\n", i);
			} else if (s.equals("tesoura") && r.equals("lagarto")) {
				System.out.printf("Caso #%d: Bazinga!\n", i);
			} else if (s.equals("lagarto") && r.equals("papel")) {
				System.out.printf("Caso #%d: Bazinga!\n", i);
			} else if (s.equals("papel") && r.equals("Spock")) {
				System.out.printf("Caso #%d: Bazinga!\n", i);
			} else if (s.equals("Spock") && r.equals("pedra")) {
				System.out.printf("Caso #%d: Bazinga!\n", i);
			} else if (s.equals("pedra") && r.equals("tesoura")) {
				System.out.printf("Caso #%d: Bazinga!\n", i);
			} else {
				System.out.printf("Caso #%d: Raj trapaceou!\n", i);
			}
		}
		scan.close();
	}
}
