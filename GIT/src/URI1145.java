import java.util.Locale;
import java.util.Scanner;

public class URI1145 {

	public static void main(String[] args) {
		int X, Y, a, b = 0;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		X = scan.nextInt();
		Y = scan.nextInt();
		for (a = 1; a <= Y; a++) {
			b++;
			if (b == X) {
				System.out.printf("%d", a);
			} else {
				System.out.printf("%d ", a);
			}
			if (b == X) {
				{
					b = 0;
					System.out.printf("\n");
				}
			}
		}
		scan.close();
	}
}