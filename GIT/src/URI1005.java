import java.util.Locale;
import java.util.Scanner;

public class URI1005 {
	public static void main(String[] args) {
		double A, B, MEDIA;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		A = scan.nextDouble();
		B = scan.nextDouble();
		MEDIA = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);
		System.out.printf("MEDIA = %.5f\n", MEDIA);
		scan.close();

	}
}
