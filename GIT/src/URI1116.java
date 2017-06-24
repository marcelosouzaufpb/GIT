import java.util.Locale;
import java.util.Scanner;

public class URI1116 {

	public static void main(String[] args) {
		int N;
		int X, Y;
		double Z;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		for (int i = 1; i <= N; i++) {
			X = scan.nextInt();
			Y = scan.nextInt();
			if (Y == 0) {
				System.out.print("divisao impossivel\n");
			} else {
				Z =(double)  X / Y;
				System.out.printf("%.1f\n", Z);
			}
		}
		scan.close();
	}
}
