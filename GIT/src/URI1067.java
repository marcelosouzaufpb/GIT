import java.util.Locale;
import java.util.Scanner;

public class URI1067 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= n; i = i + 2)
			if (i % 2 != 0) {
				System.out.println(i);
			}
		scan.close();
	}

}
