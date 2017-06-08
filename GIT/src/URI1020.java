import java.util.Locale;
import java.util.Scanner;

public class URI1020 {

	public static void main(String[] args) {
		int N, X, Y, Z;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		X = N / 365;
		Y = N % 365 / 30;
		Z = N % 365 % 30;
		System.out.println(X + " ano(s)");
		System.out.println(Y + " mes(es)");
		System.out.println(Z + " dia(s)");
		scan.close();

	}

}
