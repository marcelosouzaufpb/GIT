import java.util.Locale;
import java.util.Scanner;

public class URI1066 {

	public static void main(String[] args) {
		int cont, n, p1, p2, p3, p4;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		cont = 0;
		p1 = 0;
		p2 = 0;
		p3 = 0;
		p4 = 0;
		while (cont != 5) {
			cont++;
			n = scan.nextInt();
			if ((n % 2) == 0) {
				p1++;
			} else {
				p2++;
			}
			if (n > 0) {
				p3++;
			}
			if (n < 0) {
				p4++;
			}

		}
		System.out.println(p1 + " valor(es) par(es)");
		System.out.println(p2 + " valor(es) impar(es)");
		System.out.println(p3 + " valor(es) positivo(s)");
		System.out.println(p4 + " valor(es) negativo(s)");

		scan.close();
	}
}
