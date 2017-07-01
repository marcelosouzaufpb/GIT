import java.util.Locale;
import java.util.Scanner;

public class URI1175 {

	public static void main(String[] args) {
		int n[] = new int[20];
		int x, y;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 20; i++) {
			y = scan.nextInt();
			n[i] = y;
		}

		for (int i = 0; i < 10; i++) {
			x = n[19 - i];
			n[19 - i] = n[i];
			n[i] = x;
		}
		for (int i = 0; i < 20; i++) {
			System.out.println("N[" + i + "] = " + n[i]);

		}
		scan.close();
	}

}