import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1038 {

	public static void main(String[] args) {
		int A, B;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.00");
		A = scan.nextInt();
		B = scan.nextInt();

		if (A == 1) {
			System.out.println("Total: R$ " + df.format(B * 4.00));
		} else if (A == 2) {
			System.out.println("Total: R$ " + df.format(B * 4.50));

		} else if (A == 3) {
			System.out.println("Total: R$ " + df.format(B * 5.00));

		} else if (A == 4) {
			System.out.println("Total: R$ " + df.format(B * 2.00));

		} else if (A == 5) {
			System.out.println("Total: R$ " + df.format(B * 1.50));

		}
		scan.close();
	}

}
