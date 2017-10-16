import java.util.Locale;
import java.util.Scanner;

public class URI1858 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		byte n = scan.nextByte();
		byte min = 21, r = 0, x, i;

		for (i = 1; i <= n; i++) {
			x = scan.nextByte();
			if (min > x) {
				min = x;
				r = i;
			}
		}

		System.out.println(r);
		scan.close();
	}
}
