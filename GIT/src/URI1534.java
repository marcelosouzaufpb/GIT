import java.util.Locale;
import java.util.Scanner;

public class URI1534 {

	public static void main(String[] args) {
		int n;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
	
		while (scan.hasNext()) {
			n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					
					if (i + j == (n - 1)) {
						System.out.print("2");
					} else if (i == j) {
						System.out.print("1");
					} else {
						System.out.print("3");
					}
				}
				System.out.println("");
			}
		}
		scan.close();
	}
}
