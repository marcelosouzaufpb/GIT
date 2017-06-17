import java.util.Locale;
import java.util.Scanner;

public class URI1094 {

	public static void main(String[] args) {
		int numeroDeCasos, X, total = 0, totalDeCoelhos = 0, totalDeRatos = 0, totalDeSapos = 0;
		String animal_cha;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		numeroDeCasos = scan.nextInt();
		for (int i = 1; i <= numeroDeCasos; i++) {
			X = scan.nextInt();
			animal_cha = scan.next();
			total += X;
			if (animal_cha.toUpperCase().equals("C")) {
				totalDeCoelhos += X;
			} else if (animal_cha.toUpperCase().equals("R")) {
				totalDeRatos += X;
			} else if (animal_cha.toUpperCase().equals("S")) {
				totalDeSapos += X;
			}

		}

		System.out.print("Total: " + total + " cobaias\n");
		System.out.print("Total de coelhos: " + totalDeCoelhos + "\n");
		System.out.print("Total de ratos: " + totalDeRatos + "\n");
		System.out.print("Total de sapos: " + totalDeSapos + "\n");

		System.out.printf("Percentual de coelhos: %.2f", (totalDeCoelhos * 100.00) / total);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f", (totalDeRatos * 100.00) / total);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f", (totalDeSapos * 100.00) / total);
		System.out.print(" %\n");
		scan.close();

	}

}
