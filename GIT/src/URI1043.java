import java.util.Locale;
import java.util.Scanner;

public class URI1043 {

	public static void main(String[] args) {
		double a, b, c, perimetro, area;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

		perimetro = a + b + c;
		area = ((a + b) * c) / 2;
		if (toTriangulo(a, b, c) == true) {
			System.out.println("Perimetro = " + perimetro);
		} else {
			System.out.println("Area = " + area);
		}

		scan.close();

	}

	public static boolean toTriangulo(double a, double b, double c) {

		if ((c < a + b) && (b < c + a) && (a < c + b)) {
			return true;
		} else {
			return false;
		}
	}

}
