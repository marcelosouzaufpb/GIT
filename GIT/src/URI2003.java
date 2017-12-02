import java.util.Locale;
import java.util.Scanner;

public class URI2003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String[] hora = scan.nextLine().split(":");
			int a = Integer.parseInt(hora[0]);
			int b = Integer.parseInt(hora[1]);
			System.out.printf("Atraso maximo: ");
			if (a < 7 || (a == 7 && b == 0)) {
				System.out.printf("0\n");
			} else {
				System.out.printf("%d\n", ((a + 1) - 8) * 60 + b);
			}
		}
		scan.close();
	}
}
