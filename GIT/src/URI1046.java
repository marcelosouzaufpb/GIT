import java.util.Locale;
import java.util.Scanner;

public class URI1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a >= b) {
			System.out.println("O JOGO DUROU " + (24-(a - b) ) + " HORA(S)");
		} else {
			System.out.println("O JOGO DUROU " + (b - a) + " HORA(S)");
		}
		scan.close();

	}

}
