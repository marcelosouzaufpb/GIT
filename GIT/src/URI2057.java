import java.util.Locale;
import java.util.Scanner;

public class URI2057 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int x, y, z, ans;
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		ans = x + y + z;
		if (ans < 0) {
			ans = 24 + ans;
		}
		System.out.printf("%d\n", ans % 24);
		scan.close();
	}
}
