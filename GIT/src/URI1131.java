import java.util.Locale;
import java.util.Scanner;

public class URI1131 {

	public static void main(String[] args) {
		int totalDeGrenais = 0, interVitorias = 0, gremioVitorias = 0, empate = 0;
		int escolha, i, g;
		boolean inicio = false;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		while (!inicio) {
			i = scan.nextInt();
			g = scan.nextInt();
			totalDeGrenais++;
			if (i > g) {
				interVitorias++;
			} else if (i < g) {
				gremioVitorias++;
			} else {
				empate++;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			escolha = scan.nextInt();
			if (escolha == 2) {
				inicio = true;
			}
		}
		System.out.printf("%d grenais\n", totalDeGrenais);
		System.out.printf("Inter:%d\n", interVitorias);
		System.out.printf("Gremio:%d\n", gremioVitorias);
		System.out.printf("Empates:%d\n", empate);
		if (interVitorias > gremioVitorias) {
			System.out.println("Inter venceu mais");
		} else if (gremioVitorias == interVitorias) {
			System.out.println("Nao houve vencedor");
		} else {
			System.out.println("Gremio venceu mais");
		}
		scan.close();
	}

}
