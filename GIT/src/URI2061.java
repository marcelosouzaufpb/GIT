import java.util.Locale;
import java.util.Scanner;

public class URI2061 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n, m, sum = 0;
		String s;

		n = scan.nextInt();
		m = scan.nextInt();
		sum = n;
		for (int i = 0; i < m; i++) {
			s = scan.nextLine();
			if (s == "fechou")
				sum++;
			else
				sum--;
		}

		System.out.println(sum * -1);
		scan.close();
	}
}