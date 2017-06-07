import java.util.Locale;
import java.util.Scanner;

public class URI1007 {

	public static void main(String[] args) {
		int A, B, C, D, DIFERENCA;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		D = scan.nextInt();
		DIFERENCA = (A * B - C * D);
		System.out.println("DIFERENCA = " + DIFERENCA);
		scan.close();
	}

}
