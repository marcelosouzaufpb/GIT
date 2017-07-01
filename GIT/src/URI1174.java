import java.util.Locale;
import java.util.Scanner;

public class URI1174 {

	public static void main(String[] args) {
		double y;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= 99; i++) {
			y = scan.nextDouble();
			if (y <= 10) {
				System.out.println("A[" + i + "] = " + y);
			}
		}
		scan.close();
	}

}
