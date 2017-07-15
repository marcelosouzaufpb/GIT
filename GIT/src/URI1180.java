import java.util.Locale;
import java.util.Scanner;

public class URI1180 {

	public static void main(String[] args) {
		int x, y, z, w;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		z = 0;
		for (int i = 1; i < x; i++) {
			w = scan.nextInt();
			if (w < y) {
				y = w;
				z = i;
			}
		}
		System.out.println("Menor valor: " + y);
		System.out.println("Posicao: " + z);
		scan.close();

	}

}
