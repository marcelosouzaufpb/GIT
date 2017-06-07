import java.util.Locale;
import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		String[] A = scan.nextLine().split(" ");
		String[] B = scan.nextLine().split(" ");
		double C = Double.parseDouble(A[1]);
		double D = Double.parseDouble(A[2]);
		double E = Double.parseDouble(B[1]);
		double F = Double.parseDouble(B[2]);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", (C * D) + (E * F));
		scan.close();

	}

}
