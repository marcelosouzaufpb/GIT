import java.util.Locale;
import java.util.Scanner;

public class URI1045 {

	public static void main(String[] args) {
		double a, b, c;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		double tempA = Math.max(a, Math.max(b, c));
		double tempB = 0;
		double tempC = 0;

		if (tempA == a) {
			tempB = Math.max(b, c);
			tempC = Math.min(b, c);
		}
		if (tempA == b) {
			tempB = Math.max(a, c);
			tempC = Math.min(a, c);
		}
		if (tempA == c) {
			tempB = Math.max(b, a);
			tempC = Math.min(b, a);
		}
		if (tempA >= (tempB + tempC)) {
			System.out.print("NAO FORMA TRIANGULO\n");

		} else if (tempA * tempA > ((tempB * tempB) + (tempC * tempC))) {
			System.out.print("TRIANGULO OBTUSANGULO\n");
		}
		if (tempA * tempA == ((tempB * tempB) + (tempC * tempC))) {
			System.out.print("TRIANGULO RETANGULO\n");
		}

		if (tempA * tempA < ((tempB * tempB) + (tempC * tempC))) {
			System.out.print("TRIANGULO ACUTANGULO\n");
		}
		if ((tempA == tempB) && (tempA == tempC)) {
			System.out.print("TRIANGULO EQUILATERO\n");
		}
		if (((tempA == tempB) && (tempA != tempC)) || ((tempA == tempC) && (tempA != tempB))
				|| ((tempB == tempC) && (tempB != tempA))) {
			System.out.print("TRIANGULO ISOSCELES\n");
		}
		scan.close();
	}

}