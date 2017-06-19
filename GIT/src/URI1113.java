import java.util.Locale;
import java.util.Scanner;

public class URI1113 {

	public static void main(String[] args) {
		int x, y;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		do {
			x = scan.nextInt();
			y = scan.nextInt();
			if (x > y) {
				System.out.print("Decrescente\n");
			} else if (x < y) {
				System.out.print("Crescente\n");
			}
		} while (x != y);
		scan.close();

	}
}
