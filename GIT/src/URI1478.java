import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI1478 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		int n, x, y;
		
		while (true) {
			n = Integer.parseInt(in.readLine());
			if (n == 0) {
				break;
			}
			for (int i = 1; i <= n; i++) {
				y = i;
				for (int j = x = 1; j <= n; j++) {
					if (j != 1) {
						System.out.printf(" ");
					}
					if (j >= i) {
						System.out.printf("%3d", x);
						x++;
					} else {
						System.out.printf("%3d", y);
						y--;
					}
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
	}
}
