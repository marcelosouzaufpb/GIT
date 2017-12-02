import java.util.Locale;
import java.util.Scanner;

public class URI1961 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int x, y, contador = 0, diferenca;
		x = scan.nextInt();
		y = scan.nextInt();
		int salto[] = new int[y];
		for (int i = 0; i < y; i++) {
			salto[i] = scan.nextInt();
		}
		for (int i = 1; i < y; i++) {
			if (salto[i] > salto[i - 1]) {
				diferenca = (salto[i] - salto[i - 1]);
			} else {
				diferenca = (salto[i - 1] - salto[i]);
			}
			if (diferenca <= x) {
				contador++;
			}

		}
		if (contador == y - 1)
			System.out.printf("YOU WIN\n");
		else
			System.out.printf("GAME OVER\n");
		scan.close();

	}
}