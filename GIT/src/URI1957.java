import java.util.Locale;
import java.util.Scanner;

public class URI1957 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String h = Integer.toHexString(n);
		System.out.println(h.toUpperCase());
		scan.close();
	}

}
