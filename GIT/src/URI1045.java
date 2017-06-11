import java.util.Locale;
import java.util.Scanner;

public class URI1045 {

	public static void main(String[] args) {
		double aa, aux, bc;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		aux = a;
		if (b > a) {
			a = b;
			b = aux;
		}
		if (c > a) {
			a = c;
			c = aux;
		}
		aa = Math.pow(a, 2);
		bc = Math.pow(b, 2) + Math.pow(c, 2);

		if (a >= b + c) {
			System.out.println(" NAO FORMA TRIANGULO");
		} else {
			if (aa > bc) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else if (aa < bc) {
				System.out.println("TRIANGULO ACUTANGULO");
			} else if (aa == (bc)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (a == b && b == c) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (a == b || a == c || b == c) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		scan.close();
	}
}