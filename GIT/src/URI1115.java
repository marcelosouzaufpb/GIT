import java.util.Locale;
import java.util.Scanner;

public class URI1115 {

	public static void main(String[] args) {
		int X, Y;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		do {
			X = scan.nextInt();
			Y = scan.nextInt();
			if ((X > 0) & (Y > 0)) {
				System.out.println("primeiro");
			} else if ((X < 0) & (Y > 0)) {
				System.out.println("segundo");
			} else if ((X < 0) & (Y < 0)) {
				System.out.println("terceiro");
			} else if ((X > 0) & (Y < 0)) {
				System.out.println("quarto");
			}
		} while ((X != 0) && (Y != 0));
		scan.close();

	}
}