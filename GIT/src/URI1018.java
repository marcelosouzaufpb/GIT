import java.util.Locale;
import java.util.Scanner;

public class URI1018 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;

		if ((0 < N) && (N < 1000000)) {
			System.out.println(N);
			while (N >= 100) {
				a++;
				N -= 100;
			}
			System.out.println(a + " nota(s) de R$ 100,00");
			while (N >= 50) {
				b++;
				N -= 50;

			}
			System.out.println(b + " nota(s) de R$ 50,00");
			while (N >= 20) {
				c++;
				N -= 20;
			}
			System.out.println(c + " nota(s) de R$ 20,00");
			while (N >= 10) {
				d++;
				N -= 10;
			}
			System.out.println(d + " nota(s) de R$ 10,00");
			while (N >= 5) {
				e++;
				N -= 5;
			}
			System.out.println(e + " nota(s) de R$ 5,00");
			while (N >= 2) {
				f++;
				N -= 2;
			}
			System.out.println(f + " nota(s) de R$ 2,00");
			while (N >= 1) {
				g++;
				N -= 1;
			}
			System.out.println(g + " nota(s) de R$ 1,00");
		}
		scan.close();

	}

}