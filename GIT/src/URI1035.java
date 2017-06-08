import java.util.Locale;
import java.util.Scanner;

public class URI1035 {

	public static void main(String[] args) {
		int A, B, C, D;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		D = scan.nextInt();
		if ((B > C) && (D > A) && ((C + D) > (A + B)) && ((C > 0) && (D > 0))) {
			System.out.println("Valores aceitos");

		} else {
			System.out.println("Valores nao aceitos");
		}
		scan.close();

	}

}
