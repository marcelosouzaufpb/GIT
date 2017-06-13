import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class URI1061 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int d1, d2, h1, h2, m1, m2, s1, s2;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		String string;

		d1 = Integer.parseInt(scan.next());
		// -------------------
		h1 = Integer.parseInt(scan.next());
		string = scan.next();
		m1 = Integer.parseInt(scan.next());
		string = scan.next();
		s1 = Integer.parseInt(scan.next());
		// -------------------
		d2 = Integer.parseInt(scan.next());
		// -------------------
		h2 = Integer.parseInt(scan.next());
		string = scan.next();
		m2 = Integer.parseInt(scan.next());
		string = scan.next();
		s2 = Integer.parseInt(scan.next());

		int t1, t2, tempo;
		t1 = s1 + (m1 * 60) + (h1 * 60 * 60) + (d1 * 60 * 60 * 24);
		t2 = s2 + (m2 * 60) + (h2 * 60 * 60) + (d2 * 60 * 60 * 24);
		tempo = t2 - t1;

		System.out.printf("%d dia(s)\n", tempo / (60 * 60 * 24));
		tempo = tempo % (60 * 60 * 24);
		System.out.printf("%d hora(s)\n", tempo / (60 * 60));
		tempo = tempo % (60 * 60);
		System.out.printf("%d minuto(s)\n", tempo / (60));
		tempo = tempo % (60);
		System.out.printf("%d segundo(s)\n", tempo);

		scan.close();

	}

}