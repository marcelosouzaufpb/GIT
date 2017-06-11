import java.util.Locale;
import java.util.Scanner;

public class URI1047 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		int inicio = a * 60 + b;
		int Final = c * 60 + d;
		int duracao = 0;

		if (a <= c) {
			duracao = Final - inicio;
			if (duracao == 0)
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", 24, duracao % 60);
			else
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (duracao - duracao % 60) / 60,
						duracao % 60);
		} else {
			duracao = (24 * 60 - inicio) + Final;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (duracao - duracao % 60) / 60, duracao % 60);
		}
		scan.close();
	}
}
