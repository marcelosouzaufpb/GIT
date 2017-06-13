import java.util.Locale;
import java.util.Scanner;

public class URI1064 {

	public static void main(String[] args) {
		float a1, a2 = 0, a3 = 0;
		int b1 = 0;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 6; i++) {
			a1 = scan.nextFloat();
			if (a1 > 0) {
				b1 += 1;
				a2 += a1;
			}
		}
		a3 = a2 / b1;
		System.out.print(b1 + " valores positivos\n");
		System.out.printf("%.1f\n", a3);
		scan.close();
	}

}