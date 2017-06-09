import java.util.Locale;
import java.util.Scanner;

public class URI1040 {

	public static void main(String[] args) {
		float N1, N2, N3, N4, M, N5, Mf;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		N1 = scan.nextFloat();
		N2 = scan.nextFloat();
		N3 = scan.nextFloat();
		N4 = scan.nextFloat();
		M = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

		if (M >= 7.0) {
			System.out.printf("Media: %.1f\n", M);
			System.out.print("Aluno aprovado.\n");
		} else if (M >= 5.0 && M <= 6.9) {
			System.out.printf("Media: %.1f\n", M);
			System.out.print("Aluno em exame.\n");
			N5 = scan.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", N5);
			Mf = (M + N5) / 2;
			if (Mf >= 5.0) {
				System.out.print("Aluno aprovado.\n");
			} else {
				System.out.print("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %.1f\n", Mf);
		} else if (M < 5.0) {
			System.out.printf("Media: %.1f\n", M);
			System.out.print("Aluno reprovado.\n");
		}
		scan.close();
	}
}
