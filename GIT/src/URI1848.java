import java.util.Locale;
import java.util.Scanner;

public class URI1848 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		String z;
		int x, y = 0;

		while (scan.hasNextLine()) {
			z = scan.nextLine();
			if (z.equals("caw caw")) {
				System.out.println(y);
				y = 0;
			} else {
				x = loteria(z);
				y += x;
			}
		}
		scan.close();
	}

	public static int loteria(String s) {
		if (s.equals("--*")) {
			return 1;
		} else if (s.equals("-*-")) {
			return 2;
		} else if (s.equals("-**")) {
			return 3;
		} else if (s.equals("*--")) {
			return 4;
		} else if (s.equals("*-*")) {
			return 5;
		} else if (s.equals("**-")) {
			return 6;
		} else if (s.equals("***")) {
			return 7;
		} else {
			return 8;
		}
	}

}
