import java.util.Locale;
import java.util.Scanner;

public class URI1154 {

	public static void main(String[] args) {
		int x = 0, y;
		float z, w = 0;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			y = scan.nextInt();
			if (y < 0) {
				break;
			}
			x = x + y;
			w++;
		}
		z = x / w;
		System.out.printf("%.2f\n", z);
		scan.close();

	}
}