import java.util.Locale;
import java.util.Scanner;

public class URI2060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int v[] = new int[n];
		int m2 = 0, m3 = 0, m4 = 0, m5 = 0;
		for (int i = 0; i < n; i++) {
			v[i] = scan.nextInt();
		}

		for (int j = 0; j < n; j++) {
			if (v[j] % 2 == 0)
				m2++;
			if (v[j] % 3 == 0)
				m3++;
			if (v[j] % 4 == 0)
				m4++;
			if (v[j] % 5 == 0)
				m5++;
		}
		System.out.printf("%d Multiplo(s) de 2\n", m2);
		System.out.printf("%d Multiplo(s) de 3\n", m3);
		System.out.printf("%d Multiplo(s) de 4\n", m4);
		System.out.printf("%d Multiplo(s) de 5\n", m5);
		scan.close();
	}
}