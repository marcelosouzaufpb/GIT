import java.util.Locale;
import java.util.Scanner;

public class URI1864 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		System.out.println(s.substring(0, n));
		scan.close();
	}
}
