import java.util.Locale;
import java.util.Scanner;

public class URI1564 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		String n;
		while (true) {
			n = scan.nextLine();
			if (n != "EOF") {
				if (n.equals("0")) {
					System.out.printf("vai ter copa!\n");
				} else {
					System.out.printf("vai ter duas!\n");
				}
			} else {
				break;
			}
		}
	}
}
