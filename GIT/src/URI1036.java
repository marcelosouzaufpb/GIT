import java.util.Locale;
import java.util.Scanner;

public class URI1036 {

	public static void main(String[] args) {
		double A, B, C, R1, R2;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
		if ((A == 0) || (((B * B) - (4 * A * C)) < 0)) {
			System.out.print("Impossivel calcular\n");
		} else {

			R1 = (double) ((-B + Math.sqrt(((B * B) - (4 * A * C)))) / (2 * A));
			R2 = (double) ((-B - Math.sqrt(((B * B) - (4 * A * C)))) / (2 * A));
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		}
		scan.close();

	}

}
