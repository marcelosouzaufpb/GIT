import java.util.Locale;
import java.util.Scanner;

public class URI1238 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n;
		char palavra1[] = new char[55];
		char palavra2[] = new char[55];
		String palavraF;
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			palavraF = "";
			palavra1 = scan.next().toCharArray();
			palavra2 = scan.next().toCharArray();
			if (palavra1.length > palavra2.length) {
				for (int j = 0; j < palavra1.length; j++) {
					if (j < palavra1.length) {
						palavraF += palavra1[j];
					}
					if (j < palavra2.length) {
						palavraF += palavra2[j];
					}
				}
			} else {
				for (int j = 0; j < palavra2.length; j++) {
					if (j < palavra1.length) {
						palavraF += palavra1[j];
					}
					if (j < palavra2.length) {
						palavraF += palavra2[j];
					}
				}
			}
			System.out.println(palavraF);
		}
		scan.close();
	}
}
