import java.util.Locale;
import java.util.Scanner;

public class URI1759 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n;
		String c = "";
		n = scan.nextInt();
		if (n > 0) {
			for (int i = 1; i < n; i++) {
				c += "Ho ";
			}
			System.out.println(c + "HO!\n ");
		} else {
			System.out.println(c + "HO!\n ");
		}

		scan.close();
	}

}