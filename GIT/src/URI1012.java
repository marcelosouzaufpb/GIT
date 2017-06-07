import java.util.Locale;
import java.util.Scanner;

public class URI1012 {

	public static void main(String[] args) {
		double A, B, C;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		String[] D = scan.nextLine().split(" ");
		A = Double.parseDouble(D[0]);
		B = Double.parseDouble(D[1]);
		C = Double.parseDouble(D[2]);
		System.out.printf("TRIANGULO: %.3f\n", A * C / 2);
		System.out.printf("CIRCULO: %.3f\n", 3.14159 * (C * C));
		System.out.printf("TRAPEZIO: %.3f\n", ((A + B) * C) / 2);
		System.out.printf("QUADRADO: %.3f\n", B * B);
		System.out.printf("RETANGULO: %.3f\n", A * B);
		scan.close();

	}

}
