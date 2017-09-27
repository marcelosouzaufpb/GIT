import java.util.Locale;
import java.util.Scanner;

public class URI1028 {

	public static void main(String[] args) {
		int x, y, w, z, a;
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
				
		a = scan.nextInt();
		for (int i = 1; i <= a; i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			
			if (x < y) {
				w = x;
				x = y;
				y = w;
			}
			while (x % y != 0) {
				z = x;
				x = y;
				y = z % x;
			}
			System.out.println(y);
		}
		scan.close();

	}

}
