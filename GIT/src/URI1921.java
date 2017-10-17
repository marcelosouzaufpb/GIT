import java.util.Locale;
import java.util.Scanner;

public class URI1921 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int resultado = (a - 3);
		for (int i = (a - 3); i > 0; i--) {
			resultado += i;
		}
		if (resultado < 0) {
			resultado = 0;
		}

		System.out.println(resultado);

	}
}
