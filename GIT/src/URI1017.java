import java.util.Locale;
import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) {
		double A,B,C;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = (A*B)/12;
		scan.close();
		System.out.printf("%.3f\n", C);
		

	}

}
