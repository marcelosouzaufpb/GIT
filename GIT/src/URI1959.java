import java.util.Locale;
import java.util.Scanner;

public class URI1959 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		System.out.println(a * b);
		scan.close();
	}

}
