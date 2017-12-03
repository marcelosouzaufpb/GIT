import java.util.Locale;
import java.util.Scanner;

public class URI2031 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			String j1 = scan.next();
			String j2 = scan.next();

			if (j1.equals("ataque") && j2.equals("pedra")) {
				System.out.println("Jogador 1 venceu");
			} else if (j1.equals("pedra") && j2.equals("ataque")) {
				System.out.println("Jogador 2 venceu");
			} else if (j1.equals("pedra") && j2.equals("papel")) {
				System.out.println("Jogador 1 venceu");
			} else if (j1.equals("papel") && j2.equals("pedra")) {
				System.out.println("Jogador 2 venceu");
			} else if (j1.equals("papel") && j2.equals("ataque")) {
				System.out.println("Jogador 2 venceu");
			} else if (j1.equals("ataque") && j2.equals("papel")) {
				System.out.println("Jogador 1 venceu");
			} else if (j1.equals("papel") && j2.equals("papel")) {
				System.out.println("Ambos venceram");
			} else if (j1.equals("pedra") && j2.equals("pedra")) {
				System.out.println("Sem ganhador");
			} else if (j1.equals("ataque") && j2.equals("ataque")) {
				System.out.println("Aniquilacao mutua");
			}
		}
		scan.close();
	}
}