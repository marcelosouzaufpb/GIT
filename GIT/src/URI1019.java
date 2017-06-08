import java.util.Locale;
import java.util.Scanner;

public class URI1019 {

	public static void main(String[] args) {
		int N, X, Y, Z;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		X = N / 3600;
		Y = N % 3600 / 60;
		Z = N % 60;
		System.out.println(X + ":" + Y + ":" + Z);
		scan.close();

	}

}
