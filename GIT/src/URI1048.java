import java.util.Locale;
import java.util.Scanner;

public class URI1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		float s = scan.nextFloat();

		if (s >= 0 && s <= 400.00) {
			System.out.printf("Novo salario: %.2f\n", ((s * 0.15) + s));
			System.out.printf("Reajuste ganho: %.2f\n", s * 0.15);
			System.out.println("Em percentual: 15 %");

		} else if (s >= 400.01 && s <= 800) {
			System.out.printf("Novo salario: %.2f\n", ((s * 0.12) + s));
			System.out.println("Reajuste ganho: %.2f\n" + s * 0.12);
			System.out.println("Em percentual: 12 %");

		} else if (s >= 800.01 && s <= 1200) {
			System.out.printf("Novo salario: %.2f\n", ((s * 0.10) + s));
			System.out.printf("Reajuste ganho: %.2f\n", s * 0.10);
			System.out.println("Em percentual: 10 %");

		} else if (s >= 1200.01 && s <= 2000) {
			System.out.printf("Novo salario: %.2f\n", ((s * 0.07) + s));
			System.out.printf("Reajuste ganho: %.2f\n", s * 0.07);
			System.out.println("Em percentual: 7 %");

		} else if (s > 2000) {
			System.out.printf("Novo salario: %.2f\n", ((s * 0.04) + s));
			System.out.printf("Reajuste ganho: %.2f\n", s * 0.04);
			System.out.println("Em percentual: 4 %");
		}
		scan.close();

	}

}
