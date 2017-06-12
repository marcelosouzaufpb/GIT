import java.util.Locale;
import java.util.Scanner;

public class URI1050 {

	public static void main(String[] args) {
		int dd;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		dd = scan.nextInt();
		if (dd == 61) {
			System.out.printf("Brasilia\n");
		} else if (dd == 71) {
			System.out.printf("Salvador\n");

		} else if (dd == 11) {
			System.out.printf("Sao Paulo\n");

		} else if (dd == 21) {
			System.out.printf("Rio de Janeiro\n");

		} else if (dd == 32) {
			System.out.printf("Juiz de Fora\n");

		} else if (dd == 19) {
			System.out.printf("Campinas\n");

		} else if (dd == 27) {
			System.out.printf("Vitoria\n");

		} else if (dd == 31) {
			System.out.printf("Belo Horizonte\n");

		} else {
			System.out.printf("DDD nao cadastrado\n");
		}
		scan.close();
	}
}
