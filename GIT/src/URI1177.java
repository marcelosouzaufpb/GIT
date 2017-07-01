import java.util.Locale;
import java.util.Scanner;

public class URI1177 {

	public static void main(String[] args) {
		int x, y = 0;
		int z[] = new int[1000];
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		for (int i = 0; i < 1000; i++) {
			if (y >= x) {
				y = 0;
			}
			z[i] = y;
			System.out.println("N[" + i + "] = " + z[i]);
			y++;
		}
		scan.close();
	}
}